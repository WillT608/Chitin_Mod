package com.willt608.chitin.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import com.willt608.chitin.init.Materials;

public class ItemChitinSword extends ItemSword {

    public ItemChitinSword() {
        super(Materials.CHITIN_TOOL);
        setCreativeTab(CreativeTabs.tabCombat);
    }
}
