package com.sigmastudios.mboats.item;

import com.sigmastudios.mboats.item.block.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {

    public static void init () {
        GameRegistry.addSmelting(ModBlocks.boatOre, new ItemStack(ModItems.boatIngot), 0.7F);
    }

}
