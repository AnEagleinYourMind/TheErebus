package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.entity.EntityLocust;

@SideOnly(Side.CLIENT)
public class ModelLocust extends ModelBase {

    ModelRenderer LAnt;
    ModelRenderer RAnt;
    ModelRenderer LEye;
    ModelRenderer REye;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer Head3;
    ModelRenderer HeadLBot;
    ModelRenderer HeadCBot;
    ModelRenderer HeadRBot;
    ModelRenderer Thorax1;
    ModelRenderer Thorax2;
    ModelRenderer Ab1;
    ModelRenderer Ab2;
    ModelRenderer LFL1;
    ModelRenderer LFL2;
    ModelRenderer LFL3;
    ModelRenderer LFL4;
    ModelRenderer RFL1;
    ModelRenderer RFL2;
    ModelRenderer RFL3;
    ModelRenderer RFL4;
    ModelRenderer LML1;
    ModelRenderer LML2;
    ModelRenderer LML3;
    ModelRenderer LML4;
    ModelRenderer RML1;
    ModelRenderer RML2;
    ModelRenderer RML3;
    ModelRenderer RML4;
    ModelRenderer LBL1;
    ModelRenderer LBL2;
    ModelRenderer LBL3;
    ModelRenderer LBL4;
    ModelRenderer LBL5;
    ModelRenderer LBL6;
    ModelRenderer RBL1;
    ModelRenderer RBL2;
    ModelRenderer RBL3;
    ModelRenderer RBL4;
    ModelRenderer RBL5;
    ModelRenderer RBL6;
    ModelRenderer LFWing;
    ModelRenderer RFWing;
    ModelRenderer LBWing;
    ModelRenderer RBWing;

