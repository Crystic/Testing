package net.crystic.testing;

//Imports
import net.crystic.testing.blocks.TestBlock;
import net.crystic.testing.items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid= Testing.modid, version= Testing.version)

public class Testing {
	public static final String modid = "Testing";
	public static final String version = "A0.1";
	
	//Items
	public static Item itemTestItem;
	
	//Blocks
	public static Block blockTestBlock;
	
	//Creative Tab
	public static CreativeTabs testingTab;
	
	@EventHandler	
	public void PreInit(FMLPreInitializationEvent preEvent){
	
	//Items
		itemTestItem = new Items().setUnlocalizedName("TestItem");
		GameRegistry.registerItem(itemTestItem, "TestItem");
		
	//Blocks
		blockTestBlock = new TestBlock(Material.rock).setBlockName("TestBlock");
		GameRegistry.registerBlock(blockTestBlock, "TestBlock");
		
	//Creative Tab
		testingTab = new CreativeTabs("Testing"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(Testing.blockTestBlock);
			}
		};
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
