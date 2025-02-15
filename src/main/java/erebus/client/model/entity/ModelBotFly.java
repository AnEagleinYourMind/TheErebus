package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityBotFly;

@SideOnly(Side.CLIENT)
public class ModelBotFly extends ModelBase {

    ModelRenderer Head;
    ModelRenderer HeadFront;
    ModelRenderer HeadTop;
    ModelRenderer HeadBottom;
    ModelRenderer EyeR;
    ModelRenderer EveL;
    ModelRenderer Thorax1;
    ModelRenderer Thorax2;
    ModelRenderer Thorax3;
    ModelRenderer Ab1;
    ModelRenderer Ab2;
    ModelRenderer Ab3;
    ModelRenderer Ab4;
    ModelRenderer RWing1;
    ModelRenderer RWing2;
    ModelRenderer LWing1;
    ModelRenderer LWing2;
    ModelRenderer LegRF1;
    ModelRenderer LegRF2;
    ModelRenderer LegRF3;
    ModelRenderer LegLF1;
    ModelRenderer LegLF2;
    ModelRenderer LegLF3;
    ModelRenderer LegRM1;
    ModelRenderer LegRM2;
    ModelRenderer LegRM3;
    ModelRenderer LegLM1;
    ModelRenderer LegLM2;
    ModelRenderer LegLM3;
    ModelRenderer LegRB1;
    ModelRenderer LegRB2;
    ModelRenderer LegRB3;
    ModelRenderer LegLB1;
    ModelRenderer LegLB2;
    ModelRenderer LegLB3;

