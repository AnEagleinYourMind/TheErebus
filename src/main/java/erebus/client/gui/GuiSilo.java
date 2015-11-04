package erebus.client.gui;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.block.silo.TileEntitySiloTank;
import erebus.core.helper.Utils;
import erebus.inventory.ContainerSilo;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

@SideOnly(Side.CLIENT)
public class GuiSilo extends GuiContainer {

	private static final ResourceLocation GUI_SILO = new ResourceLocation("erebus:textures/gui/container/siloGui.png");
	private final TileEntitySiloTank siloTank;

	public GuiSilo(InventoryPlayer playerInventory, TileEntitySiloTank tile) {
		super(new ContainerSilo(playerInventory, tile));
		siloTank = tile;
		allowUserInput = false;
		xSize = 256;
		ySize = 256;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y) {
		int colour = Utils.getColour(192, 192, 192);
		fontRendererObj.drawString(StatCollector.translateToLocal(siloTank.getInventoryName()), xSize / 2 - fontRendererObj.getStringWidth(StatCollector.translateToLocal(siloTank.getInventoryName())) / 2, 6, colour);
		fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, colour);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTickTime, int x, int y) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.getTextureManager().bindTexture(GUI_SILO); // temp texture
		int k = (width - xSize) / 2;
		int l = (height - ySize) / 2;
		drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
	}
}