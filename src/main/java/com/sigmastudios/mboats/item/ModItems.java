package com.sigmastudios.mboats.item;

import com.sigmastudios.mboats.item.boat.IronBoat;
import com.sigmastudios.mboats.item.items.BoatIngot;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    //public static EntityBoat.Type ironType

    public static BoatIngot boatIngot = new BoatIngot("boat_ingot");
    public static IronBoat ironBoat = new IronBoat(EntityBoat.Type.OAK, "iron_boat");

    public static void register (IForgeRegistry<Item> registry) {
        registry.register(boatIngot);
        registry.register(ironBoat);
    }
    public static void registerModels () {
        boatIngot.registerItemModel("boat_ingot");
        ironBoat.registerItemModel("iron_boat");
    }


}
