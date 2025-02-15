package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import erebus.entity.EntityRhinoBeetle;

public class ModelRhinoBeetle extends ModelBase {

    ModelRenderer Ab;
    ModelRenderer AbSide;
    ModelRenderer AbTop;
    ModelRenderer AbBack;
    ModelRenderer LBL1;
    ModelRenderer LBL2;
    ModelRenderer LBL3;
    ModelRenderer LBL4;
    ModelRenderer LML1;
    ModelRenderer LML2;
    ModelRenderer LML3;
    ModelRenderer LML4;
    ModelRenderer LFL1;
    ModelRenderer LFL2;
    ModelRenderer LFL3;
    ModelRenderer LFL4;
    ModelRenderer RFL1;
    ModelRenderer RFL2;
    ModelRenderer RFL3;
    ModelRenderer RFL4;
    ModelRenderer RML1;
    ModelRenderer RML2;
    ModelRenderer RML3;
    ModelRenderer RML4;
    ModelRenderer RBL1;
    ModelRenderer RBL2;
    ModelRenderer RBL3;
    ModelRenderer RBL4;
    ModelRenderer HeadA;
    ModelRenderer HeadB;
    ModelRenderer HeadC;
    ModelRenderer Eyes;
    ModelRenderer Lplate;
    ModelRenderer Rplate;
    ModelRenderer TplateA;
    ModelRenderer TplateB;
    ModelRenderer TplateC;
    ModelRenderer NoseA;
    ModelRenderer NoseB;
    ModelRenderer NoseC;
    ModelRenderer Neck;

