package erebus.client.render.item;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemCloth;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class RenderMaxSpeedBow implements IItemRenderer {

    private Minecraft mc;

    public RenderMaxSpeedBow() {
        mc = Minecraft.getMinecraft();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return type == ItemRenderType.EQUIPPED;// || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        EntityLivingBase entity = (EntityLivingBase) data[1];
        GL11.glPushMatrix();
        if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            renderItem(entity, item, 0);
        } else {
            GL11.glPushMatrix();
            float f2 = 3F - (1F / 1.3F);
            GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F); // Roll left-right
            GL11.glRotatef(110.0F, 1.0F, 0.0F, 0.0F);// aim up-down
            GL11.glRotatef(-10.0F, 0.0F, 0.0F, 1.0F);// aim left-right
            GL11.glScalef(f2, f2, f2);
            GL11.glTranslatef(0.15F, -0.1875F, 0.1875F);

            float f3 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(f3, -f3, f3);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);

            renderItem(entity, item, 0);
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
    }

    private void renderItem(EntityLivingBase entity, ItemStack stack, int pass) {
        RenderBlocks renderBlock = new RenderBlocks();

        ItemRenderType type = ItemRenderType.EQUIPPED_FIRST_PERSON;

        GL11.glPushMatrix();
        TextureManager texturemanager = mc.getTextureManager();
        Item item = stack.getItem();
        Block block = Block.getBlockFromItem(item);

        IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(stack, type);
        if (customRenderer != null) {
            texturemanager.bindTexture(texturemanager.getResourceLocation(stack.getItemSpriteNumber()));
            ForgeHooksClient.renderEquippedItem(type, customRenderer, renderBlock, entity, stack);
        } else if (stack.getItemSpriteNumber() == 0 && item instanceof ItemBlock
            && RenderBlocks.renderItemIn3d(block.getRenderType())) {
                texturemanager.bindTexture(texturemanager.getResourceLocation(0));

                if (stack != null && stack.getItem() instanceof ItemCloth) {
                    GL11.glEnable(GL11.GL_BLEND);
                    GL11.glDepthMask(false);
                    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                    renderBlock.renderBlockAsItem(block, stack.getItemDamage(), 1.0F);
                    GL11.glDepthMask(true);
                    GL11.glDisable(GL11.GL_BLEND);
                } else {
                    renderBlock.renderBlockAsItem(block, stack.getItemDamage(), 1.0F);
                }
            } else {
                IIcon iicon = entity.getItemIcon(stack, pass);
                if (iicon == null) {
                    GL11.glPopMatrix();
                    return;
                }

                texturemanager.bindTexture(texturemanager.getResourceLocation(stack.getItemSpriteNumber()));
                Tessellator tessellator = Tessellator.instance;
                float f = iicon.getMinU();
                float f1 = iicon.getMaxU();
                float f2 = iicon.getMinV();
                float f3 = iicon.getMaxV();
                float f4 = 0.0F;
                float f5 = 0.3F;
                GL11.glEnable(GL12.GL_RESCALE_NORMAL);
                GL11.glTranslatef(-f4, -f5, 0.0F);
                float f6 = 1.5F;
                GL11.glScalef(f6, f6, f6);
                GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
                GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
                ItemRenderer
                    .renderItemIn2D(tessellator, f1, f2, f, f3, iicon.getIconWidth(), iicon.getIconHeight(), 0.0625F);

                if (stack.hasEffect(pass)) {
                    ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
                    GL11.glDepthFunc(GL11.GL_EQUAL);
                    GL11.glDisable(GL11.GL_LIGHTING);
                    texturemanager.bindTexture(RES_ITEM_GLINT);
                    GL11.glEnable(GL11.GL_BLEND);
                    OpenGlHelper.glBlendFunc(768, 1, 1, 0);
                    float f7 = 0.76F;
                    GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
                    GL11.glMatrixMode(GL11.GL_TEXTURE);
                    GL11.glPushMatrix();
                    float f8 = 0.125F;
                    GL11.glScalef(f8, f8, f8);
                    float f9 = (float) (Minecraft.getSystemTime() % 3000L) / 3000.0F * 8.0F;
                    GL11.glTranslatef(f9, 0.0F, 0.0F);
                    GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
                    ItemRenderer.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                    GL11.glPopMatrix();
                    GL11.glPushMatrix();
                    GL11.glScalef(f8, f8, f8);
                    f9 = (float) (Minecraft.getSystemTime() % 4873L) / 4873.0F * 8.0F;
                    GL11.glTranslatef(-f9, 0.0F, 0.0F);
                    GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
                    ItemRenderer.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                    GL11.glPopMatrix();
                    GL11.glMatrixMode(GL11.GL_MODELVIEW);
                    GL11.glDisable(GL11.GL_BLEND);
                    GL11.glEnable(GL11.GL_LIGHTING);
                    GL11.glDepthFunc(GL11.GL_LEQUAL);
                }
                GL11.glDisable(GL12.GL_RESCALE_NORMAL);
                texturemanager.bindTexture(texturemanager.getResourceLocation(stack.getItemSpriteNumber()));
                TextureUtil.func_147945_b();
            }
        GL11.glPopMatrix();
    }
}
