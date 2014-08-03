package net.crystic.cryscraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.crystic.cryscraft.CrysCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class CopperHoe extends ItemHoe {

	public CopperHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setCreativeTab(CrysCraft.crysCraftTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		this.itemIcon = iconRegister.registerIcon(CrysCraft.modid + ":" + this.getUnlocalizedName().substring(5));
		
	}
	
}
