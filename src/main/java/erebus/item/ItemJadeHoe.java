package erebus.item;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

import erebus.ModMaterials;
import erebus.ModTabs;
import erebus.core.helper.Utils;

public class ItemJadeHoe extends ItemHoe {

    public ItemJadeHoe() {
        super(ModMaterials.toolJADE);
        setCreativeTab(ModTabs.gears);
        setTextureName("erebus:hoe_jade");
        setUnlocalizedName("erebus.hoeJade");
    }

    @Override
    public boolean getIsRepairable(ItemStack stack, ItemStack material) {
        return Utils.isItemOre(material, "gemJade");
    }
}
