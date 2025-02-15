package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelScytodes extends ModelBase {

    ModelRenderer Lmand1;
    ModelRenderer Lmand2;
    ModelRenderer Rmand1;
    ModelRenderer Rmand2;
    ModelRenderer Head1;
    ModelRenderer HeadMain;
    ModelRenderer HeadFront;
    ModelRenderer HeadBack;
    ModelRenderer HeadBotB;
    ModelRenderer HeadBot;
    ModelRenderer HeadCore;
    ModelRenderer AbTop1;
    ModelRenderer AbTop2;
    ModelRenderer ABot1;
    ModelRenderer AbBack;
    ModelRenderer AbCore1;
    ModelRenderer AbCore2;
    ModelRenderer AbCore3;
    ModelRenderer LFL1;
    ModelRenderer LFL2;
    ModelRenderer LFL3;
    ModelRenderer LFL4;
    ModelRenderer LFL5;
    ModelRenderer LFL6;
    ModelRenderer LMFL1;
    ModelRenderer LMFL2;
    ModelRenderer LMFL3;
    ModelRenderer LMFL4;
    ModelRenderer LMFL5;
    ModelRenderer LMFL6;
    ModelRenderer LMBL1;
    ModelRenderer LMBL2;
    ModelRenderer LMBL3;
    ModelRenderer LMBL4;
    ModelRenderer LMBL5;
    ModelRenderer LMBL6;
    ModelRenderer LBL1;
    ModelRenderer LBL2;
    ModelRenderer LBL3;
    ModelRenderer LBL4;
    ModelRenderer LBL5;
    ModelRenderer LBL6;
    ModelRenderer RFL1;
    ModelRenderer RFL2;
    ModelRenderer RFL3;
    ModelRenderer RFL4;
    ModelRenderer RFL5;
    ModelRenderer RFL6;
    ModelRenderer RMFL1;
    ModelRenderer RMFL2;
    ModelRenderer RMFL3;
    ModelRenderer RMFL4;
    ModelRenderer RMFL5;
    ModelRenderer RMFL6;
    ModelRenderer RMBL1;
    ModelRenderer RMBL2;
    ModelRenderer RMBL3;
    ModelRenderer RMBL4;
    ModelRenderer RMBL5;
    ModelRenderer RMBL6;
    ModelRenderer RBL1;
    ModelRenderer RBL2;
    ModelRenderer RBL3;
    ModelRenderer RBL4;
    ModelRenderer RBL5;
    ModelRenderer RBL6;

    public ModelScytodes() {
        textureWidth = 64;
        textureHeight = 128;

        Lmand1 = new ModelRenderer(this, 0, 0);
        Lmand1.addBox(0F, -1.5F, -0.5F, 1, 4, 1);
        Lmand1.setRotationPoint(1F, 17F, -13F);
        setRotation(Lmand1, 0.6981317F, 0F, 0F);
        Lmand2 = new ModelRenderer(this, 5, 0);
        Lmand2.addBox(0F, 0.5F, -1.5F, 1, 3, 1);
        Lmand2.setRotationPoint(1F, 17F, -13F);
        setRotation(Lmand2, -0.8726646F, 0F, 0F);
        Rmand1 = new ModelRenderer(this, 0, 0);
        Rmand1.addBox(-1F, -1.5F, -0.5F, 1, 4, 1);
        Rmand1.setRotationPoint(-1F, 17F, -13F);
        setRotation(Rmand1, 0.6981317F, 0F, 0F);
        Rmand2 = new ModelRenderer(this, 5, 0);
        Rmand2.addBox(-1F, 0.5F, -1.5F, 1, 3, 1);
        Rmand2.setRotationPoint(-1F, 17F, -13F);
        setRotation(Rmand2, -0.8726646F, 0F, 0F);
        Head1 = new ModelRenderer(this, 10, 0);
        Head1.addBox(-2.5F, 0.5F, -4.5F, 5, 4, 2);
        Head1.setRotationPoint(0F, 15F, -7F);
        setRotation(Head1, 0F, 0F, 0F);
        HeadMain = new ModelRenderer(this, 0, 21);
        HeadMain.addBox(-6F, -1.7F, -2.8F, 12, 4, 11);
        HeadMain.setRotationPoint(0F, 17F, -7F);
        setRotation(HeadMain, 0F, 0F, 0F);
        HeadFront = new ModelRenderer(this, 26, 0);
        HeadFront.addBox(-4F, -3.866667F, -1.9F, 8, 6, 9);
        HeadFront.setRotationPoint(0F, 17F, -7F);
        setRotation(HeadFront, 0.6981317F, 0F, 0F);
        HeadBack = new ModelRenderer(this, 0, 7);
        HeadBack.addBox(-4F, -8F, -1.1F, 8, 4, 9);
        HeadBack.setRotationPoint(0F, 17F, -7F);
        setRotation(HeadBack, -0.5235988F, 0F, 0F);
        HeadBotB = new ModelRenderer(this, 36, 16);
        HeadBotB.addBox(-4F, 1F, 4.2F, 8, 4, 6);
        HeadBotB.setRotationPoint(0F, 17F, -7F);
        setRotation(HeadBotB, 0.3490659F, 0F, 0F);
        HeadBot = new ModelRenderer(this, 0, 37);
        HeadBot.addBox(-4F, 2.3F, -0.8F, 8, 1, 8);
        HeadBot.setRotationPoint(0F, 17F, -8F);
        setRotation(HeadBot, 0F, 0F, 0F);
        HeadCore = new ModelRenderer(this, 27, 113);
        HeadCore.addBox(-5F, -2.5F, 0F, 10, 6, 7);
        HeadCore.setRotationPoint(0F, 17F, -7F);
        setRotation(HeadCore, 0.7853982F, 0F, 0F);
        AbTop1 = new ModelRenderer(this, 0, 47);
        AbTop1.addBox(-4F, 2.9F, 6.1F, 8, 6, 9);
        AbTop1.setRotationPoint(0F, 17F, -7F);
        setRotation(AbTop1, 0.6981317F, 0F, 0F);
        AbTop2 = new ModelRenderer(this, 32, 43);
        AbTop2.addBox(-4F, -13.2F, 8F, 8, 4, 8);
        AbTop2.setRotationPoint(0F, 17F, -7F);
        setRotation(AbTop2, -0.5235988F, 0F, 0F);
        ABot1 = new ModelRenderer(this, 0, 63);
        ABot1.addBox(-4F, -5.6F, 7.8F, 8, 5, 8);
        ABot1.setRotationPoint(0F, 17F, -7F);
        setRotation(ABot1, -0.3490659F, 0F, 0F);
        AbBack = new ModelRenderer(this, 34, 56);
        AbBack.addBox(-4F, 0.8F, 13.7F, 8, 7, 7);
        AbBack.setRotationPoint(0F, 17F, -7F);
        setRotation(AbBack, 0.2094395F, 0F, 0F);
        AbCore1 = new ModelRenderer(this, 25, 77);
        AbCore1.addBox(-6F, -11.7F, 8.6F, 12, 7, 7);
        AbCore1.setRotationPoint(0F, 17F, -7F);
        setRotation(AbCore1, -0.5235988F, 0F, 0F);
        AbCore2 = new ModelRenderer(this, 26, 92);
        AbCore2.addBox(-7F, 2.3F, 13.6F, 14, 4, 4);
        AbCore2.setRotationPoint(0F, 17F, -7F);
        setRotation(AbCore2, 0.2617994F, 0F, 0F);
        AbCore3 = new ModelRenderer(this, 27, 102);
        AbCore3.addBox(-6F, 1.7F, 14.6F, 12, 5, 5);
        AbCore3.setRotationPoint(0F, 18F, -7F);
        setRotation(AbCore3, 0.2617994F, 0F, 0F);

        float correction = 0.6108652F;
        LFL1 = new ModelRenderer(this, 0, 94);
        LFL1.addBox(0F, -1F, -1F, 8, 2, 2);
        LFL1.setRotationPoint(5F, 17F, -9F);
        setRotation(LFL1, 0F, 0F, -0.6108652F);
        LFL2 = new ModelRenderer(this, 0, 99);
        LFL2.addBox(2.5F, -7.7F, -1F, 6, 1, 2);
        setRotation(LFL2, 0F, 0F, 0.5235988F + correction);
        LFL3 = new ModelRenderer(this, 0, 103);
        LFL3.addBox(3.7F, -6F, -1F, 6, 1, 2);
        setRotation(LFL3, 0F, 0F, 0.3490659F + correction);
        LFL4 = new ModelRenderer(this, 0, 107);
        LFL4.addBox(10F, 3F, -0.5F, 1, 6, 1);
        setRotation(LFL4, 0F, 0F, -0.4712389F + correction);
        LFL5 = new ModelRenderer(this, 0, 115);
        LFL5.addBox(9F, 3.5F, -0.5F, 1, 6, 1);
        setRotation(LFL5, 0F, 0F, -0.5759587F + correction);
        LFL6 = new ModelRenderer(this, 0, 123);
        LFL6.addBox(11F, 7.5F, -0.5F, 1, 4, 1);
        setRotation(LFL6, 0F, 0F, -0.3490659F + correction);
        LMFL1 = new ModelRenderer(this, 0, 94);
        LMFL1.addBox(0F, -1F, -1F, 8, 2, 2);
        LMFL1.setRotationPoint(5F, 17F, -6F);
        setRotation(LMFL1, 0F, 0F, -0.6108652F);
        LMFL2 = new ModelRenderer(this, 0, 99);
        LMFL2.addBox(2.5F, -7.7F, -1F, 6, 1, 2);
        setRotation(LMFL2, 0F, 0F, 0.5235988F + correction);
        LMFL3 = new ModelRenderer(this, 0, 103);
        LMFL3.addBox(3.7F, -6F, -1F, 6, 1, 2);
        setRotation(LMFL3, 0F, 0F, 0.3490659F + correction);
        LMFL4 = new ModelRenderer(this, 0, 107);
        LMFL4.addBox(10F, 3F, -0.5F, 1, 6, 1);
        setRotation(LMFL4, 0F, 0F, -0.4712389F + correction);
        LMFL5 = new ModelRenderer(this, 0, 115);
        LMFL5.addBox(9F, 3.5F, -0.5F, 1, 6, 1);
        setRotation(LMFL5, 0F, 0F, -0.5759587F + correction);
        LMFL6 = new ModelRenderer(this, 0, 123);
        LMFL6.addBox(11F, 7.5F, -0.5F, 1, 4, 1);
        setRotation(LMFL6, 0F, 0F, -0.3490659F + correction);
        LMBL1 = new ModelRenderer(this, 0, 94);
        LMBL1.addBox(0F, -1F, -1F, 8, 2, 2);
        LMBL1.setRotationPoint(5F, 17F, -3F);
        setRotation(LMBL1, 0F, 0F, -0.6108652F);
        LMBL2 = new ModelRenderer(this, 0, 99);
        LMBL2.addBox(2.5F, -7.7F, -1F, 6, 1, 2);
        setRotation(LMBL2, 0F, 0F, 0.5235988F + correction);
        LMBL3 = new ModelRenderer(this, 0, 103);
        LMBL3.addBox(3.7F, -6F, -1F, 6, 1, 2);
        setRotation(LMBL3, 0F, 0F, 0.3490659F + correction);
        LMBL4 = new ModelRenderer(this, 0, 107);
        LMBL4.addBox(10F, 3F, -0.5F, 1, 6, 1);
        setRotation(LMBL4, 0F, 0F, -0.4712389F + correction);
        LMBL5 = new ModelRenderer(this, 0, 115);
        LMBL5.addBox(9F, 3.5F, -0.5F, 1, 6, 1);
        setRotation(LMBL5, 0F, 0F, -0.5759587F + correction);
        LMBL6 = new ModelRenderer(this, 0, 123);
        LMBL6.addBox(11F, 7.5F, -0.5F, 1, 4, 1);
        setRotation(LMBL6, 0F, 0F, -0.3490659F + correction);
        LBL1 = new ModelRenderer(this, 0, 94);
        LBL1.addBox(0F, -1F, -1F, 8, 2, 2);
        LBL1.setRotationPoint(5F, 17F, 0F);
        setRotation(LBL1, 0F, 0F, -0.6108652F);
        LBL2 = new ModelRenderer(this, 0, 99);
        LBL2.addBox(2.5F, -7.7F, -1F, 6, 1, 2);
        setRotation(LBL2, 0F, 0F, 0.5235988F + correction);
        LBL3 = new ModelRenderer(this, 0, 103);
        LBL3.addBox(3.7F, -6F, -1F, 6, 1, 2);
        setRotation(LBL3, 0F, 0F, 0.3490659F + correction);
        LBL4 = new ModelRenderer(this, 0, 107);
        LBL4.addBox(10F, 3F, -0.5F, 1, 6, 1);
        setRotation(LBL4, 0F, 0F, -0.4712389F + correction);
        LBL5 = new ModelRenderer(this, 0, 115);
        LBL5.addBox(9F, 3.5F, -0.5F, 1, 6, 1);
        setRotation(LBL5, 0F, 0F, -0.5759587F + correction);
        LBL6 = new ModelRenderer(this, 0, 123);
        LBL6.addBox(11F, 7.5F, -0.5F, 1, 4, 1);
        setRotation(LBL6, 0F, 0F, -0.3490659F + correction);
        RFL1 = new ModelRenderer(this, 0, 94);
        RFL1.addBox(0F, -1F, -1F, 8, 2, 2);
        RFL1.setRotationPoint(-5F, 17F, -9F);
        setRotation(RFL1, 0F, -3.141593F, 0.6108652F);
        RFL2 = new ModelRenderer(this, 0, 99);
        RFL2.addBox(2.5F, -7.7F, -1F, 6, 1, 2);
        setRotation(RFL2, 0F, 0F, 0.5235988F + correction);
        RFL3 = new ModelRenderer(this, 0, 99);
        RFL3.addBox(3.7F, -6F, -1F, 6, 1, 2);
        setRotation(RFL3, 0F, 0F, 0.3490659F + correction);
        RFL4 = new ModelRenderer(this, 0, 107);
        RFL4.addBox(10F, 3F, -0.5F, 1, 6, 1);
        setRotation(RFL4, 0F, 0F, -0.4712389F + correction);
        RFL5 = new ModelRenderer(this, 0, 115);
        RFL5.addBox(9F, 3.5F, -0.5F, 1, 6, 1);
        setRotation(RFL5, 0F, 0F, -0.5759587F + correction);
        RFL6 = new ModelRenderer(this, 0, 123);
        RFL6.addBox(11F, 7.5F, -0.5F, 1, 4, 1);
        setRotation(RFL6, 0F, 0F, -0.3490659F + correction);
        RMFL1 = new ModelRenderer(this, 0, 94);
        RMFL1.addBox(0F, -1F, -1F, 8, 2, 2);
        RMFL1.setRotationPoint(-5F, 17F, -6F);
        setRotation(RMFL1, 0F, 3.141593F, 0.6108652F);
        RMFL2 = new ModelRenderer(this, 0, 99);
        RMFL2.addBox(2.5F, -7.7F, -1F, 6, 1, 2);
        setRotation(RMFL2, 0F, 0F, 0.5235988F + correction);
        RMFL3 = new ModelRenderer(this, 0, 103);
        RMFL3.addBox(3.7F, -6F, -1F, 6, 1, 2);
        setRotation(RMFL3, 0F, 0F, 0.3490659F + correction);
        RMFL4 = new ModelRenderer(this, 0, 107);
        RMFL4.addBox(10F, 3F, -0.5F, 1, 6, 1);
        setRotation(RMFL4, 0F, 0F, -0.4712389F + correction);
        RMFL5 = new ModelRenderer(this, 0, 115);
        RMFL5.addBox(9F, 3.5F, -0.5F, 1, 6, 1);
        setRotation(RMFL5, 0F, 0F, -0.5759587F + correction);
        RMFL6 = new ModelRenderer(this, 0, 123);
        RMFL6.addBox(11F, 7.5F, -0.5F, 1, 4, 1);
        setRotation(RMFL6, 0F, 0F, -0.3490659F + correction);
        RMBL1 = new ModelRenderer(this, 0, 94);
        RMBL1.addBox(0F, -1F, -1F, 8, 2, 2);
        RMBL1.setRotationPoint(-5F, 17F, -3F);
        setRotation(RMBL1, 0F, 3.141593F, 0.6108652F);
        RMBL2 = new ModelRenderer(this, 0, 99);
        RMBL2.addBox(2.5F, -7.7F, -1F, 6, 1, 2);
        setRotation(RMBL2, 0F, 0F, 0.5235988F + correction);
        RMBL3 = new ModelRenderer(this, 0, 103);
        RMBL3.addBox(3.7F, -6F, -1F, 6, 1, 2);
        setRotation(RMBL3, 0F, 0F, 0.3490659F + correction);
        RMBL4 = new ModelRenderer(this, 0, 107);
        RMBL4.addBox(10F, 3F, -0.5F, 1, 6, 1);
        setRotation(RMBL4, 0F, 0F, -0.4712389F + correction);
        RMBL5 = new ModelRenderer(this, 0, 115);
        RMBL5.addBox(9F, 3.5F, -0.5F, 1, 6, 1);
        setRotation(RMBL5, 0F, 0F, -0.5759587F + correction);
        RMBL6 = new ModelRenderer(this, 0, 123);
        RMBL6.addBox(11F, 7.5F, -0.5F, 1, 4, 1);
        setRotation(RMBL6, 0F, 0F, -0.3490659F + correction);
        RBL1 = new ModelRenderer(this, 0, 94);
        RBL1.addBox(0F, -1F, -1F, 8, 2, 2);
        RBL1.setRotationPoint(-5F, 17F, 0F);
        setRotation(RBL1, 0F, 3.141593F, 0.6108652F);
        RBL2 = new ModelRenderer(this, 0, 99);
        RBL2.addBox(2.5F, -7.7F, -1F, 6, 1, 2);
        setRotation(RBL2, 0F, 0F, 0.5235988F + correction);
        RBL3 = new ModelRenderer(this, 0, 103);
        RBL3.addBox(3.7F, -6F, -1F, 6, 1, 2);
        setRotation(RBL3, 0F, 0F, 0.3490659F + correction);
        RBL4 = new ModelRenderer(this, 0, 107);
        RBL4.addBox(10F, 3F, -0.5F, 1, 6, 1);
        setRotation(RBL4, 0F, 0F, -0.4712389F + correction);
        RBL5 = new ModelRenderer(this, 0, 115);
        RBL5.addBox(9F, 3.5F, -0.5F, 1, 6, 1);
        setRotation(RBL5, 0F, 0F, -0.5759587F + correction);
        RBL6 = new ModelRenderer(this, 0, 123);
        RBL6.addBox(11F, 7.5F, -0.5F, 1, 4, 1);
        setRotation(RBL6, 0F, 0F, -0.3490659F + correction);

        LFL1.addChild(LFL2);
        LFL1.addChild(LFL3);
        LFL1.addChild(LFL4);
        LFL1.addChild(LFL5);
        LFL1.addChild(LFL6);

        LMFL1.addChild(LMFL2);
        LMFL1.addChild(LMFL3);
        LMFL1.addChild(LMFL4);
        LMFL1.addChild(LMFL5);
        LMFL1.addChild(LMFL6);

        LMBL1.addChild(LMBL2);
        LMBL1.addChild(LMBL3);
        LMBL1.addChild(LMBL4);
        LMBL1.addChild(LMBL5);
        LMBL1.addChild(LMBL6);

        LBL1.addChild(LBL2);
        LBL1.addChild(LBL3);
        LBL1.addChild(LBL4);
        LBL1.addChild(LBL5);
        LBL1.addChild(LBL6);

        RFL1.addChild(RFL2);
        RFL1.addChild(RFL3);
        RFL1.addChild(RFL4);
        RFL1.addChild(RFL5);
        RFL1.addChild(RFL6);

        RMFL1.addChild(RMFL2);
        RMFL1.addChild(RMFL3);
        RMFL1.addChild(RMFL4);
        RMFL1.addChild(RMFL5);
        RMFL1.addChild(RMFL6);

        RMBL1.addChild(RMBL2);
        RMBL1.addChild(RMBL3);
        RMBL1.addChild(RMBL4);
        RMBL1.addChild(RMBL5);
        RMBL1.addChild(RMBL6);

        RBL1.addChild(RBL2);
        RBL1.addChild(RBL3);
        RBL1.addChild(RBL4);
        RBL1.addChild(RBL5);
        RBL1.addChild(RBL6);
    }

    @Override
    public void render(Entity entity, float ingCorpse, float edARaft, float away, float yClouds, float inACarnival,
        float ationTank) {
        super.render(entity, ingCorpse, edARaft, away, yClouds, inACarnival, ationTank);
        setRotationAngles(ingCorpse, edARaft, away, yClouds, inACarnival, ationTank, entity);
        Lmand1.render(ationTank);
        Lmand2.render(ationTank);
        Rmand1.render(ationTank);
        Rmand2.render(ationTank);
        Head1.render(ationTank);
        HeadMain.render(ationTank);
        HeadFront.render(ationTank);
        HeadBack.render(ationTank);
        HeadBotB.render(ationTank);
        HeadBot.render(ationTank);
        HeadCore.render(ationTank);
        AbTop1.render(ationTank);
        AbTop2.render(ationTank);
        ABot1.render(ationTank);
        AbBack.render(ationTank);
        AbCore1.render(ationTank);
        AbCore2.render(ationTank);
        AbCore3.render(ationTank);

        GL11.glPushMatrix();
        GL11.glTranslated(0.625F, 0F, 0F);
        GL11.glRotated(60F, 0F, 1F, 0F);
        LFL1.render(ationTank);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(0.1875, -0.0625F, 0.0625F);
        GL11.glRotated(20F, 0F, 1F, 0F);
        LMFL1.render(ationTank);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(0F, -0.0625F, -0.125F);
        GL11.glRotated(-20F, 0F, 1F, 0F);
        LMBL1.render(ationTank);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(0.1875F, -0.0625F, -0.25F);
        GL11.glRotated(-60F, 0F, 1F, 0F);
        LBL1.render(ationTank);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(-0.625F, 0F, 0F);
        GL11.glRotated(-60F, 0F, 1F, 0F);
        RFL1.render(ationTank);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(-0.1875, -0.0625F, 0.0625F);
        GL11.glRotated(-20F, 0F, 1F, 0F);
        RMFL1.render(ationTank);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(0F, -0.0625F, -0.125F);
        GL11.glRotated(20F, 0F, 1F, 0F);
        RMBL1.render(ationTank);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(-0.1875F, -0.0625F, -0.25F);
        GL11.glRotated(60F, 0F, 1F, 0F);
        RBL1.render(ationTank);
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
        float cosZ = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        float cosY = MathHelper.cos(limbSwing * 1.0F) * 0.4F * prevLimbSwing;
        float fixZ = 0.611F;
        float PI = 3.141593F;
        LBL1.rotateAngleZ = cosZ - fixZ;
        LMBL1.rotateAngleZ = -cosZ - fixZ;
        LMFL1.rotateAngleZ = cosZ - fixZ;
        LFL1.rotateAngleZ = cosZ - fixZ;

        RBL1.rotateAngleZ = -cosZ + fixZ;
        RMBL1.rotateAngleZ = cosZ + fixZ;
        RMFL1.rotateAngleZ = -cosZ + fixZ;
        RFL1.rotateAngleZ = cosZ + fixZ;

        LBL1.rotateAngleY = -cosY;
        LMBL1.rotateAngleY = cosY;
        LMFL1.rotateAngleY = -cosY;
        LFL1.rotateAngleY = cosY;

        RBL1.rotateAngleY = -cosY + PI;
        RMBL1.rotateAngleY = cosY + PI;
        RMFL1.rotateAngleY = -cosY + PI;
        RFL1.rotateAngleY = cosY + PI;
    }
}
