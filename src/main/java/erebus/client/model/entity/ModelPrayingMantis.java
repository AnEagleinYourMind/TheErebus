package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityPrayingMantis;

@SideOnly(Side.CLIENT)
public class ModelPrayingMantis extends ModelBase {

    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer Head3;
    ModelRenderer REye;
    ModelRenderer LEye;
    ModelRenderer RAnt;
    ModelRenderer LAnt1;
    ModelRenderer Neck;
    ModelRenderer Thorax1;
    ModelRenderer Ab1;
    ModelRenderer Ab2;
    ModelRenderer Ab3;
    ModelRenderer Ab4;
    ModelRenderer LArm1;
    ModelRenderer LArm2;
    ModelRenderer LArm3;
    ModelRenderer LArm4;
    ModelRenderer RArm1;
    ModelRenderer RArm2;
    ModelRenderer RArm3;
    ModelRenderer RArm4;
    ModelRenderer RFLeg1;
    ModelRenderer RFLeg2;
    ModelRenderer RFLeg3;
    ModelRenderer RFLeg4;
    ModelRenderer RFLeg5;
    ModelRenderer RFLeg6;
    ModelRenderer LFLeg1;
    ModelRenderer LFLeg2;
    ModelRenderer LFLeg3;
    ModelRenderer LFLeg4;
    ModelRenderer LFLeg5;
    ModelRenderer LFLeg6;
    ModelRenderer RBLeg1;
    ModelRenderer RBLeg2;
    ModelRenderer RBLeg3;
    ModelRenderer RBLeg4;
    ModelRenderer RBLeg5;
    ModelRenderer RBLeg6;
    ModelRenderer LBLeg1;
    ModelRenderer LBLeg2;
    ModelRenderer LBLeg3;
    ModelRenderer LBLeg4;
    ModelRenderer LBLeg5;
    ModelRenderer LBLeg6;

