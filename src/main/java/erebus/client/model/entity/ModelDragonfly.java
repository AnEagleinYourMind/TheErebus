package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityDragonfly;

@SideOnly(Side.CLIENT)
public class ModelDragonfly extends ModelBase {

    ModelRenderer REye;
    ModelRenderer LEye;
    ModelRenderer HeadFront;
    ModelRenderer HeadTop;
    ModelRenderer HeadMain;
    ModelRenderer Neck;
    ModelRenderer ThoraxFront;
    ModelRenderer ThoraxBottom;
    ModelRenderer ThoraxBack;
    ModelRenderer RFWing;
    ModelRenderer RBWing;
    ModelRenderer LFWing;
    ModelRenderer LBWing;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer Tail6;
    ModelRenderer Tail7;
    ModelRenderer Tail8;
    ModelRenderer Tail9R;
    ModelRenderer Tail9L;
    ModelRenderer RFLeg1;
    ModelRenderer RFLeg2;
    ModelRenderer RMLeg1;
    ModelRenderer RMLeg2;
    ModelRenderer RBLeg1;
    ModelRenderer RBLeg2;
    ModelRenderer LFLeg1;
    ModelRenderer LFLeg2;
    ModelRenderer LMLeg1;
    ModelRenderer LMLeg2;
    ModelRenderer LBLeg1;
    ModelRenderer LBLeg2;

