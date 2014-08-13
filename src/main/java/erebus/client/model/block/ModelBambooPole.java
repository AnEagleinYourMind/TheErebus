package erebus.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelBambooPole extends ModelBase
{

	ModelRenderer A;
	ModelRenderer B;
	ModelRenderer C;
	ModelRenderer D;
	ModelRenderer E;
	ModelRenderer F;
	ModelRenderer G;
	ModelRenderer H;
	ModelRenderer I;
	ModelRenderer J;
	ModelRenderer K;
	ModelRenderer L;
	ModelRenderer M;
	ModelRenderer N;
	ModelRenderer O;
	ModelRenderer P;
	ModelRenderer Q;
	ModelRenderer R;
	ModelRenderer S;
	ModelRenderer T;
	ModelRenderer U;
	ModelRenderer V;
	ModelRenderer W;
	ModelRenderer X;
	ModelRenderer Y;
	ModelRenderer Z;
	ModelRenderer XX;
	ModelRenderer YY;

	public ModelBambooPole()
	{
		textureWidth = 128;
		textureHeight = 64;

		A = new ModelRenderer(this, 0, 8);
		A.addBox(-2F, -1F, -8F, 4, 4, 16);
		A.setRotationPoint(-5F, 20F, 0F);
		setRotation(A, 0F, 0F, 0F);
		B = new ModelRenderer(this, 0, 8);
		B.addBox(-2F, 0F, -8F, 4, 4, 16);
		B.setRotationPoint(5F, 19F, 0F);
		setRotation(B, 0F, 0F, 0F);
		C = new ModelRenderer(this, 0, 0);
		C.addBox(-8F, 0F, -2F, 16, 4, 4);
		C.setRotationPoint(0F, 19F, 5F);
		setRotation(C, 0F, 0F, 0F);
		D = new ModelRenderer(this, 0, 0);
		D.addBox(-8F, 0F, -2F, 16, 4, 4);
		D.setRotationPoint(0F, 19F, -5F);
		setRotation(D, 0F, 0F, 0F);
		E = new ModelRenderer(this, 0, 28);
		E.addBox(-2F, 0F, -2F, 4, 16, 4);
		E.setRotationPoint(-5F, -24F, -5F);
		setRotation(E, 0F, 0F, 0F);
		F = new ModelRenderer(this, 0, 28);
		F.addBox(-2F, 0F, -2F, 4, 16, 4);
		F.setRotationPoint(5F, -24F, -5F);
		setRotation(F, 0F, 0F, 0F);
		G = new ModelRenderer(this, 0, 28);
		G.addBox(-2F, 0F, -2F, 4, 16, 4);
		G.setRotationPoint(5F, -24F, 5F);
		setRotation(G, 0F, 0F, 0F);
		H = new ModelRenderer(this, 0, 28);
		H.addBox(-2F, 0F, -2F, 4, 16, 4);
		H.setRotationPoint(-5F, -24F, 5F);
		setRotation(H, 0F, 0F, 0F);
		I = new ModelRenderer(this, 0, 8);
		I.addBox(-2F, -2F, 0F, 4, 4, 16);
		I.setRotationPoint(5F, -21F, -8F);
		setRotation(I, 0F, 0F, 0F);
		J = new ModelRenderer(this, 0, 8);
		J.addBox(-2F, -2F, 0F, 4, 4, 16);
		J.setRotationPoint(-5F, -21F, -8F);
		setRotation(J, 0F, 0F, 0F);
		K = new ModelRenderer(this, 0, 0);
		K.addBox(0F, -2F, -2F, 16, 4, 4);
		K.setRotationPoint(-8F, -21F, -5F);
		setRotation(K, 0F, 0F, 0F);
		L = new ModelRenderer(this, 0, 0);
		L.addBox(0F, -2F, -2F, 16, 4, 4);
		L.setRotationPoint(-8F, -21F, 5F);
		setRotation(L, 0F, 0F, 0F);
		M = new ModelRenderer(this, 0, 28);
		M.addBox(-2F, 0F, -2F, 4, 16, 4);
		M.setRotationPoint(5F, 8F, -5F);
		setRotation(M, 0F, 0F, 0F);
		N = new ModelRenderer(this, 0, 28);
		N.addBox(-2F, 0F, -2F, 4, 16, 4);
		N.setRotationPoint(-5F, 8F, -5F);
		setRotation(N, 0F, 0F, 0F);
		O = new ModelRenderer(this, 0, 28);
		O.addBox(-2F, 0F, -2F, 4, 16, 4);
		O.setRotationPoint(-5F, 8F, 5F);
		setRotation(O, 0F, 0F, 0F);
		P = new ModelRenderer(this, 0, 28);
		P.addBox(-2F, 0F, -2F, 4, 16, 4);
		P.setRotationPoint(5F, 8F, 5F);
		setRotation(P, 0F, 0F, 0F);
		Q = new ModelRenderer(this, 0, 0);
		Q.addBox(0F, -2F, -2F, 16, 4, 4);
		Q.setRotationPoint(-8F, 8F, 5F);
		setRotation(Q, 0F, 0F, 0F);
		R = new ModelRenderer(this, 0, 8);
		R.addBox(-2F, -5F, 0F, 4, 4, 16);
		R.setRotationPoint(5F, 11F, -8F);
		setRotation(R, 0F, 0F, 0F);
		S = new ModelRenderer(this, 0, 8);
		S.addBox(-2F, -1F, 0F, 4, 4, 16);
		S.setRotationPoint(-5F, 7F, -8F);
		setRotation(S, 0F, 0F, 0F);
		T = new ModelRenderer(this, 0, 0);
		T.addBox(0F, 0F, -2F, 16, 4, 4);
		T.setRotationPoint(-8F, 6F, -5F);
		setRotation(T, 0F, 0F, 0F);
		U = new ModelRenderer(this, 0, 8);
		U.addBox(-2F, 3F, 0F, 4, 4, 16);
		U.setRotationPoint(5F, -12F, -8F);
		setRotation(U, 0F, 0F, 0F);
		V = new ModelRenderer(this, 0, 0);
		V.addBox(0F, -4F, -2F, 16, 4, 4);
		V.setRotationPoint(-8F, -5F, 5F);
		setRotation(V, 0F, 0F, 0F);
		W = new ModelRenderer(this, 0, 28);
		W.addBox(-2F, 0F, -2F, 4, 16, 4);
		W.setRotationPoint(5F, -8F, 5F);
		setRotation(W, 0F, 0F, 0F);
		X = new ModelRenderer(this, 0, 28);
		X.addBox(-2F, 0F, -2F, 4, 16, 4);
		X.setRotationPoint(-5F, -8F, 5F);
		setRotation(X, 0F, 0F, 0F);
		Y = new ModelRenderer(this, 0, 8);
		Y.addBox(-2F, -3F, 0F, 4, 4, 16);
		Y.setRotationPoint(-5F, -6F, -8F);
		setRotation(Y, 0F, 0F, 0F);
		Z = new ModelRenderer(this, 0, 28);
		Z.addBox(-2F, 0F, -2F, 4, 16, 4);
		Z.setRotationPoint(-5F, -8F, -5F);
		setRotation(Z, 0F, 0F, 0F);
		XX = new ModelRenderer(this, 0, 0);
		XX.addBox(0F, -2F, -2F, 16, 4, 4);
		XX.setRotationPoint(-8F, -7F, -5F);
		setRotation(XX, 0F, 0F, 0F);
		YY = new ModelRenderer(this, 0, 28);
		YY.addBox(-2F, 0F, -2F, 4, 16, 4);
		YY.setRotationPoint(5F, -8F, -5F);
		setRotation(YY, 0F, 0F, 0F);

	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void renderModel()
	{
		GL11.glPushMatrix();
		GL11.glScalef(0.335F, 0.335F, 0.335F);
		A.render(0.0625F);
		B.render(0.0625F);
		C.render(0.0625F);
		D.render(0.0625F);
		E.render(0.0625F);
		F.render(0.0625F);
		G.render(0.0625F);
		H.render(0.0625F);
		I.render(0.0625F);
		J.render(0.0625F);
		K.render(0.0625F);
		L.render(0.0625F);
		M.render(0.0625F);
		N.render(0.0625F);
		O.render(0.0625F);
		P.render(0.0625F);
		Q.render(0.0625F);
		R.render(0.0625F);
		S.render(0.0625F);
		T.render(0.0625F);
		U.render(0.0625F);
		V.render(0.0625F);
		W.render(0.0625F);
		X.render(0.0625F);
		Y.render(0.0625F);
		Z.render(0.0625F);
		XX.render(0.0625F);
		YY.render(0.0625F);
		GL11.glPopMatrix();
	}
}
