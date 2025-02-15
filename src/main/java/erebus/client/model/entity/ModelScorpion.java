package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityScorpion;

@SideOnly(Side.CLIENT)
public class ModelScorpion extends ModelBase {

    ModelRenderer RMand;
    ModelRenderer LMand;
    ModelRenderer Head;
    ModelRenderer EyeL;
    ModelRenderer EyeR;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer RBL1;
    ModelRenderer RBL2;
    ModelRenderer RBL3;
    ModelRenderer RBL4;
    ModelRenderer RML1;
    ModelRenderer RML2;
    ModelRenderer RML3;
    ModelRenderer RML4;
    ModelRenderer RFL1;
    ModelRenderer RFL2;
    ModelRenderer RFL3;
    ModelRenderer RFL4;
    ModelRenderer RFFL1;
    ModelRenderer RFFL2;
    ModelRenderer RFFL3;
    ModelRenderer RFFL4;
    ModelRenderer LFFL1;
    ModelRenderer LFFL2;
    ModelRenderer LFFL3;
    ModelRenderer LFFL4;
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
    ModelRenderer ClawR1;
    ModelRenderer ClawR2;
    ModelRenderer ClawR3;
    ModelRenderer ClawR4;
    ModelRenderer ClawR5Top;
    ModelRenderer ClawR5Bot;
    ModelRenderer ClawL1;
    ModelRenderer ClawL2;
    ModelRenderer ClawL3;
    ModelRenderer ClawL4;
    ModelRenderer ClawL5Top;
    ModelRenderer ClawL5Bot;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer Tail6;
    ModelRenderer Sting1;
    ModelRenderer Sting2;

