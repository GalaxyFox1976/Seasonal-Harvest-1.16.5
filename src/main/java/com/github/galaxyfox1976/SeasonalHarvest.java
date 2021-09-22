package com.github.galaxyfox1976;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.galaxyfox1976.core.init.ItemInit;

import java.util.stream.Collectors;

@Mod(SeasonalHarvest.MOD_ID)
public class SeasonalHarvest
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "seasonalharvest2231976";

    public SeasonalHarvest() {
    	/* Bus 1 */
    	IEventBus bus1 = FMLJavaModLoadingContext.get().getModEventBus();
        bus1.addListener(this::setup);
        ItemInit.ITEMS.register(bus1);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
}