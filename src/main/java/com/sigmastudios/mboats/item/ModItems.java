package com.sigmastudios.mboats.item;

import com.sigmastudios.mboats.item.items.BoatIngot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static BoatIngot boatIngot = new BoatIngot("boat_ingot");

    public static void register (IForgeRegistry<Item> registry) {
        registry.register(boatIngot);
    }
    public static void registerModels () {
        boatIngot.registerItemModel("boat_ingot");
    }


}
