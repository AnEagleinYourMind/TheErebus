package erebus.client.render.item;

import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.client.model.block.ModelBambooBridge;
import erebus.tileentity.TileEntityBambooBridge;

@SideOnly(Side.CLIENT)
public class BambooBridgeItemRenderer implements IItemRenderer {

    private final ModelBambooBridge ModelBambooBridge = new ModelBambooBridge();
    private final TileEntityBambooBridge te = new TileEntityBambooBridge();
    private final ResourceLocation texture = new ResourceLocation("erebus:textures/special/tiles/bambooLadder.png");

    public BambooBridgeItemRenderer() {
        te.setRenderSide1(true);
        te.setRenderSide2(true);
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return type != ItemRenderType.FIRST_PERSON_MAP;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return helper != ItemRendererHelper.BLOCK_3D;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY:
                renderBlock(0.0F, 0.5F, 0.0F, 0.5D);
                break;
            case EQUIPPED:
                renderBlock(0.5F, 2.0F, 1.0F, 1.0D);
                break;
            case EQUIPPED_FIRST_PERSON:
                renderBlock(0.5F, 1.5F, 0.5F, 1.0D);
                break;
            case INVENTORY:
                renderBlock(0.0F, 1.0F, 0.0F, 1.0D);
                break;
            default:
                break;
        }
    }

    private void renderBlock(float x, float y, float z, double size) {
        FMLClientHandler.instance()
            .getClient()
            .getTextureManager()
            .bindTexture(texture);
        if (RenderItem.renderInFrame) {
            GL11.glPushMatrix();
            GL11.glTranslatef(x, y + 0.4F, z);
            GL11.glRotatef(180F, 1F, 0, 0);
            GL11.glRotatef(90F, 0, 1F, 0);
            GL11.glScaled(size + 0.2D, size + 0.2D, size + 0.2D);
            ModelBambooBridge.render(te);
            GL11.glPopMatrix();
        } else {
            GL11.glPushMatrix();
            GL11.glTranslatef(x, y, z);
            GL11.glRotatef(180F, 1F, 0, 0);
            GL11.glRotatef(90F, 0, 1F, 0);
            GL11.glScaled(size, size, size);
            ModelBambooBridge.render(te);
            GL11.glPopMatrix();
        }
    }
}
