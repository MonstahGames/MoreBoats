package com.sigmastudios.mboats.item.items;

import com.sigmastudios.mboats.MoreBoats;
import net.minecraft.item.Item;

public class BoatIngot extends Item {

    public BoatIngot (String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreBoats.tab);
    }
    public void registerItemModel(String name)
    {
        MoreBoats.proxy.registerItemRenderer(this, 0, name);
    }
}