    public ModelScorpion() {
        textureWidth = 64;
        textureHeight = 128;
        RMand = new ModelRenderer(this, 33, 0);
        RMand.addBox(0F, -0.5F, -0.5F, 3, 2, 1);
        RMand.setRotationPoint(-1F, 18F, -5F);
        setRotation(RMand, 0F, 1.570796F, 0F);
        LMand = new ModelRenderer(this, 25, 0);
        LMand.addBox(0F, -0.5F, -0.5F, 3, 2, 1);
        LMand.setRotationPoint(1F, 18F, -5F);
        setRotation(LMand, 0F, 1.570796F, 0F);
        Head = new ModelRenderer(this, 22, 6);
        Head.addBox(-3F, -1F, -6F, 6, 3, 4);
        Head.setRotationPoint(0F, 17F, 0F);
        setRotation(Head, 0F, 0F, 0F);
        EyeL = new ModelRenderer(this, 18, 3);
        EyeL.addBox(-1F, -1.5F, -5.5F, 1, 1, 2);
        EyeL.setRotationPoint(1.5F, 17F, 0F);
        setRotation(EyeL, 0F, 0F, 0F);
        EyeR = new ModelRenderer(this, 40, 3);
        EyeR.addBox(-1F, -1.5F, -5.5F, 1, 1, 2);
        EyeR.setRotationPoint(-0.5F, 17F, 0F);
        setRotation(EyeR, 0F, 0F, 0F);
        Body1 = new ModelRenderer(this, 7, 15);
        Body1.addBox(-5.5F, -1.5F, -4.5F, 11, 3, 14);
        Body1.setRotationPoint(0F, 17F, 4F);
        setRotation(Body1, 0F, 0F, 0F);
        Body2 = new ModelRenderer(this, 9, 33);
        Body2.addBox(-3.5F, -2F, -2F, 7, 4, 17);
        Body2.setRotationPoint(0F, 17F, 0F);
        setRotation(Body2, 0F, 0F, 0F);
        RBL1 = new ModelRenderer(this, 0, 95);
        RBL1.addBox(0F, -1F, -1F, 5, 2, 2);
        RBL1.setRotationPoint(-5F, 17F, 11F);
        setRotation(RBL1, 0F, -2.443461F, -0.83490659F);
        RBL2 = new ModelRenderer(this, 0, 88);
        RBL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
        setRotation(RBL2, 0F, -0F, 1.151917F);
        RBL3 = new ModelRenderer(this, 0, 82);
        RBL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
        setRotation(RBL3, 0F, -0F, 0.8203047F);
        RBL4 = new ModelRenderer(this, 0, 76);
        RBL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
        setRotation(RBL4, 0F, -0F, 0.6981317F);
        RML1 = new ModelRenderer(this, 0, 95);
        RML1.addBox(0F, -1F, -1F, 5, 2, 2);
        RML1.setRotationPoint(-5F, 17F, 8F);
        RML1.setTextureSize(64, 128);
        RML1.mirror = true;
        setRotation(RML1, 0F, -2.879793F, -0.83490659F);
        RML2 = new ModelRenderer(this, 0, 88);
        RML2.addBox(1F, -5.5F, -1F, 4, 2, 2);
        setRotation(RML2, 0F, -0F, 1.151917F);
        RML3 = new ModelRenderer(this, 0, 82);
        RML3.addBox(5F, -4F, -0.5F, 4, 2, 1);
        setRotation(RML3, 0F, -0F, 0.8203047F);
        RML4 = new ModelRenderer(this, 0, 76);
        RML4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
        setRotation(RML4, 0F, -0F, 0.6981317F);
        RFL1 = new ModelRenderer(this, 0, 95);
        RFL1.addBox(0F, -1F, -1F, 5, 2, 2);
        RFL1.setRotationPoint(-5F, 17F, 5F);
        setRotation(RFL1, 0F, 2.879793F, -0.83490659F);
        RFL2 = new ModelRenderer(this, 0, 88);
        RFL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
        setRotation(RFL2, 0F, 0F, 1.151917F);
        RFL3 = new ModelRenderer(this, 0, 82);
        RFL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
        setRotation(RFL3, 0F, 0F, 0.8203047F);
        RFL4 = new ModelRenderer(this, 0, 76);
        RFL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
        setRotation(RFL4, 0F, 0F, 0.6981317F);
        RFFL1 = new ModelRenderer(this, 0, 95);
        RFFL1.addBox(0F, -1F, -1F, 5, 2, 2);
        RFFL1.setRotationPoint(-5F, 17F, 2F);
        setRotation(RFFL1, 0F, 2.443461F, -0.83490659F);
        RFFL2 = new ModelRenderer(this, 0, 88);
        RFFL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
        setRotation(RFFL2, 0F, 0F, 1.151917F);
        RFFL3 = new ModelRenderer(this, 0, 82);
        RFFL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
        setRotation(RFFL3, 0F, 0F, 0.8203047F);
        RFFL4 = new ModelRenderer(this, 0, 76);
        RFFL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
        setRotation(RFFL4, 0F, 0F, 0.6981317F);
        LFFL1 = new ModelRenderer(this, 0, 95);
        LFFL1.addBox(0F, -1F, -1F, 5, 2, 2);
        LFFL1.setRotationPoint(5F, 17F, 2F);
        setRotation(LFFL1, 0F, 0.6981317F, 0.3490659F);
        LFFL2 = new ModelRenderer(this, 0, 88);
        LFFL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
        setRotation(LFFL2, 0F, 0F, 1.151917F);
        LFFL3 = new ModelRenderer(this, 0, 82);
        LFFL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
        setRotation(LFFL3, 0F, 0F, 0.8203047F);
        LFFL4 = new ModelRenderer(this, 0, 76);
        LFFL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
        setRotation(LFFL4, 0F, 0F, 0.6981317F);
        LFL1 = new ModelRenderer(this, 0, 95);
        LFL1.addBox(0F, -1F, -1F, 5, 2, 2);
        LFL1.setRotationPoint(5F, 17F, 5F);
        setRotation(LFL1, 0F, 0.2617994F, 0.3490659F);
        LFL2 = new ModelRenderer(this, 0, 88);
        LFL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
        setRotation(LFL2, 0F, 0F, 1.151917F);
        LFL3 = new ModelRenderer(this, 0, 82);
        LFL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
        setRotation(LFL3, 0F, 0F, 0.8203047F);
        LFL4 = new ModelRenderer(this, 0, 76);
        LFL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
        setRotation(LFL4, 0F, 0F, 0.6981317F);
        LML1 = new ModelRenderer(this, 0, 95);
        LML1.addBox(0F, -1F, -1F, 5, 2, 2);
        LML1.setRotationPoint(5F, 17F, 8F);
        setRotation(LML1, 0F, -0.2617994F, 0.3490659F);
        LML2 = new ModelRenderer(this, 0, 88);
        LML2.addBox(1F, -5.5F, -1F, 4, 2, 2);
        setRotation(LML2, 0F, -0F, 1.151917F);
        LML3 = new ModelRenderer(this, 0, 82);
        LML3.addBox(5F, -4F, -0.5F, 4, 2, 1);
        setRotation(LML3, 0F, -0F, 0.8203047F);
        LML4 = new ModelRenderer(this, 0, 76);
        LML4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
        setRotation(LML4, 0F, -0F, 0.6981317F);
        LBL1 = new ModelRenderer(this, 0, 95);
        LBL1.addBox(0F, -1F, -1F, 5, 2, 2);
        LBL1.setRotationPoint(5F, 17F, 11F);
        setRotation(LBL1, 0F, -0.6981317F, 0.3490659F);
        LBL2 = new ModelRenderer(this, 0, 88);
        LBL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
        setRotation(LBL2, 0F, -0F, 1.151917F);
        LBL3 = new ModelRenderer(this, 0, 82);
        LBL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
        setRotation(LBL3, 0F, -0F, 0.8203047F);
        LBL4 = new ModelRenderer(this, 0, 76);
        LBL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
        setRotation(LBL4, 0F, -0F, 0.6981317F);
        ClawR1 = new ModelRenderer(this, 44, 24);
        ClawR1.addBox(-2F, -1F, -1F, 4, 2, 2);
        ClawR1.setRotationPoint(-3F, 18F, -5F);
        setRotation(ClawR1, 0F, -1.047198F, 0F);
        ClawR2 = new ModelRenderer(this, 44, 19);
        ClawR2.addBox(-5F, -1F, -4F, 6, 2, 2);
        ClawR2.setRotationPoint(-3F, 18F, -5F);
        setRotation(ClawR2, 0F, 0.523599F, 0F);
        ClawR3 = new ModelRenderer(this, 44, 12);
        ClawR3.addBox(-6F, -1.5F, 3F, 4, 3, 3);
        ClawR3.setRotationPoint(-3F, 18F, -5F);
        setRotation(ClawR3, 0F, -1.396263F, 0F);
        ClawR4 = new ModelRenderer(this, 44, 3);
        ClawR4.addBox(-9.5F, -2F, 4F, 6, 4, 4);
        ClawR4.setRotationPoint(-3F, 18F, -5F);
        setRotation(ClawR4, 0F, -1.745329F, 0F);
        ClawR5Top = new ModelRenderer(this, 43, 0);
        ClawR5Top.addBox(-8.5F, -1.5F, 10F, 4, 1, 1);
        ClawR5Top.setRotationPoint(-3F, 18F, -5F);
        setRotation(ClawR5Top, 0F, -2.268928F, 0F);
        ClawR5Bot = new ModelRenderer(this, 54, 0);
        ClawR5Bot.addBox(-8.5F, 0.5F, 10F, 4, 1, 1);
        ClawR5Bot.setRotationPoint(-3F, 18F, -5F);
        setRotation(ClawR5Bot, 0F, -2.268928F, 0F);
        ClawL1 = new ModelRenderer(this, 8, 24);
        ClawL1.addBox(-2F, -1F, -1F, 4, 2, 2);
        ClawL1.setRotationPoint(3F, 18F, -5F);
        setRotation(ClawL1, 0F, -2.094395F, 0F);
        ClawL2 = new ModelRenderer(this, 4, 19);
        ClawL2.addBox(-5F, -1F, 2F, 6, 2, 2);
        ClawL2.setRotationPoint(3F, 18F, -5F);
        setRotation(ClawL2, 0F, 2.617994F, 0F);
        ClawL3 = new ModelRenderer(this, 6, 12);
        ClawL3.addBox(-6F, -1.5F, -6F, 4, 3, 3);
        ClawL3.setRotationPoint(3F, 18F, -5F);
        setRotation(ClawL3, 0F, -1.745329F, 0F);
        ClawL4 = new ModelRenderer(this, 0, 3);
        ClawL4.addBox(-9.5F, -2F, -8F, 6, 4, 4);
        ClawL4.setRotationPoint(3F, 18F, -5F);
        setRotation(ClawL4, 0F, -1.396263F, 0F);
        ClawL5Top = new ModelRenderer(this, 0, 0);
        ClawL5Top.addBox(-8.5F, -1.5F, -11F, 4, 1, 1);
        ClawL5Top.setRotationPoint(3F, 18F, -5F);
        setRotation(ClawL5Top, 0F, -0.8726646F, 0F);
        ClawL5Bot = new ModelRenderer(this, 11, 0);
        ClawL5Bot.addBox(-8.5F, 0.5F, -11F, 4, 1, 1);
        ClawL5Bot.setRotationPoint(3F, 18F, -5F);
        setRotation(ClawL5Bot, 0F, -0.8726646F, 0F);
        Tail1 = new ModelRenderer(this, 23, 55);
        Tail1.addBox(-3F, -0.5F, -2.5F, 6, 3, 4);
        Tail1.setRotationPoint(0F, 16F, 17.5F);
        setRotation(Tail1, 0F, 0F, 0F);
        Tail2 = new ModelRenderer(this, 24, 63);
        Tail2.addBox(-2.5F, -1.5F, 0F, 5, 3, 5);
        setRotation(Tail2, 0.8726646F, 0F, 0F);
        Tail3 = new ModelRenderer(this, 24, 72);
        Tail3.addBox(-2F, -0.3F, 4F, 4, 3, 5);
        setRotation(Tail3, 1.22173F, 0F, 0F);
        Tail4 = new ModelRenderer(this, 24, 81);
        Tail4.addBox(-1.5F, 2.5F, 7.5F, 3, 3, 6);
        setRotation(Tail4, 1.570796F, 0F, 0F);
        Tail5 = new ModelRenderer(this, 25, 91);
        Tail5.addBox(-1F, 7F, 11F, 2, 2, 6);
        setRotation(Tail5, 1.919862F, 0F, 0F);
        Tail6 = new ModelRenderer(this, 25, 100);
        Tail6.addBox(-1F, 12F, 13F, 2, 2, 6);
        setRotation(Tail6, 2.268928F, 0F, 0F);
        Sting1 = new ModelRenderer(this, 24, 109);
        Sting1.addBox(-2F, 16F, 13F, 4, 4, 5);
        setRotation(Sting1, 2.617994F, 0F, 0F);
        Sting2 = new ModelRenderer(this, 27, 119);
        Sting2.addBox(-0.5F, -6.5F, 18F, 1, 1, 5);
        setRotation(Sting2, 1.570796F, 0F, 0F);

        LFFL1.addChild(LFFL2);
        LFFL1.addChild(LFFL3);
        LFFL1.addChild(LFFL4);
        LFL1.addChild(LFL2);
        LFL1.addChild(LFL3);
        LFL1.addChild(LFL4);
        LML1.addChild(LML2);
        LML1.addChild(LML3);
        LML1.addChild(LML4);
        LBL1.addChild(LBL2);
        LBL1.addChild(LBL3);
        LBL1.addChild(LBL4);
        RFFL1.addChild(RFFL2);
        RFFL1.addChild(RFFL3);
        RFFL1.addChild(RFFL4);
        RFL1.addChild(RFL2);
        RFL1.addChild(RFL3);
        RFL1.addChild(RFL4);
        RML1.addChild(RML2);
        RML1.addChild(RML3);
        RML1.addChild(RML4);
        RBL1.addChild(RBL2);
        RBL1.addChild(RBL3);
        RBL1.addChild(RBL4);
        Tail1.addChild(Tail2);
        Tail1.addChild(Tail3);
        Tail1.addChild(Tail4);
        Tail1.addChild(Tail5);
        Tail1.addChild(Tail6);
        Tail1.addChild(Sting1);
        Tail1.addChild(Sting2);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        RMand.render(unitPixel);
        LMand.render(unitPixel);
        Head.render(unitPixel);
        EyeL.render(unitPixel);
        EyeR.render(unitPixel);
        Body1.render(unitPixel);
        Body2.render(unitPixel);
        RBL1.render(unitPixel);
        RML1.render(unitPixel);
        RFL1.render(unitPixel);
        RFFL1.render(unitPixel);
        LFFL1.render(unitPixel);
        LFL1.render(unitPixel);
        LML1.render(unitPixel);
        LBL1.render(unitPixel);
        ClawR1.render(unitPixel);
        ClawR2.render(unitPixel);
        ClawR3.render(unitPixel);
        ClawR4.render(unitPixel);
        ClawR5Top.render(unitPixel);
        ClawR5Bot.render(unitPixel);
        ClawL1.render(unitPixel);
        ClawL2.render(unitPixel);
        ClawL3.render(unitPixel);
        ClawL4.render(unitPixel);
        ClawL5Top.render(unitPixel);
        ClawL5Bot.render(unitPixel);
        Tail1.render(unitPixel);
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
        EntityScorpion var8 = (EntityScorpion) entity;
        float cosz1 = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing;
        float cosz2 = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        float cozy1 = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.4F * prevLimbSwing;
        float cozy2 = MathHelper.cos(limbSwing * 1.0F) * 0.4F * prevLimbSwing;
        float cosxnz1 = MathHelper.cos(limbSwing / 3.0F + (float) Math.PI) * 0.1F * prevLimbSwing;
        float cosxnz2 = MathHelper.cos(limbSwing / 3.0F + (float) Math.PI) * 0.05F * prevLimbSwing;
        LBL1.rotateAngleZ = cosz1 - 0.3F;
        LML1.rotateAngleZ = cosz2 - 0.3F;
        LFL1.rotateAngleZ = cosz1 - 0.3F;
        LFFL1.rotateAngleZ = cosz2 - 0.3F;
        RBL1.rotateAngleZ = -cosz2 + 0.3F;
        RML1.rotateAngleZ = -cosz1 + 0.3F;
        RFL1.rotateAngleZ = -cosz2 + 0.3F;
        RFFL1.rotateAngleZ = -cosz1 + 0.3F;
        LBL1.rotateAngleY = cozy1 - 0.6981317F;
        LML1.rotateAngleY = cozy2 - 0.2617994F;
        LFL1.rotateAngleY = cozy1 + 0.2617994F;
        LFFL1.rotateAngleY = cozy2 + 0.6981317F;
        RBL1.rotateAngleY = -cozy2 - 2.443461F;
        RML1.rotateAngleY = -cozy1 - 2.879793F;
        RFL1.rotateAngleY = -cozy2 + 2.879793F;
        RFFL1.rotateAngleY = -cozy1 + 2.443461F;
        ClawR1.rotateAngleX = -cosxnz1;
        ClawR1.rotateAngleZ = cosxnz1;
        ClawR2.rotateAngleX = -cosxnz1;
        ClawR3.rotateAngleX = cosxnz1;
        ClawR4.rotateAngleX = cosxnz1;
        ClawR5Bot.rotateAngleX = cosxnz2;
        ClawR5Top.rotateAngleX = cosxnz2;
        ClawR5Bot.rotateAngleZ = cosxnz2;
        ClawR5Top.rotateAngleZ = cosxnz2;
        ClawL1.rotateAngleX = -cosxnz1;
        ClawL1.rotateAngleZ = cosxnz1;
        ClawL2.rotateAngleX = -cosxnz1;
        ClawL3.rotateAngleX = cosxnz1;
        ClawL4.rotateAngleX = cosxnz1;
        ClawL5Bot.rotateAngleX = cosxnz2;
        ClawL5Top.rotateAngleX = cosxnz2;
        ClawL5Bot.rotateAngleZ = cosxnz2;
        ClawL5Top.rotateAngleZ = cosxnz2;
        Tail1.rotateAngleZ = -cosxnz1;
        Tail2.rotateAngleZ = -cosxnz1;
        Tail3.rotateAngleZ = -cosxnz1;
        Tail4.rotateAngleZ = -cosxnz1;
        Tail5.rotateAngleZ = -cosxnz1;
        Tail6.rotateAngleZ = -cosxnz1;
        Sting1.rotateAngleZ = -cosxnz1;
        Sting2.rotateAngleZ = -cosxnz1;
        if (var8.captured()) {
            Tail1.rotateAngleX = EntityScorpion.stingticks;
            Tail2.rotateAngleX = EntityScorpion.stingticks + 0.8726646F;
            Tail3.rotateAngleX = EntityScorpion.stingticks + 1.22173F;
            Tail4.rotateAngleX = EntityScorpion.stingticks + 1.570796F;
            Tail5.rotateAngleX = EntityScorpion.stingticks + 1.919862F;
            Tail6.rotateAngleX = EntityScorpion.stingticks + 2.268928F;
            Sting1.rotateAngleX = EntityScorpion.stingticks + 2.617994F;
            Sting2.rotateAngleX = EntityScorpion.stingticks + 1.570796F;
            ClawR1.rotateAngleZ = 0.2943951F;
            ClawR2.rotateAngleX = -0F;
            ClawR2.rotateAngleZ = 0.2943951F;
            ClawR3.rotateAngleZ = 0.2943951F;
            ClawR4.rotateAngleZ = 0.2943951F;
            ClawR5Bot.rotateAngleX = 0.14719755F;
            ClawR5Top.rotateAngleX = 0.14719755F;
            ClawL1.rotateAngleZ = -0.2943951F;
            ClawL2.rotateAngleZ = -0.2943951F;
            ClawL2.rotateAngleX = 0F;
            ClawL3.rotateAngleZ = -0.2943951F;
            ClawL4.rotateAngleZ = -0.2943951F;
            ClawL5Bot.rotateAngleX = -0.14719755F;
            ClawL5Top.rotateAngleX = -0.14719755F;
        }
        if (!var8.captured()) {
            Tail1.rotateAngleX = 0F;
            Tail2.rotateAngleX = 0.8726646F;
            Tail3.rotateAngleX = 1.22173F;
            Tail4.rotateAngleX = 1.570796F;
            Tail5.rotateAngleX = 1.919862F;
            Tail6.rotateAngleX = 2.268928F;
            Sting1.rotateAngleX = 2.617994F;
            Sting2.rotateAngleX = 1.570796F;
            ClawR1.rotateAngleZ = 0F + cosxnz1;
            ClawR2.rotateAngleX = 0F - cosxnz1;
            ClawR2.rotateAngleZ = 0F;
            ClawR3.rotateAngleZ = 0F;
            ClawR4.rotateAngleZ = 0F;
            ClawL5Bot.rotateAngleX = 0F + cosxnz2;
            ClawL5Top.rotateAngleX = 0F + cosxnz2;
            ClawL1.rotateAngleZ = 0F + cosxnz1;
            ClawL2.rotateAngleX = 0F - cosxnz1;
            ClawL2.rotateAngleZ = 0F;
            ClawL3.rotateAngleZ = 0F;
            ClawL4.rotateAngleZ = 0F;
            ClawL5Bot.rotateAngleX = 0F + cosxnz2;
            ClawL5Top.rotateAngleX = 0F + cosxnz2;
        }
        RMand.rotateAngleY = -MathHelper.cos(limbSwing * 0.5F) * 0.2F * prevLimbSwing + 1.570796F;
        LMand.rotateAngleY = -MathHelper.cos(limbSwing * 0.5F + (float) Math.PI) * 0.2F * prevLimbSwing + 1.570796F;
    }
}
