package erebus.block.glowshroom;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import erebus.ModBlocks;
import erebus.core.proxy.ClientProxy.BlockRenderIDs;

public class BlockGlowshroomStalkS3 extends BlockGlowshroomPart {

    public BlockGlowshroomStalkS3() {
        super("StalkS3", ForgeDirection.NORTH);
        setBlockBounds(0.3125F, 0.3125F, 0F, 0.6875F, 1F, 0.6875F);
    }

    @Override
    public int getRenderType() {
        return BlockRenderIDs.GLOWSHROOM_STALK.id();
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbour) {
        if (!world.isRemote && world.getBlock(x, y + 1, z) != ModBlocks.glowshroom)
            world.setBlock(x, y, z, ModBlocks.glowshroomStalkS1);

        super.onNeighborBlockChange(world, x, y, z, neighbour);
    }

    @Override
    protected boolean isValidBlock(Block block) {
        return block == ModBlocks.glowshroomStalkNS2;
    }
}
