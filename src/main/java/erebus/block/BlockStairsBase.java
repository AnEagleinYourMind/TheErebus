package erebus.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

import erebus.ModTabs;

public class BlockStairsBase extends BlockStairs {

    public BlockStairsBase(Block block, int meta) {
        super(block, meta);
        setHardness(2.0F);
        setLightOpacity(0);
        setStepSound(block.stepSound);
        setCreativeTab(ModTabs.blocks);
    }
}