    public ModelDragonfly() {
        textureWidth = 128;
        textureHeight = 128;

        REye = new ModelRenderer(this, 71, 5);
        REye.addBox(-1.5F, -2.5F, -3.5F, 3, 1, 3);
        REye.setRotationPoint(0F, 16F, -13F);
        setRotation(REye, 0F, 0F, -0.7853982F);
        LEye = new ModelRenderer(this, 45, 5);
        LEye.addBox(-1.5F, -2.5F, -3.5F, 3, 1, 3);
        LEye.setRotationPoint(0F, 16F, -13F);
        setRotation(LEye, 0F, 0F, 0.7853982F);
        HeadFront = new ModelRenderer(this, 62, 0);
        HeadFront.addBox(-0.5F, -1.5F, -4.5F, 1, 3, 1);
        HeadFront.setRotationPoint(0F, 16F, -13F);
        setRotation(HeadFront, 0F, 0F, 0F);
        HeadTop = new ModelRenderer(this, 61, 12);
        HeadTop.addBox(-0.5F, -2.5F, -3F, 1, 1, 2);
        HeadTop.setRotationPoint(0F, 16F, -13F);
        setRotation(HeadTop, 0F, 0F, 0F);
        HeadMain = new ModelRenderer(this, 58, 5);
        HeadMain.addBox(-1.5F, -1.5F, -4F, 3, 3, 3);
        HeadMain.setRotationPoint(0F, 16F, -13F);
        setRotation(HeadMain, 0F, 0F, 0.7853982F);
        Neck = new ModelRenderer(this, 59, 16);
        Neck.addBox(-1F, -1F, -1F, 2, 2, 3);
        Neck.setRotationPoint(0F, 16F, -13F);
        setRotation(Neck, 0F, 0F, 0.7853982F);
        ThoraxFront = new ModelRenderer(this, 52, 22);
        ThoraxFront.addBox(-3F, -2F, -3F, 6, 4, 6);
        ThoraxFront.setRotationPoint(0F, 15F, -10F);
        setRotation(ThoraxFront, 0.2617994F, 0F, 0F);
        ThoraxBottom = new ModelRenderer(this, 52, 33);
        ThoraxBottom.addBox(-2F, 1.5F, -2F, 4, 1, 8);
        ThoraxBottom.setRotationPoint(0F, 15F, -10F);
        setRotation(ThoraxBottom, 0F, 0F, 0F);
        ThoraxBack = new ModelRenderer(this, 55, 43);
        ThoraxBack.addBox(-2.5F, -2.5F, 2F, 5, 4, 4);
        ThoraxBack.setRotationPoint(0F, 15F, -10F);
        setRotation(ThoraxBack, 0F, 0F, 0F);
        RFWing = new ModelRenderer(this, 80, 29);
        RFWing.addBox(-18F, 0F, -3F, 18, 0, 6);
        RFWing.setRotationPoint(-2F, 13F, -10F);
        setRotation(RFWing, 0F, -0.2617994F, 0F);
        RBWing = new ModelRenderer(this, 80, 36);
        RBWing.addBox(-18F, 0F, -3F, 18, 0, 6);
        RBWing.setRotationPoint(-2F, 13F, -6F);
        setRotation(RBWing, 0F, 0.2617994F, 0F);
        LFWing = new ModelRenderer(this, 0, 29);
        LFWing.addBox(0F, 0F, -3F, 18, 0, 6);
        LFWing.setRotationPoint(2F, 13F, -10F);
        setRotation(LFWing, 0F, 0.2617994F, 0F);
        LBWing = new ModelRenderer(this, 0, 36);
        LBWing.addBox(0F, 0F, -3F, 18, 0, 6);
        LBWing.setRotationPoint(2F, 13F, -6F);
        setRotation(LBWing, 0F, -0.2617994F, 0F);
        Tail1 = new ModelRenderer(this, 57, 52);
        Tail1.addBox(-1.5F, -1.5F, 6F, 3, 3, 4);
        Tail1.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail1, 0F, 0F, 0F);
        Tail2 = new ModelRenderer(this, 61, 60);
        Tail2.addBox(-1F, -1F, 10F, 2, 2, 1);
        Tail2.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail2, 0F, 0F, 0F);
        Tail3 = new ModelRenderer(this, 57, 64);
        Tail3.addBox(-1.5F, -1.5F, 11F, 3, 3, 4);
        Tail3.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail3, 0F, 0F, 0F);
        Tail4 = new ModelRenderer(this, 62, 72);
        Tail4.addBox(-0.5F, -0.5F, 15F, 1, 1, 1);
        Tail4.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail4, 0F, 0F, 0F);
        Tail5 = new ModelRenderer(this, 58, 75);
        Tail5.addBox(-1F, -1F, 15.5F, 2, 2, 4);
        Tail5.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail5, 0F, 0F, 0F);
        Tail6 = new ModelRenderer(this, 62, 82);
        Tail6.addBox(-0.5F, -0.5F, 19.5F, 1, 1, 1);
        Tail6.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail6, 0F, 0F, 0F);
        Tail7 = new ModelRenderer(this, 58, 85);
        Tail7.addBox(-1F, -1F, 20F, 2, 2, 4);
        Tail7.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail7, 0F, 0F, 0F);
        Tail8 = new ModelRenderer(this, 61, 92);
        Tail8.addBox(-0.5F, -0.5F, 24F, 1, 1, 2);
        Tail8.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail8, 0F, 0F, 0F);
        Tail9R = new ModelRenderer(this, 68, 92);
        Tail9R.addBox(-1.5F, -0.5F, 25.5F, 1, 1, 3);
        Tail9R.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail9R, 0F, 0F, 0F);
        Tail9L = new ModelRenderer(this, 52, 92);
        Tail9L.addBox(0.5F, -0.5F, 25.5F, 1, 1, 3);
        Tail9L.setRotationPoint(0F, 15F, -10F);
        setRotation(Tail9L, 0F, 0F, 0F);
        RFLeg1 = new ModelRenderer(this, 80, 18);
        RFLeg1.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
        RFLeg1.setRotationPoint(-2F, 17F, -13F);
        setRotation(RFLeg1, 0.2617994F, 0F, 0F);
        RFLeg2 = new ModelRenderer(this, 80, 23);
        RFLeg2.addBox(-0.5F, 2.4F, 1F, 1, 4, 1);
        RFLeg2.setRotationPoint(-2F, 17F, -13F);
        setRotation(RFLeg2, -0.2617994F, 0F, 0F);
        RMLeg1 = new ModelRenderer(this, 80, 43);
        RMLeg1.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
        RMLeg1.setRotationPoint(-3F, 17F, -11F);
        setRotation(RMLeg1, 1.047198F, 0F, 0F);
        RMLeg2 = new ModelRenderer(this, 80, 49);
        RMLeg2.addBox(-0.5F, 0.5F, 3F, 1, 5, 1);
        RMLeg2.setRotationPoint(-3F, 17F, -11F);
        setRotation(RMLeg2, -0.5235988F, 0F, 0F);
        RBLeg1 = new ModelRenderer(this, 80, 58);
        RBLeg1.addBox(-0.5F, 0F, -0.5F, 1, 5, 1);
        RBLeg1.setRotationPoint(-3F, 16F, -9F);
        setRotation(RBLeg1, 1.047198F, 0F, 0F);
        RBLeg2 = new ModelRenderer(this, 80, 65);
        RBLeg2.addBox(-0.5F, 0.5F, 4F, 1, 6, 1);
        RBLeg2.setRotationPoint(-3F, 16F, -9F);
        setRotation(RBLeg2, -0.5235988F, 0F, 0F);
        LFLeg1 = new ModelRenderer(this, 44, 18);
        LFLeg1.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
        LFLeg1.setRotationPoint(2F, 17F, -13F);
        setRotation(LFLeg1, 0.2617994F, 0F, 0F);
        LFLeg2 = new ModelRenderer(this, 44, 23);
        LFLeg2.addBox(-0.5F, 2.4F, 1F, 1, 4, 1);
        LFLeg2.setRotationPoint(2F, 17F, -13F);
        setRotation(LFLeg2, -0.2617994F, 0F, 0F);
        LMLeg1 = new ModelRenderer(this, 44, 43);
        LMLeg1.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
        LMLeg1.setRotationPoint(3F, 17F, -11F);
        setRotation(LMLeg1, 1.047198F, 0F, 0F);
        LMLeg2 = new ModelRenderer(this, 44, 49);
        LMLeg2.addBox(-0.5F, 0.5F, 3F, 1, 5, 1);
        LMLeg2.setRotationPoint(3F, 17F, -11F);
        setRotation(LMLeg2, -0.5235988F, 0F, 0F);
        LBLeg1 = new ModelRenderer(this, 44, 58);
        LBLeg1.addBox(-0.5F, 0F, -0.5F, 1, 5, 1);
        LBLeg1.setRotationPoint(3F, 16F, -9F);
        setRotation(LBLeg1, 1.047198F, 0F, 0F);
        LBLeg2 = new ModelRenderer(this, 44, 65);
        LBLeg2.addBox(-0.5F, 0.5F, 4F, 1, 6, 1);
        LBLeg2.setRotationPoint(3F, 16F, -9F);
        setRotation(LBLeg2, -0.5235988F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        REye.render(unitPixel);
        LEye.render(unitPixel);
        HeadFront.render(unitPixel);
        HeadTop.render(unitPixel);
        HeadMain.render(unitPixel);
        Neck.render(unitPixel);
        ThoraxFront.render(unitPixel);
        ThoraxBottom.render(unitPixel);
        ThoraxBack.render(unitPixel);
        RFWing.render(unitPixel);
        RBWing.render(unitPixel);
        LFWing.render(unitPixel);
        LBWing.render(unitPixel);
        Tail1.render(unitPixel);
        Tail2.render(unitPixel);
        Tail3.render(unitPixel);
        Tail4.render(unitPixel);
        Tail5.render(unitPixel);
        Tail6.render(unitPixel);
        Tail7.render(unitPixel);
        Tail8.render(unitPixel);
        Tail9R.render(unitPixel);
        Tail9L.render(unitPixel);
        RFLeg1.render(unitPixel);
        RFLeg2.render(unitPixel);
        RMLeg1.render(unitPixel);
        RMLeg2.render(unitPixel);
        RBLeg1.render(unitPixel);
        RBLeg2.render(unitPixel);
        LFLeg1.render(unitPixel);
        LFLeg2.render(unitPixel);
        LMLeg1.render(unitPixel);
        LMLeg2.render(unitPixel);
        LBLeg1.render(unitPixel);
        LBLeg2.render(unitPixel);
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
        EntityDragonfly var8 = (EntityDragonfly) entity;
        RFWing.rotateAngleZ = var8.wingFloat;
        LFWing.rotateAngleZ = -var8.wingFloat;
        RBWing.rotateAngleZ = var8.wingFloat;
        LBWing.rotateAngleZ = -var8.wingFloat;
    }
}
