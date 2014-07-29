package net.crystic.cryscraft.items;

import net.crystic.cryscraft.Testing;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CCItems extends Item{
	
	public CCItems(){
		
		this.setCreativeTab(Testing.crysCraftTab);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		this.itemIcon = iconRegister.registerIcon(Testing.modid + ":" + this.getUnlocalizedName().substring(5));
		
	}

}
