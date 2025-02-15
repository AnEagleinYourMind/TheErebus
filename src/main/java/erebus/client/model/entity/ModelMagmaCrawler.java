package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMagmaCrawler extends ModelBase {

    ModelRenderer Thx;
    ModelRenderer ThxTop;
    ModelRenderer ThxS;
    ModelRenderer ThxBottom;
    ModelRenderer Eyeball;
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
    ModelRenderer ThxButt;
    ModelRenderer ThxFront;

    public ModelMagmaCrawler() {
        textureWidth = 64;
        textureHeight = 128;

        Thx = new ModelRenderer(this, 14, 13);
        Thx.addBox(-3.5F, -3.5F, 0F, 7, 7, 9);
        Thx.setRotationPoint(0F, 17F, -4F);
        setRotation(Thx, 0F, 0F, 0F);
        ThxTop = new ModelRenderer(this, 21, 30);
        ThxTop.addBox(-2.5F, -4.5F, 1F, 5, 1, 7);
        ThxTop.setRotationPoint(0F, 17F, -4F);
        setRotation(ThxTop, 0F, 0F, 0F);
        ThxS = new ModelRenderer(this, 15, 39);
        ThxS.addBox(-4.5F, -2.5F, 1F, 9, 5, 7);
        ThxS.setRotationPoint(0F, 17F, -4F);
        setRotation(ThxS, 0F, 0F, 0F);
        ThxBottom = new ModelRenderer(this, 21, 30);
        ThxBottom.addBox(-2.5F, 0F, 1F, 5, 1, 7);
        ThxBottom.setRotationPoint(0F, 20F, -4F);
        setRotation(ThxBottom, 0F, 0F, 0F);
        Eyeball = new ModelRenderer(this, 27, 52);
        Eyeball.addBox(-1.5F, -1.5F, 0F, 3, 3, 1);
        Eyeball.setRotationPoint(0F, 17F, -6F);
        setRotation(Eyeball, 0F, 0F, 0F);
        ThxButt = new ModelRenderer(this, 14, 30);
        ThxButt.addBox(-2.5F, -2.5F, 0F, 5, 5, 1);
        ThxButt.setRotationPoint(0F, 17F, 5F);
        setRotation(ThxButt, 0F, 0F, 0F);
        ThxFront = new ModelRenderer(this, 14, 30);
        ThxFront.addBox(-2.5F, -2.5F, 0F, 5, 5, 1);
        ThxFront.setRotationPoint(0F, 17F, -5F);
        setRotation(ThxFront, 0F, 0F, 0F);

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
        Thx.render(unitPixel);
        ThxTop.render(unitPixel);
        ThxS.render(unitPixel);
        ThxBottom.render(unitPixel);
        Eyeball.render(unitPixel);
        ThxButt.render(unitPixel);
        ThxFront.render(unitPixel);

        GL11.glPushMatrix();
        GL11.glTranslated(0F, 0F, -0.2);
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
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel, Entity entity) {
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