    public ModelPrayingMantis() {
        textureWidth = 64;
        textureHeight = 128;
        Head1 = new ModelRenderer(this, 20, 11);
        Head1.addBox(-3.5F, -3F, -2.5F, 7, 4, 4);
        Head1.setRotationPoint(0F, -6F, -12F);
        setRotation(Head1, -0.2617994F, 0F, 0F);
        Head2 = new ModelRenderer(this, 23, 5);
        Head2.addBox(-2.5F, 1F, -2.5F, 5, 2, 3);
        Head2.setRotationPoint(0F, -6F, -12F);
        setRotation(Head2, -0.6108652F, 0F, 0F);
        Head3 = new ModelRenderer(this, 26, 0);
        Head3.addBox(-1.5F, 3F, -2F, 3, 2, 2);
        Head3.setRotationPoint(0F, -6F, -12F);
        setRotation(Head3, -0.6283185F, 0F, 0F);
        REye = new ModelRenderer(this, 40, 0);
        REye.addBox(-4F, -4F, -3F, 3, 4, 3);
        REye.setRotationPoint(0F, -6F, -12F);
        setRotation(REye, -0.2617994F, 0F, -0.2617994F);
        LEye = new ModelRenderer(this, 10, 0);
        LEye.addBox(1F, -4F, -3F, 3, 4, 3);
        LEye.setRotationPoint(0F, -6F, -12F);
        setRotation(LEye, -0.2617994F, 0F, 0.2617994F);
        RAnt = new ModelRenderer(this, 0, 99);
        RAnt.addBox(0F, -11F, -1F, 1, 8, 1);
        RAnt.setRotationPoint(0F, -6F, -12F);
        setRotation(RAnt, 0F, 0F, -0.3490659F);
        LAnt1 = new ModelRenderer(this, 0, 99);
        LAnt1.addBox(-1F, -11F, -1F, 1, 8, 1);
        LAnt1.setRotationPoint(0F, -6F, -12F);
        setRotation(LAnt1, 0F, 0F, 0.3490659F);
        Neck = new ModelRenderer(this, 23, 20);
        Neck.addBox(-2F, -4F, -2.5F, 4, 5, 4);
        Neck.setRotationPoint(0F, -4F, -8F);
        setRotation(Neck, 0.9599311F, 0F, 0F);
        Thorax1 = new ModelRenderer(this, 21, 30);
        Thorax1.addBox(-2.5F, 0F, -3F, 5, 10, 5);
        Thorax1.setRotationPoint(0F, -4F, -8F);
        setRotation(Thorax1, 0.6981317F, 0F, 0F);
        Ab1 = new ModelRenderer(this, 19, 46);
        Ab1.addBox(-3F, 10F, -4F, 6, 10, 6);
        Ab1.setRotationPoint(0F, -4F, -8F);
        setRotation(Ab1, 0.7330383F, 0F, 0F);
        Ab2 = new ModelRenderer(this, 16, 63);
        Ab2.addBox(-4F, 17F, -9F, 8, 12, 7);
        Ab2.setRotationPoint(0F, -4F, -8F);
        setRotation(Ab2, 0.9773844F, 0F, 0F);
        Ab3 = new ModelRenderer(this, 19, 83);
        Ab3.addBox(-3F, 29F, -8.5F, 6, 5, 6);
        Ab3.setRotationPoint(0F, -4F, -8F);
        setRotation(Ab3, 0.9773844F, 0F, 0F);
        Ab4 = new ModelRenderer(this, 23, 95);
        Ab4.addBox(-2F, 34F, -7F, 4, 2, 4);
        Ab4.setRotationPoint(0F, -4F, -8F);
        setRotation(Ab4, 0.9773844F, 0F, 0F);
        LArm1 = new ModelRenderer(this, 0, 20);
        LArm1.addBox(0F, 0F, -1.5F, 2, 10, 3);
        LArm1.setRotationPoint(2F, -2F, -9F);
        setRotation(LArm1, 0.3490659F, 0F, 0F);
        LArm2 = new ModelRenderer(this, 0, 34);
        LArm2.addBox(-0.5F, -9F, 4.5F, 3, 10, 3);
        LArm2.setRotationPoint(2F, -2F, -9F);
        setRotation(LArm2, -2.268928F, 0F, 0F);
        LArm3 = new ModelRenderer(this, 0, 48);
        LArm3.addBox(0F, 2.5F, -7.5F, 2, 11, 2);
        LArm3.setRotationPoint(2F, -2F, -9F);
        setRotation(LArm3, 0.3490659F, 0F, 0F);
        LArm4 = new ModelRenderer(this, 0, 62);
        LArm4.addBox(0F, 3.5F, -8.5F, 2, 8, 1);
        LArm4.setRotationPoint(2F, -2F, -9F);
        setRotation(LArm4, 0.3490659F, 0F, 0F);
        RArm1 = new ModelRenderer(this, 54, 20);
        RArm1.addBox(-2F, 0F, -1.5F, 2, 10, 3);
        RArm1.setRotationPoint(-2F, -2F, -9F);
        setRotation(RArm1, 0.3490659F, 0F, 0F);
        RArm2 = new ModelRenderer(this, 52, 34);
        RArm2.addBox(-2.5F, -9F, 4.5F, 3, 10, 3);
        RArm2.setRotationPoint(-2F, -2F, -9F);
        setRotation(RArm2, -2.268928F, 0F, 0F);
        RArm3 = new ModelRenderer(this, 56, 48);
        RArm3.addBox(-2F, 2.5F, -7.5F, 2, 11, 2);
        RArm3.setRotationPoint(-2F, -2F, -9F);
        setRotation(RArm3, 0.3490659F, 0F, 0F);
        RArm4 = new ModelRenderer(this, 58, 62);
        RArm4.addBox(-2F, 3.5F, -8.5F, 2, 8, 1);
        RArm4.setRotationPoint(-2F, -2F, -9F);
        setRotation(RArm4, 0.3490659F, 0F, 0F);
        RFLeg1 = new ModelRenderer(this, 52, 72);
        RFLeg1.addBox(-1.5F, 0F, -2F, 3, 5, 3);
        RFLeg1.setRotationPoint(-2F, 5F, -2F);
        setRotation(RFLeg1, -0.3490659F, -0.7853982F, 0.3490659F);
        RFLeg2 = new ModelRenderer(this, 56, 81);
        RFLeg2.addBox(-1F, 5F, -1.5F, 2, 4, 2);
        RFLeg2.setRotationPoint(-2F, 5F, -2F);
        setRotation(RFLeg2, -0.3490659F, -0.7853982F, 0.3490659F);
        RFLeg3 = new ModelRenderer(this, 21, 89);
        RFLeg3.addBox(-9F, 8F, -1F, 9, 2, 1);
        RFLeg3.setRotationPoint(-2F, 5F, -2F);
        setRotation(RFLeg3, -0.3490659F, -0.7853982F, 0.3490659F);
        RFLeg4 = new ModelRenderer(this, 60, 99);
        RFLeg4.addBox(-9F, 10F, -1F, 1, 12, 1);
        RFLeg4.setRotationPoint(-2F, 5F, -2F);
        setRotation(RFLeg4, -0.3490659F, -0.7853982F, 0.3490659F);
        RFLeg5 = new ModelRenderer(this, 56, 113);
        RFLeg5.addBox(-9.5F, 19.5F, -1.5F, 2, 2, 2);
        RFLeg5.setRotationPoint(-2F, 5F, -2F);
        setRotation(RFLeg5, -0.3490659F, -0.7853982F, 0.3490659F);
        RFLeg6 = new ModelRenderer(this, 60, 118);
        RFLeg6.addBox(-10F, 20F, -1F, 1, 4, 1);
        RFLeg6.setRotationPoint(-2F, 5F, -2F);
        setRotation(RFLeg6, -0.3490659F, -0.7853982F, 0.3490659F);
        LFLeg1 = new ModelRenderer(this, 0, 72);
        LFLeg1.addBox(-1.5F, 0F, -2F, 3, 5, 3);
        LFLeg1.setRotationPoint(2F, 5F, -2F);
        setRotation(LFLeg1, -0.3490659F, 0.7853982F, -0.3490659F);
        LFLeg2 = new ModelRenderer(this, 0, 81);
        LFLeg2.addBox(-1F, 5F, -1.5F, 2, 4, 2);
        LFLeg2.setRotationPoint(2F, 5F, -2F);
        setRotation(LFLeg2, -0.3490659F, 0.7853982F, -0.3490659F);
        LFLeg3 = new ModelRenderer(this, 21, 89);
        LFLeg3.addBox(0F, 8F, -1F, 9, 2, 1);
        LFLeg3.setRotationPoint(2F, 5F, -2F);
        setRotation(LFLeg3, -0.3490659F, 0.7853982F, -0.3490659F);
        LFLeg4 = new ModelRenderer(this, 0, 99);
        LFLeg4.addBox(7.95F, 10F, -1F, 1, 12, 1);
        LFLeg4.setRotationPoint(2F, 5F, -2F);
        setRotation(LFLeg4, -0.3490659F, 0.7853982F, -0.3490659F);
        LFLeg5 = new ModelRenderer(this, 0, 113);
        LFLeg5.addBox(7.5F, 19.5F, -1.5F, 2, 2, 2);
        LFLeg5.setRotationPoint(2F, 5F, -2F);
        setRotation(LFLeg5, -0.3490659F, 0.7853982F, -0.3490659F);
        LFLeg6 = new ModelRenderer(this, 0, 118);
        LFLeg6.addBox(9F, 20F, -1F, 1, 4, 1);
        LFLeg6.setRotationPoint(2F, 5F, -2F);
        setRotation(LFLeg6, -0.3490659F, 0.7853982F, -0.3490659F);
        RBLeg1 = new ModelRenderer(this, 8, 95);
        RBLeg1.addBox(-1.5F, 0F, -1.5F, 3, 4, 3);
        RBLeg1.setRotationPoint(-2F, 8F, 0F);
        setRotation(RBLeg1, 0.3490659F, 0.7853982F, 0.3490659F);
        RBLeg2 = new ModelRenderer(this, 10, 103);
        RBLeg2.addBox(-1F, 4F, -1F, 2, 3, 2);
        RBLeg2.setRotationPoint(-2F, 8F, 0F);
        setRotation(RBLeg2, 0.3490659F, 0.7853982F, 0.3490659F);
        RBLeg3 = new ModelRenderer(this, 21, 89);
        RBLeg3.addBox(-9F, 6F, -0.5F, 9, 2, 1);
        RBLeg3.setRotationPoint(-2F, 8F, 0F);
        setRotation(RBLeg3, 0.3490659F, 0.7853982F, 0.3490659F);
        RBLeg4 = new ModelRenderer(this, 18, 109);
        RBLeg4.addBox(-9F, 8F, -0.5F, 1, 10, 1);
        RBLeg4.setRotationPoint(-2F, 8F, 0F);
        setRotation(RBLeg4, 0.3490659F, 0.7853982F, 0.3490659F);
        RBLeg5 = new ModelRenderer(this, 14, 121);
        RBLeg5.addBox(-9.5F, 15.5F, -1F, 2, 2, 2);
        RBLeg5.setRotationPoint(-2F, 8F, 0F);
        setRotation(RBLeg5, 0.3490659F, 0.7853982F, 0.3490659F);
        RBLeg6 = new ModelRenderer(this, 9, 120);
        RBLeg6.addBox(-10F, 16F, -0.5F, 1, 4, 1);
        RBLeg6.setRotationPoint(-2F, 8F, 0F);
        setRotation(RBLeg6, 0.3490659F, 0.7853982F, 0.3490659F);
        LBLeg1 = new ModelRenderer(this, 42, 95);
        LBLeg1.addBox(-1.5F, 0F, -1.5F, 3, 4, 3);
        LBLeg1.setRotationPoint(2F, 8F, 0F);
        setRotation(LBLeg1, 0.3490659F, -0.7853982F, -0.3490659F);
        LBLeg2 = new ModelRenderer(this, 44, 103);
        LBLeg2.addBox(-1F, 4F, -1F, 2, 3, 2);
        LBLeg2.setRotationPoint(2F, 8F, 0F);
        setRotation(LBLeg2, 0.3490659F, -0.7853982F, -0.3490659F);
        LBLeg3 = new ModelRenderer(this, 21, 89);
        LBLeg3.addBox(0F, 6F, -0.5F, 9, 2, 1);
        LBLeg3.setRotationPoint(2F, 8F, 0F);
        setRotation(LBLeg3, 0.3490659F, -0.7853982F, -0.3490659F);
        LBLeg4 = new ModelRenderer(this, 40, 109);
        LBLeg4.addBox(8F, 8F, -0.5F, 1, 10, 1);
        LBLeg4.setRotationPoint(2F, 8F, 0F);
        setRotation(LBLeg4, 0.3490659F, -0.7853982F, -0.3490659F);
        LBLeg5 = new ModelRenderer(this, 40, 121);
        LBLeg5.addBox(7.5F, 15.5F, -1F, 2, 2, 2);
        LBLeg5.setRotationPoint(2F, 8F, 0F);
        setRotation(LBLeg5, 0.3490659F, -0.7853982F, -0.3490659F);
        LBLeg6 = new ModelRenderer(this, 49, 120);
        LBLeg6.addBox(9F, 16F, -0.5F, 1, 4, 1);
        LBLeg6.setRotationPoint(2F, 8F, 0F);
        setRotation(LBLeg6, 0.3490659F, -0.7853982F, -0.3490659F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        Head1.render(unitPixel);
        Head2.render(unitPixel);
        Head3.render(unitPixel);
        REye.render(unitPixel);
        LEye.render(unitPixel);
        RAnt.render(unitPixel);
        LAnt1.render(unitPixel);
        Neck.render(unitPixel);
        Thorax1.render(unitPixel);
        Ab1.render(unitPixel);
        Ab2.render(unitPixel);
        Ab3.render(unitPixel);
        Ab4.render(unitPixel);
        LArm1.render(unitPixel);
        LArm2.render(unitPixel);
        LArm3.render(unitPixel);
        LArm4.render(unitPixel);
        RArm1.render(unitPixel);
        RArm2.render(unitPixel);
        RArm3.render(unitPixel);
        RArm4.render(unitPixel);
        RFLeg1.render(unitPixel);
        RFLeg2.render(unitPixel);
        RFLeg3.render(unitPixel);
        RFLeg4.render(unitPixel);
        RFLeg5.render(unitPixel);
        RFLeg6.render(unitPixel);
        LFLeg1.render(unitPixel);
        LFLeg2.render(unitPixel);
        LFLeg3.render(unitPixel);
        LFLeg4.render(unitPixel);
        LFLeg5.render(unitPixel);
        LFLeg6.render(unitPixel);
        RBLeg1.render(unitPixel);
        RBLeg2.render(unitPixel);
        RBLeg3.render(unitPixel);
        RBLeg4.render(unitPixel);
        RBLeg5.render(unitPixel);
        RBLeg6.render(unitPixel);
        LBLeg1.render(unitPixel);
        LBLeg2.render(unitPixel);
        LBLeg3.render(unitPixel);
        LBLeg4.render(unitPixel);
        LBLeg5.render(unitPixel);
        LBLeg6.render(unitPixel);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel, Entity entity) {
        EntityPrayingMantis entityPrayingMantis = (EntityPrayingMantis) entity;
        float cos1 = MathHelper.cos(limbSwing + (float) Math.PI) * 0.3F * prevLimbSwing;
        float cos2 = MathHelper.cos(limbSwing) * 0.3F * prevLimbSwing;
        float cosxnz1 = MathHelper.cos(limbSwing * 0.5F + (float) Math.PI) * 0.7F * prevLimbSwing;
        LBLeg1.rotateAngleX = cos1;
        LBLeg2.rotateAngleX = cos1;
        LBLeg3.rotateAngleX = cos1;
        LBLeg4.rotateAngleX = cos1;
        LBLeg5.rotateAngleX = cos1;
        LBLeg5.rotateAngleX = cos1;
        LBLeg6.rotateAngleX = cos1;
        LFLeg1.rotateAngleX = cos2;
        LFLeg2.rotateAngleX = cos2;
        LFLeg3.rotateAngleX = cos2;
        LFLeg4.rotateAngleX = cos2;
        LFLeg5.rotateAngleX = cos2;
        LFLeg6.rotateAngleX = cos2;
        RBLeg1.rotateAngleX = cos2;
        RBLeg2.rotateAngleX = cos2;
        RBLeg3.rotateAngleX = cos2;
        RBLeg4.rotateAngleX = cos2;
        RBLeg5.rotateAngleX = cos2;
        RBLeg6.rotateAngleX = cos2;
        RFLeg1.rotateAngleX = cos1;
        RFLeg2.rotateAngleX = cos1;
        RFLeg3.rotateAngleX = cos1;
        RFLeg4.rotateAngleX = cos1;
        RFLeg5.rotateAngleX = cos1;
        RFLeg6.rotateAngleX = cos1;

        if (entityPrayingMantis.getDataWatcher()
            .getWatchableObjectByte(22) == 1) {
            LArm1.rotateAngleX = cosxnz1 + 0.3490659F;
            LArm2.rotateAngleX = cosxnz1 - 2.268928F;
            LArm3.rotateAngleX = cosxnz1 + 0.3490659F;
            LArm4.rotateAngleX = cosxnz1 + 0.3490659F;
            RArm1.rotateAngleX = -cosxnz1 + 0.3490659F;
            RArm2.rotateAngleX = -cosxnz1 - 2.268928F;
            RArm3.rotateAngleX = -cosxnz1 + 0.3490659F;
            RArm4.rotateAngleX = -cosxnz1 + 0.3490659F;
        }

        if (entityPrayingMantis.getDataWatcher()
            .getWatchableObjectByte(22) == 0) {
            LArm1.rotateAngleX = -1.222F;
            LArm2.rotateAngleX = 2.443F;
            LArm3.rotateAngleX = -1.222F;
            LArm4.rotateAngleX = -1.222F;
            RArm1.rotateAngleX = -1.222F;
            RArm2.rotateAngleX = 2.443F;
            RArm3.rotateAngleX = -1.222F;
            RArm4.rotateAngleX = -1.222F;
        }
    }
}