    public ModelRhinoBeetle() {
        textureWidth = 64;
        textureHeight = 128;
        Ab = new ModelRenderer(this, 9, 95);
        Ab.addBox(-5.5F, -4.5F, 0F, 11, 9, 15);
        Ab.setRotationPoint(0F, 17F, 0F);
        setRotation(Ab, 0F, 0F, 0F);
        AbSide = new ModelRenderer(this, 10, 64);
        AbSide.addBox(-6.5F, -3.5F, 2F, 13, 5, 11);
        AbSide.setRotationPoint(0F, 17F, 0F);
        setRotation(AbSide, 0F, 0F, 0F);
        AbTop = new ModelRenderer(this, 15, 81);
        AbTop.addBox(-4F, -6.5F, 2F, 8, 2, 11);
        AbTop.setRotationPoint(0F, 17F, 0F);
        setRotation(AbTop, 0F, 0F, 0F);
        AbBack = new ModelRenderer(this, 27, 120);
        AbBack.addBox(-3.5F, -2.5F, 15F, 7, 5, 2);
        AbBack.setRotationPoint(0F, 17F, 0F);
        setRotation(AbBack, 0F, 0F, 0F);
        LBL1 = new ModelRenderer(this, 0, 95);
        LBL1.addBox(-4F, -1F, -1F, 4, 2, 2);
        LBL1.setRotationPoint(5F, 17F, 15F);
        setRotation(LBL1, 0F, 2.617994F, -0.3490659F);
        LBL2 = new ModelRenderer(this, 0, 88);
        LBL2.addBox(-5F, 0F, -1F, 2, 4, 2);
        setRotation(LBL2, 0F, 0F, 0.3490659F);
        LBL3 = new ModelRenderer(this, 0, 82);
        LBL3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(LBL3, 0F, 0F, 0.6981317F);
        LBL4 = new ModelRenderer(this, 0, 76);
        LBL4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(LBL4, 0F, 0F, 0.8726646F);
        LFL1 = new ModelRenderer(this, 0, 95);
        LFL1.addBox(-4F, -1F, -1F, 4, 2, 2);
        LFL1.setRotationPoint(5F, 17F, 2F);
        setRotation(LFL1, 0F, -2.617994F, -0.3490659F);
        LFL2 = new ModelRenderer(this, 0, 88);
        LFL2.addBox(-5F, 0F, -1F, 2, 4, 2);
        setRotation(LFL2, 0F, 0F, 0.3490659F);
        LFL3 = new ModelRenderer(this, 0, 82);
        LFL3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(LFL3, 0F, 0F, 0.6981317F);
        LFL4 = new ModelRenderer(this, 0, 76);
        LFL4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(LFL4, 0F, 0F, 0.8726646F);
        LML1 = new ModelRenderer(this, 0, 95);
        LML1.addBox(-4F, -1F, -1F, 4, 2, 2);
        LML1.setRotationPoint(5F, 17F, 8.5F);
        setRotation(LML1, 0F, -3.141593F, -0.3490659F);
        LML2 = new ModelRenderer(this, 0, 88);
        LML2.addBox(-5F, 0F, -1F, 2, 4, 2);
        setRotation(LML2, 0F, 0F, 0.3490659F);
        LML3 = new ModelRenderer(this, 0, 82);
        LML3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(LML3, 0F, 0F, 0.6981317F);
        LML4 = new ModelRenderer(this, 0, 76);
        LML4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(LML4, 0F, 0F, 0.8726646F);
        RFL1 = new ModelRenderer(this, 0, 95);
        RFL1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RFL1.setRotationPoint(-7F, 17F, 2F);
        setRotation(RFL1, 0F, -0.5235988F, 0.3490659F);
        RFL2 = new ModelRenderer(this, 0, 88);
        RFL2.addBox(-5F, 0F, -1F, 2, 4, 2);
        setRotation(RFL2, 0F, 0F, 0.3490659F);
        RFL3 = new ModelRenderer(this, 0, 82);
        RFL3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(RFL3, 0F, 0F, 0.6981317F);
        RFL4 = new ModelRenderer(this, 0, 76);
        RFL4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(RFL4, 0F, 0F, 0.8726646F);
        RML1 = new ModelRenderer(this, 0, 95);
        RML1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RML1.setRotationPoint(-7F, 17F, 8.5F);
        setRotation(RML1, 0F, 0F, 0.3490659F);
        RML2 = new ModelRenderer(this, 0, 88);
        RML2.addBox(-5F, 0F, -1F, 2, 4, 2);
        setRotation(RML2, 0F, 0F, 0.3490659F);
        RML3 = new ModelRenderer(this, 0, 82);
        RML3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(RML3, 0F, 0F, 0.6981317F);
        RML4 = new ModelRenderer(this, 0, 76);
        RML4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(RML4, 0F, 0F, 0.8726646F);
        RBL1 = new ModelRenderer(this, 0, 95);
        RBL1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RBL1.setRotationPoint(-7F, 17F, 15F);
        setRotation(RBL1, 0F, 0F, 0.3490659F);
        RBL2 = new ModelRenderer(this, 0, 88);
        RBL2.addBox(-5F, 0F, -1F, 2, 4, 2);
        setRotation(RBL2, 0F, 0F, 0.3490659F);
        RBL3 = new ModelRenderer(this, 0, 82);
        RBL3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(RBL3, 0F, 0F, 0.6981317F);
        RBL4 = new ModelRenderer(this, 0, 76);
        RBL4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(RBL4, 0F, 0F, 0.8726646F);
        HeadA = new ModelRenderer(this, 22, 40);
        HeadA.addBox(-2F, -3F, -3F, 4, 6, 7);
        HeadA.setRotationPoint(0F, 17F, -4F);
        setRotation(HeadA, 0F, 0F, 0F);
        HeadB = new ModelRenderer(this, 28, 33);
        HeadB.addBox(-2F, -1F, -4F, 4, 4, 2);
        HeadB.setRotationPoint(0F, 17F, -4F);
        setRotation(HeadB, 0F, 0F, 0F);
        HeadC = new ModelRenderer(this, 29, 27);
        HeadC.addBox(-1.5F, 0F, -6F, 3, 3, 2);
        HeadC.setRotationPoint(0F, 17F, -4F);
        setRotation(HeadC, 0F, 0F, 0F);
        Eyes = new ModelRenderer(this, 0, 36);
        Eyes.addBox(-2F, 0.5F, -5.5F, 4, 1, 1);
        Eyes.setRotationPoint(0F, 17F, -4F);
        setRotation(Eyes, 0F, 0F, 0F);
        Lplate = new ModelRenderer(this, 0, 40);
        Lplate.addBox(1F, -3F, -1F, 2, 6, 6);
        Lplate.setRotationPoint(0F, 17F, -4F);
        setRotation(Lplate, 0F, 0.5235988F, 0F);
        Rplate = new ModelRenderer(this, 47, 40);
        Rplate.addBox(-3F, -3F, -1F, 2, 6, 6);
        Rplate.setRotationPoint(0F, 17F, -4F);
        setRotation(Rplate, 0F, -0.5235988F, 0F);
        TplateA = new ModelRenderer(this, 23, 54);
        TplateA.addBox(-1.5F, -3.9F, -0.5F, 3, 2, 7);
        TplateA.setRotationPoint(0F, 17F, -4F);
        setRotation(TplateA, 0.6981317F, 0F, 0F);
        TplateB = new ModelRenderer(this, 0, 60);
        TplateB.addBox(-2.5F, -3F, 0.5F, 5, 2, 5);
        TplateB.setRotationPoint(0F, 17F, -4F);
        setRotation(TplateB, 0.6981317F, 0F, 0F);
        TplateC = new ModelRenderer(this, 0, 53);
        TplateC.addBox(-3.5F, -1.9F, 2F, 7, 2, 3);
        TplateC.setRotationPoint(0F, 17F, -4F);
        setRotation(TplateC, 0.6981317F, 0F, 0F);
        NoseA = new ModelRenderer(this, 35, 65);
        NoseA.addBox(-1F, -5.3F, -6.5F, 2, 6, 2);
        NoseA.setRotationPoint(0F, 17F, -4F);
        setRotation(NoseA, 0.3490659F, 0F, 0F);
        NoseB = new ModelRenderer(this, 36, 69);
        NoseB.addBox(-0.5F, -3.5F, -8.2F, 1, 2, 2);
        NoseB.setRotationPoint(0F, 17F, -4F);
        setRotation(NoseB, -0.1396263F, 0F, 0F);
        NoseC = new ModelRenderer(this, 32, 22);
        NoseC.addBox(-0.5F, -6.5F, -8.2F, 1, 3, 1);
        NoseC.setRotationPoint(0F, 17F, -4F);
        setRotation(NoseC, -0.1396263F, 0F, 0F);
        Neck = new ModelRenderer(this, 21, 66);
        Neck.addBox(-2F, -4F, 2F, 4, 6, 2);
        Neck.setRotationPoint(0F, 17F, -4F);
        setRotation(Neck, 0F, 0F, 0F);

        LFL1.addChild(LFL2);
        LFL1.addChild(LFL3);
        LFL1.addChild(LFL4);

        LML1.addChild(LML2);
        LML1.addChild(LML3);
        LML1.addChild(LML4);

        LBL1.addChild(LBL2);
        LBL1.addChild(LBL3);
        LBL1.addChild(LBL4);

        RFL1.addChild(RFL2);
        RFL1.addChild(RFL3);
        RFL1.addChild(RFL4);

        RML1.addChild(RML2);
        RML1.addChild(RML3);
        RML1.addChild(RML4);

        RBL1.addChild(RBL2);
        RBL1.addChild(RBL3);
        RBL1.addChild(RBL4);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        GL11.glPushMatrix();
        GL11.glTranslatef(0F, -0.0625F, -0.25F);
        Ab.render(unitPixel);
        AbSide.render(unitPixel);
        Ab.render(unitPixel);
        AbSide.render(unitPixel);
        AbTop.render(unitPixel);
        AbBack.render(unitPixel);
        HeadA.render(unitPixel);
        HeadB.render(unitPixel);
        HeadC.render(unitPixel);
        Eyes.render(unitPixel);
        Lplate.render(unitPixel);
        Rplate.render(unitPixel);
        TplateA.render(unitPixel);
        TplateB.render(unitPixel);
        TplateC.render(unitPixel);
        NoseA.render(unitPixel);
        NoseB.render(unitPixel);
        NoseC.render(unitPixel);
        Neck.render(unitPixel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(0F, 0.125F, -0.375F);
        LBL1.render(unitPixel);
        LFL1.render(unitPixel);
        LML1.render(unitPixel);
        GL11.glTranslatef(0.125F, 0F, 0F);
        RFL1.render(unitPixel);
        RML1.render(unitPixel);
        RBL1.render(unitPixel);
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
        EntityRhinoBeetle beetle = (EntityRhinoBeetle) entity;
        float cos1 = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing;
        float cos2 = MathHelper.cos(limbSwing * 1.0F) * 0.5F * prevLimbSwing;
        float headAngle = beetle.getRammingCharge() * 0.01F;

        HeadA.rotateAngleX = headAngle;
        HeadB.rotateAngleX = headAngle;
        HeadC.rotateAngleX = headAngle;
        Eyes.rotateAngleX = headAngle;
        Lplate.rotateAngleX = headAngle;
        Rplate.rotateAngleX = headAngle;
        TplateA.rotateAngleX = headAngle + 0.6981317F;
        TplateB.rotateAngleX = headAngle + 0.6981317F;
        TplateC.rotateAngleX = headAngle + 0.6981317F;
        NoseA.rotateAngleX = headAngle + 0.3490659F;
        NoseB.rotateAngleX = headAngle - 0.1396263F;
        NoseC.rotateAngleX = headAngle - 0.1396263F;

        LBL1.rotateAngleX = cos1;
        LML1.rotateAngleX = cos2;
        LFL1.rotateAngleX = cos1;
        RBL1.rotateAngleX = -cos2;
        RML1.rotateAngleX = -cos1;
        RFL1.rotateAngleX = -cos2;
        LBL1.rotateAngleY = cos1 + 2.617994F;
        LML1.rotateAngleY = cos2 - 3.142F;
        LFL1.rotateAngleY = cos1 - 2.617994F;
        RBL1.rotateAngleY = -cos2 + 0.3490659F;
        RML1.rotateAngleY = -cos1;
        RFL1.rotateAngleY = -cos2 - 0.3490659F;
    }
}
