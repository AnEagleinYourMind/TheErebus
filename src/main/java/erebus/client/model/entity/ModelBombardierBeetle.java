package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelBombardierBeetle extends ModelBase {

    ModelRenderer Thx;
    ModelRenderer ThxS;
    ModelRenderer Ab;
    ModelRenderer AbSide;
    ModelRenderer AbBack;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer LMandible;
    ModelRenderer RMandible;
    ModelRenderer Eyes;
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
    ModelRenderer AntRE;
    ModelRenderer AntLE;

    public ModelBombardierBeetle() {
        textureWidth = 64;
        textureHeight = 128;
        Thx = new ModelRenderer(this, 14, 13);
        Thx.addBox(-3.5F, -3F, -1F, 7, 6, 7);
        Thx.setRotationPoint(0F, 17F, 0F);
        setRotation(Thx, 0F, 0F, 0F);
        ThxS = new ModelRenderer(this, 15, 27);
        ThxS.addBox(-5F, -2F, 0F, 10, 4, 4);
        ThxS.setRotationPoint(0F, 17F, 0F);
        setRotation(ThxS, 0F, 0F, 0F);
        Ab = new ModelRenderer(this, 0, 90);
        Ab.addBox(-4.5F, -4.5F, -2F, 9, 7, 21);
        Ab.setRotationPoint(0F, 18F, 7F);
        setRotation(Ab, -0.0872665F, 0F, 0F);
        AbSide = new ModelRenderer(this, 0, 40);
        AbSide.addBox(-6F, -2F, 1F, 12, 4, 19);
        AbSide.setRotationPoint(0F, 17F, 5F);
        setRotation(AbSide, -0.0872665F, 0F, 0F);
        AbBack = new ModelRenderer(this, 22, 120);
        AbBack.addBox(-3F, -2F, 21F, 6, 4, 2);
        AbBack.setRotationPoint(0F, 17F, 5F);
        setRotation(AbBack, -0.0872665F, 0F, 0F);
        Head1 = new ModelRenderer(this, 16, 0);
        Head1.addBox(-2.5F, -1.5F, -6F, 5, 4, 6);
        Head1.setRotationPoint(0F, 17F, -1F);
        setRotation(Head1, 0.1745329F, 0F, 0F);
        Head2 = new ModelRenderer(this, 39, 0);
        Head2.addBox(-2F, -1F, -7.5F, 4, 3, 2);
        Head2.setRotationPoint(0F, 17F, -1F);
        setRotation(Head2, 0.1745329F, 0F, 0F);
        LMandible = new ModelRenderer(this, 52, 0);
        LMandible.addBox(0.5F, 1F, -10.5F, 1, 1, 3);
        LMandible.setRotationPoint(0F, 17F, -1F);
        setRotation(LMandible, 0.1745329F, 0F, 0F);
        RMandible = new ModelRenderer(this, 52, 0);
        RMandible.addBox(-1.5F, 1F, -10.5F, 1, 1, 3);
        RMandible.setRotationPoint(0F, 17F, -1F);
        setRotation(RMandible, 0.1745329F, 0F, 0F);
        Eyes = new ModelRenderer(this, 0, 0);
        Eyes.addBox(-3.5F, -1F, -4F, 7, 2, 2);
        Eyes.setRotationPoint(0F, 17F, -1F);
        setRotation(Eyes, 0.1745329F, 0F, 0F);
        LBLA = new ModelRenderer(this, 42, 95);
        LBLA.addBox(-1F, -1F, -1F, 7, 2, 2);
        LBLA.setRotationPoint(6F, 18F, 14F);
        setRotation(LBLA, 0.25F, -0.7F, -0.5F);
        LBLB = new ModelRenderer(this, 0, 88);
        LBLB.addBox(5F, 0F, -1F, 2, 4, 2);
        LBLB.setRotationPoint(6F, 18F, 14F);
        setRotation(LBLB, 0.25F, -0.7F, -0.5F);
        LBLC = new ModelRenderer(this, 0, 82);
        LBLC.addBox(3.5F, 5.5F, -0.5F, 2, 4, 1);
        LBLC.setRotationPoint(6F, 18F, 14F);
        setRotation(LBLC, 0.5F, -0.6F, -0.95F);
        LBLD = new ModelRenderer(this, 0, 76);
        LBLD.addBox(2.5F, 9F, -0.5F, 1, 4, 1);
        LBLD.setRotationPoint(6F, 18F, 14F);
        setRotation(LBLD, 0.64F, -0.7F, -1.27F);
        LMLA = new ModelRenderer(this, 0, 95);
        LMLA.addBox(0F, -1F, -1F, 4, 2, 2);
        LMLA.setRotationPoint(5F, 18F, 8F);
        setRotation(LMLA, 0F, 0F, -0.3490659F);
        LMLB = new ModelRenderer(this, 0, 88);
        LMLB.addBox(3F, 0F, -1F, 2, 4, 2);
        LMLB.setRotationPoint(5F, 18F, 8F);
        setRotation(LMLB, 0F, 0F, -0.3490659F);
        LMLC = new ModelRenderer(this, 0, 82);
        LMLC.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
        LMLC.setRotationPoint(5F, 18F, 8F);
        setRotation(LMLC, 0F, 0F, -0.6981317F);
        LMLD = new ModelRenderer(this, 0, 76);
        LMLD.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        LMLD.setRotationPoint(5F, 18F, 8F);
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
        RMLA.setRotationPoint(-5F, 18F, 8F);
        setRotation(RMLA, 0F, 0F, 0.3490659F);
        RMLB = new ModelRenderer(this, 0, 88);
        RMLB.addBox(-5F, 0F, -1F, 2, 4, 2);
        RMLB.setRotationPoint(-5F, 18F, 8F);
        setRotation(RMLB, 0F, 0F, 0.3490659F);
        RMLC = new ModelRenderer(this, 0, 82);
        RMLC.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        RMLC.setRotationPoint(-5F, 18F, 8F);
        setRotation(RMLC, 0F, 0F, 0.6981317F);
        RMLD = new ModelRenderer(this, 0, 76);
        RMLD.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        RMLD.setRotationPoint(-5F, 18F, 8F);
        setRotation(RMLD, 0F, 0F, 0.8726646F);
        RBLA = new ModelRenderer(this, 42, 95);
        RBLA.addBox(-6F, -1F, -1F, 7, 2, 2);
        RBLA.setRotationPoint(-6F, 18F, 14F);
        setRotation(RBLA, 0.25F, 0.7F, 0.5F);
        RBLB = new ModelRenderer(this, 0, 88);
        RBLB.addBox(-7F, 0F, -1F, 2, 4, 2);
        RBLB.setRotationPoint(-6F, 18F, 14F);
        setRotation(RBLB, 0.25F, 0.7F, 0.5F);
        RBLC = new ModelRenderer(this, 0, 82);
        RBLC.addBox(-5.5F, 5.5F, -0.5F, 2, 4, 1);
        RBLC.setRotationPoint(-6F, 18F, 14F);
        setRotation(RBLC, 0.5F, 0.6F, 0.95F);
        RBLD = new ModelRenderer(this, 0, 76);
        RBLD.addBox(-3.5F, 9F, -0.5F, 1, 4, 1);
        RBLD.setRotationPoint(-6F, 18F, 14F);
        setRotation(RBLD, 0.64F, 0.7F, 1.27F);
        AntRE = new ModelRenderer(this, 40, 15);
        AntRE.addBox(-13F, 0.5F, -2F, 9, 1, 1);
        AntRE.setRotationPoint(0F, 17F, -1F);
        setRotation(AntRE, 0F, -0.8726646F, 0F);
        AntLE = new ModelRenderer(this, 40, 15);
        AntLE.addBox(5F, 0.5F, -2F, 9, 1, 1);
        AntLE.setRotationPoint(0F, 17F, -1F);
        setRotation(AntLE, 0F, 0.8726646F, 0F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        GL11.glPushMatrix();
        GL11.glTranslated(0F, 0F, -0.375F);
        Thx.render(unitPixel);
        ThxS.render(unitPixel);
        Ab.render(unitPixel);
        AbSide.render(unitPixel);
        AbBack.render(unitPixel);
        Head1.render(unitPixel);
        Head2.render(unitPixel);
        LMandible.render(unitPixel);
        RMandible.render(unitPixel);
        Eyes.render(unitPixel);
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
        AntRE.render(unitPixel);
        AntLE.render(unitPixel);
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
        Head1.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        Head2.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        LMandible.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        RMandible.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        AntRE.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 1.0F;
        AntLE.rotateAngleY = rotationYaw / (180F / (float) Math.PI) + 1.0F;
        Eyes.rotateAngleY = rotationYaw / (180F / (float) Math.PI);

        LBLA.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle + 0.25F;
        LBLB.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle + 0.25F;
        LBLC.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle + 0.5F;
        LBLD.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle + 0.61F;
        LMLA.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle;
        LMLB.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle;
        LMLC.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle;
        LMLD.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle;
        LFLA.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle - 0.25F;
        LFLB.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle - 0.25F;
        LFLC.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle - 0.5F;
        LFLD.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle - 0.64F;
        RBLA.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle + 0.25F;
        RBLB.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle + 0.25F;
        RBLC.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle + 0.5F;
        RBLD.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle + 0.61F;
        RMLA.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle;
        RMLB.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle;
        RMLC.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle;
        RMLD.rotateAngleX = MathHelper.cos(limbSwing + (float) Math.PI) * 0.7F * limbSwingAngle;
        RFLA.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle - 0.25F;
        RFLB.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle - 0.25F;
        RFLC.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle - 0.5F;
        RFLD.rotateAngleX = MathHelper.cos(limbSwing) * 0.7F * limbSwingAngle - 0.64F;
    }
}
