package com.sigmastudios.mboats.item.block.blocks;

import com.sigmastudios.mboats.MoreBoats;
import com.sigmastudios.mboats.item.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BoatOre extends BlockBase {

    public BoatOre(String name) {
        super(Material.ROCK, name);
        setHardness(3F);
        setResistance(4.9F);
        this.setCreativeTab(MoreBoats.tab);
    }
}
