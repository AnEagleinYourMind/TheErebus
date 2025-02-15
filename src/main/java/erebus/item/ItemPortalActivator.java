package erebus.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.ModTabs;

public class ItemPortalActivator extends Item {

    public ItemPortalActivator() {
        setFull3D();
        setMaxStackSize(1);
        setCreativeTab(ModTabs.gears);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg) {}
}