    public ModelBotFly() {
        textureWidth = 64;
        textureHeight = 32;

        Head = new ModelRenderer(this, 24, 0);
        Head.addBox(-3F, -2F, -4F, 6, 4, 4);
        Head.setRotationPoint(0F, 15F, -4F);
        setRotation(Head, 0F, 0F, 0F);
        HeadFront = new ModelRenderer(this, 15, 0);
        HeadFront.addBox(-2F, -1.5F, -4.5F, 4, 3, 1);
        HeadFront.setRotationPoint(0F, 15F, -4F);
        setRotation(HeadFront, 0F, 0F, 0F);
        HeadTop = new ModelRenderer(this, 11, 5);
        HeadTop.addBox(-2F, -2.5F, -3F, 4, 1, 3);
        HeadTop.setRotationPoint(0F, 15F, -4F);
        setRotation(HeadTop, 0F, 0F, 0F);
        HeadBottom = new ModelRenderer(this, 0, 0);
        HeadBottom.addBox(-2F, 1.5F, -3F, 4, 1, 3);
        HeadBottom.setRotationPoint(0F, 15F, -4F);
        setRotation(HeadBottom, 0F, 0F, 0F);
        EyeR = new ModelRenderer(this, 0, 25);
        EyeR.addBox(-4F, -1F, -3F, 1, 3, 2);
        EyeR.setRotationPoint(0F, 15F, -4F);
        setRotation(EyeR, -0.296706F, 0F, 0F);
        EveL = new ModelRenderer(this, 0, 25);
        EveL.addBox(3F, -1F, -3F, 1, 3, 2);
        EveL.setRotationPoint(0F, 15F, -4F);
        setRotation(EveL, -0.296706F, 0F, 0F);
        Thorax1 = new ModelRenderer(this, 20, 10);
        Thorax1.addBox(-4F, -4F, 2F, 8, 7, 3);
        Thorax1.setRotationPoint(0F, 15F, -4F);
        setRotation(Thorax1, -0.2792527F, 0F, 0F);
        Thorax2 = new ModelRenderer(this, 19, 22);
        Thorax2.addBox(-3.5F, -2F, 0F, 7, 5, 3);
        Thorax2.setRotationPoint(0F, 15F, -4F);
        setRotation(Thorax2, 0F, 0F, 0F);
        Thorax3 = new ModelRenderer(this, 37, 28);
        Thorax3.addBox(-2F, -3F, 0F, 4, 1, 3);
        Thorax3.setRotationPoint(0F, 15F, -4F);
        setRotation(Thorax3, 0F, 0F, 0F);
        Ab1 = new ModelRenderer(this, 47, 0);
        Ab1.addBox(-3F, -3.5F, 5F, 6, 6, 1);
        Ab1.setRotationPoint(0F, 15F, -4F);
        setRotation(Ab1, -0.2792527F, 0F, 0F);
        Ab2 = new ModelRenderer(this, 42, 7);
        Ab2.addBox(-4F, -4F, 6F, 8, 7, 3);
        Ab2.setRotationPoint(0F, 15F, -4F);
        setRotation(Ab2, -0.2792527F, 0F, 0F);
        Ab3 = new ModelRenderer(this, 44, 18);
        Ab3.addBox(-3.5F, -3.5F, 9F, 7, 6, 2);
        Ab3.setRotationPoint(0F, 15F, -4F);
        setRotation(Ab3, -0.2792527F, 0F, 0F);
        Ab4 = new ModelRenderer(this, 52, 27);
        Ab4.addBox(-2.5F, -2.5F, 11F, 5, 4, 1);
        Ab4.setRotationPoint(0F, 15F, -4F);
        setRotation(Ab4, -0.2792527F, 0F, 0F);
        RWing1 = new ModelRenderer(this, 0, 20);
        RWing1.addBox(-1.5F, -0.5F, 0F, 3, 1, 11);
        RWing1.setRotationPoint(-2F, 11.2F, -1F);
        setRotation(RWing1, 0F, -1.570796F, 0F);
        RWing2 = new ModelRenderer(this, 0, 9);
        RWing2.addBox(-3.5F, -0.5F, 1F, 2, 1, 8);
        RWing2.setRotationPoint(-2F, 11.2F, -1F);
        setRotation(RWing2, 0F, -1.570796F, 0F);
        LWing1 = new ModelRenderer(this, 0, 20);
        LWing1.addBox(-1.5F, -0.5F, 0F, 3, 1, 11);
        LWing1.setRotationPoint(2F, 11.2F, -1F);
        setRotation(LWing1, 0F, 1.570796F, 0F);
        LWing2 = new ModelRenderer(this, 0, 9);
        LWing2.addBox(1.5F, -0.5F, 1F, 2, 1, 8);
        LWing2.setRotationPoint(2F, 11.2F, -1F);
        setRotation(LWing2, 0F, 1.570796F, 0F);
        LegRF1 = new ModelRenderer(this, 0, 19);
        LegRF1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
        LegRF1.setRotationPoint(-3F, 18F, -3F);
        setRotation(LegRF1, -1.396263F, 0F, 0F);
        LegRF2 = new ModelRenderer(this, 5, 19);
        LegRF2.addBox(-0.5F, -1.3F, -3.2F, 1, 3, 1);
        LegRF2.setRotationPoint(-3F, 18F, -3F);
        setRotation(LegRF2, 0.6981317F, 0F, 0F);
        LegRF3 = new ModelRenderer(this, 0, 19);
        LegRF3.addBox(-0.5F, 2.7F, -0.2F, 1, 4, 1);
        LegRF3.setRotationPoint(-3F, 18F, -3F);
        setRotation(LegRF3, -0.4363323F, 0F, 0F);
        LegLF1 = new ModelRenderer(this, 0, 19);
        LegLF1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
        LegLF1.setRotationPoint(3F, 18F, -3F);
        setRotation(LegLF1, -1.396263F, 0F, 0F);
        LegLF2 = new ModelRenderer(this, 5, 19);
        LegLF2.addBox(-0.5F, -1.3F, -3.2F, 1, 3, 1);
        LegLF2.setRotationPoint(3F, 18F, -3F);
        setRotation(LegLF2, 0.6981317F, 0F, 0F);
        LegLF3 = new ModelRenderer(this, 0, 19);
        LegLF3.addBox(-0.5F, 2.7F, -0.2F, 1, 4, 1);
        LegLF3.setRotationPoint(3F, 18F, -3F);
        setRotation(LegLF3, -0.4363323F, 0F, 0F);
        LegRM1 = new ModelRenderer(this, 0, 19);
        LegRM1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
        LegRM1.setRotationPoint(-3F, 18F, -2F);
        setRotation(LegRM1, -1.396263F, 1.570796F, 0F);
        LegRM2 = new ModelRenderer(this, 5, 19);
        LegRM2.addBox(-0.5F, -1.3F, -3.2F, 1, 3, 1);
        LegRM2.setRotationPoint(-3F, 18F, -2F);
        setRotation(LegRM2, 0.6981317F, 1.570796F, 0F);
        LegRM3 = new ModelRenderer(this, 0, 19);
        LegRM3.addBox(-0.5F, 2.7F, -0.2F, 1, 4, 1);
        LegRM3.setRotationPoint(-3F, 18F, -2F);
        setRotation(LegRM3, -0.4363323F, 1.570796F, 0F);
        LegLM1 = new ModelRenderer(this, 0, 19);
        LegLM1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
        LegLM1.setRotationPoint(3F, 18F, -2F);
        setRotation(LegLM1, -1.396263F, -1.570796F, 0F);
        LegLM2 = new ModelRenderer(this, 5, 19);
        LegLM2.addBox(-0.5F, -1.3F, -3.2F, 1, 3, 1);
        LegLM2.setRotationPoint(3F, 18F, -2F);
        setRotation(LegLM2, 0.6981317F, -1.570796F, 0F);
        LegLM3 = new ModelRenderer(this, 0, 19);
        LegLM3.addBox(-0.5F, 2.7F, -0.2F, 1, 4, 1);
        LegLM3.setRotationPoint(3F, 18F, -2F);
        setRotation(LegLM3, -0.4363323F, -1.570796F, 0F);
        LegRB1 = new ModelRenderer(this, 0, 10);
        LegRB1.addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1);
        LegRB1.setRotationPoint(-3F, 18F, -1F);
        setRotation(LegRB1, -1.570796F, 2.617994F, 0F);
        LegRB2 = new ModelRenderer(this, 5, 19);
        LegRB2.addBox(-0.5F, 0.5F, -4.4F, 1, 3, 1);
        LegRB2.setRotationPoint(-3F, 18F, -1F);
        setRotation(LegRB2, -0.1047198F, 2.617994F, 0F);
        LegRB3 = new ModelRenderer(this, 0, 19);
        LegRB3.addBox(-0.5F, 4.3F, -3.1F, 1, 4, 1);
        LegRB3.setRotationPoint(-3F, 18F, -1F);
        setRotation(LegRB3, -0.4363323F, 2.617994F, 0F);
        LegLB1 = new ModelRenderer(this, 0, 10);
        LegLB1.addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1);
        LegLB1.setRotationPoint(3F, 18F, -1F);
        setRotation(LegLB1, -1.570796F, -2.617994F, 0F);
        LegLB2 = new ModelRenderer(this, 5, 19);
        LegLB2.addBox(-0.5F, 0.5F, -4.4F, 1, 3, 1);
        LegLB2.setRotationPoint(3F, 18F, -1F);
        setRotation(LegLB2, -0.1047198F, -2.617994F, 0F);
        LegLB3 = new ModelRenderer(this, 0, 19);
        LegLB3.addBox(-0.5F, 4.3F, -3.1F, 1, 4, 1);
        LegLB3.setRotationPoint(3F, 18F, -1F);
        setRotation(LegLB3, -0.4363323F, -2.617994F, 0F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        Head.render(unitPixel);
        HeadFront.render(unitPixel);
        HeadTop.render(unitPixel);
        HeadBottom.render(unitPixel);
        EyeR.render(unitPixel);
        EveL.render(unitPixel);
        Thorax1.render(unitPixel);
        Thorax2.render(unitPixel);
        Thorax3.render(unitPixel);
        Ab1.render(unitPixel);
        Ab2.render(unitPixel);
        Ab3.render(unitPixel);
        Ab4.render(unitPixel);
        LegRF1.render(unitPixel);
        LegRF2.render(unitPixel);
        LegRF3.render(unitPixel);
        LegLF1.render(unitPixel);
        LegLF2.render(unitPixel);
        LegLF3.render(unitPixel);
        LegRM1.render(unitPixel);
        LegRM2.render(unitPixel);
        LegRM3.render(unitPixel);
        LegLM1.render(unitPixel);
        LegLM2.render(unitPixel);
        LegLM3.render(unitPixel);
        LegRB1.render(unitPixel);
        LegRB2.render(unitPixel);
        LegRB3.render(unitPixel);
        LegLB1.render(unitPixel);
        LegLB2.render(unitPixel);
        LegLB3.render(unitPixel);
        GL11.glPushMatrix();
        GL11.glEnable(GL11.GL_BLEND);
        RWing1.render(unitPixel);
        RWing2.render(unitPixel);
        LWing1.render(unitPixel);
        LWing2.render(unitPixel);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel, Entity entity) {
        super.setRotationAngles(
            limbSwing,
            prevLimbSwing,
            entityTickTime,
            rotationYaw,
            rotationPitch,
            unitPixel,
            entity);
        EntityBotFly var8 = (EntityBotFly) entity;
        RWing1.rotateAngleX = var8.wingFloat;
        RWing2.rotateAngleX = var8.wingFloat;
        LWing1.rotateAngleX = var8.wingFloat;
        LWing2.rotateAngleX = var8.wingFloat;
    }

    public int getFlySize() {
        return 100;
    }

}
