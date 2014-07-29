package net.crystic.cryscraft.handler;

import net.crystic.cryscraft.CrysCraft;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == CrysCraft.itemTreePitch) return 800;
		
		return 0;
	}

		
}
