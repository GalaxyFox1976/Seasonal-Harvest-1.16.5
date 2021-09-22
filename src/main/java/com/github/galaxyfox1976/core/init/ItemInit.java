package com.github.galaxyfox1976.core.init;

import com.github.galaxyfox1976.SeasonalHarvest;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SeasonalHarvest.MOD_ID);
	
	public static final RegistryObject<net.minecraft.item.Item> COIN = ITEMS.register("harvest_coin", () -> new net.minecraft.item.Item(new net.minecraft.item.Item.Properties().tab(ItemGroup.TAB_MISC)));
}
