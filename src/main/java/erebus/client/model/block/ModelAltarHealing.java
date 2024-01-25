package erebus.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.tileentity.TileEntityErebusAltarHealing;

@SideOnly(Side.CLIENT)
public class ModelAltarHealing extends ModelBase {

    // fields
    ModelRenderer ROutPetal1;
    ModelRenderer ROutPetal2;
    ModelRenderer ROutPetal3;
    ModelRenderer ROutPelal4;
    ModelRenderer LOutPetal1;
    ModelRenderer LOutPetal2;
    ModelRenderer LOutPetal3;
    ModelRenderer LOutPetal4;
    ModelRenderer BOutPetal1;
    ModelRenderer BOutPetal2;
    ModelRenderer BOutPetal3;
    ModelRenderer BOutPetal4;
    ModelRenderer RInPetal1;
    ModelRenderer RInPetal2;
    ModelRenderer RInPetal3;
    ModelRenderer RInPetal4;
    ModelRenderer LInPetal1;
    ModelRenderer LInPetal2;
    ModelRenderer LinPetal3;
    ModelRenderer LInPetal4;
    ModelRenderer FInPetal1;
    ModelRenderer FInPetal2;
    ModelRenderer FInPetal3;
    ModelRenderer FInPetal4;
    ModelRenderer RLeafBack;
    ModelRenderer RLeafMain;
    ModelRenderer RLeafFront;
    ModelRenderer RLeafTop;
    ModelRenderer RLeafEnd;
    ModelRenderer LLeafBack;
    ModelRenderer LLeafMain;
    ModelRenderer LLeafFront;
    ModelRenderer LLeafTop;
    ModelRenderer LLeafEnd;
    ModelRenderer Stem;
    ModelRenderer Top;
    ModelRenderer Mid;
    ModelRenderer Bot;

