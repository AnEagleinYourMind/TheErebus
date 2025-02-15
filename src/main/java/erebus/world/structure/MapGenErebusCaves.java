package erebus.world.structure;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.MapGenBase;

import erebus.world.biomes.BiomeBaseErebus;

public class MapGenErebusCaves extends MapGenBase {

    protected void generateLargeCaveNode(long seed, int chunkX, int chunkZ, Block[] blocks, double xx, double yy,
        double zz) {
        generateCaveNode(
            seed,
            chunkX,
            chunkZ,
            blocks,
            xx,
            yy,
            zz,
            1F + rand.nextFloat() * 3F,
            0F,
            0F,
            -1,
            -1,
            rand.nextDouble() * 0.5D + 0.3D);
    }

    protected void generateCaveNode(long seed, int chunkX, int chunkZ, Block[] blocks, double xx, double yy, double zz,
        float innerSize, float xzAngle, float yAngle, int par15, int par16, double heightMp) {
        double centerX = chunkX * 16 + 8;
        double centerZ = chunkZ * 16 + 8;
        float f3 = 0F;
        float f4 = 0F;
        Random rand = new Random(seed);

        if (par16 <= 0) {
            int j1 = range * 16 - 16;
            par16 = j1 - rand.nextInt(j1 / 4);
        }

        boolean flag = false;

        if (par15 == -1) {
            par15 = par16 / 2;
            flag = true;
        }

        int k1 = rand.nextInt(par16 / 2) + par16 / 4;

        for (boolean steep = rand.nextInt(6) == 0; par15 < par16; ++par15) {
            double xzRange = 1.5D + MathHelper.sin(par15 * (float) Math.PI / par16) * innerSize * 1F;
            double yRange = xzRange * heightMp;
            float f5 = MathHelper.cos(yAngle);
            float f6 = MathHelper.sin(yAngle);
            xx += MathHelper.cos(xzAngle) * f5;
            yy += f6;
            zz += MathHelper.sin(xzAngle) * f5;

            if (steep) yAngle *= 0.92F;
            else yAngle *= 0.7F;

            yAngle += f4 * 0.1F;
            xzAngle += f3 * 0.1F;
            f4 *= 0.9F;
            f3 *= 0.75F;
            f4 += (rand.nextFloat() - rand.nextFloat()) * rand.nextFloat() * 2F;
            f3 += (rand.nextFloat() - rand.nextFloat()) * rand.nextFloat() * 4F;

            if (!flag && par15 == k1 && innerSize > 1F) {
                generateCaveNode(
                    rand.nextLong(),
                    chunkX,
                    chunkZ,
                    blocks,
                    xx,
                    yy,
                    zz,
                    rand.nextFloat() * 0.5F + 0.5F,
                    xzAngle - (float) Math.PI / 2F,
                    yAngle / 3F,
                    par15,
                    par16,
                    1D);
                generateCaveNode(
                    rand.nextLong(),
                    chunkX,
                    chunkZ,
                    blocks,
                    xx,
                    yy,
                    zz,
                    rand.nextFloat() * 0.5F + 0.5F,
                    xzAngle + (float) Math.PI / 2F,
                    yAngle / 3F,
                    par15,
                    par16,
                    1D);
                return;
            }

            if (flag || rand.nextInt(4) != 0) {
                double diffX = xx - centerX;
                double diffZ = zz - centerZ;
                double d10 = par16 - par15;
                double radius = innerSize + 2F + 16F;

                if (diffX * diffX + diffZ * diffZ - d10 * d10 > radius * radius) return;

                if (xx >= centerX - 16D - xzRange * 2D && zz >= centerZ - 16D - xzRange * 2D
                    && xx <= centerX + 16D + xzRange * 2D
                    && zz <= centerZ + 16D + xzRange * 2D) {
                    int minX = MathHelper.floor_double(xx - xzRange) - chunkX * 16 - 1;
                    int maxX = MathHelper.floor_double(xx + xzRange) - chunkX * 16 + 1;
                    int minY = MathHelper.floor_double(yy - yRange) - 1;
                    int maxY = MathHelper.floor_double(yy + yRange) + 1;
                    int minZ = MathHelper.floor_double(zz - xzRange) - chunkZ * 16 - 1;
                    int maxZ = MathHelper.floor_double(zz + xzRange) - chunkZ * 16 + 1;

                    if (minX < 0) minX = 0;
                    if (maxX > 16) maxX = 16;
                    if (minY < 6) minY = 6;
                    if (maxY > 124) maxY = 124;
                    if (minZ < 0) minZ = 0;
                    if (maxZ > 16) maxZ = 16;

                    boolean preventGeneration = false;

                    for (int px = minX; !preventGeneration && px < maxX; ++px)
                        for (int pz = minZ; !preventGeneration && pz < maxZ; ++pz)
                            for (int py = maxY + 1; !preventGeneration && py >= minY - 1; --py) if (py >= 0 && py < 128)
                                if (py != minY - 1 && px != minX && px != maxX - 1 && pz != minZ && pz != maxZ - 1)
                                    py = minY;

                    if (!preventGeneration) {
                        for (int px = minX; px < maxX; ++px) {
                            double xDiff = (px + chunkX * 16 + 0.5D - xx) / xzRange;

                            for (int pz = minZ; pz < maxZ; ++pz) {
                                double zDiff = (pz + chunkZ * 16 + 0.5D - zz) / xzRange;
                                int index = (px * 16 + pz) * 128 + maxY;

                                if (xDiff * xDiff + zDiff * zDiff < 1D) for (int py = maxY - 1; py >= minY; --py) {
                                    double yDiff = (py + 0.5D - yy) / yRange;

                                    if (yDiff > -0.7D && xDiff * xDiff + yDiff * yDiff + zDiff * zDiff < 1D) {
                                        Block block = blocks[index];
                                        BiomeBaseErebus biome = (BiomeBaseErebus) worldObj
                                            .getBiomeGenForCoords(px + chunkX * 16, pz + chunkZ * 16);
                                        blocks[index] = biome.placeCaveBlock(block, px, py, pz, rand);
                                    }

                                    --index;
                                }
                            }
                        }

                        if (flag) break;
                    }
                }
            }
        }
    }

