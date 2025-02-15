package erebus.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.tileentity.TileEntityBambooBridge;

@SideOnly(Side.CLIENT)
public class ModelBambooBridge extends ModelBase {

    ModelRenderer BambooStep1;
    ModelRenderer BambooStep3;
    ModelRenderer BambooStep2;
    ModelRenderer BambooStep4;
    ModelRenderer SupportR1;
    ModelRenderer SupportR2;
    ModelRenderer SupportL1;
    ModelRenderer SupportL2;
    ModelRenderer String1;
    ModelRenderer String2;
    ModelRenderer String3;
    ModelRenderer String4;
    ModelRenderer StringR1;
    ModelRenderer StringR2;
    ModelRenderer StringL1;
    ModelRenderer StringL2;

    public ModelBambooBridge() {
        textureWidth = 64;
        textureHeight = 32;
        BambooStep1 = new ModelRenderer(this, 1, 1);
        BambooStep1.addBox(0F, 0F, 0F, 14, 3, 2);
        BambooStep1.setRotationPoint(-7F, 22F, -4.5F);
        setRotation(BambooStep1, -1.570796F, 0F, 0F);
        BambooStep3 = new ModelRenderer(this, 1, 1);
        BambooStep3.addBox(0F, 0F, 0F, 14, 3, 2);
        BambooStep3.setRotationPoint(-7F, 22F, 3.5F);
        setRotation(BambooStep3, -1.570796F, 0F, 0F);
        BambooStep2 = new ModelRenderer(this, 1, 1);
        BambooStep2.addBox(0F, 0F, 0F, 14, 3, 2);
        BambooStep2.setRotationPoint(-7F, 22F, -0.5F);
        setRotation(BambooStep2, -1.570796F, 0F, 0F);
        BambooStep4 = new ModelRenderer(this, 1, 1);
        BambooStep4.addBox(0F, 0F, 0F, 14, 3, 2);
        BambooStep4.setRotationPoint(-7F, 22F, 7.5F);
        setRotation(BambooStep4, -1.570796F, 0F, 0F);
        SupportR1 = new ModelRenderer(this, 0, 0);
        SupportR1.addBox(0F, 0F, 0F, 14, 2, 3);
        SupportR1.setRotationPoint(-8F, 24F, -7.5F);
        setRotation(SupportR1, 0F, 0F, -1.570796F);
        SupportR2 = new ModelRenderer(this, 0, 0);
        SupportR2.addBox(0F, 0F, 0F, 14, 2, 3);
        SupportR2.setRotationPoint(-8F, 24F, 4.5F);
        setRotation(SupportR2, 0F, 0F, -1.570796F);
        SupportL1 = new ModelRenderer(this, 0, 0);
        SupportL1.addBox(0F, 0F, 0F, 14, 2, 3);
        SupportL1.setRotationPoint(6F, 24F, -7.5F);
        setRotation(SupportL1, 0F, 0F, -1.570796F);
        SupportL2 = new ModelRenderer(this, 0, 0);
        SupportL2.addBox(0F, 0F, 0F, 14, 2, 3);
        SupportL2.setRotationPoint(6F, 24F, 4.5F);
        setRotation(SupportL2, 0F, 0F, -1.570796F);
        String1 = new ModelRenderer(this, 0, 6);
        String1.addBox(0F, 0F, 0F, 1, 16, 1);
        String1.setRotationPoint(5F, 22.5F, 8F);
        setRotation(String1, -1.570796F, 0F, 0F);
        String2 = new ModelRenderer(this, 0, 6);
        String2.addBox(0F, 0F, 0F, 1, 16, 1);
        String2.setRotationPoint(-6F, 22.5F, 8F);
        setRotation(String2, -1.570796F, 0F, 0F);
        String3 = new ModelRenderer(this, 0, 6);
        String3.addBox(0F, 0F, 0F, 1, 16, 1);
        String3.setRotationPoint(6.6F, 12F, -8F);
        setRotation(String3, 1.570796F, 0F, 0F);
        String4 = new ModelRenderer(this, 0, 6);
        String4.addBox(0F, 0F, 0F, 1, 16, 1);
        String4.setRotationPoint(-7.4F, 12F, -8F);
        setRotation(String4, 1.570796F, 0F, 0F);
        StringR1 = new ModelRenderer(this, 0, 6);
        StringR1.addBox(0F, 0.2F, 0F, 1, 12, 1);
        StringR1.setRotationPoint(-7.4F, 11F, -2.5F);
        setRotation(StringR1, 0F, 0F, -0.122173F);
        StringR2 = new ModelRenderer(this, 0, 6);
        StringR2.addBox(0F, 0.3F, 0F, 1, 12, 1);
        StringR2.setRotationPoint(-7.4F, 11F, 1.5F);
        setRotation(StringR2, 0F, 0F, -0.122173F);
        StringL1 = new ModelRenderer(this, 0, 6);
        StringL1.addBox(0F, 0.1F, 0F, 1, 12, 1);
        StringL1.setRotationPoint(6.6F, 11F, -2.5F);
        setRotation(StringL1, 0F, 0F, 0.122173F);
        StringL2 = new ModelRenderer(this, 0, 6);
        StringL2.addBox(0F, 0.2F, 0F, 1, 12, 1);
        StringL2.setRotationPoint(6.6F, 11F, 1.5F);
        setRotation(StringL2, 0F, 0F, 0.122173F);
    }

    public void render(TileEntityBambooBridge tile) {
        if (tile.getRenderSide1()) {
            SupportR1.render(0.0625F);
            SupportR2.render(0.0625F);
            StringR1.render(0.0625F);
            StringR2.render(0.0625F);
            String4.render(0.0625F);
        }

        if (tile.getRenderSide2()) {
            SupportL1.render(0.0625F);
            SupportL2.render(0.0625F);
            StringL1.render(0.0625F);
            StringL2.render(0.0625F);
            String3.render(0.0625F);
        }

        BambooStep1.render(0.0625F);
        BambooStep3.render(0.0625F);
        BambooStep2.render(0.0625F);
        BambooStep4.render(0.0625F);
        String1.render(0.0625F);
        String2.render(0.0625F);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
