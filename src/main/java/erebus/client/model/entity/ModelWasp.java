package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityWasp;

@SideOnly(Side.CLIENT)
public class ModelWasp extends ModelBase {

    ModelRenderer Thx;
    ModelRenderer ThxS;
    ModelRenderer ThxTop;
    ModelRenderer Ab;
    ModelRenderer AbF;
    ModelRenderer AbSide;
    ModelRenderer AbTop;
    ModelRenderer AbBack;
    ModelRenderer Neck;
    ModelRenderer HeadA;
    ModelRenderer HeadB;
    ModelRenderer HeadC;
    ModelRenderer RMandibleA;
    ModelRenderer RMandibleB;
    ModelRenderer LMandibleA;
    ModelRenderer LMandibleB;
    ModelRenderer Eyes;
    ModelRenderer AntLE;
    ModelRenderer AntRE;
    ModelRenderer AntRS;
    ModelRenderer AntLS;
    ModelRenderer LBLA;
    ModelRenderer LBLB;
    ModelRenderer LBLC;
    ModelRenderer LBLD;
    ModelRenderer LMLA;
    ModelRenderer LMLB;
    ModelRenderer LMLC;
    ModelRenderer LMLD;
    ModelRenderer LFLA;
    ModelRenderer LFLB;
    ModelRenderer LFLC;
    ModelRenderer LFLD;
    ModelRenderer RFLA;
    ModelRenderer RFLB;
    ModelRenderer RFLC;
    ModelRenderer RFLD;
    ModelRenderer RMLA;
    ModelRenderer RMLB;
    ModelRenderer RMLC;
    ModelRenderer RMLD;
    ModelRenderer RBLA;
    ModelRenderer RBLB;
    ModelRenderer RBLC;
    ModelRenderer RBLD;
    ModelRenderer Sting;
    ModelRenderer ThxRW;
    ModelRenderer ThxLW;
    ModelRenderer RWingBack;
    ModelRenderer RWingMid;
    ModelRenderer RWingFront;
    ModelRenderer LWingBack;
    ModelRenderer LWingMid;
    ModelRenderer LWingFront;

