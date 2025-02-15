package erebus.client.render.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.client.model.entity.ModelWheatWeevil;

@SideOnly(Side.CLIENT)
public class RenderWheatWeevil extends RenderLiving {

    private static final ResourceLocation texture = new ResourceLocation("erebus:textures/entity/wheatWeevil.png");

    public RenderWheatWeevil() {
        super(new ModelWheatWeevil(), 0.0F);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityliving, float f) {
        GL11.glScalef(0.6F, 0.6F, 0.6F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return texture;
    }
}
