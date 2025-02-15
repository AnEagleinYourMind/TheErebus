package erebus.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.ModItems;

public class TabItems extends CreativeTabs {

    public TabItems() {
        super("erebus.item");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.food;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int func_151243_f() {
        return 0;
    }
}
