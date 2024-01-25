package erebus.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import erebus.ModMaterials;
import erebus.ModTabs;
import erebus.core.helper.Utils;

public class ItemPickaxeJade extends ItemPickaxe {

    public ItemPickaxeJade() {
        super(ModMaterials.toolJADE);
        setCreativeTab(ModTabs.gears);
        setTextureName("erebus:pickaxe_jade");
        setUnlocalizedName("erebus.pickaxeJade");
    }

    @Override
    public boolean getIsRepairable(ItemStack stack, ItemStack material) {
        return Utils.isItemOre(material, "gemJade");
    }
}
