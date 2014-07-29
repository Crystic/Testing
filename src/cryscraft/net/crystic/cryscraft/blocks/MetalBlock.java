package net.crystic.cryscraft.blocks;

import net.crystic.cryscraft.CrysCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MetalBlock extends Block{
	
	public MetalBlock(Material material) {
		super(material);
		
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(CrysCraft.crysCraftTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(CrysCraft.modid + ":" + this.getUnlocalizedName().substring(5));		
	}
}
