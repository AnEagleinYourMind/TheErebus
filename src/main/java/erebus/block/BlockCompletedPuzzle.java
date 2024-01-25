package erebus.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import erebus.tileentity.TileEntityCompletedPuzzle;

public class BlockCompletedPuzzle extends BlockContainer {

    public BlockCompletedPuzzle() {
        super(Material.rock);
        setBlockUnbreakable();
        setBlockName("erebus.completedPuzzle");
        setBlockTextureName("erebus:anthillBlock");
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityCompletedPuzzle();
    }
}
