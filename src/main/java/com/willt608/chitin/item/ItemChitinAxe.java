package com.willt608.chitin.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.willt608.chitin.init.Materials;

public class ItemChitinAxe extends ItemAxe {

    public ItemChitinAxe() {
        super(Materials.CHITIN_TOOL);
        setCreativeTab(CreativeTabs.tabTools);
    }
}
