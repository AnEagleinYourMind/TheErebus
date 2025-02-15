package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityTitanBeetle;

@SideOnly(Side.CLIENT)
public class ModelTitanBeetle extends ModelBase {

    ModelRenderer Thx;
    ModelRenderer ThxS;
    ModelRenderer Ab;
    ModelRenderer AbSide;
    ModelRenderer AbBack;
    ModelRenderer AntLE;
    ModelRenderer AntLB;
    ModelRenderer AntRE;
    ModelRenderer AntRB;
    ModelRenderer Eyes;
    ModelRenderer HeadTop;
    ModelRenderer HeadFront;
    ModelRenderer HeadMain;
    ModelRenderer Neck;
    ModelRenderer LMandible1;
    ModelRenderer LMandible2;
    ModelRenderer RMandible1;
    ModelRenderer RMandible2;
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
    ModelRenderer Lid;
    ModelRenderer Body;
    ModelRenderer Lock;

    public ModelTitanBeetle() {
        textureWidth = 128;
        textureHeight = 128;

        Thx = new ModelRenderer(this, 0, 0);
        Thx.addBox(-4.5F, -3F, -1F, 9, 6, 7);
        Thx.setRotationPoint(0F, 16F, -7F);
        setRotation(Thx, 0F, 0F, 0F);
        ThxS = new ModelRenderer(this, 0, 14);
        ThxS.addBox(-6F, -2F, 0F, 12, 4, 4);
        ThxS.setRotationPoint(0F, 16F, -7F);
        setRotation(ThxS, 0F, 0F, 0F);
        Ab = new ModelRenderer(this, 0, 24);
        Ab.addBox(-5.5F, -4.5F, -2F, 11, 7, 21);
        Ab.setRotationPoint(0F, 17F, 0F);
        setRotation(Ab, -0.0872665F, 0F, 0F);
        AbSide = new ModelRenderer(this, 33, 0);
        AbSide.addBox(-7F, -2F, 1F, 14, 4, 19);
        AbSide.setRotationPoint(0F, 16F, -2F);
        setRotation(AbSide, -0.0872665F, 0F, 0F);
        AbBack = new ModelRenderer(this, 0, 24);
        AbBack.addBox(-3.5F, -2F, 21F, 7, 4, 2);
        AbBack.setRotationPoint(0F, 16F, -2F);
        setRotation(AbBack, -0.0872665F, 0F, 0F);
        AntLE = new ModelRenderer(this, 95, 24);
        AntLE.addBox(-1F, 0.5F, -11F, 9, 1, 1);
        setRotation(AntLE, 0F, -0.6981317F, 0F);
        AntLB = new ModelRenderer(this, 80, 24);
        AntLB.addBox(5F, 0.5F, -2F, 6, 1, 1);
        setRotation(AntLB, 0F, 0.8726646F, 0F);
        AntRE = new ModelRenderer(this, 95, 27);
        AntRE.addBox(-8F, 0.5F, -11F, 9, 1, 1);
        setRotation(AntRE, 0F, 0.6981317F, 0F);
        AntRB = new ModelRenderer(this, 80, 27);
        AntRB.addBox(-11F, 0.5F, -2F, 6, 1, 1);
        setRotation(AntRB, 0F, -0.8726646F, 0F);
        Eyes = new ModelRenderer(this, 65, 49);
        Eyes.addBox(-4F, -2F, -4F, 8, 3, 3);
        setRotation(Eyes, 0F, 0F, 0F);
        HeadTop = new ModelRenderer(this, 65, 30);
        HeadTop.addBox(-1.5F, -2.5F, -6F, 3, 1, 6);
        setRotation(HeadTop, 0F, 0F, 0F);
        HeadFront = new ModelRenderer(this, 65, 24);
        HeadFront.addBox(-2.5F, -1F, -7.5F, 5, 3, 2);
        setRotation(HeadFront, 0F, 0F, 0F);
        HeadMain = new ModelRenderer(this, 65, 38);
        HeadMain.addBox(-3.5F, -1.5F, -6F, 7, 4, 6);
        HeadMain.setRotationPoint(0F, 16F, -8F);
        setRotation(HeadMain, 0.1745329F, 0F, 0F);
        Neck = new ModelRenderer(this, 65, 58);
        Neck.addBox(-2F, -2F, -8.5F, 4, 3, 2);
        Neck.setRotationPoint(0F, 16F, 0F);
        setRotation(Neck, 0.1745329F, 0F, 0F);
        LMandible1 = new ModelRenderer(this, 92, 33);
        LMandible1.addBox(-2F, 0F, -10.5F, 2, 1, 4);
        setRotation(LMandible1, 0F, -0.3490659F, 0F);
        LMandible2 = new ModelRenderer(this, 94, 30);
        LMandible2.addBox(-3F, 0F, -11.5F, 3, 1, 1);
        setRotation(LMandible2, 0F, -0.3490659F, 0F);
        RMandible1 = new ModelRenderer(this, 105, 33);
        RMandible1.addBox(0F, 0F, -10.5F, 2, 1, 4);
        setRotation(RMandible1, 0F, 0.3316126F, 0F);
        RMandible2 = new ModelRenderer(this, 107, 30);
        RMandible2.addBox(0F, 0F, -11.5F, 3, 1, 1);
        setRotation(RMandible2, 0F, 0.3316126F, 0F);

        float correction = 0.3490659F;
        LBL1 = new ModelRenderer(this, 42, 53);
        LBL1.addBox(-1F, -1F, -1F, 7, 2, 2);
        LBL1.setRotationPoint(7F, 17F, 7F);
        setRotation(LBL1, 0F, -0.6981317F, -0.3490659F - correction);
        LBL2 = new ModelRenderer(this, 0, 53);
        LBL2.addBox(5F, 0F, -1F, 2, 4, 2);
        setRotation(LBL2, 0F, 0F, -0.3490659F + correction);
        LBL3 = new ModelRenderer(this, 9, 53);
        LBL3.addBox(3.5F, 5.5F, -0.5F, 2, 4, 1);
        setRotation(LBL3, 0F, 0F, -0.6981317F + correction);
        LBL4 = new ModelRenderer(this, 16, 53);
        LBL4.addBox(2.5F, 9F, -0.5F, 1, 4, 1);
        setRotation(LBL4, 0F, 0F, -0.8726646F + correction);
        LML1 = new ModelRenderer(this, 0, 60);
        LML1.addBox(0F, -1F, -1F, 4, 2, 2);
        LML1.setRotationPoint(6F, 17F, 1F);
        setRotation(LML1, 0F, 0F, -0.3490659F - correction);
        LML2 = new ModelRenderer(this, 0, 53);
        LML2.addBox(3F, 0F, -1F, 2, 4, 2);
        setRotation(LML2, 0F, 0F, -0.3490659F + correction);
        LML3 = new ModelRenderer(this, 9, 53);
        LML3.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(LML3, 0F, 0F, -0.6981317F + correction);
        LML4 = new ModelRenderer(this, 16, 53);
        LML4.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(LML4, 0F, 0F, -0.8726646F + correction);
        LFL1 = new ModelRenderer(this, 0, 60);
        LFL1.addBox(0F, -1F, -1F, 4, 2, 2);
        LFL1.setRotationPoint(5F, 17F, -5F);
        setRotation(LFL1, 0F, 0.6981317F, -0.3490659F - correction);
        LFL2 = new ModelRenderer(this, 0, 53);
        LFL2.addBox(3F, 0F, -1F, 2, 4, 2);
        setRotation(LFL2, 0F, 0F, -0.3490659F + correction);
        LFL3 = new ModelRenderer(this, 9, 53);
        LFL3.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(LFL3, 0F, 0F, -0.6981317F + correction);
        LFL4 = new ModelRenderer(this, 16, 53);
        LFL4.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(LFL4, 0F, 0F, -0.8726646F + correction);
        RFL1 = new ModelRenderer(this, 0, 60);
        RFL1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RFL1.setRotationPoint(-5F, 17F, -5F);
        setRotation(RFL1, 0F, -0.6981317F, 0.3490659F + correction);
        RFL2 = new ModelRenderer(this, 0, 53);
        RFL2.addBox(-5F, 0F, -1F, 2, 4, 2);
        setRotation(RFL2, 0F, 0F, 0.3490659F - correction);
        RFL3 = new ModelRenderer(this, 9, 53);
        RFL3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(RFL3, 0F, 0F, 0.6981317F - correction);
        RFL4 = new ModelRenderer(this, 16, 53);
        RFL4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(RFL4, 0F, 0F, 0.8726646F - correction);
        RML1 = new ModelRenderer(this, 0, 60);
        RML1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RML1.setRotationPoint(-6F, 17F, 1F);
        setRotation(RML1, 0F, 0F, 0.3490659F + correction);
        RML2 = new ModelRenderer(this, 0, 53);
        RML2.addBox(-5F, 0F, -1F, 2, 4, 2);
        setRotation(RML2, 0F, 0F, 0.3490659F - correction);
        RML3 = new ModelRenderer(this, 9, 53);
        RML3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
        setRotation(RML3, 0F, 0F, 0.6981317F - correction);
        RML4 = new ModelRenderer(this, 16, 53);
        RML4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        setRotation(RML4, 0F, 0F, 0.8726646F - correction);
        RBL1 = new ModelRenderer(this, 42, 53);
        RBL1.addBox(-6F, -1F, -1F, 7, 2, 2);
        RBL1.setRotationPoint(-7F, 17F, 7F);
        setRotation(RBL1, 0F, 0.6981317F, 0.3490659F + correction);
        RBL2 = new ModelRenderer(this, 0, 53);
        RBL2.addBox(-7F, 0F, -1F, 2, 4, 2);
        setRotation(RBL2, 0F, 0F, 0.3490659F - correction);
        RBL3 = new ModelRenderer(this, 9, 53);
        RBL3.addBox(-5.5F, 5.5F, -0.5F, 2, 4, 1);
        setRotation(RBL3, 0F, 0F, 0.6981317F - correction);
        RBL4 = new ModelRenderer(this, 16, 53);
        RBL4.addBox(-3.5F, 9F, -0.5F, 1, 4, 1);
        setRotation(RBL4, 0F, 0F, 0.8726646F - correction);
        Lid = new ModelRenderer(this, 0, 65);
        Lid.addBox(-7F, -4F, -14F, 14, 5, 14);
        Lid.setRotationPoint(0F, 3F, 4F);
        setRotation(Lid, 0.0872665F, 3.141593F, 0F);
        Body = new ModelRenderer(this, 0, 85);
        Body.addBox(-7F, 0F, -14F, 14, 10, 14);
        Body.setRotationPoint(0F, 3F, 4F);
        setRotation(Body, 0.0872665F, 3.141593F, 0F);
        Lock = new ModelRenderer(this, 0, 110);
        Lock.addBox(-1F, -1F, -15F, 2, 4, 1);
        Lock.setRotationPoint(0F, 3F, 4F);
        setRotation(Lock, 0.0872665F, 3.141593F, 0F);

        LFL1.addChild(LFL2);
        LFL1.addChild(LFL3);
        LFL1.addChild(LFL4);
        LML1.addChild(LML2);
        LML1.addChild(LML3);
        LML1.addChild(LML4);
        LBL1.addChild(LBL2);
        LBL1.addChild(LBL3);
        LBL1.addChild(LBL4);
        RFL1.addChild(RFL2);
        RFL1.addChild(RFL3);
        RFL1.addChild(RFL4);
        RML1.addChild(RML2);
        RML1.addChild(RML3);
        RML1.addChild(RML4);
        RBL1.addChild(RBL2);
        RBL1.addChild(RBL3);
        RBL1.addChild(RBL4);
        HeadMain.addChild(Eyes);
        HeadMain.addChild(HeadTop);
        HeadMain.addChild(HeadFront);
        HeadMain.addChild(LMandible1);
        HeadMain.addChild(LMandible2);
        HeadMain.addChild(RMandible1);
        HeadMain.addChild(RMandible2);
        HeadMain.addChild(AntLE);
        HeadMain.addChild(AntRE);
        HeadMain.addChild(AntLB);
        HeadMain.addChild(AntRB);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        EntityTitanBeetle beetle = (EntityTitanBeetle) entity;
        Thx.render(unitPixel);
        ThxS.render(unitPixel);
        Ab.render(unitPixel);
        AbSide.render(unitPixel);
        AbBack.render(unitPixel);
        HeadMain.render(unitPixel);
        Neck.render(unitPixel);
        LBL1.render(unitPixel);
        LML1.render(unitPixel);
        LFL1.render(unitPixel);
        RFL1.render(unitPixel);
        RML1.render(unitPixel);
        RBL1.render(unitPixel);
        if (beetle.getTameState() >= 3) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0F, 0.27F, 0.15F);
            GL11.glScalef(0.67F, 0.67F, 0.67F);
            Body.render(unitPixel);
            Lid.render(unitPixel);
            Lock.render(unitPixel);
            GL11.glPopMatrix();
        }
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
        EntityTitanBeetle beetle = (EntityTitanBeetle) entity;
        float correction = 0.3490659F;
        float legMovement = MathHelper.cos(limbSwing * 1.0F) * 0.5F * prevLimbSwing;
        HeadMain.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        LBL1.rotateAngleX = -legMovement + correction;
        LML1.rotateAngleX = legMovement;
        LFL1.rotateAngleX = -legMovement - correction;
        RBL1.rotateAngleX = legMovement + correction;
        RML1.rotateAngleX = -legMovement;
        RFL1.rotateAngleX = legMovement - correction;
        Lid.rotateAngleX = beetle.getDataWatcher()
            .getWatchableObjectFloat(21) + 0.087F;
        Lock.rotateAngleX = beetle.getDataWatcher()
            .getWatchableObjectFloat(21) + 0.087F;
    }
}