    @Override
    protected void func_151538_a(World world, int localX, int localZ, int chunkX, int chunkZ, Block[] blocks) {
        int caveAmount = rand.nextInt(rand.nextInt(25) + 1);
        if (rand.nextInt(10) != 0) caveAmount = 0;

        for (int iter = 0; iter < caveAmount; ++iter) {
            double xx = localX * 16 + rand.nextInt(16);
            double yy = 68 + rand.nextGaussian() * 48D;
            double zz = localZ * 16 + rand.nextInt(16);
            int smallCaves = rand.nextBoolean() && rand.nextBoolean() ? 2 : 1;

            if (rand.nextInt(8) == 0) {
                generateLargeCaveNode(rand.nextLong(), chunkX, chunkZ, blocks, xx, yy, zz);
                smallCaves += rand.nextInt(3);
            }

            for (int cave = 0; cave < smallCaves; ++cave) {
                float xzAngle = rand.nextFloat() * (float) Math.PI * 2F;
                float yAngle = (rand.nextFloat() - 0.5F) * 2F / 8F;
                float innerSize = rand.nextFloat() * 2.5F + rand.nextFloat();

                if (rand.nextInt(10) == 0) innerSize *= rand.nextFloat() * rand.nextFloat() + 1F;

                generateCaveNode(
                    rand.nextLong(),
                    chunkX,
                    chunkZ,
                    blocks,
                    xx,
                    yy,
                    zz,
                    innerSize,
                    xzAngle,
                    yAngle,
                    0,
                    0,
                    1D);
            }
        }
    }
}
