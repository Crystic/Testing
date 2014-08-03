package net.crystic.cryscraft.blocks;

import java.util.Random;

import net.crystic.cryscraft.CrysCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreBlock extends Block{

	public OreBlock(Material material) {
		super(material);
		
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(CrysCraft.crysCraftTab);
	}
	
	public Item getItemDropped(int i, Random random, int j) {
		return this == CrysCraft.oreRedEmerald ? CrysCraft.itemRedEmerald : Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random random) {
		return this == CrysCraft.oreRedEmerald ? 1 + random.nextInt(3) : 1;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(CrysCraft.modid + ":" + this.getUnlocalizedName().substring(5));		
	}
	
}