    public ModelAltarHealing() {
        textureWidth = 256;
        textureHeight = 64;

        ROutPetal1 = new ModelRenderer(this, 0, 37);
        ROutPetal1.addBox(-2F, 0F, 5.5F, 4, 4, 1);
        ROutPetal1.setRotationPoint(0F, -32F, 0F);
        setRotation(ROutPetal1, -0.7853982F, -2.094395F, 0F);
        ROutPetal2 = new ModelRenderer(this, 20, 43);
        ROutPetal2.addBox(-3F, 0F, 4.5F, 6, 4, 1);
        ROutPetal2.setRotationPoint(0F, -32F, 0F);
        setRotation(ROutPetal2, -0.1570796F, -2.094395F, 0F);
        ROutPetal3 = new ModelRenderer(this, 20, 51);
        ROutPetal3.addBox(-4F, -4F, 4.5F, 8, 4, 1);
        ROutPetal3.setRotationPoint(0F, -32F, 0F);
        setRotation(ROutPetal3, -0.1570796F, -2.094395F, 0F);
        ROutPelal4 = new ModelRenderer(this, 20, 37);
        ROutPelal4.addBox(-3F, -7F, 5F, 6, 4, 1);
        ROutPelal4.setRotationPoint(0F, -32F, 0F);
        setRotation(ROutPelal4, 0F, -2.094395F, 0F);
        LOutPetal1 = new ModelRenderer(this, 0, 37);
        LOutPetal1.addBox(-2F, 0F, 5.5F, 4, 4, 1);
        LOutPetal1.setRotationPoint(0F, -32F, 0F);
        setRotation(LOutPetal1, -0.7853982F, 2.094395F, 0F);
        LOutPetal2 = new ModelRenderer(this, 20, 43);
        LOutPetal2.addBox(-3F, 0F, 4.5F, 6, 4, 1);
        LOutPetal2.setRotationPoint(0F, -32F, 0F);
        setRotation(LOutPetal2, -0.1570796F, 2.094395F, 0F);
        LOutPetal3 = new ModelRenderer(this, 20, 51);
        LOutPetal3.addBox(-4F, -4F, 4.5F, 8, 4, 1);
        LOutPetal3.setRotationPoint(0F, -32F, 0F);
        setRotation(LOutPetal3, -0.1570796F, 2.094395F, 0F);
        LOutPetal4 = new ModelRenderer(this, 20, 37);
        LOutPetal4.addBox(-3F, -7F, 5F, 6, 4, 1);
        LOutPetal4.setRotationPoint(0F, -32F, 0F);
        setRotation(LOutPetal4, 0F, 2.094395F, 0F);
        BOutPetal1 = new ModelRenderer(this, 0, 37);
        BOutPetal1.addBox(-2F, 0F, 5.5F, 4, 4, 1);
        BOutPetal1.setRotationPoint(0F, -32F, 0F);
        setRotation(BOutPetal1, -0.7853982F, 0F, 0F);
        BOutPetal2 = new ModelRenderer(this, 20, 43);
        BOutPetal2.addBox(-3F, 0F, 4.5F, 6, 4, 1);
        BOutPetal2.setRotationPoint(0F, -32F, 0F);
        setRotation(BOutPetal2, -0.1570796F, 0F, 0F);
        BOutPetal3 = new ModelRenderer(this, 20, 51);
        BOutPetal3.addBox(-4F, -4F, 4.5F, 8, 4, 1);
        BOutPetal3.setRotationPoint(0F, -32F, 0F);
        setRotation(BOutPetal3, -0.1570796F, 0F, 0F);
        BOutPetal4 = new ModelRenderer(this, 20, 37);
        BOutPetal4.addBox(-3F, -7F, 5F, 6, 4, 1);
        BOutPetal4.setRotationPoint(0F, -32F, 0F);
        setRotation(BOutPetal4, 0F, 0F, 0F);
        RInPetal1 = new ModelRenderer(this, 0, 43);
        RInPetal1.addBox(-1.5F, 1F, 4F, 3, 3, 1);
        RInPetal1.setRotationPoint(0F, -32F, 0F);
        setRotation(RInPetal1, -0.7853982F, -1.047198F, 0F);
        RInPetal2 = new ModelRenderer(this, 35, 43);
        RInPetal2.addBox(-3F, 0F, 0.5F, 6, 4, 3);
        RInPetal2.setRotationPoint(0F, -32F, 0F);
        setRotation(RInPetal2, -0.1570796F, -1.047198F, 0F);
        RInPetal3 = new ModelRenderer(this, 39, 51);
        RInPetal3.addBox(-3.5F, -4F, 1.5F, 7, 4, 2);
        RInPetal3.setRotationPoint(0F, -32F, 0F);
        setRotation(RInPetal3, -0.1570796F, -1.047198F, 0F);
        RInPetal4 = new ModelRenderer(this, 20, 37);
        RInPetal4.addBox(-3F, -7F, 3F, 6, 4, 1);
        RInPetal4.setRotationPoint(0F, -32F, 0F);
        setRotation(RInPetal4, 0F, -1.047198F, 0F);
        LInPetal1 = new ModelRenderer(this, 0, 43);
        LInPetal1.addBox(-1.5F, 1F, 4F, 3, 3, 1);
        LInPetal1.setRotationPoint(0F, -32F, 0F);
        setRotation(LInPetal1, -0.7853982F, 1.047198F, 0F);
        LInPetal2 = new ModelRenderer(this, 35, 43);
        LInPetal2.addBox(-3F, 0F, 0.5F, 6, 4, 3);
        LInPetal2.setRotationPoint(0F, -32F, 0F);
        setRotation(LInPetal2, -0.1570796F, 1.047198F, 0F);
        LinPetal3 = new ModelRenderer(this, 39, 51);
        LinPetal3.addBox(-3.5F, -4F, 1.5F, 7, 4, 2);
        LinPetal3.setRotationPoint(0F, -32F, 0F);
        setRotation(LinPetal3, -0.1570796F, 1.047198F, 0F);
        LInPetal4 = new ModelRenderer(this, 20, 37);
        LInPetal4.addBox(-3F, -7F, 3F, 6, 4, 1);
        LInPetal4.setRotationPoint(0F, -32F, 0F);
        setRotation(LInPetal4, 0F, 1.047198F, 0F);
        FInPetal1 = new ModelRenderer(this, 0, 43);
        FInPetal1.addBox(-1.5F, 1F, 4F, 3, 3, 1);
        FInPetal1.setRotationPoint(0F, -32F, 0F);
        setRotation(FInPetal1, -0.7853982F, -3.141593F, 0F);
        FInPetal2 = new ModelRenderer(this, 35, 43);
        FInPetal2.addBox(-3F, 0F, 0.5F, 6, 4, 3);
        FInPetal2.setRotationPoint(0F, -32F, 0F);
        setRotation(FInPetal2, -0.1570796F, 3.141593F, 0F);
        FInPetal3 = new ModelRenderer(this, 39, 51);
        FInPetal3.addBox(-3.5F, -4F, 1.5F, 7, 4, 2);
        FInPetal3.setRotationPoint(0F, -32F, 0F);
        setRotation(FInPetal3, -0.1570796F, 3.141593F, 0F);
        FInPetal4 = new ModelRenderer(this, 20, 37);
        FInPetal4.addBox(-3F, -7F, 3F, 6, 4, 1);
        FInPetal4.setRotationPoint(0F, -32F, 0F);
        setRotation(FInPetal4, 0F, 3.141593F, 0F);
        RLeafBack = new ModelRenderer(this, 8, 43);
        RLeafBack.addBox(-2F, 11F, -9.5F, 1, 9, 1);
        RLeafBack.setRotationPoint(0F, -32F, 0F);
        setRotation(RLeafBack, 0.3490659F, 1.570796F, 0F);
        RLeafMain = new ModelRenderer(this, 13, 37);
        RLeafMain.addBox(-1F, 7.5F, -9.5F, 2, 14, 1);
        RLeafMain.setRotationPoint(0F, -32F, 0F);
        setRotation(RLeafMain, 0.3490659F, 1.570796F, 0F);
        RLeafFront = new ModelRenderer(this, 8, 54);
        RLeafFront.addBox(1F, 11F, -9.5F, 1, 9, 1);
        RLeafFront.setRotationPoint(0F, -32F, 0F);
        setRotation(RLeafFront, 0.3490659F, 1.570796F, 0F);
        RLeafTop = new ModelRenderer(this, 13, 53);
        RLeafTop.addBox(-1F, 12F, -1.5F, 2, 3, 1);
        RLeafTop.setRotationPoint(0F, -32F, 0F);
        setRotation(RLeafTop, -0.4363323F, 1.570796F, 0F);
        RLeafEnd = new ModelRenderer(this, 13, 58);
        RLeafEnd.addBox(-0.5F, 15F, -1.5F, 1, 2, 1);
        RLeafEnd.setRotationPoint(0F, -32F, 0F);
        setRotation(RLeafEnd, -0.4363323F, 1.570796F, 0F);
        LLeafBack = new ModelRenderer(this, 8, 43);
        LLeafBack.addBox(1F, 11F, -9.5F, 1, 9, 1);
        LLeafBack.setRotationPoint(0F, -32F, 0F);
        setRotation(LLeafBack, 0.3490659F, -1.570796F, 0F);
        LLeafMain = new ModelRenderer(this, 13, 37);
        LLeafMain.addBox(-1F, 7.5F, -9.5F, 2, 14, 1);
        LLeafMain.setRotationPoint(0F, -32F, 0F);
        setRotation(LLeafMain, 0.3490659F, -1.570796F, 0F);
        LLeafFront = new ModelRenderer(this, 8, 54);
        LLeafFront.addBox(-2F, 11F, -9.5F, 1, 9, 1);
        LLeafFront.setRotationPoint(0F, -32F, 0F);
        setRotation(LLeafFront, 0.3490659F, -1.570796F, 0F);
        LLeafTop = new ModelRenderer(this, 13, 53);
        LLeafTop.addBox(-1F, 12F, 0.5F, 2, 3, 1);
        LLeafTop.setRotationPoint(0F, -32F, 0F);
        setRotation(LLeafTop, 0.4363323F, -4.712389F, 0F);
        LLeafEnd = new ModelRenderer(this, 13, 58);
        LLeafEnd.addBox(-0.5F, 15F, 0.5F, 1, 2, 1);
        LLeafEnd.setRotationPoint(0F, -32F, 0F);
        setRotation(LLeafEnd, 0.4363323F, -4.712389F, 0F);
        Stem = new ModelRenderer(this, 58, 40);
        Stem.addBox(-1F, 6F, -1F, 2, 18, 2);
        Stem.setRotationPoint(0F, -32F, 0F);
        setRotation(Stem, 0F, 0.7853982F, 0F);
        Top = new ModelRenderer(this, 0, 0);
        Top.addBox(-16F, 0F, -16F, 32, 4, 32);
        Top.setRotationPoint(0F, -8F, 0F);
        setRotation(Top, 0F, 0F, 0F);
        Mid = new ModelRenderer(this, 130, 0);
        Mid.addBox(-12F, 0F, -12F, 24, 24, 24);
        Mid.setRotationPoint(0F, -4F, 0F);
        setRotation(Mid, 0F, 0F, 0F);
        Bot = new ModelRenderer(this, 0, 0);
        Bot.addBox(-16F, 0F, -16F, 32, 4, 32);
        Bot.setRotationPoint(0F, 20F, 0F);
        setRotation(Bot, 0F, 0F, 0F);
    }

