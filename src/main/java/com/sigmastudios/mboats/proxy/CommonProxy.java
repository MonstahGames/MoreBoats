package com.sigmastudios.mboats.proxy;

import com.sigmastudios.mboats.world.ModWorldGen;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }
    public void init(FMLInitializationEvent event) {

        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);

    }
    public void postInit(FMLPostInitializationEvent event) {

    }
    public void registerItemRenderer (Item item, int meta, String id) {

    }

}
