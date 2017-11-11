package com.sigmastudios.mboats.item.block;


import com.sigmastudios.mboats.MoreBoats;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material mat, String name) {
        super(mat);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    public void registerItemModel(Item item) {
        MoreBoats.proxy.registerItemRenderer(item, 0, name);
    }
    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(MoreBoats.tab);
        return this;
    }

}
