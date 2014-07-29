package net.crystic.cryscraft.handler;

import net.crystic.cryscraft.CrysCraft;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class CraftingHandler {
	
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event) {
		
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
			if(event.craftMatrix.getStackInSlot(i) != null) {
				
				ItemStack item0 = event.craftMatrix.getStackInSlot(i);
					if(item0 != null && item0.getItem() == CrysCraft.itemIronHammer) {
						ItemStack k = new ItemStack(CrysCraft.itemIronHammer, 2, (item0.getItemDamage() +1));
					if(k.getItemDamage() >= k.getMaxDamage()) {
						k.stackSize--;
					}
					
				event.craftMatrix.setInventorySlotContents(i, k);
					
				}
				
				ItemStack item1 = event.craftMatrix.getStackInSlot(i);
					if(item1 != null && item1.getItem() == CrysCraft.itemIronPunch) {
						ItemStack k = new ItemStack(CrysCraft.itemIronPunch, 2, (item0.getItemDamage() +1));
					if(k.getItemDamage() >= k.getMaxDamage()) {
						k.stackSize--;
					}
					
				event.craftMatrix.setInventorySlotContents(i, k);
			
					}
			}
		}
	}
}
