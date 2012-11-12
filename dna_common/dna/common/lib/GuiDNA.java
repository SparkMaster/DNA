package dna_common.dna.common.lib;

import net.minecraft.src.GuiContainer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.StatCollector;

import org.lwjgl.opengl.GL11;

import dna_common.dna.common.container.ContainerDNA;
import dna_common.dna.common.tile.TileDNA;

public class GuiDNA extends GuiContainer
{
	public GuiDNA(InventoryPlayer player_inventory, TileDNA tile_entity)
	{
		super(new ContainerDNA(tile_entity, player_inventory));
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		fontRenderer.drawString("Microscope", 6, 6, 0xffffff);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 6, ySize - 96 , 0xffffff);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		int picture = mc.renderEngine.getTexture("/dna_resources/gui/microscope.png");
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.renderEngine.bindTexture(picture);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
}
