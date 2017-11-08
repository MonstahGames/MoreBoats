package com.sigmastudios.mboats.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class MoreBoatsTab extends CreativeTabs {
    public MoreBoatsTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Blocks.COMMAND_BLOCK);
    }
}
