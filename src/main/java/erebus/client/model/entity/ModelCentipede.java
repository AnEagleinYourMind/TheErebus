package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelCentipede extends ModelBase {

    // fields
    ModelRenderer Head1;
    ModelRenderer Head3;
    ModelRenderer BodA1;
    ModelRenderer BodA2;
    ModelRenderer RLA1;
    ModelRenderer RLA2;
    ModelRenderer RLA3;
    ModelRenderer LLA1;
    ModelRenderer LLA2;
    ModelRenderer LLA3;
    ModelRenderer BodB1;
    ModelRenderer BodB2;
    ModelRenderer RLB1;
    ModelRenderer RLB2;
    ModelRenderer RLB3;
    ModelRenderer LLB1;
    ModelRenderer LLB2;
    ModelRenderer LLB3;
    ModelRenderer BodC1;
    ModelRenderer BodC2;
    ModelRenderer RLC1;
    ModelRenderer RLC2;
    ModelRenderer RLC3;
    ModelRenderer LLC1;
    ModelRenderer LLC2;
    ModelRenderer LLC3;
    ModelRenderer BodD1;
    ModelRenderer BodD2;
    ModelRenderer RLD1;
    ModelRenderer RLD2;
    ModelRenderer RLD3;
    ModelRenderer LLD1;
    ModelRenderer LLD2;
    ModelRenderer LLD3;
    ModelRenderer BodE1;
    ModelRenderer BodE2;
    ModelRenderer RLE1;
    ModelRenderer RLE2;
    ModelRenderer RLE3;
    ModelRenderer LLE1;
    ModelRenderer LLE2;
    ModelRenderer LLE3;
    ModelRenderer BodF1;
    ModelRenderer BodF2;
    ModelRenderer RLF1;
    ModelRenderer RLF2;
    ModelRenderer RLF3;
    ModelRenderer LLF1;
    ModelRenderer LLF2;
    ModelRenderer LLF3;
    ModelRenderer RMand1;
    ModelRenderer RMand2;
    ModelRenderer RMand3;
    ModelRenderer LMand1;
    ModelRenderer LMand2;
    ModelRenderer LMand3;
    ModelRenderer RAnt;
    ModelRenderer LAnt;
    ModelRenderer Neck;

    public ModelCentipede() {
        textureWidth = 64;
        textureHeight = 32;

        Head1 = new ModelRenderer(this, 23, 14);
        Head1.addBox(-2.5F, -1.5F, -5F, 5, 3, 5);
        Head1.setRotationPoint(0F, 21F, -3F);
        setRotation(Head1, 0F, 0F, 0F);
        Head3 = new ModelRenderer(this, 26, 9);
        Head3.addBox(-1.5F, -1.5F, -7F, 3, 2, 2);
        Head3.setRotationPoint(0F, 21F, -3F);
        setRotation(Head3, 0F, 0F, 0F);
        BodA1 = new ModelRenderer(this, 0, 7);
        BodA1.addBox(-3F, -0.5F, -3F, 6, 2, 5);
        BodA1.setRotationPoint(0F, 21F, 0F);
        setRotation(BodA1, 0F, 0F, 0F);
        BodA2 = new ModelRenderer(this, 0, 15);
        BodA2.addBox(-2F, -1.5F, -1.5F, 4, 1, 3);
        BodA2.setRotationPoint(0F, 21F, 0F);
        setRotation(BodA2, 0F, 0F, 0F);
        RLA1 = new ModelRenderer(this, 0, 0);
        RLA1.addBox(0F, -1F, -1F, 3, 2, 2);
        RLA1.setRotationPoint(-3F, 21.5F, 0F);
        setRotation(RLA1, 0F, 3.141593F, 0F);
        RLA2 = new ModelRenderer(this, 11, 0);
        RLA2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        RLA2.setRotationPoint(-3F, 21.5F, 0F);
        setRotation(RLA2, 0F, 3.141593F, -0.2617994F);
        RLA3 = new ModelRenderer(this, 11, 4);
        RLA3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        RLA3.setRotationPoint(-3F, 21.5F, 0F);
        setRotation(RLA3, 0F, 3.141593F, -0.5235988F);
        LLA1 = new ModelRenderer(this, 0, 0);
        LLA1.addBox(0F, -1F, -1F, 3, 2, 2);
        LLA1.setRotationPoint(3F, 21.5F, 0F);
        setRotation(LLA1, 0F, 0F, 0F);
        LLA2 = new ModelRenderer(this, 11, 0);
        LLA2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        LLA2.setRotationPoint(3F, 21.5F, 0F);
        setRotation(LLA2, 0F, 0F, 0.2617994F);
        LLA3 = new ModelRenderer(this, 11, 4);
        LLA3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        LLA3.setRotationPoint(3F, 21.5F, 0F);
        setRotation(LLA3, 0F, 0F, 0.5235988F);
        BodB1 = new ModelRenderer(this, 0, 7);
        BodB1.addBox(-3F, -0.5F, -3F, 6, 2, 5);
        BodB1.setRotationPoint(0F, 21F, 5F);
        setRotation(BodB1, 0F, 0F, 0F);
        BodB2 = new ModelRenderer(this, 0, 15);
        BodB2.addBox(-2F, -1.5F, -1.5F, 4, 1, 3);
        BodB2.setRotationPoint(0F, 21F, 5F);
        setRotation(BodB2, 0F, 0F, 0F);
        RLB1 = new ModelRenderer(this, 0, 0);
        RLB1.addBox(0F, -1F, -1F, 3, 2, 2);
        RLB1.setRotationPoint(-3F, 21.5F, 5F);
        setRotation(RLB1, 0F, 3.141593F, 0F);
        RLB2 = new ModelRenderer(this, 11, 0);
        RLB2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        RLB2.setRotationPoint(-3F, 21.5F, 5F);
        setRotation(RLB2, 0F, 3.141593F, -0.2617994F);
        RLB3 = new ModelRenderer(this, 11, 4);
        RLB3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        RLB3.setRotationPoint(-3F, 21.5F, 5F);
        setRotation(RLB3, 0F, 3.141593F, -0.5235988F);
        LLB1 = new ModelRenderer(this, 0, 0);
        LLB1.addBox(0F, -1F, -1F, 3, 2, 2);
        LLB1.setRotationPoint(3F, 21.5F, 5F);
        setRotation(LLB1, 0F, 0F, 0F);
        LLB2 = new ModelRenderer(this, 11, 0);
        LLB2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        LLB2.setRotationPoint(3F, 21.5F, 5F);
        setRotation(LLB2, 0F, 0F, 0.2617994F);
        LLB3 = new ModelRenderer(this, 11, 4);
        LLB3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        LLB3.setRotationPoint(3F, 21.5F, 5F);
        setRotation(LLB3, 0F, 0F, 0.5235988F);
        BodC1 = new ModelRenderer(this, 0, 7);
        BodC1.addBox(-3F, -0.5F, -3F, 6, 2, 5);
        BodC1.setRotationPoint(0F, 21F, 10F);
        setRotation(BodC1, 0F, 0F, 0F);
        BodC2 = new ModelRenderer(this, 0, 15);
        BodC2.addBox(-2F, -1.5F, -1.5F, 4, 1, 3);
        BodC2.setRotationPoint(0F, 21F, 10F);
        setRotation(BodC2, 0F, 0F, 0F);
        RLC1 = new ModelRenderer(this, 0, 0);
        RLC1.addBox(0F, -1F, -1F, 3, 2, 2);
        RLC1.setRotationPoint(-3F, 21.5F, 10F);
        setRotation(RLC1, 0F, 3.141593F, 0F);
        RLC2 = new ModelRenderer(this, 11, 0);
        RLC2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        RLC2.setRotationPoint(-3F, 21.5F, 10F);
        setRotation(RLC2, 0F, 3.141593F, -0.2617994F);
        RLC3 = new ModelRenderer(this, 11, 4);
        RLC3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        RLC3.setRotationPoint(-3F, 21.5F, 10F);
        setRotation(RLC3, 0F, 3.141593F, -0.5235988F);
        LLC1 = new ModelRenderer(this, 0, 0);
        LLC1.addBox(0F, -1F, -1F, 3, 2, 2);
        LLC1.setRotationPoint(3F, 21.5F, 10F);
        setRotation(LLC1, 0F, 0F, 0F);
        LLC2 = new ModelRenderer(this, 11, 0);
        LLC2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        LLC2.setRotationPoint(3F, 21.5F, 10F);
        setRotation(LLC2, 0F, 0F, 0.2617994F);
        LLC3 = new ModelRenderer(this, 11, 4);
        LLC3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        LLC3.setRotationPoint(3F, 21.5F, 10F);
        setRotation(LLC3, 0F, 0F, 0.5235988F);
        BodD1 = new ModelRenderer(this, 0, 7);
        BodD1.addBox(-3F, -0.5F, -3F, 6, 2, 5);
        BodD1.setRotationPoint(0F, 21F, 15F);
        setRotation(BodD1, 0F, 0F, 0F);
        BodD2 = new ModelRenderer(this, 0, 15);
        BodD2.addBox(-2F, -1.5F, -1.5F, 4, 1, 3);
        BodD2.setRotationPoint(0F, 21F, 15F);
        setRotation(BodD2, 0F, 0F, 0F);
        RLD1 = new ModelRenderer(this, 0, 0);
        RLD1.addBox(0F, -1F, -1F, 3, 2, 2);
        RLD1.setRotationPoint(-3F, 21.5F, 15F);
        setRotation(RLD1, 0F, 3.141593F, 0F);
        RLD2 = new ModelRenderer(this, 11, 0);
        RLD2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        RLD2.setRotationPoint(-3F, 21.5F, 15F);
        setRotation(RLD2, 0F, 3.141593F, -0.2617994F);
        RLD3 = new ModelRenderer(this, 11, 4);
        RLD3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        RLD3.setRotationPoint(-3F, 21.5F, 15F);
        setRotation(RLD3, 0F, 3.141593F, -0.5235988F);
        LLD1 = new ModelRenderer(this, 0, 0);
        LLD1.addBox(0F, -1F, -1F, 3, 2, 2);
        LLD1.setRotationPoint(3F, 21.5F, 15F);
        setRotation(LLD1, 0F, 0F, 0F);
        LLD2 = new ModelRenderer(this, 11, 0);
        LLD2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        LLD2.setRotationPoint(3F, 21.5F, 15F);
        setRotation(LLD2, 0F, 0F, 0.2617994F);
        LLD3 = new ModelRenderer(this, 11, 4);
        LLD3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        LLD3.setRotationPoint(3F, 21.5F, 15F);
        setRotation(LLD3, 0F, 0F, 0.5235988F);
        BodE1 = new ModelRenderer(this, 0, 7);
        BodE1.addBox(-3F, -0.5F, -3F, 6, 2, 5);
        BodE1.setRotationPoint(0F, 21F, 20F);
        setRotation(BodE1, 0F, 0F, 0F);
        BodE2 = new ModelRenderer(this, 0, 15);
        BodE2.addBox(-2F, -1.5F, -1.5F, 4, 1, 3);
        BodE2.setRotationPoint(0F, 21F, 20F);
        setRotation(BodE2, 0F, 0F, 0F);
        RLE1 = new ModelRenderer(this, 0, 0);
        RLE1.addBox(0F, -1F, -1F, 3, 2, 2);
        RLE1.setRotationPoint(-3F, 21.5F, 20F);
        setRotation(RLE1, 0F, 3.141593F, 0F);
        RLE2 = new ModelRenderer(this, 11, 0);
        RLE2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        RLE2.setRotationPoint(-3F, 21.5F, 20F);
        setRotation(RLE2, 0F, 3.141593F, -0.2617994F);
        RLE3 = new ModelRenderer(this, 11, 4);
        RLE3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        RLE3.setRotationPoint(-3F, 21.5F, 20F);
        setRotation(RLE3, 0F, 3.141593F, -0.5235988F);
        LLE1 = new ModelRenderer(this, 0, 0);
        LLE1.addBox(0F, -1F, -1F, 3, 2, 2);
        LLE1.setRotationPoint(3F, 21.5F, 20F);
        setRotation(LLE1, 0F, 0F, 0F);
        LLE2 = new ModelRenderer(this, 11, 0);
        LLE2.addBox(2.6F, -1.7F, -0.5F, 3, 2, 1);
        LLE2.setRotationPoint(3F, 21.5F, 20F);
        setRotation(LLE2, 0F, 0F, 0.2617994F);
        LLE3 = new ModelRenderer(this, 11, 4);
        LLE3.addBox(5F, -2.7F, -0.5F, 3, 1, 1);
        LLE3.setRotationPoint(3F, 21.5F, 20F);
        setRotation(LLE3, 0F, 0F, 0.5235988F);
        BodF1 = new ModelRenderer(this, 0, 20);
        BodF1.addBox(-2F, -0.5F, -3F, 4, 2, 5);
        BodF1.setRotationPoint(0F, 21F, 25F);
        setRotation(BodF1, 0F, 0F, 0F);
        BodF2 = new ModelRenderer(this, 0, 28);
        BodF2.addBox(-1.5F, -1.5F, -1.5F, 3, 1, 3);
        BodF2.setRotationPoint(0F, 21F, 25F);
        setRotation(BodF2, 0F, 0F, 0F);
        RLF1 = new ModelRenderer(this, 40, 4);
        RLF1.addBox(0F, -1F, -1F, 3, 2, 2);
        RLF1.setRotationPoint(-1F, 21.5F, 26F);
        setRotation(RLF1, 0F, -1.919862F, 0F);
        RLF2 = new ModelRenderer(this, 51, 5);
        RLF2.addBox(3F, -1F, -0.5F, 3, 2, 1);
        RLF2.setRotationPoint(-1F, 21.5F, 26F);
        setRotation(RLF2, 0.0F, -1.919862F, 0F);
        RLF3 = new ModelRenderer(this, 11, 4);
        RLF3.addBox(6F, -0.5F, -0.5F, 3, 1, 1);
        RLF3.setRotationPoint(-1F, 21.5F, 26F);
        setRotation(RLF3, 0.0F, -1.919862F, 0F);
        LLF1 = new ModelRenderer(this, 40, 4);
        LLF1.addBox(0F, -1F, -1F, 3, 2, 2);
        LLF1.setRotationPoint(1F, 21.5F, 26F);
        setRotation(LLF1, 0F, -1.22173F, 0F);
        LLF2 = new ModelRenderer(this, 51, 5);
        LLF2.addBox(3F, -1F, -0.5F, 3, 2, 1);
        LLF2.setRotationPoint(1F, 21.5F, 26F);
        setRotation(LLF2, 0F, -1.22173F, 0F);
        LLF3 = new ModelRenderer(this, 11, 4);
        LLF3.addBox(6F, -0.5F, -0.5F, 3, 1, 1);
        LLF3.setRotationPoint(1F, 21.5F, 26F);
        setRotation(LLF3, 0F, -1.22173F, 0F);
        RMand1 = new ModelRenderer(this, 56, 0);
        RMand1.addBox(-4.8F, 0.5F, -5.5F, 1, 1, 3);
        RMand1.setRotationPoint(0F, 21F, -3F);
        setRotation(RMand1, 0F, -0.1745329F, 0F);
        RMand2 = new ModelRenderer(this, 49, 0);
        RMand2.addBox(-4.3F, 0.5F, -3.5F, 1, 1, 2);
        RMand2.setRotationPoint(0F, 21F, -3F);
        setRotation(RMand2, 0F, 0F, 0F);
        RMand3 = new ModelRenderer(this, 40, 0);
        RMand3.addBox(-4F, -0.5F, -2.5F, 2, 2, 2);
        RMand3.setRotationPoint(0F, 21F, -3F);
        setRotation(RMand3, 0F, 0.1745329F, 0F);
        LMand1 = new ModelRenderer(this, 56, 0);
        LMand1.addBox(3.8F, 0.5F, -5.5F, 1, 1, 3);
        LMand1.setRotationPoint(0F, 21F, -3F);
        setRotation(LMand1, 0F, 0.1745329F, 0F);
        LMand2 = new ModelRenderer(this, 49, 0);
        LMand2.addBox(3.3F, 0.5F, -3.5F, 1, 1, 2);
        LMand2.setRotationPoint(0F, 21F, -3F);
        setRotation(LMand2, 0F, 0F, 0F);
        LMand3 = new ModelRenderer(this, 40, 0);
        LMand3.addBox(2F, -0.5F, -2.5F, 2, 2, 2);
        LMand3.setRotationPoint(0F, 21F, -3F);
        setRotation(LMand3, 0F, -0.1745329F, 0F);
        RAnt = new ModelRenderer(this, 23, 0);
        RAnt.addBox(-0.2F, -1F, -13.5F, 1, 1, 7);
        RAnt.setRotationPoint(0F, 21F, -3F);
        setRotation(RAnt, 0F, 0.1745329F, 0F);
        LAnt = new ModelRenderer(this, 23, 0);
        LAnt.addBox(-0.7F, -1F, -13.5F, 1, 1, 7);
        LAnt.setRotationPoint(0F, 21F, -3F);
        setRotation(LAnt, 0F, -0.1745329F, 0F);
        Neck = new ModelRenderer(this, 0, 20);
        Neck.addBox(-1.5F, -0.5F, -2F, 3, 2, 5);
        Neck.setRotationPoint(0F, 21F, -3F);
        setRotation(Neck, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        Head1.render(unitPixel);
        Head3.render(unitPixel);
        BodA1.render(unitPixel);
        BodA2.render(unitPixel);
        RLA1.render(unitPixel);
        RLA2.render(unitPixel);
        RLA3.render(unitPixel);
        LLA1.render(unitPixel);
        LLA2.render(unitPixel);
        LLA3.render(unitPixel);
        BodB1.render(unitPixel);
        BodB2.render(unitPixel);
        RLB1.render(unitPixel);
        RLB2.render(unitPixel);
        RLB3.render(unitPixel);
        LLB1.render(unitPixel);
        LLB2.render(unitPixel);
        LLB3.render(unitPixel);
        BodC1.render(unitPixel);
        BodC2.render(unitPixel);
        RLC1.render(unitPixel);
        RLC2.render(unitPixel);
        RLC3.render(unitPixel);
        LLC1.render(unitPixel);
        LLC2.render(unitPixel);
        LLC3.render(unitPixel);
        BodD1.render(unitPixel);
        BodD2.render(unitPixel);
        RLD1.render(unitPixel);
        RLD2.render(unitPixel);
        RLD3.render(unitPixel);
        LLD1.render(unitPixel);
        LLD2.render(unitPixel);
        LLD3.render(unitPixel);
        BodE1.render(unitPixel);
        BodE2.render(unitPixel);
        RLE1.render(unitPixel);
        RLE2.render(unitPixel);
        RLE3.render(unitPixel);
        LLE1.render(unitPixel);
        LLE2.render(unitPixel);
        LLE3.render(unitPixel);
        BodF1.render(unitPixel);
        BodF2.render(unitPixel);
        RLF1.render(unitPixel);
        RLF2.render(unitPixel);
        RLF3.render(unitPixel);
        LLF1.render(unitPixel);
        LLF2.render(unitPixel);
        LLF3.render(unitPixel);
        RMand1.render(unitPixel);
        RMand2.render(unitPixel);
        RMand3.render(unitPixel);
        LMand1.render(unitPixel);
        LMand2.render(unitPixel);
        LMand3.render(unitPixel);
        RAnt.render(unitPixel);
        LAnt.render(unitPixel);
        Neck.render(unitPixel);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entityLiving, float limbSwing, float prevLimbSwing,
        float partialTickTime) {
        float ba = MathHelper.cos(limbSwing * 1.0F) * 1.5F * prevLimbSwing;
        float bb = MathHelper.cos(limbSwing + 1.0F * 1.0F) * 2.25F * prevLimbSwing;
        float bc = MathHelper.cos(limbSwing + 2.0F * 1.0F) * 3.F * prevLimbSwing;
        float bd = MathHelper.cos(limbSwing + 3.0F * 1.0F) * 2.5F * prevLimbSwing;
        float be = MathHelper.cos(limbSwing + 4.0F * 1.0F) * 1.5F * prevLimbSwing;
        float bf = MathHelper.cos(limbSwing + 5.0F * 1.0F) * 0.75F * prevLimbSwing;

        Head1.rotationPointX = bf;
        Head3.rotationPointX = bf;
        RAnt.rotationPointX = bf;
        LAnt.rotationPointX = bf;
        RMand1.rotationPointX = bf;
        RMand2.rotationPointX = bf;
        RMand3.rotationPointX = bf;
        LMand1.rotationPointX = bf;
        LMand2.rotationPointX = bf;
        LMand3.rotationPointX = bf;

        BodA1.rotationPointX = ba;
        BodA2.rotationPointX = ba;

        BodB1.rotationPointX = bb;
        BodB2.rotationPointX = bb;

        BodC1.rotationPointX = bc;
        BodC2.rotationPointX = bc;

        BodD1.rotationPointX = bd;
        BodD2.rotationPointX = bd;

        BodE1.rotationPointX = be;
        BodE2.rotationPointX = be;

        BodF1.rotationPointX = bf;
        BodF2.rotationPointX = bf;

        RLA1.rotationPointX = ba - 3.0F;
        RLA2.rotationPointX = ba - 3.0F;
        RLA3.rotationPointX = ba - 3.0F;
        LLA1.rotationPointX = ba + 3.0F;
        LLA2.rotationPointX = ba + 3.0F;
        LLA3.rotationPointX = ba + 3.0F;

        RLB1.rotationPointX = bb - 3.0F;
        RLB2.rotationPointX = bb - 3.0F;
        RLB3.rotationPointX = bb - 3.0F;
        LLB1.rotationPointX = bb + 3.0F;
        LLB2.rotationPointX = bb + 3.0F;
        LLB3.rotationPointX = bb + 3.0F;

        RLC1.rotationPointX = bc - 3.0F;
        RLC2.rotationPointX = bc - 3.0F;
        RLC3.rotationPointX = bc - 3.0F;
        LLC1.rotationPointX = bc + 3.0F;
        LLC2.rotationPointX = bc + 3.0F;
        LLC3.rotationPointX = bc + 3.0F;

        RLD1.rotationPointX = bd - 3.0F;
        RLD2.rotationPointX = bd - 3.0F;
        RLD3.rotationPointX = bd - 3.0F;
        LLD1.rotationPointX = bd + 3.0F;
        LLD2.rotationPointX = bd + 3.0F;
        LLD3.rotationPointX = bd + 3.0F;

        RLE1.rotationPointX = be - 3.0F;
        RLE2.rotationPointX = be - 3.0F;
        RLE3.rotationPointX = be - 3.0F;
        LLE1.rotationPointX = be + 3.0F;
        LLE2.rotationPointX = be + 3.0F;
        LLE3.rotationPointX = be + 3.0F;

        RLA1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        RLA2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        RLA3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        LLA1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        LLA2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        LLA3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;

        RLA1.rotateAngleZ = MathHelper.cos(limbSwing * 1.0F) * 0.5F * prevLimbSwing;
        RLA2.rotateAngleZ = MathHelper.cos(limbSwing * 1.0F) * 0.5F * prevLimbSwing - 0.2617994F;
        RLA3.rotateAngleZ = MathHelper.cos(limbSwing * 1.0F) * 0.5F * prevLimbSwing - 0.5235988F;
        LLA1.rotateAngleZ = MathHelper.cos(limbSwing * 1.0F) * 0.5F * prevLimbSwing;
        LLA2.rotateAngleZ = MathHelper.cos(limbSwing * 1.0F) * 0.5F * prevLimbSwing + 0.2617994F;
        LLA3.rotateAngleZ = MathHelper.cos(limbSwing * 1.0F) * 0.5F * prevLimbSwing + 0.5235988F;

        RLB1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing + 3.141593F;
        RLB2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing + 3.141593F;
        RLB3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing + 3.141593F;
        LLB1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing;
        LLB2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing;
        LLB3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing;

        RLB1.rotateAngleZ = MathHelper.cos(limbSwing + 0.5F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing;
        RLB2.rotateAngleZ = MathHelper.cos(limbSwing + 0.5F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing
            - 0.2617994F;
        RLB3.rotateAngleZ = MathHelper.cos(limbSwing + 0.5F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing
            - 0.5235988F;
        LLB1.rotateAngleZ = MathHelper.cos(limbSwing + 0.5F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing;
        LLB2.rotateAngleZ = MathHelper.cos(limbSwing + 0.5F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing
            + 0.2617994F;
        LLB3.rotateAngleZ = MathHelper.cos(limbSwing + 0.5F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing
            + 0.5235988F;

        RLC1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        RLC2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        RLC3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        LLC1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        LLC2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        LLC3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;

        RLC1.rotateAngleZ = MathHelper.cos(limbSwing + 1.0F * 1.0F) * 0.5F * prevLimbSwing;
        RLC2.rotateAngleZ = MathHelper.cos(limbSwing + 1.0F * 1.0F) * 0.5F * prevLimbSwing - 0.2617994F;
        RLC3.rotateAngleZ = MathHelper.cos(limbSwing + 1.0F * 1.0F) * 0.5F * prevLimbSwing - 0.5235988F;
        LLC1.rotateAngleZ = MathHelper.cos(limbSwing + 1.0F * 1.0F) * 0.5F * prevLimbSwing;
        LLC2.rotateAngleZ = MathHelper.cos(limbSwing + 1.0F * 1.0F) * 0.5F * prevLimbSwing + 0.2617994F;
        LLC3.rotateAngleZ = MathHelper.cos(limbSwing + 1.0F * 1.0F) * 0.5F * prevLimbSwing + 0.5235988F;

        RLD1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing + 3.141593F;
        RLD2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing + 3.141593F;
        RLD3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing + 3.141593F;
        LLD1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing;
        LLD2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing;
        LLD3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F + (float) Math.PI) * 0.3F * prevLimbSwing;

        RLD1.rotateAngleZ = MathHelper.cos(limbSwing + 2.0F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing;
        RLD2.rotateAngleZ = MathHelper.cos(limbSwing + 2.0F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing
            - 0.2617994F;
        RLD3.rotateAngleZ = MathHelper.cos(limbSwing + 2.0F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing
            - 0.5235988F;
        LLD1.rotateAngleZ = MathHelper.cos(limbSwing + 2.0F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing;
        LLD2.rotateAngleZ = MathHelper.cos(limbSwing + 2.0F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing
            + 0.2617994F;
        LLD3.rotateAngleZ = MathHelper.cos(limbSwing + 2.0F * 1.0F + (float) Math.PI) * 0.5F * prevLimbSwing
            + 0.5235988F;

        RLE1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        RLE2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        RLE3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing + 3.141593F;
        LLE1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        LLE2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;
        LLE3.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 0.3F * prevLimbSwing;

        RLE1.rotateAngleZ = MathHelper.cos(limbSwing + 3.0F * 1.0F) * 0.5F * prevLimbSwing;
        RLE2.rotateAngleZ = MathHelper.cos(limbSwing + 3.0F * 1.0F) * 0.5F * prevLimbSwing - 0.2617994F;
        RLE3.rotateAngleZ = MathHelper.cos(limbSwing + 3.0F * 1.0F) * 0.5F * prevLimbSwing - 0.5235988F;
        LLE1.rotateAngleZ = MathHelper.cos(limbSwing + 3.0F * 1.0F) * 0.5F * prevLimbSwing;
        LLE2.rotateAngleZ = MathHelper.cos(limbSwing + 3.0F * 1.0F) * 0.5F * prevLimbSwing + 0.2617994F;
        LLE3.rotateAngleZ = MathHelper.cos(limbSwing + 3.0F * 1.0F) * 0.5F * prevLimbSwing + 0.5235988F;
    }

    @Override
    public void setRotationAngles(float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel, Entity entity) {
        Head1.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        Head3.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        RAnt.rotateAngleY = rotationYaw / (180F / (float) Math.PI) + 0.175F;
        LAnt.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 0.175F;
        RMand1.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 0.175F;
        RMand2.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        RMand3.rotateAngleY = rotationYaw / (180F / (float) Math.PI) + 0.175F;
        LMand1.rotateAngleY = rotationYaw / (180F / (float) Math.PI) + 0.175F;
        LMand2.rotateAngleY = rotationYaw / (180F / (float) Math.PI);
        LMand3.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 0.175F;

        Head1.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        Head3.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        RAnt.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        LAnt.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        RMand1.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        RMand2.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        RMand3.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        LMand1.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        LMand2.rotateAngleX = rotationPitch / (180F / (float) Math.PI);
        LMand3.rotateAngleX = rotationPitch / (180F / (float) Math.PI);

        RLF1.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 1.919862F;
        RLF2.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 1.919862F;
        RLF3.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 1.919862F;
        LLF1.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 1.22173F;
        LLF2.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 1.22173F;
        LLF3.rotateAngleY = rotationYaw / (180F / (float) Math.PI) - 1.22173F;
    }
}
