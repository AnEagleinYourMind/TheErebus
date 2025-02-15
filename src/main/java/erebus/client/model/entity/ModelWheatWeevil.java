package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelWheatWeevil extends ModelBase {

    ModelRenderer HeadTop;
    ModelRenderer HeadMain;
    ModelRenderer HeadFront;
    ModelRenderer Nose1;
    ModelRenderer Nose2;
    ModelRenderer Eyes;
    ModelRenderer Ant1;
    ModelRenderer AntR2;
    ModelRenderer AntL2;
    ModelRenderer Ab;
    ModelRenderer AbSideR;
    ModelRenderer AbSideL;
    ModelRenderer AbTop;
    ModelRenderer AbBack;
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
    ModelRenderer LFL1;
    ModelRenderer LFL2;
    ModelRenderer LFL3;
    ModelRenderer LFL4;
    ModelRenderer LML1;
    ModelRenderer LML2;
    ModelRenderer LML3;
    ModelRenderer LML4;
    ModelRenderer LBL1;
    ModelRenderer LBL2;
    ModelRenderer LBL3;
    ModelRenderer LBL4;

    public ModelWheatWeevil() {
        textureWidth = 64;
        textureHeight = 128;
        HeadTop = new ModelRenderer(this, 17, 25);
        HeadTop.addBox(-3F, -2.4F, -3F, 6, 3, 8);
        setRotation(HeadTop, 0.3490659F, 0F, 0F);
        HeadMain = new ModelRenderer(this, 16, 37);
        HeadMain.addBox(-4F, -1F, -3F, 8, 4, 7);
        HeadMain.setRotationPoint(0F, 18F, -4F);
        setRotation(HeadMain, 0F, 0F, 0F);
        HeadFront = new ModelRenderer(this, 23, 15);
        HeadFront.addBox(-2.5F, -1.4F, -6F, 5, 3, 3);
        setRotation(HeadFront, 0.3490659F, 0F, 0F);
        Nose1 = new ModelRenderer(this, 25, 5);
        Nose1.addBox(-1F, -2.3F, -9.5F, 2, 2, 4);
        setRotation(Nose1, 0.5235988F, 0F, 0F);
        Nose2 = new ModelRenderer(this, 27, 0);
        Nose2.addBox(-0.5F, -2F, -12.5F, 1, 1, 3);
        setRotation(Nose2, 0.5235988F, 0F, 0F);
        Eyes = new ModelRenderer(this, 24, 22);
        Eyes.addBox(-3F, 1F, -5F, 6, 1, 1);
        setRotation(Eyes, 0F, 0F, 0F);
        Ant1 = new ModelRenderer(this, 23, 12);
        Ant1.addBox(-3.5F, -2F, -7.2F, 7, 1, 1);
        setRotation(Ant1, 0.5235988F, 0F, 0F);
        AntR2 = new ModelRenderer(this, 40, 10);
        AntR2.addBox(-4F, -2F, -10F, 1, 1, 3);
        setRotation(AntR2, 0.5235988F, 0F, 0F);
        AntL2 = new ModelRenderer(this, 14, 10);
        AntL2.addBox(3.033333F, -2F, -10F, 1, 1, 3);
        setRotation(AntL2, 0.5235988F, 0F, 0F);
        Ab = new ModelRenderer(this, 10, 49);
        Ab.addBox(-4.5F, -4F, 0F, 9, 7, 13);
        Ab.setRotationPoint(0F, 18F, 0F);
        setRotation(Ab, 0F, 0F, 0F);
        AbSideR = new ModelRenderer(this, 44, 49);
        AbSideR.addBox(-5.5F, -3F, 2F, 1, 4, 9);
        AbSideR.setRotationPoint(0F, 18F, 0F);
        setRotation(AbSideR, 0F, 0F, 0F);
        AbSideL = new ModelRenderer(this, 0, 48);
        AbSideL.addBox(4.5F, -3F, 2F, 1, 4, 9);
        AbSideL.setRotationPoint(0F, 18F, 0F);
        setRotation(AbSideL, 0F, 0F, 0F);
        AbTop = new ModelRenderer(this, 16, 70);
        AbTop.addBox(-3.5F, -5F, 2F, 7, 1, 9);
        AbTop.setRotationPoint(0F, 18F, 0F);
        setRotation(AbTop, 0F, 0F, 0F);
        AbBack = new ModelRenderer(this, 23, 81);
        AbBack.addBox(-3.5F, -2F, 13F, 7, 4, 2);
        AbBack.setRotationPoint(0F, 18F, 0F);
        setRotation(AbBack, 0F, 0F, 0F);

        float correction = 0.3490659F;
        RFL1 = new ModelRenderer(this, 0, 95);
        RFL1.addBox(-6F, -1F, -1F, 6, 2, 2);
        RFL1.setRotationPoint(-3F, 20F, -2F);
        setRotation(RFL1, 0F, -0.6981317F, 0.3490659F + correction);
        RFL2 = new ModelRenderer(this, 0, 88);
        RFL2.addBox(-6F, 1F, -0.5F, 1, 3, 1);
        setRotation(RFL2, 0F, 0F, 0.3490659F - correction);
        RFL3 = new ModelRenderer(this, 0, 82);
        RFL3.addBox(0F, 6.5F, -0.5F, 1, 3, 1);
        setRotation(RFL3, 0F, 0F, 1.396263F - correction);
        RFL4 = new ModelRenderer(this, 0, 76);
        RFL4.addBox(-10.63333F, 1.5F, -0.5F, 2, 2, 1);
        setRotation(RFL4, 0F, 0F, 0F - correction);
        RML1 = new ModelRenderer(this, 0, 95);
        RML1.addBox(-6F, -1F, -1F, 6, 2, 2);
        RML1.setRotationPoint(-4F, 20F, 2F);
        setRotation(RML1, 0F, 0F, 0.3490659F + correction);
        RML2 = new ModelRenderer(this, 0, 88);
        RML2.addBox(-6F, 1F, -0.5F, 1, 3, 1);
        setRotation(RML2, 0F, 0F, 0.3490659F - correction);
        RML3 = new ModelRenderer(this, 0, 82);
        RML3.addBox(0F, 6.5F, -0.5F, 1, 3, 1);
        setRotation(RML3, 0F, 0F, 1.396263F - correction);
        RML4 = new ModelRenderer(this, 0, 76);
        RML4.addBox(-10.5F, 1.5F, -0.5F, 2, 2, 1);
        setRotation(RML4, 0F, 0F, 0F - correction);
        RBL1 = new ModelRenderer(this, 0, 95);
        RBL1.addBox(-6F, -1F, -1F, 6, 2, 2);
        RBL1.setRotationPoint(-4F, 20F, 7F);
        setRotation(RBL1, 0F, 0.5235988F, 0.3490659F + correction);
        RBL2 = new ModelRenderer(this, 0, 88);
        RBL2.addBox(-6F, 1F, -0.5F, 1, 3, 1);
        setRotation(RBL2, 0F, 0F, 0.3490659F - correction);
        RBL3 = new ModelRenderer(this, 0, 82);
        RBL3.addBox(0F, 6.5F, -0.5F, 1, 3, 1);
        setRotation(RBL3, 0F, 0F, 1.396263F - correction);
        RBL4 = new ModelRenderer(this, 0, 76);
        RBL4.addBox(-10.5F, 1.5F, -0.5F, 2, 2, 1);
        setRotation(RBL4, 0F, 0F, 0F - correction);
        LFL1 = new ModelRenderer(this, 0, 95);
        LFL1.addBox(-6F, -1F, -1F, 6, 2, 2);
        LFL1.setRotationPoint(3F, 20F, -2F);
        setRotation(LFL1, 0F, -2.443461F, -0.3490659F - correction);
        LFL2 = new ModelRenderer(this, 0, 88);
        LFL2.addBox(-6F, 1F, -0.5F, 1, 3, 1);
        setRotation(LFL2, 0F, 0F, 0.3490659F - correction);
        LFL3 = new ModelRenderer(this, 0, 82);
        LFL3.addBox(0F, 6.5F, -0.5F, 1, 3, 1);
        setRotation(LFL3, 0F, 0F, 1.396263F - correction);
        LFL4 = new ModelRenderer(this, 0, 76);
        LFL4.addBox(-10.5F, 1.5F, -0.5F, 2, 2, 1);
        setRotation(LFL4, 0F, 0F, 0F - correction);
        LML1 = new ModelRenderer(this, 0, 95);
        LML1.addBox(-6F, -1F, -1F, 6, 2, 2);
        LML1.setRotationPoint(4F, 20F, 2F);
        setRotation(LML1, 0F, 3.141593F, -0.3490659F - correction);
        LML2 = new ModelRenderer(this, 0, 88);
        LML2.addBox(-6F, 1F, -0.5F, 1, 3, 1);
        setRotation(LML2, 0F, 0F, 0.3490659F - correction);
        LML3 = new ModelRenderer(this, 0, 82);
        LML3.addBox(0F, 6.5F, -0.5F, 1, 3, 1);
        setRotation(LML3, 0F, 0F, 1.396263F - correction);
        LML4 = new ModelRenderer(this, 0, 76);
        LML4.addBox(-10.5F, 1.5F, -0.5F, 2, 2, 1);
        setRotation(LML4, 0F, 0F, 0F - correction);
        LBL1 = new ModelRenderer(this, 0, 95);
        LBL1.addBox(-6F, -1F, -1F, 6, 2, 2);
        LBL1.setRotationPoint(4F, 20F, 7F);
        setRotation(LBL1, 0F, 2.617994F, -0.3490659F - correction);
        LBL2 = new ModelRenderer(this, 0, 88);
        LBL2.addBox(-6F, 1F, -0.5F, 1, 3, 1);
        setRotation(LBL2, 0F, 0F, 0.3490659F - correction);
        LBL3 = new ModelRenderer(this, 0, 82);
        LBL3.addBox(0F, 6.5F, -0.5F, 1, 3, 1);
        setRotation(LBL3, 0F, 0F, 1.396263F - correction);
        LBL4 = new ModelRenderer(this, 0, 76);
        LBL4.addBox(-10.5F, 1.5F, -0.5F, 2, 2, 1);
        setRotation(LBL4, 0F, 0F, 0F - correction);

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
        HeadMain.addChild(Eyes);
        HeadMain.addChild(HeadTop);
        HeadMain.addChild(HeadFront);
        HeadMain.addChild(Nose1);
        HeadMain.addChild(Nose2);
        HeadMain.addChild(Ant1);
        HeadMain.addChild(AntR2);
        HeadMain.addChild(AntL2);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        HeadMain.render(unitPixel);
        Ab.render(unitPixel);
        AbSideR.render(unitPixel);
        AbSideL.render(unitPixel);
        AbTop.render(unitPixel);
        AbBack.render(unitPixel);
        RFL1.render(unitPixel);
        RML1.render(unitPixel);
        RBL1.render(unitPixel);
        LFL1.render(unitPixel);
        LML1.render(unitPixel);
        LBL1.render(unitPixel);
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
        float correction = 0.3490659F;
        float legMovement = MathHelper.cos(limbSwing * 2.5F) * 0.9F * prevLimbSwing;
        LBL1.rotateAngleX = legMovement - correction;
        LML1.rotateAngleX = -legMovement;
        LFL1.rotateAngleX = legMovement + correction;
        RBL1.rotateAngleX = legMovement + correction;
        RML1.rotateAngleX = -legMovement;
        RFL1.rotateAngleX = legMovement - correction;
    }

}
