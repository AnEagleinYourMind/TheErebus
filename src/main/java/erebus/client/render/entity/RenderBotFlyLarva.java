package erebus.client.render.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.client.model.entity.ModelBotFlyLarva;
import erebus.entity.EntityBotFlyLarva;

@SideOnly(Side.CLIENT)
public class RenderBotFlyLarva extends RenderLiving {

    private static final ResourceLocation Texture = new ResourceLocation("erebus:textures/entity/botFlyLarva.png");

    public RenderBotFlyLarva() {
        super(new ModelBotFlyLarva(), 0.5F);
    }

    @Override
    protected float getDeathMaxRotation(EntityLivingBase entityLivingBase) {
        return 180F;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return Texture;
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityliving, float f) {
        scaleBotFlyLarva((EntityBotFlyLarva) entityliving, f);
    }

    protected void scaleBotFlyLarva(EntityBotFlyLarva entityBotFlyLarva, float f) {
        float f1 = 0.6F;
        GL11.glScalef(f1, f1, f1);
        if (entityBotFlyLarva.ridingEntity != null) {
            GL11.glTranslatef(0F, 0F, -0.2F);
            GL11.glRotatef(180, 0F, 1F, 0F);
        }
    }
}