    public ModelWasp() {
        textureWidth = 64;
        textureHeight = 128;

        Thx = new ModelRenderer(this, 14, 13);
        Thx.addBox(-3F, -3F, 0F, 6, 6, 9);
        Thx.setRotationPoint(0F, 17F, 0F);
        setRotation(Thx, 0F, 0F, 0F);
        ThxS = new ModelRenderer(this, 5, 39);
        ThxS.addBox(-4F, -2.5F, 1F, 8, 5, 7);
        ThxS.setRotationPoint(0F, 17F, 0F);
        setRotation(ThxS, 0F, 0F, 0F);
        ThxTop = new ModelRenderer(this, 21, 30);
        ThxTop.addBox(-2F, -4F, 1F, 4, 1, 7);
        ThxTop.setRotationPoint(0F, 17F, 0F);
        setRotation(ThxTop, 0F, 0F, 0F);
        Ab = new ModelRenderer(this, 9, 100);
        Ab.addBox(-3.5F, -4.5F, -1F, 7, 7, 12);
        Ab.setRotationPoint(0F, 18F, 11F);
        setRotation(Ab, -0.0872665F, 0F, 0F);
        AbF = new ModelRenderer(this, 23, 57);
        AbF.addBox(-2F, -3F, -2F, 4, 4, 2);
        AbF.setRotationPoint(0F, 18F, 11F);
        setRotation(AbF, 0F, 0F, 0F);
        AbSide = new ModelRenderer(this, 10, 66);
        AbSide.addBox(-5F, -2F, 1F, 10, 4, 8);
        AbSide.setRotationPoint(0F, 17F, 11F);
        setRotation(AbSide, -0.0872665F, 0F, 0F);
        AbTop = new ModelRenderer(this, 15, 80);
        AbTop.addBox(-2F, -4.5F, 1F, 4, 1, 8);
        AbTop.setRotationPoint(0F, 17F, 11F);
        setRotation(AbTop, -0.0872665F, 0F, 0F);
        AbBack = new ModelRenderer(this, 22, 121);
        AbBack.addBox(-2F, -2F, 11F, 4, 4, 2);
        AbBack.setRotationPoint(0F, 17F, 11F);
        setRotation(AbBack, -0.0872665F, 0F, 0F);
        Neck = new ModelRenderer(this, 0, 12);
        Neck.addBox(-1.5F, -1.5F, 0F, 3, 3, 3);
        Neck.setRotationPoint(0F, 17F, -3F);
        setRotation(Neck, 0F, 0F, 0F);
        HeadA = new ModelRenderer(this, 21, 0);
        HeadA.addBox(-1F, -0.5F, -5F, 2, 4, 6);
        HeadA.setRotationPoint(0F, 17F, -1F);
        setRotation(HeadA, -0.5235988F, 0F, 0F);
        HeadB = new ModelRenderer(this, 0, 0);
        HeadB.addBox(-2.5F, -1.5F, -4F, 5, 6, 4);
        HeadB.setRotationPoint(0F, 17F, -1F);
        setRotation(HeadB, -0.5235988F, 0F, 0F);
        HeadC = new ModelRenderer(this, 44, 50);
        HeadC.addBox(-2F, -2.5F, -3.5F, 4, 8, 3);
        HeadC.setRotationPoint(0F, 17F, -1F);
        setRotation(HeadC, -0.5235988F, 0F, 0F);
        RMandibleA = new ModelRenderer(this, 52, 0);
        RMandibleA.addBox(-2F, 5.5F, -2.5F, 1, 2, 1);
        RMandibleA.setRotationPoint(0F, 17F, -1F);
        setRotation(RMandibleA, -0.5235988F, 0F, 0F);
        RMandibleB = new ModelRenderer(this, 52, 9);
        RMandibleB.addBox(-1.5F, 6.5F, -2.5F, 1, 1, 1);
        RMandibleB.setRotationPoint(0F, 17F, -1F);
        setRotation(RMandibleB, -0.5235988F, 0F, 0F);
        LMandibleA = new ModelRenderer(this, 47, 0);
        LMandibleA.addBox(1F, 5.5F, -2.5F, 1, 2, 1);
        LMandibleA.setRotationPoint(0F, 17F, -1F);
        setRotation(LMandibleA, -0.5235988F, 0F, 0F);
        LMandibleB = new ModelRenderer(this, 47, 9);
        LMandibleB.addBox(0.5F, 6.5F, -2.5F, 1, 1, 1);
        LMandibleB.setRotationPoint(0F, 17F, -1F);
        setRotation(LMandibleB, -0.5235988F, 0F, 0F);
        Eyes = new ModelRenderer(this, 0, 30);
        Eyes.addBox(-3.5F, -0.5F, -3.5F, 7, 4, 3);
        Eyes.setRotationPoint(0F, 17F, -1F);
        setRotation(Eyes, -0.5235988F, 0F, 0F);
        AntLE = new ModelRenderer(this, 47, 15);
        AntLE.addBox(2F, -0.5F, -7F, 6, 1, 1);
        AntLE.setRotationPoint(0F, 17F, -1F);
        setRotation(AntLE, -1F, 0.5F, 0F);
        AntRE = new ModelRenderer(this, 47, 15);
        AntRE.addBox(-8F, -0.5F, -7F, 6, 1, 1);
        AntRE.setRotationPoint(0F, 17F, -1F);
        setRotation(AntRE, -1F, -0.5F, -0F);
        AntRS = new ModelRenderer(this, 53, 4);
        AntRS.addBox(-2F, -0.5F, -6F, 1, 1, 3);
        AntRS.setRotationPoint(0F, 17F, -1F);
        setRotation(AntRS, -1F, -0.5F, -0F);
        AntLS = new ModelRenderer(this, 53, 4);
        AntLS.addBox(1F, -0.5F, -6F, 1, 1, 3);
        AntLS.setRotationPoint(0F, 17F, -1F);
        setRotation(AntLS, -1F, 0.5F, 0F);
        LBLA = new ModelRenderer(this, 44, 95);
        LBLA.addBox(-1F, -1F, -1F, 7, 2, 2);
        LBLA.setRotationPoint(4F, 18F, 8F);
        setRotation(LBLA, 0.25F, -0.7F, -0.5F);
        LBLB = new ModelRenderer(this, 0, 88);
        LBLB.addBox(5F, 0F, -1F, 2, 4, 2);
        LBLB.setRotationPoint(4F, 18F, 8F);
        setRotation(LBLB, 0.25F, -0.7F, -0.5F);
        LBLC = new ModelRenderer(this, 0, 82);
        LBLC.addBox(3.5F, 5.5F, -0.5F, 2, 4, 1);
        LBLC.setRotationPoint(4F, 18F, 8F);
        setRotation(LBLC, 0.5F, -0.6F, -0.95F);
        LBLD = new ModelRenderer(this, 0, 76);
        LBLD.addBox(2.5F, 9F, -0.5F, 1, 4, 1);
        LBLD.setRotationPoint(4F, 18F, 8F);
        setRotation(LBLD, 0.64F, -0.7F, -1.27F);
        LMLA = new ModelRenderer(this, 0, 95);
        LMLA.addBox(0F, -1F, -1F, 4, 2, 2);
        LMLA.setRotationPoint(4F, 18F, 5F);
        setRotation(LMLA, 0F, 0F, -0.3490659F);
        LMLB = new ModelRenderer(this, 0, 88);
        LMLB.addBox(3F, 0F, -1F, 2, 4, 2);
        LMLB.setRotationPoint(4F, 18F, 5F);
        setRotation(LMLB, 0F, 0F, -0.3490659F);
        LMLC = new ModelRenderer(this, 0, 82);
        LMLC.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
        LMLC.setRotationPoint(4F, 18F, 5F);
        setRotation(LMLC, 0F, 0F, -0.6981317F);
        LMLD = new ModelRenderer(this, 0, 76);
        LMLD.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        LMLD.setRotationPoint(4F, 18F, 5F);
        setRotation(LMLD, 0F, 0F, -0.8726646F);
        LFLA = new ModelRenderer(this, 0, 95);
        LFLA.addBox(0F, -1F, -1F, 4, 2, 2);
        LFLA.setRotationPoint(4F, 18F, 2F);
        setRotation(LFLA, -0.25F, 0.7F, -0.5F);
        LFLB = new ModelRenderer(this, 0, 88);
        LFLB.addBox(3F, 0F, -1F, 2, 4, 2);
        LFLB.setRotationPoint(4F, 18F, 2F);
        setRotation(LFLB, -0.25F, 0.7F, -0.5F);
        LFLC = new ModelRenderer(this, 0, 82);
        LFLC.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
        LFLC.setRotationPoint(4F, 18F, 2F);
        setRotation(LFLC, -0.5F, 0.6F, -0.95F);
        LFLD = new ModelRenderer(this, 0, 76);
        LFLD.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        LFLD.setRotationPoint(4F, 18F, 2F);
        setRotation(LFLD, -0.64F, 0.7F, -1.27F);
        RFLA = new ModelRenderer(this, 0, 95);
        RFLA.addBox(-4F, -1F, -1F, 4, 2, 2);
        RFLA.setRotationPoint(-4F, 18F, 2F);
        setRotation(RFLA, -0.25F, -0.7F, 0.5F);
        RFLB = new ModelRenderer(this, 0, 88);
        RFLB.addBox(-5F, 0F, -1F, 2, 4, 2);
        RFLB.setRotationPoint(-4F, 18F, 2F);
        setRotation(RFLB, -0.25F, -0.7F, 0.5F);
        RFLC = new ModelRenderer(this, 0, 82);
        RFLC.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        RFLC.setRotationPoint(-4F, 18F, 2F);
        setRotation(RFLC, -0.5F, -0.6F, 0.95F);
        RFLD = new ModelRenderer(this, 0, 76);
        RFLD.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        RFLD.setRotationPoint(-4F, 18F, 2F);
        setRotation(RFLD, -0.64F, -0.7F, 1.27F);
        RMLA = new ModelRenderer(this, 0, 95);
        RMLA.addBox(-4F, -1F, -1F, 4, 2, 2);
        RMLA.setRotationPoint(-4F, 18F, 5F);
        setRotation(RMLA, 0F, 0F, 0.3490659F);
        RMLB = new ModelRenderer(this, 0, 88);
        RMLB.addBox(-5F, 0F, -1F, 2, 4, 2);
        RMLB.setRotationPoint(-4F, 18F, 5F);
        setRotation(RMLB, 0F, 0F, 0.3490659F);
        RMLC = new ModelRenderer(this, 0, 82);
        RMLC.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        RMLC.setRotationPoint(-4F, 18F, 5F);
        setRotation(RMLC, 0F, 0F, 0.6981317F);
        RMLD = new ModelRenderer(this, 0, 76);
        RMLD.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        RMLD.setRotationPoint(-4F, 18F, 5F);
        setRotation(RMLD, 0F, 0F, 0.8726646F);
        RBLA = new ModelRenderer(this, 44, 95);
        RBLA.addBox(-6F, -1F, -1F, 7, 2, 2);
        RBLA.setRotationPoint(-4F, 18F, 8F);
        setRotation(RBLA, 0.25F, 0.7F, 0.5F);
        RBLB = new ModelRenderer(this, 0, 88);
        RBLB.addBox(-7F, 0F, -1F, 2, 4, 2);
        RBLB.setRotationPoint(-4F, 18F, 8F);
        setRotation(RBLB, 0.25F, 0.7F, 0.5F);
        RBLC = new ModelRenderer(this, 0, 82);
        RBLC.addBox(-5.5F, 5.5F, -0.5F, 2, 4, 1);
        RBLC.setRotationPoint(-4F, 18F, 8F);
        setRotation(RBLC, 0.5F, 0.6F, 0.95F);
        RBLD = new ModelRenderer(this, 0, 76);
        RBLD.addBox(-3.5F, 9F, -0.5F, 1, 4, 1);
        RBLD.setRotationPoint(-4F, 18F, 8F);
        setRotation(RBLD, 0.64F, 0.7F, 1.27F);
        Sting = new ModelRenderer(this, 0, 122);
        Sting.addBox(-0.5F, -0.5F, 13F, 1, 1, 3);
        Sting.setRotationPoint(0F, 17F, 11F);
        setRotation(Sting, -0.0872665F, 0F, 0F);
        ThxRW = new ModelRenderer(this, 0, 52);
        ThxRW.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
        ThxRW.setRotationPoint(-3F, 13F, 4F);
        setRotation(ThxRW, 0F, 0F, 0F);
        ThxLW = new ModelRenderer(this, 0, 52);
        ThxLW.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
        ThxLW.setRotationPoint(3F, 13F, 4F);
        setRotation(ThxLW, 0F, 0F, 0F);
        RWingBack = new ModelRenderer(this, 36, 28);
        RWingBack.addBox(1.5F, -0.5F, 6F, 1, 1, 13);
        RWingBack.setRotationPoint(-3F, 13F, 4F);
        setRotation(RWingBack, 0F, -0.1745329F, 0F);
        RWingMid = new ModelRenderer(this, 16, 44);
        RWingMid.addBox(-1.5F, -0.5F, 0F, 3, 1, 20);
        RWingMid.setRotationPoint(-3F, 13F, 4F);
        setRotation(RWingMid, 0F, -0.1745329F, 0F);
        RWingFront = new ModelRenderer(this, 36, 28);
        RWingFront.addBox(-2.5F, -0.5F, 6F, 1, 1, 13);
        RWingFront.setRotationPoint(-3F, 13F, 4F);
        setRotation(RWingFront, 0F, -0.1745329F, 0F);
        LWingBack = new ModelRenderer(this, 36, 28);
        LWingBack.addBox(-2.5F, -0.5F, 6F, 1, 1, 13);
        LWingBack.setRotationPoint(3F, 13F, 4F);
        setRotation(LWingBack, 0F, 0.1745329F, 0F);
        LWingMid = new ModelRenderer(this, 16, 44);
        LWingMid.addBox(-1.5F, -0.5F, 0F, 3, 1, 20);
        LWingMid.setRotationPoint(3F, 13F, 4F);
        setRotation(LWingMid, 0F, 0.1745329F, 0F);
        LWingFront = new ModelRenderer(this, 36, 28);
        LWingFront.addBox(1.5F, -0.5F, 6F, 1, 1, 13);
        LWingFront.setRotationPoint(3F, 13F, 4F);
        setRotation(LWingFront, 0F, 0.1745329F, 0F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        GL11.glPushMatrix();
        GL11.glTranslated(0F, 0F, -0.5F);
        Thx.render(unitPixel);
        ThxS.render(unitPixel);
        ThxTop.render(unitPixel);
        Ab.render(unitPixel);
        AbF.render(unitPixel);
        AbSide.render(unitPixel);
        AbTop.render(unitPixel);
        AbBack.render(unitPixel);
        Neck.render(unitPixel);
        HeadA.render(unitPixel);
        HeadB.render(unitPixel);
        HeadC.render(unitPixel);
        RMandibleA.render(unitPixel);
        RMandibleB.render(unitPixel);
        LMandibleA.render(unitPixel);
        LMandibleB.render(unitPixel);
        Eyes.render(unitPixel);
        AntLE.render(unitPixel);
        AntRE.render(unitPixel);
        AntRS.render(unitPixel);
        AntLS.render(unitPixel);
        LBLA.render(unitPixel);
        LBLB.render(unitPixel);
        LBLC.render(unitPixel);
        LBLD.render(unitPixel);
        LMLA.render(unitPixel);
        LMLB.render(unitPixel);
        LMLC.render(unitPixel);
        LMLD.render(unitPixel);
        LFLA.render(unitPixel);
        LFLB.render(unitPixel);
        LFLC.render(unitPixel);
        LFLD.render(unitPixel);
        RFLA.render(unitPixel);
        RFLB.render(unitPixel);
        RFLC.render(unitPixel);
        RFLD.render(unitPixel);
        RMLA.render(unitPixel);
        RMLB.render(unitPixel);
        RMLC.render(unitPixel);
        RMLD.render(unitPixel);
        RBLA.render(unitPixel);
        RBLB.render(unitPixel);
        RBLC.render(unitPixel);
        RBLD.render(unitPixel);
        Sting.render(unitPixel);
        ThxRW.render(unitPixel);
        ThxLW.render(unitPixel);
        GL11.glPushMatrix();
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        RWingBack.render(unitPixel);
        RWingMid.render(unitPixel);
        RWingFront.render(unitPixel);
        LWingBack.render(unitPixel);
        LWingMid.render(unitPixel);
        LWingFront.render(unitPixel);
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
        float heady = rotationYaw / (180F / (float) Math.PI);
        float headx = rotationPitch / (180F / (float) Math.PI) - 1.0F;
        HeadA.rotateAngleY = heady;
        HeadB.rotateAngleY = heady;
        HeadC.rotateAngleY = heady;
        AntLS.rotateAngleY = heady;
        AntLE.rotateAngleY = heady;
        AntRS.rotateAngleY = heady;
        AntRE.rotateAngleY = heady;
        Eyes.rotateAngleY = heady;
        RMandibleA.rotateAngleY = heady;
        RMandibleB.rotateAngleY = heady;
        LMandibleA.rotateAngleY = heady;
        LMandibleB.rotateAngleY = heady;
        HeadA.rotateAngleX = headx;
        HeadB.rotateAngleX = headx;
        HeadC.rotateAngleX = headx;
        AntLS.rotateAngleX = headx;
        AntLE.rotateAngleX = headx;
        AntRS.rotateAngleX = headx;
        AntRE.rotateAngleX = headx;
        Eyes.rotateAngleX = headx;
        RMandibleA.rotateAngleX = headx;
        RMandibleB.rotateAngleX = headx;
        LMandibleA.rotateAngleX = headx;
        LMandibleB.rotateAngleX = headx;
        EntityWasp wasp = (EntityWasp) entity;
        if (wasp.onGround) {
            float legx1 = MathHelper.cos(limbSwing * 2.0F + (float) Math.PI) * 0.7F * prevLimbSwing;
            float legx2 = MathHelper.cos(limbSwing * 2.0F) * 0.7F * prevLimbSwing;
            LBLA.rotateAngleX = legx1 + 0.25F;
            LBLB.rotateAngleX = legx1 + 0.25F;
            LBLC.rotateAngleX = legx1 + 0.5F;
            LBLD.rotateAngleX = legx1 + 0.61F;
            LMLA.rotateAngleX = legx2;
            LMLB.rotateAngleX = legx2;
            LMLC.rotateAngleX = legx2;
            LMLD.rotateAngleX = legx2;
            LFLA.rotateAngleX = legx1 - 0.25F;
            LFLB.rotateAngleX = legx1 - 0.25F;
            LFLC.rotateAngleX = legx1 - 0.5F;
            LFLD.rotateAngleX = legx1 - 0.64F;
            RBLA.rotateAngleX = legx2 + 0.25F;
            RBLB.rotateAngleX = legx2 + 0.25F;
            RBLC.rotateAngleX = legx2 + 0.5F;
            RBLD.rotateAngleX = legx2 + 0.61F;
            RMLA.rotateAngleX = legx1;
            RMLB.rotateAngleX = legx1;
            RMLC.rotateAngleX = legx1;
            RMLD.rotateAngleX = legx1;
            RFLA.rotateAngleX = legx2 - 0.25F;
            RFLB.rotateAngleX = legx2 - 0.25F;
            RFLC.rotateAngleX = legx2 - 0.5F;
            RFLD.rotateAngleX = legx2 - 0.64F;
            RWingBack.rotateAngleY = -0.25F;
            RWingMid.rotateAngleY = -0.25F;
            RWingFront.rotateAngleY = -0.25F;
            LWingBack.rotateAngleY = 0.25F;
            LWingMid.rotateAngleY = 0.25F;
            LWingFront.rotateAngleY = 0.25F;
            RWingBack.rotateAngleX = 0F;
            RWingMid.rotateAngleX = 0F;
            RWingFront.rotateAngleX = 0F;
            LWingBack.rotateAngleX = 0F;
            LWingMid.rotateAngleX = 0F;
            LWingFront.rotateAngleX = 0F;
            Ab.rotateAngleX = -0.2F;
            AbF.rotateAngleX = -0.2F;
            AbSide.rotateAngleX = -0.2F;
            AbTop.rotateAngleX = -0.2F;
            AbBack.rotateAngleX = -0.2F;
            Sting.rotateAngleX = -0.2F;
        }
        if (wasp.isFlying()) {
            LBLA.rotateAngleX = +0.25F;
            LBLB.rotateAngleX = +0.25F;
            LBLC.rotateAngleX = +0.5F;
            LBLD.rotateAngleX = +0.61F;
            LMLA.rotateAngleX = 0F;
            LMLB.rotateAngleX = 0F;
            LMLC.rotateAngleX = 0F;
            LMLD.rotateAngleX = 0F;
            LFLA.rotateAngleX = -0.25F;
            LFLB.rotateAngleX = -0.25F;
            LFLC.rotateAngleX = -0.5F;
            LFLD.rotateAngleX = -0.64F;
            RBLA.rotateAngleX = +0.25F;
            RBLB.rotateAngleX = +0.25F;
            RBLC.rotateAngleX = +0.5F;
            RBLD.rotateAngleX = +0.61F;
            RMLA.rotateAngleX = 0F;
            RMLB.rotateAngleX = 0F;
            RMLC.rotateAngleX = 0F;
            RMLD.rotateAngleX = 0F;
            RFLA.rotateAngleX = -0.25F;
            RFLB.rotateAngleX = -0.25F;
            RFLC.rotateAngleX = -0.5F;
            RFLD.rotateAngleX = -0.64F;
            RWingBack.rotateAngleY = -1.5F;
            RWingMid.rotateAngleY = -1.5F;
            RWingFront.rotateAngleY = -1.5F;
            LWingBack.rotateAngleY = 1.5F;
            LWingMid.rotateAngleY = 1.5F;
            LWingFront.rotateAngleY = 1.5F;
            RWingBack.rotateAngleX = wasp.wingFloat;
            RWingMid.rotateAngleX = wasp.wingFloat;
            RWingFront.rotateAngleX = wasp.wingFloat;
            LWingBack.rotateAngleX = wasp.wingFloat;
            LWingMid.rotateAngleX = wasp.wingFloat;
            LWingFront.rotateAngleX = wasp.wingFloat;
            Ab.rotateAngleX = -0.8F;
            AbF.rotateAngleX = -0.8F;
            AbSide.rotateAngleX = -0.8F;
            AbTop.rotateAngleX = -0.8F;
            AbBack.rotateAngleX = -0.8F;
            Sting.rotateAngleX = -0.8F;
        }
    }
}
