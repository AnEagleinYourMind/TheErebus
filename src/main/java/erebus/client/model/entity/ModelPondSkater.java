package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelPondSkater extends ModelBase {

    ModelRenderer proboscis1;
    ModelRenderer proboscis2;
    ModelRenderer proboscis3;
    ModelRenderer leftAnt1;
    ModelRenderer leftAnt2;
    ModelRenderer rightAnt1;
    ModelRenderer rightAnt2;
    ModelRenderer leftEye;
    ModelRenderer rightEye;
    ModelRenderer head;
    ModelRenderer leftLegFront1;
    ModelRenderer leftLegFront2;
    ModelRenderer rightLegFront1;
    ModelRenderer rightLegFront2;
    ModelRenderer bodyLower;
    ModelRenderer bodyTop;
    ModelRenderer leftLegMid1;
    ModelRenderer leftLegMid2;
    ModelRenderer leftLegMid3;
    ModelRenderer leftLegMid4;
    ModelRenderer rightLegMid1;
    ModelRenderer rightLegMid2;
    ModelRenderer rightLegMid3;
    ModelRenderer rightLegMid4;
    ModelRenderer leftLegBack1;
    ModelRenderer leftLegBack2;
    ModelRenderer leftLegBack3;
    ModelRenderer leftLegBack4;
    ModelRenderer rightLegBack1;
    ModelRenderer rightLegBack2;
    ModelRenderer rightLegBack3;
    ModelRenderer rightLegBack4;
    ModelRenderer bum1;
    ModelRenderer bum2;

    public ModelPondSkater() {
        textureWidth = 64;
        textureHeight = 128;

        proboscis1 = new ModelRenderer(this, 37, 0);
        proboscis1.addBox(-1.5F, -2.5F, -6F, 3, 3, 3);
        proboscis1.setRotationPoint(0F, 16F, -4F);
        setRotation(proboscis1, 0.4014257F, 0F, 0F);
        proboscis2 = new ModelRenderer(this, 28, 5);
        proboscis2.addBox(-1F, -3.5F, -7F, 2, 2, 2);
        proboscis2.setRotationPoint(0F, 16F, -4F);
        setRotation(proboscis2, 0.7679449F, 0F, 0F);
        proboscis3 = new ModelRenderer(this, 28, 0);
        proboscis3.addBox(-0.5F, -5.5F, -7F, 1, 1, 3);
        proboscis3.setRotationPoint(0F, 16F, -4F);
        setRotation(proboscis3, 1.291544F, 0F, 0F);
        leftAnt1 = new ModelRenderer(this, 3, 13);
        leftAnt1.addBox(-1F, -0.5F, -17F, 1, 1, 12);
        leftAnt1.setRotationPoint(0F, 16F, -4F);
        setRotation(leftAnt1, 0F, -0.3490659F, 0F);
        leftAnt2 = new ModelRenderer(this, 3, 13);
        leftAnt2.addBox(-6.7F, -0.5F, -27.6F, 1, 1, 12);
        leftAnt2.setRotationPoint(0F, 16F, -4F);
        setRotation(leftAnt2, 0F, -0.6981317F, 0F);
        rightAnt1 = new ModelRenderer(this, 35, 13);
        rightAnt1.addBox(0F, -0.5F, -17F, 1, 1, 12);
        rightAnt1.setRotationPoint(0F, 16F, -4F);
        setRotation(rightAnt1, 0F, 0.3490659F, 0F);
        rightAnt2 = new ModelRenderer(this, 35, 13);
        rightAnt2.addBox(5.7F, -0.5F, -27.6F, 1, 1, 12);
        rightAnt2.setRotationPoint(0F, 16F, -4F);
        setRotation(rightAnt2, 0F, 0.6981317F, 0F);
        leftEye = new ModelRenderer(this, 10, 27);
        leftEye.addBox(1F, -2.5F, -3F, 3, 3, 3);
        leftEye.setRotationPoint(0F, 16F, -4F);
        setRotation(leftEye, 0F, 0F, 0F);
        rightEye = new ModelRenderer(this, 42, 27);
        rightEye.addBox(-4F, -2.5F, -3F, 3, 3, 3);
        rightEye.setRotationPoint(0F, 16F, -4F);
        setRotation(rightEye, 0F, 0F, 0F);
        head = new ModelRenderer(this, 23, 27);
        head.addBox(-2F, -2F, -4F, 4, 4, 5);
        head.setRotationPoint(0F, 16F, -4F);
        setRotation(head, 0F, 0F, 0F);
        leftLegFront1 = new ModelRenderer(this, 0, 37);
        leftLegFront1.addBox(-1.5F, -1.5F, 0F, 2, 2, 15);
        leftLegFront1.setRotationPoint(2F, 19F, -2F);
        setRotation(leftLegFront1, -0.1919862F, 2.96706F, 0F);
        leftLegFront2 = new ModelRenderer(this, 35, 44);
        leftLegFront2.addBox(-0.5F, -0.5F, 0F, 1, 1, 9);
        leftLegFront2.setRotationPoint(5F, 21.5F, -16.5F);
        setRotation(leftLegFront2, -0.2094395F, 1.745329F, 0F);
        rightLegFront1 = new ModelRenderer(this, 0, 37);
        rightLegFront1.addBox(-1.5F, -1.5F, 0F, 2, 2, 15);
        rightLegFront1.setRotationPoint(-3F, 19F, -2F);
        setRotation(rightLegFront1, -0.1919862F, -2.96706F, 0F);
        rightLegFront2 = new ModelRenderer(this, 35, 44);
        rightLegFront2.addBox(-0.5F, -0.5F, 0F, 1, 1, 9);
        rightLegFront2.setRotationPoint(-5F, 21.5F, -16.5F);
        setRotation(rightLegFront2, -0.2094395F, -1.745329F, 0F);
        bodyLower = new ModelRenderer(this, 29, 62);
        bodyLower.addBox(-5F, 0F, 0.5F, 10, 4, 6);
        bodyLower.setRotationPoint(0F, 16F, -4F);
        setRotation(bodyLower, 0F, 0F, 0F);
        bodyTop = new ModelRenderer(this, 0, 55);
        bodyTop.addBox(-2.5F, -3F, 0F, 5, 5, 18);
        bodyTop.setRotationPoint(0F, 16F, -4F);
        setRotation(bodyTop, 0F, 0F, 0F);
        leftLegMid1 = new ModelRenderer(this, 30, 89);
        leftLegMid1.addBox(-1.5F, -1.5F, 0F, 3, 3, 9);
        leftLegMid1.setRotationPoint(3F, 18F, -2F);
        setRotation(leftLegMid1, -0.1919862F, 0.1570796F, 0F);
        leftLegMid2 = new ModelRenderer(this, 0, 95);
        leftLegMid2.addBox(0.5F, -0.5F, 7.5F, 3, 3, 3);
        leftLegMid2.setRotationPoint(3F, 18F, -2F);
        setRotation(leftLegMid2, -0.1919862F, 0.1570796F, 0F);
        leftLegMid3 = new ModelRenderer(this, 0, 79);
        leftLegMid3.addBox(-1F, -1F, 0F, 2, 2, 25);
        leftLegMid3.setRotationPoint(6.5F, 21F, 6F);
        setRotation(leftLegMid3, -3.071779F, -0.7853982F, 0F);
        leftLegMid4 = new ModelRenderer(this, 0, 107);
        leftLegMid4.addBox(14F, 0.5F, 20F, 1, 1, 20);
        leftLegMid4.setRotationPoint(6.5F, 21F, 6F);
        setRotation(leftLegMid4, -0.0523599F, 1.745329F, 0F);
        rightLegMid1 = new ModelRenderer(this, 30, 89);
        rightLegMid1.addBox(-1.5F, -1.5F, 0F, 3, 3, 9);
        rightLegMid1.setRotationPoint(-3F, 18F, -2F);
        setRotation(rightLegMid1, -0.1919862F, -0.1570796F, 0F);
        rightLegMid2 = new ModelRenderer(this, 0, 95);
        rightLegMid2.addBox(-4.5F, -0.5F, 7.5F, 3, 3, 3);
        rightLegMid2.setRotationPoint(-2F, 18F, -2F);
        setRotation(rightLegMid2, -0.1919862F, -0.1570796F, 0F);
        rightLegMid3 = new ModelRenderer(this, 0, 79);
        rightLegMid3.addBox(-1F, -1F, 0F, 2, 2, 25);
        rightLegMid3.setRotationPoint(-6F, 21F, 6F);
        setRotation(rightLegMid3, -3.071779F, 0.7853982F, 0F);
        rightLegMid4 = new ModelRenderer(this, 0, 107);
        rightLegMid4.addBox(-15F, 0.5F, 20F, 1, 1, 20);
        rightLegMid4.setRotationPoint(-6F, 21F, 6F);
        setRotation(rightLegMid4, -0.0523599F, -1.745329F, 0F);
        leftLegBack1 = new ModelRenderer(this, 0, 85);
        leftLegBack1.addBox(-1.5F, -1.5F, 0F, 3, 3, 6);
        leftLegBack1.setRotationPoint(2F, 18F, 7F);
        setRotation(leftLegBack1, -0.3316126F, 0.1570796F, 0F);
        leftLegBack2 = new ModelRenderer(this, 0, 95);
        leftLegBack2.addBox(-1F, -1F, 0F, 3, 3, 3);
        leftLegBack2.setRotationPoint(3F, 20F, 12F);
        setRotation(leftLegBack2, -0.1919862F, 0.1570796F, 0F);
        leftLegBack3 = new ModelRenderer(this, 0, 79);
        leftLegBack3.addBox(-1F, -1F, 0F, 2, 2, 25);
        leftLegBack3.setRotationPoint(3F, 21F, 13F);
        setRotation(leftLegBack3, -3.071779F, -2.356194F, 0F);
        leftLegBack4 = new ModelRenderer(this, 0, 107);
        leftLegBack4.addBox(10.5F, 0.5F, 22F, 1, 1, 20);
        leftLegBack4.setRotationPoint(3F, 21F, 13F);
        setRotation(leftLegBack4, -0.0523599F, 0.3490659F, 0F);
        rightLegBack1 = new ModelRenderer(this, 0, 85);
        rightLegBack1.addBox(-1.5F, -1.5F, 0F, 3, 3, 6);
        rightLegBack1.setRotationPoint(-2F, 18F, 7F);
        setRotation(rightLegBack1, -0.3316126F, -0.1570796F, 0F);
        rightLegBack2 = new ModelRenderer(this, 0, 95);
        rightLegBack2.addBox(-2F, -1F, 0F, 3, 3, 3);
        rightLegBack2.setRotationPoint(-3F, 20F, 12F);
        setRotation(rightLegBack2, -0.1919862F, -0.1570796F, 0F);
        rightLegBack3 = new ModelRenderer(this, 0, 79);
        rightLegBack3.addBox(-1F, -1F, 0F, 2, 2, 25);
        rightLegBack3.setRotationPoint(-3F, 21F, 13F);
        setRotation(rightLegBack3, -3.071779F, 2.356194F, 0F);
        rightLegBack4 = new ModelRenderer(this, 0, 107);
        rightLegBack4.addBox(-11.5F, 0.5F, 22F, 1, 1, 20);
        rightLegBack4.setRotationPoint(-3F, 21F, 13F);
        setRotation(rightLegBack4, -0.0523599F, -0.3490659F, 0F);
        bum1 = new ModelRenderer(this, 30, 110);
        bum1.addBox(-2F, -2F, 0F, 4, 4, 10);
        bum1.setRotationPoint(0F, 16F, 13F);
        setRotation(bum1, -0.1745329F, 0F, 0F);
        bum2 = new ModelRenderer(this, 0, 0);
        bum2.addBox(-1.5F, -1.5F, -1F, 3, 3, 4);
        bum2.setRotationPoint(0F, 18F, 23F);
        setRotation(bum2, -0.1745329F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAngle, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, limbSwingAngle, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, limbSwingAngle, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        proboscis1.render(unitPixel);
        proboscis2.render(unitPixel);
        proboscis3.render(unitPixel);
        leftAnt1.render(unitPixel);
        leftAnt2.render(unitPixel);
        rightAnt1.render(unitPixel);
        rightAnt2.render(unitPixel);
        leftEye.render(unitPixel);
        rightEye.render(unitPixel);
        head.render(unitPixel);
        leftLegFront1.render(unitPixel);
        leftLegFront2.render(unitPixel);
        rightLegFront1.render(unitPixel);
        rightLegFront2.render(unitPixel);
        bodyLower.render(unitPixel);
        bodyTop.render(unitPixel);
        leftLegMid1.render(unitPixel);
        leftLegMid2.render(unitPixel);
        leftLegMid3.render(unitPixel);
        leftLegMid4.render(unitPixel);
        rightLegMid1.render(unitPixel);
        rightLegMid2.render(unitPixel);
        rightLegMid3.render(unitPixel);
        rightLegMid4.render(unitPixel);
        leftLegBack1.render(unitPixel);
        leftLegBack2.render(unitPixel);
        leftLegBack3.render(unitPixel);
        leftLegBack4.render(unitPixel);
        rightLegBack1.render(unitPixel);
        rightLegBack2.render(unitPixel);
        rightLegBack3.render(unitPixel);
        rightLegBack4.render(unitPixel);
        bum1.render(unitPixel);
        bum2.render(unitPixel);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAngle, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel, Entity entity) {
        super.setRotationAngles(
            limbSwing,
            limbSwingAngle,
            entityTickTime,
            rotationYaw,
            rotationPitch,
            unitPixel,
            entity);
        float cos = MathHelper.cos(limbSwing * 1.0F) * 0.5F * limbSwingAngle;
        rightLegMid3.rotateAngleY = -cos + 0.7853982F;
        leftLegMid3.rotateAngleY = cos - 0.7853982F;
        rightLegMid4.rotateAngleY = -cos - 1.745329F;
        leftLegMid4.rotateAngleY = cos + 1.745329F;
    }

}
