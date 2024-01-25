package erebus.item;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import erebus.ModMaterials;
import erebus.ModTabs;
import erebus.core.helper.Utils;

public class ItemAxeJade extends ItemAxe {

    public ItemAxeJade() {
        super(ModMaterials.toolJADE);
        setCreativeTab(ModTabs.gears);
        setTextureName("erebus:axe_jade");
        setUnlocalizedName("erebus.axeJade");
    }

    @Override
    public boolean getIsRepairable(ItemStack stack, ItemStack material) {
        return Utils.isItemOre(material, "gemJade");
    }
}
