package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityWorkerBee;

@SideOnly(Side.CLIENT)
public class ModelWorkerBee extends ModelBase {

    ModelRenderer Thx;
    ModelRenderer ThxS;
    ModelRenderer Ab;
    ModelRenderer AbF;
    ModelRenderer AbSide;
    ModelRenderer AbTop;
    ModelRenderer AbBack;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer RMandible1;
    ModelRenderer RMandible2;
    ModelRenderer LMandible1;
    ModelRenderer LMandible2;
    ModelRenderer Eyes;
    ModelRenderer AntLE;
    ModelRenderer AntRE;
    ModelRenderer AntRS;
    ModelRenderer AntLS;
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
    ModelRenderer Sting;
    ModelRenderer Head3;
    ModelRenderer ThxTop;
    ModelRenderer ThxRW;
    ModelRenderer ThxLW;
    ModelRenderer RWingBack;
    ModelRenderer RWingMid;
    ModelRenderer RWingFront;
    ModelRenderer LWingBack;
    ModelRenderer LWingMid;
    ModelRenderer LWingFront;

    public ModelWorkerBee() {
        textureWidth = 64;
        textureHeight = 128;
        Thx = new ModelRenderer(this, 14, 14);
        Thx.addBox(-3.5F, -6F, 0F, 7, 9, 8);
        Thx.setRotationPoint(0F, 17F, 0F);
        setRotation(Thx, 0F, 0F, 0F);
        ThxS = new ModelRenderer(this, 5, 42);
        ThxS.addBox(-4.5F, -4.5F, 1F, 9, 6, 6);
        ThxS.setRotationPoint(0F, 17F, 0F);
        setRotation(ThxS, 0F, 0F, 0F);
        Ab = new ModelRenderer(this, 14, 100);
        Ab.addBox(-3.5F, -5F, -1F, 7, 8, 11);
        Ab.setRotationPoint(0F, 17F, 11F);
        setRotation(Ab, -0.0872665F, 0F, 0F);
        AbF = new ModelRenderer(this, 23, 60);
        AbF.addBox(-2F, -3F, -5F, 4, 5, 5);
        AbF.setRotationPoint(0F, 17F, 11F);
        setRotation(AbF, -0.3316126F, 0F, 0F);
        AbSide = new ModelRenderer(this, 12, 71);
        AbSide.addBox(-5F, -3.5F, 1F, 10, 5, 8);
        AbSide.setRotationPoint(0F, 17F, 11F);
        setRotation(AbSide, -0.0872665F, 0F, 0F);
        AbTop = new ModelRenderer(this, 15, 85);
        AbTop.addBox(-2.5F, -6.5F, 1F, 5, 2, 8);
        AbTop.setRotationPoint(0F, 17F, 11F);
        setRotation(AbTop, -0.0872665F, 0F, 0F);
        AbBack = new ModelRenderer(this, 22, 121);
        AbBack.addBox(-2F, -3F, 10F, 4, 5, 2);
        AbBack.setRotationPoint(0F, 17F, 11F);
        setRotation(AbBack, -0.0872665F, 0F, 0F);
        Head1 = new ModelRenderer(this, 23, 0);
        Head1.addBox(-2F, -1.5F, -6F, 4, 4, 9);
        Head1.setRotationPoint(0F, 16F, -1F);
        setRotation(Head1, -0.5235988F, 0F, 0F);
        Head2 = new ModelRenderer(this, 0, 0);
        Head2.addBox(-3F, -2.5F, -5F, 6, 8, 5);
        setRotation(Head2, 0F, 0F, 0F);
        RMandible1 = new ModelRenderer(this, 57, 0);
        RMandible1.addBox(-2F, 6.5F, -4F, 1, 2, 2);
        setRotation(RMandible1, 0F, 0F, 0F);
        RMandible2 = new ModelRenderer(this, 57, 12);
        RMandible2.addBox(-1.5F, 7.5F, -4F, 1, 1, 2);
        setRotation(RMandible2, 0F, 0F, 0F);
        LMandible1 = new ModelRenderer(this, 50, 0);
        LMandible1.addBox(1F, 6.5F, -4F, 1, 2, 2);
        setRotation(LMandible1, 0F, 0F, 0F);
        LMandible2 = new ModelRenderer(this, 50, 12);
        LMandible2.addBox(0.5F, 7.5F, -4F, 1, 1, 2);
        setRotation(LMandible2, 0F, 0F, 0F);
        Eyes = new ModelRenderer(this, 0, 32);
        Eyes.addBox(-4F, -1.5F, -4F, 8, 6, 3);
        setRotation(Eyes, 0F, 0F, 0F);
        AntLE = new ModelRenderer(this, 47, 17);
        AntLE.addBox(-1F, -2.5F, -10F, 5, 1, 1);
        setRotation(AntLE, 0F, 0F, 1.570796F);
        AntRE = new ModelRenderer(this, 47, 17);
        AntRE.addBox(-1F, 1.5F, -10F, 5, 1, 1);
        setRotation(AntRE, 0F, 0F, 1.570796F);
        AntRS = new ModelRenderer(this, 51, 5);
        AntRS.addBox(-2.5F, 1.5F, -9F, 1, 1, 5);
        setRotation(AntRS, -0.3490659F, 0F, 0F);
        AntLS = new ModelRenderer(this, 51, 5);
        AntLS.addBox(1.5F, 1.5F, -9F, 1, 1, 5);
        setRotation(AntLS, -0.3490659F, 0F, 0F);

        float legCorrection = 0.3490659F;
        LBL1 = new ModelRenderer(this, 44, 95);
        LBL1.addBox(-1F, -1F, -1F, 7, 2, 2);
        LBL1.setRotationPoint(4F, 18F, 8F);
        LBL1.setTextureSize(64, 32);
        LBL1.mirror = true;
        setRotation(LBL1, 0F, -0.6981317F, -0.3490659F);
        LBL2 = new ModelRenderer(this, 0, 103);
        LBL2.addBox(4F, 0F, -1.5F, 3, 5, 3);
        setRotation(LBL2, 0F, 0F, 0F);
        LBL3 = new ModelRenderer(this, 0, 82);
        LBL3.addBox(2.5F, 5.5F, -1F, 3, 4, 2);
        setRotation(LBL3, 0F, 0F, -0.6981317F + legCorrection);
        LBL4 = new ModelRenderer(this, 0, 70);
        LBL4.addBox(1.5F, 9F, -0.5F, 1, 3, 1);
        setRotation(LBL4, 0F, 0F, -0.8726646F + legCorrection);
        LML1 = new ModelRenderer(this, 0, 97);
        LML1.addBox(0F, -1F, -1F, 4, 2, 2);
        LML1.setRotationPoint(4F, 18F, 5F);
        setRotation(LML1, 0F, 0F, -0.3490659F);
        LML2 = new ModelRenderer(this, 0, 89);
        LML2.addBox(3F, 0F, -1.5F, 2, 4, 3);
        setRotation(LML2, 0F, 0F, 0F);
        LML3 = new ModelRenderer(this, 0, 75);
        LML3.addBox(1.5F, 4.5F, -1F, 2, 4, 2);
        setRotation(LML3, 0F, 0F, -0.6981317F + legCorrection);
        LML4 = new ModelRenderer(this, 0, 70);
        LML4.addBox(0.5F, 8F, -0.5F, 1, 3, 1);
        setRotation(LML4, 0F, 0F, -0.8726646F + legCorrection);
        LFL1 = new ModelRenderer(this, 0, 97);
        LFL1.addBox(0F, -1F, -1F, 4, 2, 2);
        LFL1.setRotationPoint(4F, 18F, 2F);
        setRotation(LFL1, 0F, 0.6981317F, -0.3490659F);
        LFL2 = new ModelRenderer(this, 0, 89);
        LFL2.addBox(3F, 0F, -1.5F, 2, 4, 3);
        setRotation(LFL2, 0F, 0F, 0F);
        LFL3 = new ModelRenderer(this, 0, 75);
        LFL3.addBox(1.5F, 4.5F, -1F, 2, 4, 2);
        setRotation(LFL3, 0F, 0F, -0.6981317F + legCorrection);
        LFL4 = new ModelRenderer(this, 0, 70);
        LFL4.addBox(0.5F, 8F, -0.5F, 1, 3, 1);
        setRotation(LFL4, 0F, 0F, -0.8726646F + legCorrection);
        RFL1 = new ModelRenderer(this, 0, 97);
        RFL1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RFL1.setRotationPoint(-4F, 18F, 2F);
        setRotation(RFL1, 0F, -0.6981317F, 0.3490659F);
        RFL2 = new ModelRenderer(this, 0, 89);
        RFL2.addBox(-5F, 0F, -1.5F, 2, 4, 3);
        setRotation(RFL2, 0F, 0F, 0F);
        RFL3 = new ModelRenderer(this, 0, 75);
        RFL3.addBox(-3.5F, 4.5F, -1F, 2, 4, 2);
        setRotation(RFL3, 0F, 0F, 0.6981317F - legCorrection);
        RFL4 = new ModelRenderer(this, 0, 70);
        RFL4.addBox(-1.5F, 8F, -0.5F, 1, 3, 1);
        setRotation(RFL4, 0F, 0F, 0.8726646F - legCorrection);
        RML1 = new ModelRenderer(this, 0, 97);
        RML1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RML1.setRotationPoint(-4F, 18F, 5F);
        setRotation(RML1, 0F, 0F, 0.3490659F);
        RML2 = new ModelRenderer(this, 0, 89);
        RML2.addBox(-5F, 0F, -1.5F, 2, 4, 3);
        setRotation(RML2, 0F, 0F, 0F);
        RML3 = new ModelRenderer(this, 0, 75);
        RML3.addBox(-3.5F, 4.5F, -1F, 2, 4, 2);
        setRotation(RML3, 0F, 0F, 0.6981317F - legCorrection);
        RML4 = new ModelRenderer(this, 0, 70);
        RML4.addBox(-1.5F, 8F, -0.5F, 1, 3, 1);
        setRotation(RML4, 0F, 0F, 0.8726646F - legCorrection);
        RBL1 = new ModelRenderer(this, 44, 95);
        RBL1.addBox(-6F, -1F, -1F, 7, 2, 2);
        RBL1.setRotationPoint(-4F, 18F, 8F);
        setRotation(RBL1, 0F, 0.6981317F, 0.3490659F);
        RBL2 = new ModelRenderer(this, 0, 103);
        RBL2.addBox(-7F, 0F, -1.5F, 3, 5, 3);
        setRotation(RBL2, 0F, 0F, 0F);
        RBL3 = new ModelRenderer(this, 0, 82);
        RBL3.addBox(-5.5F, 5.5F, -1F, 3, 4, 2);
        setRotation(RBL3, 0F, 0F, 0.6981317F - legCorrection);
        RBL4 = new ModelRenderer(this, 0, 70);
        RBL4.addBox(-2.5F, 9F, -0.5F, 1, 3, 1);
        setRotation(RBL4, 0F, 0F, 0.8726646F - legCorrection);
        Sting = new ModelRenderer(this, 0, 122);
        Sting.addBox(-1F, -1F, 12F, 2, 2, 1);
        Sting.setRotationPoint(0F, 17F, 11F);
        setRotation(Sting, -0.1745329F, 0F, 0F);
        Head3 = new ModelRenderer(this, 43, 41);
        Head3.addBox(-2.5F, -3.5F, -4.5F, 5, 10, 4);
        setRotation(Head3, 0F, 0F, 0F);
        ThxTop = new ModelRenderer(this, 23, 32);
        ThxTop.addBox(-3F, -7F, 1F, 6, 2, 6);
        ThxTop.setRotationPoint(0F, 17F, 0F);
        setRotation(ThxTop, 0F, 0F, 0F);
        ThxRW = new ModelRenderer(this, 0, 55);
        ThxRW.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
        ThxRW.setRotationPoint(-4F, 13F, 4F);
        setRotation(ThxRW, 0F, 0F, -0.7853982F);
        ThxLW = new ModelRenderer(this, 0, 55);
        ThxLW.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
        ThxLW.setRotationPoint(4F, 13F, 4F);
        setRotation(ThxLW, 0F, 0F, 0.7853982F);
        RWingBack = new ModelRenderer(this, 42, 26);
        RWingBack.addBox(1.5F, -1F, 6F, 1, 1, 10);
        setRotation(RWingBack, 0F, 0F, 0F);
        RWingMid = new ModelRenderer(this, 19, 41);
        RWingMid.addBox(-1.5F, -1F, 0F, 3, 1, 17);
        setRotation(RWingMid, 0F, 0F, 0F);
        RWingFront = new ModelRenderer(this, 42, 26);
        RWingFront.addBox(-2.5F, -1F, 6F, 1, 1, 10);
        setRotation(RWingFront, 0F, 0F, 0F);
        LWingBack = new ModelRenderer(this, 42, 26);
        LWingBack.addBox(-2.5F, -1F, 6F, 1, 1, 10);
        setRotation(LWingBack, 0F, 0F, 0F);
        LWingMid = new ModelRenderer(this, 19, 41);
        LWingMid.addBox(-1.5F, -1F, 0F, 3, 1, 17);
        setRotation(LWingMid, 0F, 0F, 0F);
        LWingFront = new ModelRenderer(this, 42, 26);
        LWingFront.addBox(1.5F, -1F, 6F, 1, 1, 10);
        setRotation(LWingFront, 0F, 0F, 0F);

        LBL1.addChild(LBL2);
        LBL1.addChild(LBL3);
        LBL1.addChild(LBL4);
        LML1.addChild(LML2);
        LML1.addChild(LML3);
        LML1.addChild(LML4);
        LFL1.addChild(LFL2);
        LFL1.addChild(LFL3);
        LFL1.addChild(LFL4);
        RBL1.addChild(RBL2);
        RBL1.addChild(RBL3);
        RBL1.addChild(RBL4);
        RML1.addChild(RML2);
        RML1.addChild(RML3);
        RML1.addChild(RML4);
        RFL1.addChild(RFL2);
        RFL1.addChild(RFL3);
        RFL1.addChild(RFL4);
        Head1.addChild(Head2);
        Head1.addChild(Head3);
        Head1.addChild(Eyes);
        Head1.addChild(RMandible1);
        Head1.addChild(RMandible2);
        Head1.addChild(LMandible1);
        Head1.addChild(LMandible2);
        Head1.addChild(AntLS);
        Head1.addChild(AntLE);
        Head1.addChild(AntRS);
        Head1.addChild(AntRE);
        ThxRW.addChild(RWingBack);
        ThxRW.addChild(RWingMid);
        ThxRW.addChild(RWingFront);
        ThxLW.addChild(LWingBack);
        ThxLW.addChild(LWingMid);
        ThxLW.addChild(LWingFront);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAngle, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, limbSwingAngle, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, limbSwingAngle, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        GL11.glPushMatrix();
        GL11.glTranslated(0F, 0F, -0.5F);
        Thx.render(unitPixel);
        ThxS.render(unitPixel);
        Ab.render(unitPixel);
        AbF.render(unitPixel);
        AbSide.render(unitPixel);
        AbTop.render(unitPixel);
        AbBack.render(unitPixel);
        Head1.render(unitPixel);
        LBL1.render(unitPixel);
        LML1.render(unitPixel);
        LFL1.render(unitPixel);
        RFL1.render(unitPixel);
        RML1.render(unitPixel);
        RBL1.render(unitPixel);
        Sting.render(unitPixel);
        ThxTop.render(unitPixel);
        GL11.glPushMatrix();
        GL11.glEnable(GL11.GL_BLEND);
        ThxRW.render(unitPixel);
        ThxLW.render(unitPixel);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
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
        float heady = rotationYaw / (180F / (float) Math.PI);
        Head1.rotateAngleY = heady;
        EntityWorkerBee bee = (EntityWorkerBee) entity;

        if (bee.onGround) {
            float legMovement = MathHelper.cos(limbSwing * 2.0F) * 0.7F * limbSwingAngle;
            LBL1.rotateAngleX = -legMovement;
            LML1.rotateAngleX = legMovement;
            LFL1.rotateAngleX = -legMovement;
            RBL1.rotateAngleX = legMovement;
            RML1.rotateAngleX = -legMovement;
            RFL1.rotateAngleX = legMovement;
            ThxRW.rotateAngleX = 0F;
            ThxLW.rotateAngleX = 0F;
            ThxRW.rotateAngleY = 0F;
            ThxLW.rotateAngleY = 0F;
            ThxRW.rotateAngleZ = -0.7853982F;
            ThxLW.rotateAngleZ = 0.7853982F;
            Ab.rotateAngleX = -0.2F;
            AbF.rotateAngleX = -0.2F;
            AbSide.rotateAngleX = -0.2F;
            AbTop.rotateAngleX = -0.2F;
            AbBack.rotateAngleX = -0.2F;
            Sting.rotateAngleX = -0.2F;
        }

        if (bee.isFlying()) {
            LBL1.rotateAngleX = +0.25F;
            LML1.rotateAngleX = 0F;
            LFL1.rotateAngleX = -0.25F;
            RBL1.rotateAngleX = +0.25F;
            RML1.rotateAngleX = 0F;
            RFL1.rotateAngleX = -0.25F;
            ThxRW.rotateAngleX = bee.wingFloat;
            ThxLW.rotateAngleX = bee.wingFloat;
            ThxRW.rotateAngleY = -1.5F;
            ThxLW.rotateAngleY = 1.5F;
            ThxRW.rotateAngleZ = 0F;
            ThxLW.rotateAngleZ = 0F;
            Ab.rotateAngleX = -0.8F;
            AbF.rotateAngleX = -0.8F;
            AbSide.rotateAngleX = -0.8F;
            AbTop.rotateAngleX = -0.8F;
            AbBack.rotateAngleX = -0.8F;
            Sting.rotateAngleX = -0.8F;
        }
    }
}