    public ModelLocust() {
        textureWidth = 64;
        textureHeight = 128;
        LAnt = new ModelRenderer(this, 0, 0);
        LAnt.addBox(1.5F, -10.5F, -4F, 1, 7, 1);
        LAnt.setRotationPoint(0F, 16F, -9F);
        setRotation(LAnt, 0.1745329F, 0F, 0F);
        RAnt = new ModelRenderer(this, 0, 0);
        RAnt.addBox(-1.5F, -10.5F, -4F, 1, 7, 1);
        RAnt.setRotationPoint(0F, 16F, -9F);
        setRotation(RAnt, 0.1745329F, 0F, 0F);
        LEye = new ModelRenderer(this, 5, 0);
        LEye.addBox(2.5F, -2.5F, -3.5F, 1, 3, 2);
        LEye.setRotationPoint(0F, 16F, -9F);
        setRotation(LEye, -0.1745329F, 0F, 0F);
        REye = new ModelRenderer(this, 45, 0);
        REye.addBox(-3.5F, -2.5F, -3.5F, 1, 3, 2);
        REye.setRotationPoint(0F, 16F, -9F);
        setRotation(REye, -0.1745329F, 0F, 0F);
        Head1 = new ModelRenderer(this, 22, 13);
        Head1.addBox(-2F, -3.5F, -4F, 4, 1, 3);
        Head1.setRotationPoint(0F, 16F, -9F);
        setRotation(Head1, -0.1745329F, 0F, 0F);
        Head2 = new ModelRenderer(this, 24, 8);
        Head2.addBox(-1.5F, -2F, -6F, 3, 3, 1);
        Head2.setRotationPoint(0F, 16F, -9F);
        setRotation(Head2, -0.1745329F, 0F, 0F);
        Head3 = new ModelRenderer(this, 19, 18);
        Head3.addBox(-2.5F, -2.5F, -5F, 5, 4, 5);
        Head3.setRotationPoint(0F, 16F, -9F);
        setRotation(Head3, -0.1745329F, 0F, 0F);
        HeadLBot = new ModelRenderer(this, 12, 0);
        HeadLBot.addBox(1.5F, 1.5F, -4.5F, 1, 2, 3);
        HeadLBot.setRotationPoint(0F, 16F, -9F);
        setRotation(HeadLBot, -0.1745329F, 0F, 0F);
        HeadCBot = new ModelRenderer(this, 21, 0);
        HeadCBot.addBox(-1.5F, 1.5F, -5F, 3, 3, 4);
        HeadCBot.setRotationPoint(0F, 16F, -9F);
        setRotation(HeadCBot, -0.1745329F, 0F, 0F);
        HeadRBot = new ModelRenderer(this, 36, 0);
        HeadRBot.addBox(-2.5F, 1.5F, -4.5F, 1, 2, 3);
        HeadRBot.setRotationPoint(0F, 16F, -9F);
        setRotation(HeadRBot, -0.1745329F, 0F, 0F);
        Thorax1 = new ModelRenderer(this, 18, 28);
        Thorax1.addBox(-3F, -3.5F, 0F, 6, 6, 5);
        Thorax1.setRotationPoint(0F, 16F, -9F);
        setRotation(Thorax1, -0.0872665F, 0F, 0F);
        Thorax2 = new ModelRenderer(this, 13, 40);
        Thorax2.addBox(-2.5F, -3F, 5F, 5, 6, 9);
        Thorax2.setRotationPoint(0F, 16F, -9F);
        setRotation(Thorax2, -0.0872665F, 0F, 0F);
        Ab1 = new ModelRenderer(this, 28, 42);
        Ab1.addBox(-2F, -2F, 14F, 4, 4, 14);
        Ab1.setRotationPoint(0F, 16F, -9F);
        setRotation(Ab1, -0.0872665F, 0F, 0F);
        Ab2 = new ModelRenderer(this, 13, 56);
        Ab2.addBox(-1.5F, -1.5F, 28F, 3, 3, 1);
        Ab2.setRotationPoint(0F, 16F, -9F);
        setRotation(Ab2, -0.0872665F, 0F, 0F);
        LFL1 = new ModelRenderer(this, 52, 0);
        LFL1.addBox(0F, -1F, -1F, 4, 2, 2);
        LFL1.setRotationPoint(2F, 17F, -7F);
        setRotation(LFL1, 0F, 0F, -0.3490659F);
        LFL2 = new ModelRenderer(this, 43, 6);
        LFL2.addBox(3F, 0F, -1F, 2, 6, 2);
        LFL2.setRotationPoint(2F, 17F, -7F);
        setRotation(LFL2, 0F, 0F, -0.4363323F);
        LFL3 = new ModelRenderer(this, 52, 12);
        LFL3.addBox(1.5F, 6.5F, -0.5F, 2, 2, 1);
        LFL3.setRotationPoint(2F, 17F, -7F);
        setRotation(LFL3, 0F, 0F, -0.698F);
        LFL4 = new ModelRenderer(this, 52, 18);
        LFL4.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        LFL4.setRotationPoint(2F, 17F, -7F);
        setRotation(LFL4, 0F, 0F, -0.8726646F);
        RFL1 = new ModelRenderer(this, 52, 0);
        RFL1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RFL1.setRotationPoint(-2F, 17F, -7F);
        setRotation(RFL1, 0F, 0F, 0.3490659F);
        RFL2 = new ModelRenderer(this, 43, 6);
        RFL2.addBox(-5F, 0F, -1F, 2, 6, 2);
        RFL2.setRotationPoint(-2F, 17F, -7F);
        setRotation(RFL2, 0F, 0F, 0.4363323F);
        RFL3 = new ModelRenderer(this, 52, 12);
        RFL3.addBox(-3.5F, 6.5F, -0.5F, 2, 2, 1);
        RFL3.setRotationPoint(-2F, 17F, -7F);
        setRotation(RFL3, 0F, 0F, 0.6981317F);
        RFL4 = new ModelRenderer(this, 52, 18);
        RFL4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        RFL4.setRotationPoint(-2F, 17F, -7F);
        setRotation(RFL4, 0F, 0F, 0.8726646F);
        LML1 = new ModelRenderer(this, 52, 0);
        LML1.addBox(0F, -1F, -1F, 4, 2, 2);
        LML1.setRotationPoint(2F, 17F, -2F);
        setRotation(LML1, 0F, 0F, -0.3490659F);
        LML2 = new ModelRenderer(this, 43, 6);
        LML2.addBox(3F, 0F, -1F, 2, 6, 2);
        LML2.setRotationPoint(2F, 17F, -2F);
        setRotation(LML2, 0F, 0F, -0.4363323F);
        LML3 = new ModelRenderer(this, 52, 12);
        LML3.addBox(1.5F, 6.5F, -0.5F, 2, 2, 1);
        LML3.setRotationPoint(2F, 17F, -2F);
        setRotation(LML3, 0F, 0F, -0.6981317F);
        LML4 = new ModelRenderer(this, 52, 18);
        LML4.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
        LML4.setRotationPoint(2F, 17F, -2F);
        setRotation(LML4, 0F, 0F, -0.8726646F);
        RML1 = new ModelRenderer(this, 52, 0);
        RML1.addBox(-4F, -1F, -1F, 4, 2, 2);
        RML1.setRotationPoint(-2F, 17F, -2F);
        setRotation(RML1, 0F, 0F, 0.3490659F);
        RML2 = new ModelRenderer(this, 43, 6);
        RML2.addBox(-5F, 0F, -1F, 2, 6, 2);
        RML2.setRotationPoint(-2F, 17F, -2F);
        setRotation(RML2, 0F, 0F, 0.4363323F);
        RML3 = new ModelRenderer(this, 52, 12);
        RML3.addBox(-3.5F, 6.5F, -0.5F, 2, 2, 1);
        RML3.setRotationPoint(-2F, 17F, -2F);
        setRotation(RML3, 0F, 0F, 0.6981317F);
        RML4 = new ModelRenderer(this, 52, 18);
        RML4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
        RML4.setRotationPoint(-2F, 17F, -2F);
        setRotation(RML4, 0F, 0F, 0.8726646F);
        LBL1 = new ModelRenderer(this, 0, 34);
        LBL1.addBox(0.5F, -4F, -1.5F, 3, 6, 4);
        LBL1.setRotationPoint(2F, 18F, 3F);
        setRotation(LBL1, -0.5235988F, 0F, 0F);
        LBL2 = new ModelRenderer(this, 0, 24);
        LBL2.addBox(1F, -10F, -1F, 2, 6, 3);
        LBL2.setRotationPoint(2F, 18F, 3F);
        setRotation(LBL2, -0.5235988F, 0F, 0F);
        LBL3 = new ModelRenderer(this, 9, 8);
        LBL3.addBox(0.5F, -13F, -1.5F, 3, 3, 4);
        LBL3.setRotationPoint(2F, 18F, 3F);
        setRotation(LBL3, -0.5235988F, 0F, 0F);
        LBL4 = new ModelRenderer(this, 0, 9);
        LBL4.addBox(1F, -9F, 6F, 2, 12, 2);
        LBL4.setRotationPoint(2F, 18F, 3F);
        setRotation(LBL4, 0F, 0F, 0F);
        LBL5 = new ModelRenderer(this, 52, 5);
        LBL5.addBox(1.5F, -4F, 7F, 1, 2, 4);
        LBL5.setRotationPoint(2F, 18F, 3F);
        setRotation(LBL5, -0.6981317F, 0F, 0F);
        LBL6 = new ModelRenderer(this, 41, 18);
        LBL6.addBox(1.5F, -2F, 10.5F, 1, 1, 4);
        LBL6.setRotationPoint(2F, 18F, 3F);
        setRotation(LBL6, -0.5235988F, 0F, 0F);
        RBL1 = new ModelRenderer(this, 0, 34);
        RBL1.addBox(-3.5F, -4F, -1.5F, 3, 6, 4);
        RBL1.setRotationPoint(-2F, 18F, 3F);
        setRotation(RBL1, -0.5235988F, 0F, 0F);
        RBL2 = new ModelRenderer(this, 0, 24);
        RBL2.addBox(-3F, -10F, -1F, 2, 6, 3);
        RBL2.setRotationPoint(-2F, 18F, 3F);
        setRotation(RBL2, -0.5235988F, 0F, 0F);
        RBL3 = new ModelRenderer(this, 9, 8);
        RBL3.addBox(-3.5F, -13F, -1.5F, 3, 3, 4);
        RBL3.setRotationPoint(-2F, 18F, 3F);
        setRotation(RBL3, -0.5235988F, 0F, 0F);
        RBL4 = new ModelRenderer(this, 0, 9);
        RBL4.addBox(-3F, -9F, 6F, 2, 12, 2);
        RBL4.setRotationPoint(-2F, 18F, 3F);
        setRotation(RBL4, 0F, 0F, 0F);
        RBL5 = new ModelRenderer(this, 52, 5);
        RBL5.addBox(-2.5F, -4F, 7F, 1, 2, 4);
        RBL5.setRotationPoint(-2F, 18F, 3F);
        setRotation(RBL5, -0.6981317F, 0F, 0F);
        RBL6 = new ModelRenderer(this, 41, 18);
        RBL6.addBox(-2.5F, -2F, 10.5F, 1, 1, 4);
        RBL6.setRotationPoint(-2F, 18F, 3F);
        setRotation(RBL6, -0.5235988F, 0F, 0F);
        LFWing = new ModelRenderer(this, 0, 62);
        LFWing.addBox(-2.5F, 0F, 0F, 5, 1, 19);
        LFWing.setRotationPoint(0F, 13F, -5F);
        setRotation(LFWing, 0F, 0F, 0F);
        RFWing = new ModelRenderer(this, 0, 62);
        RFWing.addBox(-2.5F, 0F, 0F, 5, 1, 19);
        RFWing.setRotationPoint(0F, 13F, -5F);
        setRotation(RFWing, 0F, 0F, 0F);
        LBWing = new ModelRenderer(this, 0, 62);
        LBWing.addBox(-2.5F, 0F, 0F, 5, 1, 19);
        LBWing.setRotationPoint(0F, 13F, -5F);
        setRotation(LBWing, 0F, 0F, 0F);
        RBWing = new ModelRenderer(this, 0, 62);
        RBWing.addBox(-2.5F, 0F, 0F, 5, 1, 19);
        RBWing.setRotationPoint(0F, 13F, -5F);
        setRotation(RBWing, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        LAnt.render(unitPixel);
        RAnt.render(unitPixel);
        LEye.render(unitPixel);
        REye.render(unitPixel);
        Head1.render(unitPixel);
        Head2.render(unitPixel);
        Head3.render(unitPixel);
        HeadLBot.render(unitPixel);
        HeadCBot.render(unitPixel);
        HeadRBot.render(unitPixel);
        Thorax1.render(unitPixel);
        Thorax2.render(unitPixel);
        Ab1.render(unitPixel);
        Ab2.render(unitPixel);
        LFL1.render(unitPixel);
        LFL2.render(unitPixel);
        LFL3.render(unitPixel);
        LFL4.render(unitPixel);
        RFL1.render(unitPixel);
        RFL2.render(unitPixel);
        RFL3.render(unitPixel);
        RFL4.render(unitPixel);
        LML1.render(unitPixel);
        LML2.render(unitPixel);
        LML3.render(unitPixel);
        LML4.render(unitPixel);
        RML1.render(unitPixel);
        RML2.render(unitPixel);
        RML3.render(unitPixel);
        RML4.render(unitPixel);
        LBL1.render(unitPixel);
        LBL2.render(unitPixel);
        LBL3.render(unitPixel);
        LBL4.render(unitPixel);
        LBL5.render(unitPixel);
        LBL6.render(unitPixel);
        RBL1.render(unitPixel);
        RBL2.render(unitPixel);
        RBL3.render(unitPixel);
        RBL4.render(unitPixel);
        RBL5.render(unitPixel);
        RBL6.render(unitPixel);
        GL11.glPushMatrix();
        GL11.glEnable(GL11.GL_BLEND);
        LFWing.render(unitPixel);
        RFWing.render(unitPixel);
        LBWing.render(unitPixel);
        RBWing.render(unitPixel);
        GL11.glDisable(GL11.GL_BLEND);
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
        float heady = rotationYaw / (180F / (float) Math.PI);
        float headx = rotationPitch / (180F / (float) Math.PI);
        float legx1 = MathHelper.cos(limbSwing * 2.0F) * 0.7F * prevLimbSwing;
        float legx2 = MathHelper.cos(limbSwing * 2.0F + (float) Math.PI) * 0.7F * prevLimbSwing;
        Head1.rotateAngleY = heady;
        Head2.rotateAngleY = heady;
        Head3.rotateAngleY = heady;
        HeadLBot.rotateAngleY = heady;
        HeadRBot.rotateAngleY = heady;
        HeadCBot.rotateAngleY = heady;
        RAnt.rotateAngleY = heady;
        LAnt.rotateAngleY = heady;
        LEye.rotateAngleY = heady;
        REye.rotateAngleY = heady;
        Head1.rotateAngleX = headx - 0.1745329F;
        Head2.rotateAngleX = headx - 0.1745329F;
        Head3.rotateAngleX = headx - 0.1745329F;
        HeadLBot.rotateAngleX = headx - 0.1745329F;
        HeadRBot.rotateAngleX = headx - 0.1745329F;
        HeadCBot.rotateAngleX = headx - 0.1745329F;
        RAnt.rotateAngleX = headx + 0.1745329F;
        LAnt.rotateAngleX = headx + 0.1745329F;
        LEye.rotateAngleX = headx - 0.1745329F;
        REye.rotateAngleX = headx - 0.1745329F;
        LML1.rotateAngleX = legx1;
        LML2.rotateAngleX = legx1;
        LML3.rotateAngleX = legx1;
        LML4.rotateAngleX = legx1;
        LFL1.rotateAngleX = legx2;
        LFL2.rotateAngleX = legx2;
        LFL3.rotateAngleX = legx2;
        LFL4.rotateAngleX = legx2;
        RML1.rotateAngleX = legx2;
        RML2.rotateAngleX = legx2;
        RML3.rotateAngleX = legx2;
        RML4.rotateAngleX = legx2;
        RFL1.rotateAngleX = legx1;
        RFL2.rotateAngleX = legx1;
        RFL3.rotateAngleX = legx1;
        RFL4.rotateAngleX = legx1;
        EntityLocust var8 = (EntityLocust) entity;
        if (!var8.onGround) {
            LBL4.setRotationPoint(2F, 22.0F, 14F);
            LBL5.setRotationPoint(2F, 22.0F, 14F);
            LBL6.setRotationPoint(2F, 21.0F, 14F);
            RBL4.setRotationPoint(-2F, 22.5F, 14F);
            RBL5.setRotationPoint(-2F, 22.5F, 14F);
            RBL6.setRotationPoint(-2F, 21.0F, 14F);
            LBL1.rotateAngleX = -1.0F;
            LBL2.rotateAngleX = -1.0F;
            LBL3.rotateAngleX = -1.0F;
            LBL4.rotateAngleX = 0.8F;
            LBL5.rotateAngleX = 0.0F;
            LBL6.rotateAngleX = 0.0F;
            RBL1.rotateAngleX = -1.0F;
            RBL2.rotateAngleX = -1.0F;
            RBL3.rotateAngleX = -1.0F;
            RBL4.rotateAngleX = 0.8F;
            RBL5.rotateAngleX = 0.0F;
            RBL6.rotateAngleX = 0.0F;
            LFL1.rotateAngleX = -0.6F;
            LFL2.rotateAngleX = -0.6F;
            LFL3.rotateAngleX = -0.6F;
            LFL4.rotateAngleX = -0.6F;
            RFL1.rotateAngleX = -0.6F;
            RFL2.rotateAngleX = -0.6F;
            RFL3.rotateAngleX = -0.6F;
            RFL4.rotateAngleX = -0.6F;
            LML1.rotateAngleX = 0.6F;
            LML2.rotateAngleX = 0.6F;
            LML3.rotateAngleX = 0.6F;
            LML4.rotateAngleX = 0.6F;
            RML1.rotateAngleX = 0.6F;
            RML2.rotateAngleX = 0.6F;
            RML3.rotateAngleX = 0.6F;
            RML4.rotateAngleX = 0.6F;
            RFWing.rotateAngleY = -1.7F;
            RBWing.rotateAngleY = -0.9F;
            LFWing.rotateAngleY = 1.7F;
            LBWing.rotateAngleY = 0.9F;
            RFWing.rotateAngleX = legx1;
            RBWing.rotateAngleX = legx1;
            LFWing.rotateAngleX = legx1;
            LBWing.rotateAngleX = legx1;
        }
        if (var8.onGround) {
            RFWing.rotateAngleY = 0F;
            RBWing.rotateAngleY = 0F;
            LFWing.rotateAngleY = 0F;
            LBWing.rotateAngleY = 0F;
            RFWing.rotateAngleX = 0F;
            RBWing.rotateAngleX = 0F;
            LFWing.rotateAngleX = 0F;
            LBWing.rotateAngleX = 0F;
            LBL4.setRotationPoint(2F, 18F, 3F);
            LBL5.setRotationPoint(2F, 18F, 3F);
            LBL6.setRotationPoint(2F, 18F, 3F);
            RBL4.setRotationPoint(-2F, 18F, 3F);
            RBL5.setRotationPoint(-2F, 18F, 3F);
            RBL6.setRotationPoint(-2F, 18F, 3F);
            LBL4.setRotationPoint(2F, 18F, 3F);
            LBL5.setRotationPoint(2F, 18F, 3F);
            LBL6.setRotationPoint(2F, 18F, 3F);
            RBL4.setRotationPoint(-2F, 18F, 3F);
            RBL5.setRotationPoint(-2F, 18F, 3F);
            RBL6.setRotationPoint(-2F, 18F, 3F);
            LBL1.rotateAngleX = legx2 - 0.5235988F;
            LBL2.rotateAngleX = legx2 - 0.5235988F;
            LBL3.rotateAngleX = legx2 - 0.5235988F;
            LBL4.rotateAngleX = legx2;
            LBL5.rotateAngleX = legx2 - 0.6981317F;
            LBL6.rotateAngleX = legx2 - 0.5235988F;
            RBL1.rotateAngleX = legx1 - 0.5235988F;
            RBL2.rotateAngleX = legx1 - 0.5235988F;
            RBL3.rotateAngleX = legx1 - 0.5235988F;
            RBL4.rotateAngleX = legx1;
            RBL5.rotateAngleX = legx1 - 0.6981317F;
            RBL6.rotateAngleX = legx1 - 0.5235988F;
        }
    }
}