    public void render(TileEntityErebusAltarHealing tile) {

        float x = tile.animationTicks;
        GL11.glPushMatrix();
        GL11.glScalef(0.04F * x, 0.04F * x, 0.04F * x);
        ROutPetal1.render(0.0625F);
        ROutPetal2.render(0.0625F);
        ROutPetal3.render(0.0625F);
        ROutPelal4.render(0.0625F);
        LOutPetal1.render(0.0625F);
        LOutPetal2.render(0.0625F);
        LOutPetal3.render(0.0625F);
        LOutPetal4.render(0.0625F);
        BOutPetal1.render(0.0625F);
        BOutPetal2.render(0.0625F);
        BOutPetal3.render(0.0625F);
        BOutPetal4.render(0.0625F);
        RInPetal1.render(0.0625F);
        RInPetal2.render(0.0625F);
        RInPetal3.render(0.0625F);
        RInPetal4.render(0.0625F);
        LInPetal1.render(0.0625F);
        LInPetal2.render(0.0625F);
        LinPetal3.render(0.0625F);
        LInPetal4.render(0.0625F);
        FInPetal1.render(0.0625F);
        FInPetal2.render(0.0625F);
        FInPetal3.render(0.0625F);
        FInPetal4.render(0.0625F);
        RLeafBack.render(0.0625F);
        RLeafMain.render(0.0625F);
        RLeafFront.render(0.0625F);
        RLeafTop.render(0.0625F);
        RLeafEnd.render(0.0625F);
        LLeafBack.render(0.0625F);
        LLeafMain.render(0.0625F);
        LLeafFront.render(0.0625F);
        LLeafTop.render(0.0625F);
        LLeafEnd.render(0.0625F);
        Stem.render(0.0625F);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glRotatef(-x * 7.2F, 0F, 1F, 0F);
        Mid.render(0.0625F);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glRotatef(x * 7.2F, 0F, 1F, 0F);
        Top.render(0.0625F);
        Bot.render(0.0625F);
        GL11.glPopMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel, Entity entity) {}

}
