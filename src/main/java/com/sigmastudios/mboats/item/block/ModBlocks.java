package com.sigmastudios.mboats.item.block;

import com.sigmastudios.mboats.item.block.blocks.BoatOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BoatOre boatOre = new BoatOre("boat_ore");

    public static void register(IForgeRegistry<Block> registry) {
        registry.register(boatOre);
    }
    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.register(boatOre.createItemBlock());
    }
    public static void registerModels() {
        boatOre.registerItemModel(Item.getItemFromBlock(boatOre));
    }

}
