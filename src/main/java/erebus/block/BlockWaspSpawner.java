package erebus.block;

import java.util.Random;

import net.minecraft.item.Item;

import erebus.ModItems;

public class BlockWaspSpawner extends BlockSpiderSpawner {

    public BlockWaspSpawner(String mobName) {
        super(mobName);
    }

    @Override
    public Item getItemDropped(int id, Random rand, int fortune) {
        return ModItems.waspSword;
    }

    @Override
    public int quantityDropped(Random rand) {
        return 1;
    }
}
