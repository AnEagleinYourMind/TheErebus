package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelBlackWidow extends ModelBase {

    ModelRenderer Rant1;
    ModelRenderer Rant2;
    ModelRenderer Lant1;
    ModelRenderer Lant2;
    ModelRenderer MandibleR;
    ModelRenderer MandibleL;
    ModelRenderer Head;
    ModelRenderer Thorax1;
    ModelRenderer Thorax2;
    ModelRenderer Ab1;
    ModelRenderer Ab2;
    ModelRenderer Ab3;
    ModelRenderer Ab4;
    ModelRenderer Ab5;
    ModelRenderer Ab6;
    ModelRenderer LegFR1;
    ModelRenderer LegFR2;
    ModelRenderer LegFR3;
    ModelRenderer LegFR4;
    ModelRenderer LegFR5;
    ModelRenderer LegFR6;
    ModelRenderer LegFL1;
    ModelRenderer LegFL2;
    ModelRenderer LegFL3;
    ModelRenderer LegFL4;
    ModelRenderer LegFL5;
    ModelRenderer LegFL6;
    ModelRenderer LegMFR1;
    ModelRenderer LegMFR2;
    ModelRenderer LegMFR3;
    ModelRenderer LegMFR4;
    ModelRenderer LegMFR5;
    ModelRenderer LegMFR6;
    ModelRenderer LegMFL1;
    ModelRenderer LegMFL2;
    ModelRenderer LegMFL3;
    ModelRenderer LegMFL4;
    ModelRenderer LegMFL5;
    ModelRenderer LegMFL6;
    ModelRenderer LegMBR1;
    ModelRenderer LegMBR2;
    ModelRenderer LegMBR3;
    ModelRenderer LegMBR4;
    ModelRenderer LegMBR5;
    ModelRenderer LegMBR6;
    ModelRenderer LegMBL1;
    ModelRenderer LegMBL2;
    ModelRenderer LegMBL3;
    ModelRenderer LegMBL4;
    ModelRenderer LegMBL5;
    ModelRenderer LegMBL6;
    ModelRenderer LegBR1;
    ModelRenderer LegBR2;
    ModelRenderer LegBR3;
    ModelRenderer LegBR4;
    ModelRenderer LegBR5;
    ModelRenderer LegBR6;
    ModelRenderer LegBL1;
    ModelRenderer LegBL2;
    ModelRenderer LegBL3;
    ModelRenderer LegBL4;
    ModelRenderer LegBL5;
    ModelRenderer LegBL6;

    public ModelBlackWidow() {
        textureWidth = 128;
        textureHeight = 64;

        Rant1 = new ModelRenderer(this, 29, 15);
        Rant1.addBox(1.5F, 0.5F, -4.5F, 1, 1, 4);
        Rant1.setRotationPoint(0F, 15F, -8F);
        setRotation(Rant1, 0F, -0.3490659F, 0F);
        Rant2 = new ModelRenderer(this, 29, 15);
        Rant2.addBox(4F, 0.5F, -6.5F, 1, 1, 4);
        Rant2.setRotationPoint(0F, 15F, -8F);
        setRotation(Rant2, 0F, 0.3490659F, 0F);
        Lant1 = new ModelRenderer(this, 29, 15);
        Lant1.addBox(-2.5F, 0.5F, -4.5F, 1, 1, 4);
        Lant1.setRotationPoint(0F, 15F, -8F);
        setRotation(Lant1, 0F, 0.3490659F, 0F);
        Lant2 = new ModelRenderer(this, 29, 15);
        Lant2.addBox(-5F, 0.5F, -6.5F, 1, 1, 4);
        Lant2.setRotationPoint(0F, 15F, -8F);
        setRotation(Lant2, 0F, -0.3141593F, 0F);
        MandibleR = new ModelRenderer(this, 23, 0);
        MandibleR.addBox(0.5F, -0.5F, -5F, 1, 1, 3);
        MandibleR.setRotationPoint(0F, 15F, -8F);
        setRotation(MandibleR, 0.6981317F, 0F, 0F);
        MandibleL = new ModelRenderer(this, 23, 0);
        MandibleL.addBox(-1.5F, -0.5F, -5F, 1, 1, 3);
        MandibleL.setRotationPoint(0F, 15F, -8F);
        setRotation(MandibleL, 0.6981317F, 0F, 0F);
        Head = new ModelRenderer(this, 12, 8);
        Head.addBox(-2F, -1F, -2F, 4, 3, 2);
        Head.setRotationPoint(0F, 15F, -8F);
        setRotation(Head, 0F, 0F, 0F);
        Thorax1 = new ModelRenderer(this, 32, 0);
        Thorax1.addBox(-4.5F, -2F, -9F, 9, 4, 9);
        Thorax1.setRotationPoint(0F, 15F, 1F);
        setRotation(Thorax1, 0F, 0F, 0F);
        Thorax2 = new ModelRenderer(this, 70, 0);
        Thorax2.addBox(-2.5F, -3F, -8F, 5, 2, 8);
        Thorax2.setRotationPoint(0F, 15F, 1F);
        setRotation(Thorax2, 0.1047198F, 0F, 0F);
        Ab1 = new ModelRenderer(this, 82, 11);
        Ab1.addBox(-3F, -5F, 1F, 8, 1, 10);
        Ab1.setRotationPoint(-1F, 13F, 2F);
        setRotation(Ab1, 0F, 0F, 0F);
        Ab2 = new ModelRenderer(this, 41, 29);
        Ab2.addBox(-4F, -4F, 0F, 8, 8, 12);
        Ab2.setRotationPoint(0F, 13F, 2F);
        setRotation(Ab2, 0F, 0F, 0F);
        Ab3 = new ModelRenderer(this, 82, 23);
        Ab3.addBox(-3F, -3F, -1F, 6, 6, 14);
        Ab3.setRotationPoint(0F, 13F, 2F);
        setRotation(Ab3, 0F, 0F, 0F);
        Ab4 = new ModelRenderer(this, 41, 14);
        Ab4.addBox(-6F, -3F, 2F, 12, 6, 8);
        Ab4.setRotationPoint(0F, 13F, 2F);
        setRotation(Ab4, 0F, 0F, 0F);
        Ab5 = new ModelRenderer(this, 0, 25);
        Ab5.addBox(-5F, -4.999F, 1F, 10, 8, 10);
        Ab5.setRotationPoint(0F, 14F, 2F);
        setRotation(Ab5, 0F, 0F, 0F);
        Ab6 = new ModelRenderer(this, 0, 15);
        Ab6.addBox(-3F, -6F, 2F, 6, 1, 8);
        Ab6.setRotationPoint(0F, 13F, 2F);
        setRotation(Ab6, 0F, 0F, 0F);
        LegFR1 = new ModelRenderer(this, 0, 0);
        LegFR1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
        LegFR1.setRotationPoint(4F, 15F, -7F);
        setRotation(LegFR1, 0F, 3.141593F, 0.7853982F);
        LegFR2 = new ModelRenderer(this, 0, 8);
        LegFR2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
        setRotation(LegFR2, 0F, 3.141593F, 0F);
        LegFR3 = new ModelRenderer(this, 0, 0);
        LegFR3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
        setRotation(LegFR3, 0F, 3.141593F, -0.2617994F);
        LegFR4 = new ModelRenderer(this, 0, 8);
        LegFR4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
        setRotation(LegFR4, 0F, 3.141593F, -0.2617994F);
        LegFR5 = new ModelRenderer(this, 0, 0);
        LegFR5.addBox(-15F, -11F, -1F, 9, 2, 2);
        setRotation(LegFR5, 0F, 3.141593F, -0.7853982F);
        LegFR6 = new ModelRenderer(this, 0, 5);
        LegFR6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
        setRotation(LegFR6, 0F, 3.141593F, -1.186824F);
        LegFL1 = new ModelRenderer(this, 0, 0);
        LegFL1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
        LegFL1.setRotationPoint(-4F, 15F, -7F);
        setRotation(LegFL1, 0F, 0F, 0.7853982F);
        LegFL2 = new ModelRenderer(this, 0, 8);
        LegFL2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
        setRotation(LegFL2, 0F, 0F, 0F);
        LegFL3 = new ModelRenderer(this, 0, 0);
        LegFL3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
        setRotation(LegFL3, 0F, 0F, -0.2617994F);
        LegFL4 = new ModelRenderer(this, 0, 8);
        LegFL4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
        setRotation(LegFL4, 0F, 0F, -0.2617994F);
        LegFL5 = new ModelRenderer(this, 0, 0);
        LegFL5.addBox(-15F, -11F, -1F, 9, 2, 2);
        setRotation(LegFL5, 0F, 0F, -0.7853982F);
        LegFL6 = new ModelRenderer(this, 0, 5);
        LegFL6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
        setRotation(LegFL6, 0F, 0F, -1.186824F);
        LegMFR1 = new ModelRenderer(this, 0, 0);
        LegMFR1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
        LegMFR1.setRotationPoint(4F, 15F, -5F);
        setRotation(LegMFR1, 0F, 3.141593F, 0.7853982F);
        LegMFR2 = new ModelRenderer(this, 0, 8);
        LegMFR2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
        setRotation(LegMFR2, 0F, 3.141593F, 0F);
        LegMFR3 = new ModelRenderer(this, 0, 0);
        LegMFR3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
        setRotation(LegMFR3, 0F, 3.141593F, -0.2617994F);
        LegMFR4 = new ModelRenderer(this, 0, 8);
        LegMFR4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
        setRotation(LegMFR4, 0F, 3.141593F, -0.2617994F);
        LegMFR5 = new ModelRenderer(this, 0, 0);
        LegMFR5.addBox(-15F, -11F, -1F, 9, 2, 2);
        setRotation(LegMFR5, 0F, 3.141593F, -0.7853982F);
        LegMFR6 = new ModelRenderer(this, 0, 5);
        LegMFR6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
        setRotation(LegMFR6, 0F, 3.141593F, -1.186824F);
        LegMFL1 = new ModelRenderer(this, 0, 0);
        LegMFL1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
        LegMFL1.setRotationPoint(-4F, 15F, -5F);
        setRotation(LegMFL1, 0F, 0F, 0.7853982F);
        LegMFL2 = new ModelRenderer(this, 0, 8);
        LegMFL2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
        setRotation(LegMFL2, 0F, 0F, 0F);
        LegMFL3 = new ModelRenderer(this, 0, 0);
        LegMFL3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
        setRotation(LegMFL3, 0F, 0F, -0.2617994F);
        LegMFL4 = new ModelRenderer(this, 0, 8);
        LegMFL4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
        setRotation(LegMFL4, 0F, 0F, -0.2617994F);
        LegMFL5 = new ModelRenderer(this, 0, 0);
        LegMFL5.addBox(-15F, -11F, -1F, 9, 2, 2);
        setRotation(LegMFL5, 0F, 0F, -0.7853982F);
        LegMFL6 = new ModelRenderer(this, 0, 5);
        LegMFL6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
        setRotation(LegMFL6, 0F, 0F, -1.186824F);
        LegMBR1 = new ModelRenderer(this, 0, 0);
        LegMBR1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
        LegMBR1.setRotationPoint(4F, 15F, -2F);
        setRotation(LegMBR1, 0F, 3.141593F, 0.7853982F);
        LegMBR2 = new ModelRenderer(this, 0, 8);
        LegMBR2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
        setRotation(LegMBR2, 0F, 3.141593F, 0F);
        LegMBR3 = new ModelRenderer(this, 0, 0);
        LegMBR3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
        setRotation(LegMBR3, 0F, 3.141593F, -0.2617994F);
        LegMBR4 = new ModelRenderer(this, 0, 8);
        LegMBR4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
        setRotation(LegMBR4, 0F, 3.141593F, -0.2617994F);
        LegMBR5 = new ModelRenderer(this, 0, 0);
        LegMBR5.addBox(-15F, -11F, -1F, 9, 2, 2);
        setRotation(LegMBR5, 0F, 3.141593F, -0.7853982F);
        LegMBR6 = new ModelRenderer(this, 0, 5);
        LegMBR6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
        setRotation(LegMBR6, 0F, 3.141593F, -1.186824F);
        LegMBL1 = new ModelRenderer(this, 0, 0);
        LegMBL1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
        LegMBL1.setRotationPoint(-4F, 15F, -2F);
        setRotation(LegMBL1, 0F, 0F, 0.7853982F);
        LegMBL2 = new ModelRenderer(this, 0, 8);
        LegMBL2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
        setRotation(LegMBL2, 0F, 0F, 0F);
        LegMBL3 = new ModelRenderer(this, 0, 0);
        LegMBL3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
        setRotation(LegMBL3, 0F, 0F, -0.2617994F);
        LegMBL4 = new ModelRenderer(this, 0, 8);
        LegMBL4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
        setRotation(LegMBL4, 0F, 0F, -0.2617994F);
        LegMBL5 = new ModelRenderer(this, 0, 0);
        LegMBL5.addBox(-15F, -11F, -1F, 9, 2, 2);
        setRotation(LegMBL5, 0F, 0F, -0.7853982F);
        LegMBL6 = new ModelRenderer(this, 0, 5);
        LegMBL6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
        setRotation(LegMBL6, 0F, 0F, -1.186824F);
        LegBR1 = new ModelRenderer(this, 0, 0);
        LegBR1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
        LegBR1.setRotationPoint(4F, 15F, 0F);
        setRotation(LegBR1, 0F, 3.141593F, 0.7853982F);
        LegBR2 = new ModelRenderer(this, 0, 8);
        LegBR2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
        setRotation(LegBR2, 0F, 3.141593F, 0F);
        LegBR3 = new ModelRenderer(this, 0, 0);
        LegBR3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
        setRotation(LegBR3, 0F, 3.141593F, -0.2617994F);
        LegBR4 = new ModelRenderer(this, 0, 8);
        LegBR4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
        setRotation(LegBR4, 0F, 3.141593F, -0.2617994F);
        LegBR5 = new ModelRenderer(this, 0, 0);
        LegBR5.addBox(-15F, -11F, -1F, 9, 2, 2);
        setRotation(LegBR5, 0F, 3.141593F, -0.7853982F);
        LegBR6 = new ModelRenderer(this, 0, 5);
        LegBR6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
        setRotation(LegBR6, 0F, 3.141593F, -1.186824F);
        LegBL1 = new ModelRenderer(this, 0, 0);
        LegBL1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
        LegBL1.setRotationPoint(-4F, 15F, 0F);
        setRotation(LegBL1, 0F, 0F, 0.7853982F);
        LegBL2 = new ModelRenderer(this, 0, 8);
        LegBL2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
        setRotation(LegBL2, 0F, 0F, 0F);
        LegBL3 = new ModelRenderer(this, 0, 0);
        LegBL3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
        setRotation(LegBL3, 0F, 0F, -0.2617994F);
        LegBL4 = new ModelRenderer(this, 0, 8);
        LegBL4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
        setRotation(LegBL4, 0F, 0F, -0.2617994F);
        LegBL5 = new ModelRenderer(this, 0, 0);
        LegBL5.addBox(-15F, -11F, -1F, 9, 2, 2);
        setRotation(LegBL5, 0F, 0F, -0.7853982F);
        LegBL6 = new ModelRenderer(this, 0, 5);
        LegBL6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
        setRotation(LegBL6, 0F, 0F, -1.186824F);

        LegFL1.addChild(LegFL2);
        LegFL1.addChild(LegFL3);
        LegFL1.addChild(LegFL4);
        LegFL1.addChild(LegFL5);
        LegFL1.addChild(LegFL6);

        LegMFL1.addChild(LegMFL2);
        LegMFL1.addChild(LegMFL3);
        LegMFL1.addChild(LegMFL4);
        LegMFL1.addChild(LegMFL5);
        LegMFL1.addChild(LegMFL6);

        LegMBL1.addChild(LegMBL2);
        LegMBL1.addChild(LegMBL3);
        LegMBL1.addChild(LegMBL4);
        LegMBL1.addChild(LegMBL5);
        LegMBL1.addChild(LegMBL6);

        LegBL1.addChild(LegBL2);
        LegBL1.addChild(LegBL3);
        LegBL1.addChild(LegBL4);
        LegBL1.addChild(LegBL5);
        LegBL1.addChild(LegBL6);

        LegFR1.addChild(LegFR2);
        LegFR1.addChild(LegFR3);
        LegFR1.addChild(LegFR4);
        LegFR1.addChild(LegFR5);
        LegFR1.addChild(LegFR6);

        LegMFR1.addChild(LegMFR2);
        LegMFR1.addChild(LegMFR3);
        LegMFR1.addChild(LegMFR4);
        LegMFR1.addChild(LegMFR5);
        LegMFR1.addChild(LegMFR6);

        LegMBR1.addChild(LegMBR2);
        LegMBR1.addChild(LegMBR3);
        LegMBR1.addChild(LegMBR4);
        LegMBR1.addChild(LegMBR5);
        LegMBR1.addChild(LegMBR6);

        LegBR1.addChild(LegBR2);
        LegBR1.addChild(LegBR3);
        LegBR1.addChild(LegBR4);
        LegBR1.addChild(LegBR5);
        LegBR1.addChild(LegBR6);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        Rant1.render(unitPixel);
        Rant2.render(unitPixel);
        Lant1.render(unitPixel);
        Lant2.render(unitPixel);
        MandibleR.render(unitPixel);
        MandibleL.render(unitPixel);
        Head.render(unitPixel);
        Thorax1.render(unitPixel);
        Thorax2.render(unitPixel);
        Ab1.render(unitPixel);
        Ab2.render(unitPixel);
        Ab3.render(unitPixel);
        Ab4.render(unitPixel);
        Ab5.render(unitPixel);
        Ab6.render(unitPixel);
        LegFR1.render(unitPixel);
        LegFL1.render(unitPixel);
        LegMFR1.render(unitPixel);
        LegMFL1.render(unitPixel);
        LegMBR1.render(unitPixel);
        LegMBL1.render(unitPixel);
        LegBR1.render(unitPixel);
        LegBL1.render(unitPixel);
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

        Head.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        MandibleR.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        MandibleL.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        Rant1.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 0.349F;
        Rant2.rotateAngleY = rotationYaw / (180F / (float) Math.PI) + 0.349F;
        Lant1.rotateAngleY = rotationYaw / (180F / (float) Math.PI) + 0.349F;
        Lant2.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 0.349F;

        Head.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        MandibleR.rotateAngleX = rotationPitch / (180F / (float) Math.PI) + 0.698F;
        MandibleL.rotateAngleX = rotationPitch / (180F / (float) Math.PI) + 0.698F;
        Rant1.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        Rant2.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        Lant1.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        Lant2.rotateAngleX = rotationPitch / (180F / (float) Math.PI);

        float x = 0.7853982F;
        float b = 1.2F;
        float x2 = -2.3561946F;

        float movcos1 = MathHelper.cos(limbSwing * 0.7F) * 0.4F * prevLimbSwing;
        float movsin1 = MathHelper.sin(limbSwing * 0.7F) * 0.4F * prevLimbSwing;
        float movcos2 = MathHelper.cos(limbSwing * 0.7F) * 0.5F * prevLimbSwing;
        float movcos3 = MathHelper.cos(limbSwing * 0.0F) * 0.0F * prevLimbSwing;

        LegFL1.rotateAngleY = -0.698F + movcos1;
        LegFL1.rotateAngleX = -0.698F - movsin1;
        LegFL1.rotateAngleZ = b + movcos2;
        LegFL2.rotateAngleZ = -x + movcos3;
        LegFL3.rotateAngleZ = -0.2617994F - x + movcos3;
        LegFL4.rotateAngleZ = -0.2617994F - x + movcos3;
        LegFL5.rotateAngleZ = -0.7853982F - x + movcos3;
        LegFL6.rotateAngleZ = -1.186824F - x + movcos3;

        LegMFL1.rotateAngleY = -0.175F - movcos1;
        LegMFL1.rotateAngleX = -0.175F + movsin1;
        LegMFL1.rotateAngleZ = x - movcos2;
        LegMFL2.rotateAngleZ = -x - movcos3;
        LegMFL3.rotateAngleZ = -0.2617994F - x - movcos3;
        LegMFL4.rotateAngleZ = -0.2617994F - x - movcos3;
        LegMFL5.rotateAngleZ = -0.7853982F - x - movcos3;
        LegMFL6.rotateAngleZ = -1.186824F - x - movcos3;

        LegMBL1.rotateAngleY = 0.175F + movcos1;
        LegMBL1.rotateAngleX = 0.175F - movsin1;
        LegMBL1.rotateAngleZ = x + movcos2;
        LegMBL2.rotateAngleZ = -x + movcos3;
        LegMBL3.rotateAngleZ = -0.2617994F - x + movcos3;
        LegMBL4.rotateAngleZ = -0.2617994F - x + movcos3;
        LegMBL5.rotateAngleZ = -0.7853982F - x + movcos3;
        LegMBL6.rotateAngleZ = -1.186824F - x + movcos3;

        LegBL1.rotateAngleY = 0.698F - movcos1;
        LegBL1.rotateAngleX = 0.698F + movsin1;
        LegBL1.rotateAngleZ = b - movcos2;
        LegBL2.rotateAngleZ = -x - movcos3;
        LegBL3.rotateAngleZ = -0.2617994F - x - movcos3;
        LegBL4.rotateAngleZ = -0.2617994F - x - movcos3;
        LegBL5.rotateAngleZ = -0.7853982F - x - movcos3;
        LegBL6.rotateAngleZ = -1.186824F - x - movcos3;

        LegFR1.rotateAngleY = 3.84F + movcos1;
        LegFR1.rotateAngleX = 3.84F - movsin1;
        LegFR1.rotateAngleZ = -b + movcos2;
        LegFR2.rotateAngleZ = x2 + movcos3;
        LegFR3.rotateAngleZ = 0.2617994F + x2 + movcos3;
        LegFR4.rotateAngleZ = 0.2617994F + x2 + movcos3;
        LegFR5.rotateAngleZ = 0.7853982F + x2 + movcos3;
        LegFR6.rotateAngleZ = 1.186824F + x2 + movcos3;

        LegMFR1.rotateAngleY = 3.317F - movcos1;
        LegMFR1.rotateAngleX = 3.317F + movsin1;
        LegMFR1.rotateAngleZ = -x - movcos2;
        LegMFR2.rotateAngleZ = x2 - movcos3;
        LegMFR3.rotateAngleZ = 0.2617994F + x2 - movcos3;
        LegMFR4.rotateAngleZ = 0.2617994F + x2 - movcos3;
        LegMFR5.rotateAngleZ = 0.7853982F + x2 - movcos3;
        LegMFR6.rotateAngleZ = 1.186824F + x2 - movcos3;

        LegMBR1.rotateAngleY = 2.967F + movcos1;
        LegMBR1.rotateAngleX = 2.967F - movsin1;
        LegMBR1.rotateAngleZ = -x + movcos2;
        LegMBR2.rotateAngleZ = x2 + movcos3;
        LegMBR3.rotateAngleZ = 0.2617994F + x2 + movcos3;
        LegMBR4.rotateAngleZ = 0.2617994F + x2 + movcos3;
        LegMBR5.rotateAngleZ = 0.7853982F + x2 + movcos3;
        LegMBR6.rotateAngleZ = 1.186824F + x2 + movcos3;

        LegBR1.rotateAngleY = 2.443F - movcos1;
        LegBR1.rotateAngleX = 2.443F + movsin1;
        LegBR1.rotateAngleZ = -b - movcos2;
        LegBR2.rotateAngleZ = x2 - movcos3;
        LegBR3.rotateAngleZ = 0.2617994F + x2 - movcos3;
        LegBR4.rotateAngleZ = 0.2617994F + x2 - movcos3;
        LegBR5.rotateAngleZ = 0.7853982F + x2 - movcos3;
        LegBR6.rotateAngleZ = 1.186824F + x2 - movcos3;
    }

}
