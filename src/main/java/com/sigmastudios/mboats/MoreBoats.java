package com.sigmastudios.mboats;

import com.sigmastudios.mboats.item.ModItems;
import com.sigmastudios.mboats.item.ModSmelting;
import com.sigmastudios.mboats.item.block.ModBlocks;
import com.sigmastudios.mboats.proxy.CommonProxy;
import com.sigmastudios.mboats.tab.MoreBoatsTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MoreBoats.MODID, version = MoreBoats.VERSION, name = MoreBoats.NAME)
public class MoreBoats {

    public static final String MODID = "mboats";
    public static final String VERSION = "1.0";
    public static final String NAME = "More Boats";

    public static Logger LOGGER = LogManager.getLogger(MODID.toUpperCase());

    public static boolean DEBUG = true;

    public static final String CLProxy = "com.sigmastudios.mboats.proxy.ClientProxy";
    public static final String CProxy = "com.sigmastudios.mboats.proxy.CommonProxy";

    public static MoreBoatsTab tab;

    @SidedProxy(clientSide = CLProxy, serverSide = CProxy)
    public static CommonProxy proxy;

    @Mod.Instance
    public static MoreBoats instance;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItem (ModelRegistryEvent event) {
            ModItems.registerModels();
        }

    }

    @EventHandler
    public void preInit (FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
        if (DEBUG) {
            LOGGER.info("Loading More Boats...");
        }
        tab = new MoreBoatsTab(CreativeTabs.getNextID(), "mboats_tab");
        proxy.preInit(event);
    }
    @EventHandler
    public void init (FMLInitializationEvent event) {
        ModSmelting.init();
        proxy.init(event);
    }
    @EventHandler
    public void postInit (FMLPostInitializationEvent event) {
        LOGGER.info("More Boats Loaded!");
        proxy.postInit(event);
    }

}
