package com.willt608.chitin.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.willt608.chitin.init.Materials;

public class ItemChitinShovel extends ItemSpade {

    public ItemChitinShovel() {
        super(Materials.CHITIN_TOOL);
        setCreativeTab(CreativeTabs.tabTools);
    }
}
