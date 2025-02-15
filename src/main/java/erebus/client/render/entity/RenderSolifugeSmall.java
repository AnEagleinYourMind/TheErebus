package erebus.client.render.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.client.model.entity.ModelSolifuge;

@SideOnly(Side.CLIENT)
public class RenderSolifugeSmall extends RenderLiving {

    private static final ResourceLocation texture = new ResourceLocation("erebus:textures/entity/solifuge.png");

    public RenderSolifugeSmall() {
        super(new ModelSolifuge(), 0.5F);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityliving, float f) {
        float f1 = 0.5F;
        shadowSize = f1;
        GL11.glScalef(f1, f1, f1);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return texture;
    }
}
