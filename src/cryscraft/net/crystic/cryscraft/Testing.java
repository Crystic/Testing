package net.crystic.cryscraft;

//Imports
import net.crystic.cryscraft.blocks.CopperBlock;
import net.crystic.cryscraft.blocks.CopperOre;
import net.crystic.cryscraft.items.CCItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
	public static final String modid = "CrysCraft";
	public static final String version = "A0.1";
	
	//Items
	public static Item itemCopperIngot;
	
	//Blocks
	public static Block blockCopperOre;
	public static Block blockCopperBlock;
	
	//Creative Tab
	public static CreativeTabs crysCraftTab;
	
	@EventHandler	
	public void PreInit(FMLPreInitializationEvent preEvent){

	//Creative Tab !!!Must be registered first!!!
		crysCraftTab = new CreativeTabs("CrysCraft") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Testing.blockCopperOre);
		}
	};
		
	//Items
		itemCopperIngot = new CCItems().setUnlocalizedName("CopperIngot");
		GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
		
	//Blocks
		blockCopperOre = new CopperOre(Material.rock).setBlockName("CopperOre");
		GameRegistry.registerBlock(blockCopperOre, "CopperOre");
		
		blockCopperBlock = new CopperBlock(Material.rock).setBlockName("CopperBlock");
		GameRegistry.registerBlock(blockCopperBlock, "CopperBlock");
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	//Smelting Recipe
		//Output multiple: new ItemStack (itemTestItem, X) X= Number of output.
		GameRegistry.addSmelting(blockCopperOre, new ItemStack (itemCopperIngot), 0);
		
	//Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(blockCopperOre), new Object[]{ "XXX", "XXX", "XXX", 'X', itemCopperIngot});
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
