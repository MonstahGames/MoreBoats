package com.sigmastudios.mboats.item.boat;

import com.sigmastudios.mboats.MoreBoats;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBoat;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class IronBoat extends ItemBoat {

    public IronBoat(EntityBoat.Type typeIn, String name) {
        super(typeIn);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreBoats.tab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
    public void registerItemModel(String name)
    {
        MoreBoats.proxy.registerItemRenderer(this, 0, name);
    }
}
