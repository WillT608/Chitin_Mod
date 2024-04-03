package com.willt608.chitin.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.willt608.chitin.init.Materials;

public class ItemChitinArmor extends ItemArmor {

    public ItemChitinArmor(int slot) {
        super(Materials.CHITIN_ARMOR, slot == 2 ? 2 : 1, slot);
        setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String layer) {
        return "chitin:textures/models/armor/chitin_layer_" + (slot == 2 ? 2 : 1) + ".png";
    }
}
