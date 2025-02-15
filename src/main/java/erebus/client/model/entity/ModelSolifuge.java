package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelSolifuge extends ModelBase {

    ModelRenderer HeadMain;
    ModelRenderer HeadTop;
    ModelRenderer HeadFront;
    ModelRenderer Neck;
    ModelRenderer REye;
    ModelRenderer LEye;
    ModelRenderer Thorax;
    ModelRenderer RMand1;
    ModelRenderer RMand2;
    ModelRenderer LMand1;
    ModelRenderer LMand2;
    ModelRenderer Ab1;
    ModelRenderer Ab2;
    ModelRenderer Ab3;
    ModelRenderer Ab4;
    ModelRenderer RBL1;
    ModelRenderer RBL2;
    ModelRenderer RBL3;
    ModelRenderer RBL4;
    ModelRenderer LBL1;
    ModelRenderer LBL2;
    ModelRenderer LBL3;
    ModelRenderer LBL4;
    ModelRenderer RMBL1;
    ModelRenderer RMBL2;
    ModelRenderer RMBL3;
    ModelRenderer RMBL4;
    ModelRenderer LMBL1;
    ModelRenderer LMBL2;
    ModelRenderer LMBL3;
    ModelRenderer LMBL4;
    ModelRenderer RMFL1;
    ModelRenderer RMFL2;
    ModelRenderer RMFL3;
    ModelRenderer RMFL4;
    ModelRenderer LMFL1;
    ModelRenderer LMFL2;
    ModelRenderer LMFL3;
    ModelRenderer LMFL4;
    ModelRenderer RFL1;
    ModelRenderer RFL2;
    ModelRenderer RFL3;
    ModelRenderer RFL4;
    ModelRenderer LFL1;
    ModelRenderer LFL2;
    ModelRenderer LFL3;
    ModelRenderer LFL4;
    ModelRenderer ClawR1;
    ModelRenderer ClawR2;
    ModelRenderer ClawR3;
    ModelRenderer ClawL1;
    ModelRenderer ClawL2;
    ModelRenderer ClawL3;

    public ModelSolifuge() {
        textureWidth = 64;
        textureHeight = 128;

        HeadMain = new ModelRenderer(this, 21, 34);
        HeadMain.addBox(-3.5F, -1F, -3F, 7, 4, 4);
        HeadMain.setRotationPoint(0F, 17F, 0F);
        setRotation(HeadMain, 0F, 0F, 0F);
        HeadTop = new ModelRenderer(this, 24, 29);
        HeadTop.addBox(-2.5F, -2F, -3F, 5, 1, 3);
        HeadTop.setRotationPoint(0F, 17F, 0F);
        setRotation(HeadTop, 0F, 0F, 0F);
        HeadFront = new ModelRenderer(this, 22, 21);
        HeadFront.addBox(-3F, -1F, -6F, 6, 3, 4);
        HeadFront.setRotationPoint(0F, 17F, 0F);
        setRotation(HeadFront, 0F, 0F, 0F);
        Neck = new ModelRenderer(this, 25, 43);
        Neck.addBox(-2.5F, -0.5F, -3.5F, 5, 2, 2);
        Neck.setRotationPoint(0F, 17F, 4F);
        setRotation(Neck, 0F, 0F, 0F);
        REye = new ModelRenderer(this, 33, 9);
        REye.addBox(-1.2F, -1.5F, -5F, 1, 1, 2);
        REye.setRotationPoint(0F, 17F, 0F);
        setRotation(REye, 0F, 0F, 0F);
        LEye = new ModelRenderer(this, 25, 9);
        LEye.addBox(0.2F, -1.5F, -5F, 1, 1, 2);
        LEye.setRotationPoint(0F, 17F, 0F);
        setRotation(LEye, 0F, 0F, 0F);
        Thorax = new ModelRenderer(this, 16, 48);
        Thorax.addBox(-3.5F, -1.5F, -1.5F, 7, 3, 9);
        Thorax.setRotationPoint(0F, 17F, 4F);
        setRotation(Thorax, 0F, 0F, 0F);
        RMand1 = new ModelRenderer(this, 33, 13);
        RMand1.addBox(-3.5F, -2.5F, -9.5F, 3, 3, 4);
        RMand1.setRotationPoint(0F, 17F, 0F);
        setRotation(RMand1, 0.3490659F, 0F, 0F);
        RMand2 = new ModelRenderer(this, 40, 7);
        RMand2.addBox(-5F, -1.5F, -11F, 1, 2, 3);
        RMand2.setRotationPoint(0F, 17F, 0F);
        setRotation(RMand2, 0.3490659F, -0.2617994F, 0F);
        LMand1 = new ModelRenderer(this, 17, 13);
        LMand1.addBox(0.5F, -2.5F, -9.5F, 3, 3, 4);
        LMand1.setRotationPoint(0F, 17F, 0F);
        setRotation(LMand1, 0.3490659F, 0F, 0F);
        LMand2 = new ModelRenderer(this, 16, 7);
        LMand2.addBox(4F, -1.5F, -11F, 1, 2, 3);
        LMand2.setRotationPoint(0F, 17F, 0F);
        setRotation(LMand2, 0.3490659F, 0.2617994F, 0F);
        Ab1 = new ModelRenderer(this, 20, 61);
        Ab1.addBox(-4F, -1.5F, 7.5F, 8, 5, 4);
        Ab1.setRotationPoint(0F, 16F, 4F);
        setRotation(Ab1, 0F, 0F, 0F);
        Ab2 = new ModelRenderer(this, 18, 71);
        Ab2.addBox(-5F, -2F, 11.5F, 10, 6, 4);
        Ab2.setRotationPoint(0F, 16F, 4F);
        setRotation(Ab2, 0F, 0F, 0F);
        Ab3 = new ModelRenderer(this, 20, 82);
        Ab3.addBox(-4F, -1.5F, 15.5F, 8, 5, 4);
        Ab3.setRotationPoint(0F, 16F, 4F);
        setRotation(Ab3, 0F, 0F, 0F);
        Ab4 = new ModelRenderer(this, 23, 92);
        Ab4.addBox(-3F, -1F, 19.5F, 6, 4, 3);
        Ab4.setRotationPoint(0F, 16F, 4F);
        setRotation(Ab4, 0F, 0F, 0F);
        RBL1 = new ModelRenderer(this, 0, 95);
        RBL1.addBox(0F, -1F, -1F, 9, 2, 2);
        RBL1.setRotationPoint(-3F, 17F, 10F);
        setRotation(RBL1, 0F, -2.443461F, 0.2617994F);
        RBL2 = new ModelRenderer(this, 0, 88);
        RBL2.addBox(7F, 3F, -1F, 2, 4, 2);
        setRotation(RBL2, 0F, 0F, -0.3490658F);
        RBL3 = new ModelRenderer(this, 0, 82);
        RBL3.addBox(7F, 6.5F, -0.5F, 2, 4, 1);
        setRotation(RBL3, 0F, 0F, -0.3490658F);
        RBL4 = new ModelRenderer(this, 0, 76);
        RBL4.addBox(5.5F, 11F, -0.5F, 1, 4, 1);
        setRotation(RBL4, 0F, 0F, -0.5235988F);
        LBL1 = new ModelRenderer(this, 0, 95);
        LBL1.addBox(0F, -1F, -1F, 9, 2, 2);
        LBL1.setRotationPoint(3F, 17F, 10F);
        setRotation(LBL1, 0F, -0.6981317F, -0.2617994F);
        LBL2 = new ModelRenderer(this, 0, 88);
        LBL2.addBox(7F, 3F, -1F, 2, 4, 2);
        setRotation(LBL2, 0F, 0F, -0.3490658F);
        LBL3 = new ModelRenderer(this, 0, 82);
        LBL3.addBox(7F, 6.5F, -0.5F, 2, 4, 1);
        setRotation(LBL3, 0F, 0F, -0.3490658F);
        LBL4 = new ModelRenderer(this, 0, 76);
        LBL4.addBox(5.5F, 11F, -0.5F, 1, 4, 1);
        setRotation(LBL4, 0F, 0F, -0.5235988F);
        RMBL1 = new ModelRenderer(this, 0, 95);
        RMBL1.addBox(0F, -1F, -1F, 9, 2, 2);
        RMBL1.setRotationPoint(-3F, 17F, 8F);
        setRotation(RMBL1, 0F, -2.879793F, 0.2617994F);
        RMBL2 = new ModelRenderer(this, 0, 88);
        RMBL2.addBox(7F, 3F, -1F, 2, 4, 2);
        setRotation(RMBL2, 0F, 0F, -0.3490658F);
        RMBL3 = new ModelRenderer(this, 0, 82);
        RMBL3.addBox(7F, 6.5F, -0.5F, 2, 4, 1);
        setRotation(RMBL3, 0F, 0F, -0.3490658F);
        RMBL4 = new ModelRenderer(this, 0, 76);
        RMBL4.addBox(5.5F, 11F, -0.5F, 1, 4, 1);
        setRotation(RMBL4, 0F, 0F, -0.5235988F);
        LMBL1 = new ModelRenderer(this, 0, 95);
        LMBL1.addBox(0F, -1F, -1F, 9, 2, 2);
        LMBL1.setRotationPoint(3F, 17F, 8F);
        setRotation(LMBL1, 0F, -0.3490659F, -0.2617994F);
        LMBL2 = new ModelRenderer(this, 0, 88);
        LMBL2.addBox(7F, 3F, -1F, 2, 4, 2);
        setRotation(LMBL2, 0F, 0F, -0.3490658F);
        LMBL3 = new ModelRenderer(this, 0, 82);
        LMBL3.addBox(7F, 6.5F, -0.5F, 2, 4, 1);
        setRotation(LMBL3, 0F, 0F, -0.3490658F);
        LMBL4 = new ModelRenderer(this, 0, 76);
        LMBL4.addBox(5.5F, 11F, -0.5F, 1, 4, 1);
        setRotation(LMBL4, 0F, 0F, -0.5235988F);
        RMFL1 = new ModelRenderer(this, 0, 95);
        RMFL1.addBox(0F, -1F, -1F, 9, 2, 2);
        RMFL1.setRotationPoint(-3F, 17F, 6F);
        setRotation(RMFL1, 0F, 2.879793F, 0.2617994F);
        RMFL2 = new ModelRenderer(this, 0, 88);
        RMFL2.addBox(7F, 3F, -1F, 2, 4, 2);
        setRotation(RMFL2, 0F, 0F, -0.3490658F);
        RMFL3 = new ModelRenderer(this, 0, 82);
        RMFL3.addBox(7F, 6.5F, -0.5F, 2, 4, 1);
        setRotation(RMFL3, 0F, 0F, -0.3490658F);
        RMFL4 = new ModelRenderer(this, 0, 76);
        RMFL4.addBox(5.5F, 11F, -0.5F, 1, 4, 1);
        setRotation(RMFL4, 0F, 0F, -0.5235988F);
        LMFL1 = new ModelRenderer(this, 0, 95);
        LMFL1.addBox(0F, -1F, -1F, 9, 2, 2);
        LMFL1.setRotationPoint(3F, 17F, 6F);
        setRotation(LMFL1, 0F, 0.1745329F, -0.2617994F);
        LMFL2 = new ModelRenderer(this, 0, 88);
        LMFL2.addBox(7F, 3F, -1F, 2, 4, 2);
        setRotation(LMFL2, 0F, 0F, -0.3490658F);
        LMFL3 = new ModelRenderer(this, 0, 82);
        LMFL3.addBox(7F, 6.5F, -0.5F, 2, 4, 1);
        setRotation(LMFL3, 0F, 0F, -0.3490658F);
        LMFL4 = new ModelRenderer(this, 0, 76);
        LMFL4.addBox(5.5F, 11F, -0.5F, 1, 4, 1);
        setRotation(LMFL4, 0F, 0F, -0.5235988F);
        RFL1 = new ModelRenderer(this, 0, 95);
        RFL1.addBox(0F, -1F, -1F, 9, 2, 2);
        RFL1.setRotationPoint(-3F, 17F, 4F);
        setRotation(RFL1, 0F, 2.443461F, 0.2617994F);
        RFL2 = new ModelRenderer(this, 0, 88);
        RFL2.addBox(7F, 3F, -1F, 2, 4, 2);
        setRotation(RFL2, 0F, 0F, -0.3490658F);
        RFL3 = new ModelRenderer(this, 0, 82);
        RFL3.addBox(7F, 6.5F, -0.5F, 2, 4, 1);
        setRotation(RFL3, 0F, 0F, -0.3490658F);
        RFL4 = new ModelRenderer(this, 0, 76);
        RFL4.addBox(5.5F, 11F, -0.5F, 1, 4, 1);
        setRotation(RFL4, 0F, 0F, -0.5235988F);
        LFL1 = new ModelRenderer(this, 0, 95);
        LFL1.addBox(0F, -1F, -1F, 9, 2, 2);
        LFL1.setRotationPoint(3F, 17F, 4F);
        setRotation(LFL1, 0F, 0.6981317F, -0.2617994F);
        LFL2 = new ModelRenderer(this, 0, 88);
        LFL2.addBox(7F, 3F, -1F, 2, 4, 2);
        setRotation(LFL2, 0F, 0F, -0.3490658F);
        LFL3 = new ModelRenderer(this, 0, 82);
        LFL3.addBox(7F, 6.5F, -0.5F, 2, 4, 1);
        setRotation(LFL3, 0F, 0F, -0.3490658F);
        LFL4 = new ModelRenderer(this, 0, 76);
        LFL4.addBox(5.5F, 11F, -0.5F, 1, 4, 1);
        setRotation(LFL4, 0F, 0F, -0.5235988F);
        ClawR1 = new ModelRenderer(this, 42, 29);
        ClawR1.addBox(-9F, -1F, -1F, 9, 2, 2);
        ClawR1.setRotationPoint(-2F, 18F, 0F);
        setRotation(ClawR1, 0F, -1.047198F, 0F);
        ClawR2 = new ModelRenderer(this, 49, 16);
        ClawR2.addBox(-1F, -11F, -8F, 2, 7, 2);
        setRotation(ClawR2, 0.5235988F, 1.5707968F, 0F);
        ClawR3 = new ModelRenderer(this, 44, 26);
        ClawR3.addBox(-19F, -6F, -0.5F, 8, 1, 1);
        setRotation(ClawR3, 0F, 0F, 0F);
        ClawL1 = new ModelRenderer(this, 0, 29);
        ClawL1.addBox(-9F, -1F, -1F, 9, 2, 2);
        ClawL1.setRotationPoint(2F, 18F, 0F);
        setRotation(ClawL1, 0F, -2.094395F, 0F);
        ClawL2 = new ModelRenderer(this, 7, 16);
        ClawL2.addBox(-1F, -11F, -8F, 2, 7, 2);
        setRotation(ClawL2, 0.5235988F, 1.5707962F, 0F);
        ClawL3 = new ModelRenderer(this, 2, 26);
        ClawL3.addBox(-19F, -6F, -0.5F, 8, 1, 1);
        setRotation(ClawL3, 0F, 0F, 0F);

        LFL1.addChild(LFL2);
        LFL1.addChild(LFL3);
        LFL1.addChild(LFL4);
        LMFL1.addChild(LMFL2);
        LMFL1.addChild(LMFL3);
        LMFL1.addChild(LMFL4);
        LMBL1.addChild(LMBL2);
        LMBL1.addChild(LMBL3);
        LMBL1.addChild(LMBL4);
        LBL1.addChild(LBL2);
        LBL1.addChild(LBL3);
        LBL1.addChild(LBL4);
        RFL1.addChild(RFL2);
        RFL1.addChild(RFL3);
        RFL1.addChild(RFL4);
        RMFL1.addChild(RMFL2);
        RMFL1.addChild(RMFL3);
        RMFL1.addChild(RMFL4);
        RMBL1.addChild(RMBL2);
        RMBL1.addChild(RMBL3);
        RMBL1.addChild(RMBL4);
        RBL1.addChild(RBL2);
        RBL1.addChild(RBL3);
        RBL1.addChild(RBL4);
        ClawR1.addChild(ClawR2);
        ClawR1.addChild(ClawR3);
        ClawL1.addChild(ClawL2);
        ClawL1.addChild(ClawL3);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        HeadMain.render(unitPixel);
        HeadTop.render(unitPixel);
        HeadFront.render(unitPixel);
        Neck.render(unitPixel);
        REye.render(unitPixel);
        LEye.render(unitPixel);
        Thorax.render(unitPixel);
        RMand1.render(unitPixel);
        RMand2.render(unitPixel);
        LMand1.render(unitPixel);
        LMand2.render(unitPixel);
        Ab1.render(unitPixel);
        Ab2.render(unitPixel);
        Ab3.render(unitPixel);
        Ab4.render(unitPixel);
        RBL1.render(unitPixel);
        LBL1.render(unitPixel);
        RMBL1.render(unitPixel);
        LMBL1.render(unitPixel);
        RMFL1.render(unitPixel);
        LMFL1.render(unitPixel);
        RFL1.render(unitPixel);
        LFL1.render(unitPixel);
        ClawR1.render(unitPixel);
        ClawL1.render(unitPixel);
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
        float cosz1 = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing;
        float cosz2 = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        float cozy1 = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.4F * prevLimbSwing;
        float cozy2 = MathHelper.cos(limbSwing * 1.0F) * 0.4F * prevLimbSwing;
        float cosxnz1 = MathHelper.cos(limbSwing * 0.5F + (float) Math.PI) * 0.3F * prevLimbSwing;
        LBL1.rotateAngleZ = cosz1 - 0.3F;
        LMBL1.rotateAngleZ = cosz2 - 0.3F;
        LMFL1.rotateAngleZ = cosz1 - 0.3F;
        LFL1.rotateAngleZ = cosz2 - 0.3F;
        RBL1.rotateAngleZ = -cosz2 + 0.3F;
        RMBL1.rotateAngleZ = -cosz1 + 0.3F;
        RMFL1.rotateAngleZ = -cosz2 + 0.3F;
        RFL1.rotateAngleZ = -cosz1 + 0.3F;
        LBL1.rotateAngleY = cozy1 - 0.6981317F;
        LMBL1.rotateAngleY = cozy2 - 0.2617994F;
        LMFL1.rotateAngleY = cozy1 + 0.2617994F;
        LFL1.rotateAngleY = cozy2 + 0.6981317F;
        RBL1.rotateAngleY = -cozy2 - 2.443461F;
        RMBL1.rotateAngleY = -cozy1 - 2.879793F;
        RMFL1.rotateAngleY = -cozy2 + 2.879793F;
        RFL1.rotateAngleY = -cozy1 + 2.443461F;
        ClawR1.rotateAngleX = -cosxnz1;
        ClawR1.rotateAngleZ = cosxnz1;
        ClawL1.rotateAngleX = -cosxnz1;
        ClawL1.rotateAngleZ = cosxnz1;
        RMand1.rotateAngleY = -MathHelper.cos(limbSwing * 0.5F) * 0.2F * prevLimbSwing;
        RMand2.rotateAngleY = -MathHelper.cos(limbSwing * 0.5F) * 0.2F * prevLimbSwing - 0.2617994F;
        LMand1.rotateAngleY = -MathHelper.cos(limbSwing * 0.5F + (float) Math.PI) * 0.2F * prevLimbSwing;
        LMand2.rotateAngleY = -MathHelper.cos(limbSwing * 0.5F + (float) Math.PI) * 0.2F * prevLimbSwing + 0.2617994F;
    }
}
