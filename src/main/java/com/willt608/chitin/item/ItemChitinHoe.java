package com.willt608.chitin.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import com.willt608.chitin.init.Materials;

public class ItemChitinHoe extends ItemHoe {

    public ItemChitinHoe() {
        super(Materials.CHITIN_TOOL);
        setCreativeTab(CreativeTabs.tabTools);
    }
}
