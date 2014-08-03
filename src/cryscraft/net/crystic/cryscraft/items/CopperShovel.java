package net.crystic.cryscraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.crystic.cryscraft.CrysCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class CopperShovel extends ItemSpade {

	public CopperShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.setCreativeTab(CrysCraft.crysCraftTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		this.itemIcon = iconRegister.registerIcon(CrysCraft.modid + ":" + this.getUnlocalizedName().substring(5));
		
	}
}
