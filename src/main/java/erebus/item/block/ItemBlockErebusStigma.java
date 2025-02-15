package erebus.item.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import erebus.core.helper.Utils;
import erebus.lib.EnumColour;

public class ItemBlockErebusStigma extends ItemBlockGeneric {

    public ItemBlockErebusStigma(Block block) {
        super(block);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        String colour = EnumColour.values()[Utils.getFlowerMetadata(stack)].getUnlocalisedName();
        return StatCollector.translateToLocal(getUnlocalizedName() + "_" + colour + ".name");
    }
}
