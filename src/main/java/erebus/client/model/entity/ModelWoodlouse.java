package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelWoodlouse extends ModelBase {

    ModelRenderer AntBaseR;
    ModelRenderer AntBaseL;
    ModelRenderer AntR1;
    ModelRenderer AntR2;
    ModelRenderer AntL1;
    ModelRenderer AntL2;
    ModelRenderer HL1;
    ModelRenderer HR2;
    ModelRenderer HR1;
    ModelRenderer HL2;
    ModelRenderer HM1;
    ModelRenderer HM2;
    ModelRenderer ThxR2;
    ModelRenderer ThxL2;
    ModelRenderer ThxR3;
    ModelRenderer ThxL3;
    ModelRenderer ThxR4;
    ModelRenderer ThxL4;
    ModelRenderer ThxR5;
    ModelRenderer ThxL5;
    ModelRenderer ThxR6;
    ModelRenderer ThxL6;
    ModelRenderer ThxR7;
    ModelRenderer ThxL7;
    ModelRenderer ThxR8;
    ModelRenderer ThxL8;
    ModelRenderer ThxR9;
    ModelRenderer ThxL9;
    ModelRenderer ThxR10;
    ModelRenderer ThxL10;
    ModelRenderer Thx11;
    ModelRenderer Thx12;
    ModelRenderer RLA1;
    ModelRenderer RLA2;
    ModelRenderer RLA3;
    ModelRenderer RLB1;
    ModelRenderer RLB2;
    ModelRenderer RLB3;
    ModelRenderer RLC1;
    ModelRenderer RLC2;
    ModelRenderer RLC3;
    ModelRenderer RLD1;
    ModelRenderer RLD2;
    ModelRenderer RLD3;
    ModelRenderer RLE1;
    ModelRenderer RLE2;
    ModelRenderer RLE3;
    ModelRenderer RLF1;
    ModelRenderer RLF2;
    ModelRenderer RLF3;
    ModelRenderer RLG1;
    ModelRenderer RLG2;
    ModelRenderer RLG3;
    ModelRenderer LLA1;
    ModelRenderer LLA2;
    ModelRenderer LLA3;
    ModelRenderer LLB1;
    ModelRenderer LLB2;
    ModelRenderer LLB3;
    ModelRenderer LLC1;
    ModelRenderer LLC2;
    ModelRenderer LLC3;
    ModelRenderer LLD1;
    ModelRenderer LLD2;
    ModelRenderer LLD3;
    ModelRenderer LLE1;
    ModelRenderer LLE2;
    ModelRenderer LLE3;
    ModelRenderer LLF1;
    ModelRenderer LLF2;
    ModelRenderer LLF3;
    ModelRenderer LLG1;
    ModelRenderer LLG2;
    ModelRenderer LLG3;

    public ModelWoodlouse() {
        textureWidth = 128;
        textureHeight = 128;

        AntBaseR = new ModelRenderer(this, 117, 0);
        AntBaseR.addBox(-1.5F, -0.5F, -2F, 2, 2, 3);
        AntBaseR.setRotationPoint(-2F, 19.5F, -19F);
        setRotation(AntBaseR, 0F, 0F, 0F);
        AntBaseL = new ModelRenderer(this, 105, 0);
        AntBaseL.addBox(-0.5F, -0.5F, -2F, 2, 2, 3);
        AntBaseL.setRotationPoint(2F, 19.5F, -19F);
        setRotation(AntBaseL, 0F, 0F, 0F);
        AntR1 = new ModelRenderer(this, 82, 33);
        AntR1.addBox(-0.5F, -0.5F, -0.5F, 6, 1, 1);
        AntR1.setRotationPoint(-3F, 20F, -21.33333F);
        setRotation(AntR1, 0F, 3.141593F, 0F);
        AntR2 = new ModelRenderer(this, 80, 30);
        AntR2.addBox(-0.5F, -0.5F, -0.5F, 8, 1, 1);
        AntR2.setRotationPoint(-9F, 20F, -22F);
        setRotation(AntR2, 0F, 20.94395F, 0F);
        AntL1 = new ModelRenderer(this, 82, 33);
        AntL1.addBox(-0.5F, -0.5F, -0.5F, 6, 1, 1);
        AntL1.setRotationPoint(3F, 20F, -21.33333F);
        setRotation(AntL1, 0F, 0F, 0F);
        AntL2 = new ModelRenderer(this, 80, 30);
        AntL2.addBox(-0.5F, -0.5F, -0.5F, 8, 1, 1);
        AntL2.setRotationPoint(9F, 20F, -22F);
        setRotation(AntL2, 0F, 1.047198F, 0F);
        HL1 = new ModelRenderer(this, 73, 18);
        HL1.addBox(-9.4F, -3.5F, 0F, 10, 8, 3);
        HL1.setRotationPoint(0F, 16F, -10.5F);
        setRotation(HL1, -0.1745329F, 3.141593F, -0.1745329F);
        HR2 = new ModelRenderer(this, 98, 8);
        HR2.addBox(-0.4F, -2F, 0F, 8, 7, 2);
        HR2.setRotationPoint(0F, 16F, -13.5F);
        setRotation(HR2, -0.1745329F, -3.141593F, 0.1745329F);
        HR1 = new ModelRenderer(this, 100, 18);
        HR1.addBox(-0.6F, -3.5F, 0F, 10, 8, 3);
        HR1.setRotationPoint(0F, 16F, -10.5F);
        setRotation(HR1, -0.1745329F, -3.141593F, 0.1745329F);
        HL2 = new ModelRenderer(this, 75, 8);
        HL2.addBox(-7.6F, -2F, 0F, 8, 7, 2);
        HL2.setRotationPoint(0F, 16F, -13.5F);
        setRotation(HL2, -0.1745329F, 3.141593F, -0.1745329F);
        HM1 = new ModelRenderer(this, 74, 0);
        HM1.addBox(-6.5F, 0F, 0F, 13, 5, 2);
        HM1.setRotationPoint(0F, 16F, -15.5F);
        setRotation(HM1, -0.1745329F, 3.141593F, 0F);
        HM2 = new ModelRenderer(this, 100, 31);
        HM2.addBox(-4.5F, 2F, 0F, 9, 3, 2);
        HM2.setRotationPoint(0F, 16F, -17.5F);
        setRotation(HM2, -0.1745329F, 3.141593F, 0F);
        ThxR2 = new ModelRenderer(this, 40, 0);
        ThxR2.addBox(-10.1F, -5F, 0F, 11, 9, 5);
        ThxR2.setRotationPoint(0F, 16F, -11F);
        setRotation(ThxR2, 0F, 0F, -0.1745329F);
        ThxL2 = new ModelRenderer(this, 0, 0);
        ThxL2.addBox(-0.9F, -5F, 0F, 11, 9, 5);
        ThxL2.setRotationPoint(0F, 16F, -11F);
        setRotation(ThxL2, 0F, 0F, 0.1745329F);
        ThxR3 = new ModelRenderer(this, 40, 15);
        ThxR3.addBox(-11F, -5.5F, 0F, 12, 10, 4);
        ThxR3.setRotationPoint(0F, 16F, -6F);
        setRotation(ThxR3, 0F, 0F, -0.1745329F);
        ThxL3 = new ModelRenderer(this, 0, 15);
        ThxL3.addBox(-1F, -5.5F, -6F, 12, 10, 4);
        ThxL3.setRotationPoint(0F, 16F, 0F);
        setRotation(ThxL3, 0F, 0F, 0.1745329F);
        ThxR4 = new ModelRenderer(this, 44, 30);
        ThxR4.addBox(-11.9F, -6F, 0F, 13, 10, 5);
        ThxR4.setRotationPoint(0F, 16F, -2F);
        setRotation(ThxR4, 0F, 0F, -0.1745329F);
        ThxL4 = new ModelRenderer(this, 0, 30);
        ThxL4.addBox(-1.1F, -6F, 0F, 13, 10, 5);
        ThxL4.setRotationPoint(0F, 16F, -2F);
        setRotation(ThxL4, 0F, 0F, 0.1745329F);
        ThxR5 = new ModelRenderer(this, 44, 46);
        ThxR5.addBox(-11.8F, -6.5F, 0F, 13, 10, 5);
        ThxR5.setRotationPoint(0F, 16F, 3F);
        setRotation(ThxR5, 0F, 0F, -0.1745329F);
        ThxL5 = new ModelRenderer(this, 0, 46);
        ThxL5.addBox(-1.2F, -6.5F, 0F, 13, 10, 5);
        ThxL5.setRotationPoint(0F, 16F, 3F);
        setRotation(ThxL5, 0F, 0F, 0.1745329F);
        ThxR6 = new ModelRenderer(this, 44, 62);
        ThxR6.addBox(-11.9F, -6F, 0F, 13, 10, 6);
        ThxR6.setRotationPoint(0F, 16F, 8F);
        setRotation(ThxR6, 0F, 0F, -0.1745329F);
        ThxL6 = new ModelRenderer(this, 0, 62);
        ThxL6.addBox(-1.1F, -6F, 0F, 13, 10, 6);
        ThxL6.setRotationPoint(0F, 16F, 8F);
        setRotation(ThxL6, 0F, 0F, 0.1745329F);
        ThxR7 = new ModelRenderer(this, 44, 80);
        ThxR7.addBox(-11F, -5.5F, 0F, 12, 9, 5);
        ThxR7.setRotationPoint(0F, 16F, 14F);
        setRotation(ThxR7, 0F, 0F, -0.1745329F);
        ThxL7 = new ModelRenderer(this, 0, 80);
        ThxL7.addBox(-1F, -5.5F, 0F, 12, 9, 5);
        ThxL7.setRotationPoint(0F, 16F, 14F);
        setRotation(ThxL7, 0F, 0F, 0.1745329F);
        ThxR8 = new ModelRenderer(this, 44, 95);
        ThxR8.addBox(-10.1F, -5F, 0F, 11, 9, 5);
        ThxR8.setRotationPoint(0F, 16F, 19F);
        setRotation(ThxR8, 0F, 0F, -0.1745329F);
        ThxL8 = new ModelRenderer(this, 0, 95);
        ThxL8.addBox(-0.9F, -5F, 0F, 11, 9, 5);
        ThxL8.setRotationPoint(0F, 16F, 19F);
        setRotation(ThxL8, 0F, 0F, 0.1745329F);
        ThxR9 = new ModelRenderer(this, 73, 18);
        ThxR9.addBox(-9.4F, -3.5F, 0F, 10, 8, 3);
        ThxR9.setRotationPoint(0F, 16F, 23.5F);
        setRotation(ThxR9, -0.1745329F, 0F, -0.1745329F);
        ThxL9 = new ModelRenderer(this, 100, 18);
        ThxL9.addBox(-0.6F, -3.5F, 0F, 10, 8, 3);
        ThxL9.setRotationPoint(0F, 16F, 23.5F);
        setRotation(ThxL9, -0.1745329F, 0F, 0.1745329F);
        ThxR10 = new ModelRenderer(this, 75, 8);
        ThxR10.addBox(-7.6F, -2F, 0F, 8, 7, 2);
        ThxR10.setRotationPoint(0F, 16F, 26.5F);
        setRotation(ThxR10, -0.1745329F, 0F, -0.1745329F);
        ThxL10 = new ModelRenderer(this, 98, 8);
        ThxL10.addBox(-0.4F, -2F, 0F, 8, 7, 2);
        ThxL10.setRotationPoint(0F, 16F, 26.5F);
        setRotation(ThxL10, -0.1745329F, 0F, 0.1745329F);
        Thx11 = new ModelRenderer(this, 74, 0);
        Thx11.addBox(-6.5F, 0F, 0F, 13, 5, 2);
        Thx11.setRotationPoint(0F, 16F, 28.5F);
        setRotation(Thx11, -0.1745329F, 0F, 0F);
        Thx12 = new ModelRenderer(this, 29, 114);
        Thx12.addBox(-4.5F, 2F, 0F, 9, 3, 2);
        Thx12.setRotationPoint(0F, 16F, 30.5F);
        setRotation(Thx12, -0.1745329F, 0F, 0F);

        float correction = 0.1745329F;
        float correction2 = 0.2268928F + correction;
        RLA1 = new ModelRenderer(this, 82, 40);
        RLA1.addBox(-1F, -1F, -0.5F, 5, 2, 2);
        RLA1.setRotationPoint(-8F, 20F, -8F);
        setRotation(RLA1, 0F, 2.617994F, -0.8726646F + correction);
        RLA2 = new ModelRenderer(this, 82, 50);
        RLA2.addBox(2.5F, 0.7F, 0F, 5, 2, 1);
        RLA2.setRotationPoint(-8F, 20F, -8F);
        setRotation(RLA2, 0F, 2.617994F, 0.2268928F - correction2);
        RLA3 = new ModelRenderer(this, 84, 58);
        RLA3.addBox(7F, 3F, 0F, 3, 1, 1);
        RLA3.setRotationPoint(-8F, 20F, -8F);
        setRotation(RLA3, 0F, 2.617994F, 0.0174533F);
        RLB1 = new ModelRenderer(this, 82, 40);
        RLB1.addBox(-1F, -1F, -1F, 5, 2, 2);
        RLB1.setRotationPoint(-8F, 20F, -3.5F);
        setRotation(RLB1, 0F, 2.879793F, -0.6981317F + correction);
        RLB2 = new ModelRenderer(this, 82, 50);
        RLB2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        RLB2.setRotationPoint(-8F, 20F, -3.5F);
        setRotation(RLB2, 0F, 2.879793F, 0.1745329F - correction2);
        RLB3 = new ModelRenderer(this, 84, 58);
        RLB3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        RLB3.setRotationPoint(-8F, 20F, -3.5F);
        setRotation(RLB3, 0F, 2.879793F, 0F);
        RLC1 = new ModelRenderer(this, 82, 40);
        RLC1.addBox(-1F, -1F, -1F, 5, 2, 2);
        RLC1.setRotationPoint(-9F, 20F, 0.5F);
        setRotation(RLC1, 0F, 3.010693F, -0.6981317F + correction);
        RLC2 = new ModelRenderer(this, 82, 50);
        RLC2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        RLC2.setRotationPoint(-9F, 20F, 0.5F);
        setRotation(RLC2, 0F, 3.010693F, 0.1745329F - correction2);
        RLC3 = new ModelRenderer(this, 84, 58);
        RLC3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        RLC3.setRotationPoint(-9F, 20F, 0.5F);
        setRotation(RLC3, 0F, 3.010693F, 0F);
        RLD1 = new ModelRenderer(this, 82, 40);
        RLD1.addBox(-1F, -1F, -1F, 5, 2, 2);
        RLD1.setRotationPoint(-10F, 20F, 5.5F);
        setRotation(RLD1, 0F, -3.141593F, -0.6981317F + correction);
        RLD2 = new ModelRenderer(this, 82, 50);
        RLD2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        RLD2.setRotationPoint(-10F, 20F, 5.5F);
        setRotation(RLD2, 0F, -3.141593F, 0.1745329F - correction2);
        RLD3 = new ModelRenderer(this, 84, 58);
        RLD3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        RLD3.setRotationPoint(-10F, 20F, 5.5F);
        setRotation(RLD3, 0F, -3.141593F, 0F);
        RLE1 = new ModelRenderer(this, 82, 40);
        RLE1.addBox(-1F, -1F, -1F, 5, 2, 2);
        RLE1.setRotationPoint(-9F, 20F, 11F);
        setRotation(RLE1, 0F, -3.010693F, -0.6981317F + correction);
        RLE2 = new ModelRenderer(this, 82, 50);
        RLE2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        RLE2.setRotationPoint(-9F, 20F, 11F);
        setRotation(RLE2, 0F, -3.010693F, 0.1745329F - correction2);
        RLE3 = new ModelRenderer(this, 84, 58);
        RLE3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        RLE3.setRotationPoint(-9F, 20F, 11F);
        setRotation(RLE3, 0F, -3.010693F, 0F);
        RLF1 = new ModelRenderer(this, 82, 40);
        RLF1.addBox(-1F, -1F, -1F, 5, 2, 2);
        RLF1.setRotationPoint(-8F, 20F, 16.5F);
        setRotation(RLF1, 0F, -2.879793F, -0.6981317F + correction);
        RLF2 = new ModelRenderer(this, 82, 50);
        RLF2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        RLF2.setRotationPoint(-8F, 20F, 16.5F);
        setRotation(RLF2, 0F, -2.879793F, 0.1745329F - correction2);
        RLF3 = new ModelRenderer(this, 84, 58);
        RLF3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        RLF3.setRotationPoint(-8F, 20F, 16.5F);
        setRotation(RLF3, 0F, -2.879793F, 0F);
        RLG1 = new ModelRenderer(this, 82, 40);
        RLG1.addBox(-2F, -1F, -1F, 5, 2, 2);
        RLG1.setRotationPoint(-8F, 20F, 21.5F);
        setRotation(RLG1, 0F, -2.617994F, -0.8726646F + correction);
        RLG2 = new ModelRenderer(this, 82, 50);
        RLG2.addBox(1.5F, 0.7F, -0.5F, 5, 2, 1);
        RLG2.setRotationPoint(-8F, 20F, 21.5F);
        setRotation(RLG2, 0F, -2.617994F, 0.2268928F - correction2);
        RLG3 = new ModelRenderer(this, 84, 58);
        RLG3.addBox(6F, 3F, -0.5F, 3, 1, 1);
        RLG3.setRotationPoint(-8F, 20F, 21.5F);
        setRotation(RLG3, 0F, -2.617994F, 0.0174533F);
        LLA1 = new ModelRenderer(this, 82, 40);
        LLA1.addBox(-1F, -1F, -0.5F, 5, 2, 2);
        LLA1.setRotationPoint(8F, 20F, -9F);
        setRotation(LLA1, 0F, 0.5235988F, 0.8726646F);
        LLA2 = new ModelRenderer(this, 82, 50);
        LLA2.addBox(2.5F, 0.7F, 0F, 5, 2, 1);
        LLA2.setRotationPoint(8F, 20F, -9F);
        setRotation(LLA2, 0F, 0.5235988F, 0.2268928F);
        LLA3 = new ModelRenderer(this, 84, 58);
        LLA3.addBox(7F, 3F, 0F, 3, 1, 1);
        LLA3.setRotationPoint(8F, 20F, -9F);
        setRotation(LLA3, 0F, 0.5235988F, 0.0174533F);
        LLB1 = new ModelRenderer(this, 82, 40);
        LLB1.addBox(-1F, -1F, -1F, 5, 2, 2);
        LLB1.setRotationPoint(8F, 20F, -3.5F);
        setRotation(LLB1, 0F, 0.2617994F, 0.6981317F);
        LLB2 = new ModelRenderer(this, 82, 50);
        LLB2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        LLB2.setRotationPoint(8F, 20F, -3.5F);
        setRotation(LLB2, 0F, 0.2617994F, 0.1745329F);
        LLB3 = new ModelRenderer(this, 84, 58);
        LLB3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        LLB3.setRotationPoint(8F, 20F, -3.5F);
        setRotation(LLB3, 0F, 0.2617994F, 0F);
        LLC1 = new ModelRenderer(this, 82, 40);
        LLC1.addBox(-1F, -1F, -1F, 5, 2, 2);
        LLC1.setRotationPoint(9F, 20F, 0.5F);
        setRotation(LLC1, 0F, 0.1308997F, 0.6981317F);
        LLC2 = new ModelRenderer(this, 82, 50);
        LLC2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        LLC2.setRotationPoint(9F, 20F, 0.5F);
        setRotation(LLC2, 0F, 0.1308997F, 0.1745329F);
        LLC3 = new ModelRenderer(this, 84, 58);
        LLC3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        LLC3.setRotationPoint(9F, 20F, 0.5F);
        setRotation(LLC3, 0F, 0.1308997F, 0F);
        LLD1 = new ModelRenderer(this, 82, 40);
        LLD1.addBox(-1F, -1F, -1F, 5, 2, 2);
        LLD1.setRotationPoint(10F, 20F, 5.5F);
        setRotation(LLD1, 0F, 0F, 0.6981317F);
        LLD2 = new ModelRenderer(this, 82, 50);
        LLD2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        LLD2.setRotationPoint(10F, 20F, 5.5F);
        setRotation(LLD2, 0F, 0F, 0.1745329F);
        LLD3 = new ModelRenderer(this, 84, 58);
        LLD3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        LLD3.setRotationPoint(10F, 20F, 5.5F);
        setRotation(LLD3, 0F, 0F, 0F);
        LLE1 = new ModelRenderer(this, 82, 40);
        LLE1.addBox(-1F, -1F, -1F, 5, 2, 2);
        LLE1.setRotationPoint(9F, 20F, 11F);
        setRotation(LLE1, 0F, -0.1308997F, 0.6981317F);
        LLE2 = new ModelRenderer(this, 82, 50);
        LLE2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        LLE2.setRotationPoint(9F, 20F, 11F);
        setRotation(LLE2, 0F, -0.1308997F, 0.1745329F);
        LLE3 = new ModelRenderer(this, 84, 58);
        LLE3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        LLE3.setRotationPoint(9F, 20F, 11F);
        setRotation(LLE3, 0F, -0.1308997F, 0F);
        LLF1 = new ModelRenderer(this, 82, 40);
        LLF1.addBox(-1F, -1F, -1F, 5, 2, 2);
        LLF1.setRotationPoint(8F, 20F, 16.5F);
        setRotation(LLF1, 0F, -0.2617994F, 0.6981317F);
        LLF2 = new ModelRenderer(this, 82, 50);
        LLF2.addBox(2.5F, 0.7F, -0.5F, 5, 2, 1);
        LLF2.setRotationPoint(8F, 20F, 16.5F);
        setRotation(LLF2, 0F, -0.2617994F, 0.1745329F);
        LLF3 = new ModelRenderer(this, 84, 58);
        LLF3.addBox(7F, 3F, -0.5F, 3, 1, 1);
        LLF3.setRotationPoint(8F, 20F, 16.5F);
        setRotation(LLF3, 0F, -0.2617994F, 0F);
        LLG1 = new ModelRenderer(this, 82, 40);
        LLG1.addBox(-2F, -1F, -1F, 5, 2, 2);
        LLG1.setRotationPoint(8F, 20F, 21.5F);
        setRotation(LLG1, 0F, -0.5235988F, 0.8726646F);
        LLG2 = new ModelRenderer(this, 82, 50);
        LLG2.addBox(1.5F, 0.7F, -0.5F, 5, 2, 1);
        LLG2.setRotationPoint(8F, 20F, 21.5F);
        setRotation(LLG2, 0F, -0.5235988F, 0.2268928F);
        LLG3 = new ModelRenderer(this, 84, 58);
        LLG3.addBox(6F, 3F, -0.5F, 3, 1, 1);
        LLG3.setRotationPoint(8F, 20F, 21.5F);
        setRotation(LLG3, 0F, -0.5235988F, 0.0174533F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw,
        float rotationPitch, float unitPixel) {
        super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
        setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
        AntBaseR.render(unitPixel);
        AntBaseL.render(unitPixel);
        AntR1.render(unitPixel);
        AntR2.render(unitPixel);
        AntL1.render(unitPixel);
        AntL2.render(unitPixel);
        HL1.render(unitPixel);
        HR2.render(unitPixel);
        HR1.render(unitPixel);
        HL2.render(unitPixel);
        HM1.render(unitPixel);
        HM2.render(unitPixel);
        ThxR2.render(unitPixel);
        ThxL2.render(unitPixel);
        ThxR3.render(unitPixel);
        ThxL3.render(unitPixel);
        ThxR4.render(unitPixel);
        ThxL4.render(unitPixel);
        ThxR5.render(unitPixel);
        ThxL5.render(unitPixel);
        ThxR6.render(unitPixel);
        ThxL6.render(unitPixel);
        ThxR7.render(unitPixel);
        ThxL7.render(unitPixel);
        ThxR8.render(unitPixel);
        ThxL8.render(unitPixel);
        ThxR9.render(unitPixel);
        ThxL9.render(unitPixel);
        ThxR10.render(unitPixel);
        ThxL10.render(unitPixel);
        Thx11.render(unitPixel);
        Thx12.render(unitPixel);
        RLA1.render(unitPixel);
        RLA2.render(unitPixel);
        RLA3.render(unitPixel);
        RLB1.render(unitPixel);
        RLB2.render(unitPixel);
        RLB3.render(unitPixel);
        RLC1.render(unitPixel);
        RLC2.render(unitPixel);
        RLC3.render(unitPixel);
        RLD1.render(unitPixel);
        RLD2.render(unitPixel);
        RLD3.render(unitPixel);
        RLE1.render(unitPixel);
        RLE2.render(unitPixel);
        RLE3.render(unitPixel);
        RLF1.render(unitPixel);
        RLF2.render(unitPixel);
        RLF3.render(unitPixel);
        RLG1.render(unitPixel);
        RLG2.render(unitPixel);
        RLG3.render(unitPixel);
        LLA1.render(unitPixel);
        LLA2.render(unitPixel);
        LLA3.render(unitPixel);
        LLB1.render(unitPixel);
        LLB2.render(unitPixel);
        LLB3.render(unitPixel);
        LLC1.render(unitPixel);
        LLC2.render(unitPixel);
        LLC3.render(unitPixel);
        LLD1.render(unitPixel);
        LLD2.render(unitPixel);
        LLD3.render(unitPixel);
        LLE1.render(unitPixel);
        LLE2.render(unitPixel);
        LLE3.render(unitPixel);
        LLF1.render(unitPixel);
        LLF2.render(unitPixel);
        LLF3.render(unitPixel);
        LLG1.render(unitPixel);
        LLG2.render(unitPixel);
        LLG3.render(unitPixel);
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
        float legMovement = MathHelper.cos(limbSwing * 2.5F) * 0.9F * prevLimbSwing;
        RLA1.rotateAngleX = -legMovement;
        RLA2.rotateAngleX = -legMovement;
        RLA3.rotateAngleX = -legMovement;
        RLB1.rotateAngleX = legMovement;
        RLB2.rotateAngleX = legMovement;
        RLB3.rotateAngleX = legMovement;
        RLC1.rotateAngleX = -legMovement;
        RLC2.rotateAngleX = -legMovement;
        RLC3.rotateAngleX = -legMovement;
        RLD1.rotateAngleX = legMovement;
        RLD2.rotateAngleX = legMovement;
        RLD3.rotateAngleX = legMovement;
        RLE1.rotateAngleX = -legMovement;
        RLE2.rotateAngleX = -legMovement;
        RLE3.rotateAngleX = -legMovement;
        RLF1.rotateAngleX = legMovement;
        RLF2.rotateAngleX = legMovement;
        RLF3.rotateAngleX = legMovement;
        RLG1.rotateAngleX = -legMovement;
        RLG2.rotateAngleX = -legMovement;
        RLG3.rotateAngleX = -legMovement;
        LLA1.rotateAngleX = -legMovement;
        LLA2.rotateAngleX = -legMovement;
        LLA3.rotateAngleX = -legMovement;
        LLB1.rotateAngleX = legMovement;
        LLB2.rotateAngleX = legMovement;
        LLB3.rotateAngleX = legMovement;
        LLC1.rotateAngleX = -legMovement;
        LLC2.rotateAngleX = -legMovement;
        LLC3.rotateAngleX = -legMovement;
        LLD1.rotateAngleX = legMovement;
        LLD2.rotateAngleX = legMovement;
        LLD3.rotateAngleX = legMovement;
        LLE1.rotateAngleX = -legMovement;
        LLE2.rotateAngleX = -legMovement;
        LLE3.rotateAngleX = -legMovement;
        LLF1.rotateAngleX = legMovement;
        LLF2.rotateAngleX = legMovement;
        LLF3.rotateAngleX = legMovement;
        LLG1.rotateAngleX = -legMovement;
        LLG2.rotateAngleX = -legMovement;
        LLG3.rotateAngleX = -legMovement;
    }

}
