package net.crystic.testing;

//Imports
import net.crystic.testing.items.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid= Testing.modid, version= Testing.version)

public class Testing {
	public static final String modid = "Testing";
	public static final String version = "A0.1";
	
	//Items
	public static Item itemTestItem;
	
	@EventHandler	
	public void PreInit(FMLPreInitializationEvent preEvent){
	
	//Items
		itemTestItem = new Items().setUnlocalizedName("TestItem");
		GameRegistry.registerItem(itemTestItem, "TestItem");

	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}