package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityHoneyPotAnt;

@SideOnly(Side.CLIENT)
public class ModelHoneyPotAnt extends ModelBase {

    ModelRenderer Thx;
    ModelRenderer ThxTop;
    ModelRenderer ThxS;
    ModelRenderer ThxToAb;
    ModelRenderer Ab;
    ModelRenderer AbF;
    ModelRenderer AbSide;
    ModelRenderer AbTop;
    ModelRenderer AbBack;
    ModelRenderer Neck;
    ModelRenderer HeadA;
    ModelRenderer HeadB;
    ModelRenderer RMandibleA;
    ModelRenderer RMandibleB;
    ModelRenderer LMandibleA;
    ModelRenderer LMandibleB;
    ModelRenderer Eyes;
    ModelRenderer AntLS;
    ModelRenderer AntLE;
    ModelRenderer AntRS;
    ModelRenderer AntRE;
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

    public ModelHoneyPotAnt() {
        textureWidth = 64;
        textureHeight = 128;
        Thx = new ModelRenderer(this, 14, 13);
        Thx.addBox(-3.5F, -3.5F, 0F, 7, 7, 9);
        Thx.setRotationPoint(0F, 17F, 0F);
        setRotation(Thx, 0F, 0F, 0F);
        ThxTop = new ModelRenderer(this, 21, 30);
        ThxTop.addBox(-2.5F, -4.5F, 1F, 5, 1, 7);
        ThxTop.setRotationPoint(0F, 17F, 0F);
        setRotation(ThxTop, 0F, 0F, 0F);
        ThxS = new ModelRenderer(this, 15, 39);
        ThxS.addBox(-4.5F, -2.5F, 1F, 9, 5, 7);
        ThxS.setRotationPoint(0F, 17F, 0F);
        setRotation(ThxS, 0F, 0F, 0F);
        ThxToAb = new ModelRenderer(this, 27, 52);
        ThxToAb.addBox(-1.5F, -1.5F, 0F, 3, 3, 1);
        ThxToAb.setRotationPoint(0F, 17F, 9F);
        setRotation(ThxToAb, 0F, 0F, 0F);
        Ab = new ModelRenderer(this, 9, 100);
        Ab.addBox(-5.5F, -4.5F, 0F, 11, 9, 12);
        Ab.setRotationPoint(0F, 17F, 11F);
        setRotation(Ab, 0F, 0F, 0F);
        AbF = new ModelRenderer(this, 23, 57);
        AbF.addBox(-3.5F, -3.5F, -1F, 7, 7, 1);
        AbF.setRotationPoint(0F, 17F, 11F);
        setRotation(AbF, 0F, 0F, 0F);
        AbSide = new ModelRenderer(this, 10, 66);
        AbSide.addBox(-6.5F, -2.5F, 2F, 13, 5, 8);
        AbSide.setRotationPoint(0F, 17F, 11F);
        setRotation(AbSide, 0F, 0F, 0F);
        AbTop = new ModelRenderer(this, 15, 80);
        AbTop.addBox(-4F, -5.5F, 2F, 8, 11, 8);
        AbTop.setRotationPoint(0F, 17F, 11F);
        setRotation(AbTop, 0F, 0F, 0F);
        AbBack = new ModelRenderer(this, 22, 122);
        AbBack.addBox(-3.5F, -2.5F, 12F, 7, 5, 1);
        AbBack.setRotationPoint(0F, 17F, 11F);
        setRotation(AbBack, 0F, 0F, 0F);
        Neck = new ModelRenderer(this, 0, 12);
        Neck.addBox(-1.5F, -1.5F, 0F, 3, 3, 3);
        Neck.setRotationPoint(0F, 17F, -3F);
        setRotation(Neck, 0F, 0F, 0F);
        HeadA = new ModelRenderer(this, 21, 0);
        HeadA.addBox(-2F, -0.5F, -4F, 4, 5, 6);
        HeadA.setRotationPoint(0F, 17F, -1F);
        setRotation(HeadA, -1F, 0F, 0F);
        HeadB = new ModelRenderer(this, 0, 0);
        HeadB.addBox(-3F, -0.5F, -3F, 6, 7, 4);
        setRotation(HeadB, 0F, 0F, 0F);
        RMandibleA = new ModelRenderer(this, 52, 0);
        RMandibleA.addBox(-3F, 5.5F, -2F, 1, 3, 1);
        setRotation(RMandibleA, 0F, 0F, 0F);
        RMandibleB = new ModelRenderer(this, 52, 9);
        RMandibleB.addBox(-2F, 5.5F, -2F, 1, 4, 1);
        setRotation(RMandibleB, 0F, 0F, 0F);
        LMandibleA = new ModelRenderer(this, 47, 0);
        LMandibleA.addBox(2F, 5.5F, -2F, 1, 3, 1);
        setRotation(LMandibleA, 0F, 0F, 0F);
        LMandibleB = new ModelRenderer(this, 47, 9);
        LMandibleB.addBox(1F, 5.5F, -2F, 1, 4, 1);
        setRotation(LMandibleB, 0F, 0F, 0F);
        Eyes = new ModelRenderer(this, 0, 30);
        Eyes.addBox(-4F, 1.5F, -2F, 8, 2, 2);
        setRotation(Eyes, 0F, 0F, 0F);
        AntLS = new ModelRenderer(this, 42, 6);
        AntLS.addBox(3F, 4.5F, -3F, 3, 1, 1);
        setRotation(AntLS, 0F, 0F, 0.1745329F);
        AntLE = new ModelRenderer(this, 42, 0);
        AntLE.addBox(6F, 5.5F, -3F, 1, 4, 1);
        setRotation(AntLE, 0F, 0F, 0.1745329F);
        AntRS = new ModelRenderer(this, 53, 6);
        AntRS.addBox(-6F, 4.5F, -3F, 3, 1, 1);
        setRotation(AntRS, 0F, 0F, -0.1745329F);
        AntRE = new ModelRenderer(this, 57, 0);
        AntRE.addBox(-7F, 5.5F, -3F, 1, 4, 1);
        setRotation(AntRE, 0F, 0F, -0.1745329F);

        HeadA.addChild(HeadB);
        HeadA.addChild(RMandibleA);
        HeadA.addChild(RMandibleB);
        HeadA.addChild(LMandibleA);
        HeadA.addChild(LMandibleB);
        HeadA.addChild(Eyes);
        HeadA.addChild(AntLS);
        HeadA.addChild(AntLE);
        HeadA.addChild(AntRS);
        HeadA.addChild(AntRE);

        LBLA = new ModelRenderer(this, 0, 95);
        LBLA.addBox(0F, -1F, -1F, 4, 2, 2);
        LBLA.setRotationPoint(4F, 17F, 8F);
        setRotation(LBLA, 0.25F, -0.7F, -0.5F);
        LBLB = new ModelRenderer(this, 0, 88);
        LBLB.addBox(3F, 0F, -1F, 2, 4, 2);
        LBLB.setRotationPoint(4F, 17F, 8F);
        setRotation(LBLB, 0.25F, -0.7F, -0.5F);
        LBLC = new ModelRenderer(this, 0, 82);
        LBLC.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
        LBLC.setRotationPoint(4F, 17F, 8F);
        setRotation(LBLC, 0.5F, -0.6F, -0.95F);
        LBLD = new ModelRenderer(this, 0, 76);
        LBLD.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        LBLD.setRotationPoint(4F, 17F, 8F);
        setRotation(LBLD, 0.64F, -0.7F, -1.27F);
        LMLA = new ModelRenderer(this, 0, 95);
        LMLA.addBox(0F, -1F, -1F, 4, 2, 2);
        LMLA.setRotationPoint(4F, 17F, 5F);
        setRotation(LMLA, 0F, 0F, -0.3490659F);
        LMLB = new ModelRenderer(this, 0, 88);
        LMLB.addBox(3F, 0F, -1F, 2, 4, 2);
        LMLB.setRotationPoint(4F, 17F, 5F);
        setRotation(LMLB, 0F, 0F, -0.3490659F);
        LMLC = new ModelRenderer(this, 0, 82);
        LMLC.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
        LMLC.setRotationPoint(4F, 17F, 5F);
        setRotation(LMLC, 0F, 0F, -0.6981317F);
        LMLD = new ModelRenderer(this, 0, 76);
        LMLD.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        LMLD.setRotationPoint(4F, 17F, 5F);
        setRotation(LMLD, 0F, 0F, -0.8726646F);
        LFLA = new ModelRenderer(this, 0, 95);
        LFLA.addBox(0F, -1F, -1F, 4, 2, 2);
        LFLA.setRotationPoint(4F, 17F, 2F);
        setRotation(LFLA, -0.25F, 0.7F, -0.5F);
        LFLB = new ModelRenderer(this, 0, 88);
        LFLB.addBox(3F, 0F, -1F, 2, 4, 2);
        LFLB.setRotationPoint(4F, 17F, 2F);
        setRotation(LFLB, -0.25F, 0.7F, -0.5F);
        LFLC = new ModelRenderer(this, 0, 82);
        LFLC.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
        LFLC.setRotationPoint(4F, 17F, 2F);
        setRotation(LFLC, -0.5F, 0.6F, -0.95F);
        LFLD = new ModelRenderer(this, 0, 76);
        LFLD.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        LFLD.setRotationPoint(4F, 17F, 2F);
        setRotation(LFLD, -0.64F, 0.7F, -1.27F);
        RFLA = new ModelRenderer(this, 0, 95);
        RFLA.addBox(-4F, -1F, -1F, 4, 2, 2);
        RFLA.setRotationPoint(-4F, 17F, 2F);
        setRotation(RFLA, -0.25F, -0.7F, 0.5F);
        RFLB = new ModelRenderer(this, 0, 88);
        RFLB.addBox(-5F, 0F, -1F, 2, 4, 2);
        RFLB.setRotationPoint(-4F, 17F, 2F);
        setRotation(RFLB, -0.25F, -0.7F, 0.5F);
        RFLC = new ModelRenderer(this, 0, 82);
        RFLC.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        RFLC.setRotationPoint(-4F, 17F, 2F);
        setRotation(RFLC, -0.5F, -0.6F, 0.95F);
        RFLD = new ModelRenderer(this, 0, 76);
        RFLD.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        RFLD.setRotationPoint(-4F, 17F, 2F);
        setRotation(RFLD, -0.64F, -0.7F, 1.27F);
        RMLA = new ModelRenderer(this, 0, 95);
        RMLA.addBox(-4F, -1F, -1F, 4, 2, 2);
        RMLA.setRotationPoint(-4F, 17F, 5F);
        setRotation(RMLA, 0F, 0F, 0.3490659F);
        RMLB = new ModelRenderer(this, 0, 88);
        RMLB.addBox(-5F, 0F, -1F, 2, 4, 2);
        RMLB.setRotationPoint(-4F, 17F, 5F);
        setRotation(RMLB, 0F, 0F, 0.3490659F);
        RMLC = new ModelRenderer(this, 0, 82);
        RMLC.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        RMLC.setRotationPoint(-4F, 17F, 5F);
        setRotation(RMLC, 0F, 0F, 0.6981317F);
        RMLD = new ModelRenderer(this, 0, 76);
        RMLD.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        RMLD.setRotationPoint(-4F, 17F, 5F);
        setRotation(RMLD, 0F, 0F, 0.8726646F);
        RBLA = new ModelRenderer(this, 0, 95);
        RBLA.addBox(-4F, -1F, -1F, 4, 2, 2);
        RBLA.setRotationPoint(-4F, 17F, 8F);
        setRotation(RBLA, 0.25F, 0.7F, 0.5F);
        RBLB = new ModelRenderer(this, 0, 88);
        RBLB.addBox(-5F, 0F, -1F, 2, 4, 2);
        RBLB.setRotationPoint(-4F, 17F, 8F);
        setRotation(RBLB, 0.25F, 0.7F, 0.5F);
        RBLC = new ModelRenderer(this, 0, 82);
        RBLC.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        RBLC.setRotationPoint(-4F, 17F, 8F);
        setRotation(RBLC, 0.5F, 0.6F, 0.95F);
        RBLD = new ModelRenderer(this, 0, 76);
        RBLD.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        RBLD.setRotationPoint(-4F, 17F, 8F);
        setRotation(RBLD, 0.64F, 0.7F, 1.27F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        GL11.glPushMatrix();
        GL11.glTranslated(0F, 0F, -0.625F);
        Thx.render(unitPixel);
        ThxTop.render(unitPixel);
        ThxS.render(unitPixel);
        ThxToAb.render(unitPixel);
        Neck.render(unitPixel);
        HeadA.render(unitPixel);
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
        GL11.glPopMatrix();

        EntityHoneyPotAnt ant = (EntityHoneyPotAnt) entity;
        GL11.glPushMatrix();
        GL11.glTranslated(0F, 0F, -0.625F);
        GL11.glScalef(1F + ant.getHoneyBelly(), 1F + ant.getHoneyBelly(), 1F + ant.getHoneyBelly());
        GL11.glTranslatef(0F, -ant.getHoneyBelly() * 0.5F, -ant.getHoneyBelly() * 0.36F);
        Ab.render(unitPixel);
        AbF.render(unitPixel);
        AbSide.render(unitPixel);
        AbTop.render(unitPixel);
        AbBack.render(unitPixel);
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
        HeadA.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        HeadA.rotateAngleX = rotationPitch / (180F / (float) Math.PI) - 1F;
        float stuff = MathHelper.cos(limbSwing * 1.5F + (float) Math.PI);
        float morestuff = MathHelper.cos(limbSwing * 1.5F);
        LBLA.rotateAngleX = stuff * 0.7F * prevLimbSwing + 0.25F;
        LBLB.rotateAngleX = stuff * 0.7F * prevLimbSwing + 0.25F;
        LBLC.rotateAngleX = stuff * 0.7F * prevLimbSwing + 0.5F;
        LBLD.rotateAngleX = stuff * 0.7F * prevLimbSwing + 0.64F;
        LMLA.rotateAngleX = morestuff * 0.7F * prevLimbSwing;
        LMLB.rotateAngleX = morestuff * 0.7F * prevLimbSwing;
        LMLC.rotateAngleX = morestuff * 0.7F * prevLimbSwing;
        LMLD.rotateAngleX = morestuff * 0.7F * prevLimbSwing;
        LFLA.rotateAngleX = stuff * 0.7F * prevLimbSwing - 0.25F;
        LFLB.rotateAngleX = stuff * 0.7F * prevLimbSwing - 0.25F;
        LFLC.rotateAngleX = stuff * 0.7F * prevLimbSwing - 0.5F;
        LFLD.rotateAngleX = stuff * 0.7F * prevLimbSwing - 0.64F;
        RBLA.rotateAngleX = morestuff * 0.7F * prevLimbSwing + 0.25F;
        RBLB.rotateAngleX = morestuff * 0.7F * prevLimbSwing + 0.25F;
        RBLC.rotateAngleX = morestuff * 0.7F * prevLimbSwing + 0.5F;
        RBLD.rotateAngleX = morestuff * 0.7F * prevLimbSwing + 0.64F;
        RMLA.rotateAngleX = stuff * 0.7F * prevLimbSwing;
        RMLB.rotateAngleX = stuff * 0.7F * prevLimbSwing;
        RMLC.rotateAngleX = stuff * 0.7F * prevLimbSwing;
        RMLD.rotateAngleX = stuff * 0.7F * prevLimbSwing;
        RFLA.rotateAngleX = morestuff * 0.7F * prevLimbSwing - 0.25F;
        RFLB.rotateAngleX = morestuff * 0.7F * prevLimbSwing - 0.25F;
        RFLC.rotateAngleX = morestuff * 0.7F * prevLimbSwing - 0.5F;
        RFLD.rotateAngleX = morestuff * 0.7F * prevLimbSwing - 0.64F;
    }
}
