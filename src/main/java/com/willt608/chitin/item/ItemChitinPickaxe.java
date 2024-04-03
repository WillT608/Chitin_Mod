package com.willt608.chitin.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

import com.willt608.chitin.init.Materials;

public class ItemChitinPickaxe extends ItemPickaxe {

    public ItemChitinPickaxe() {
        super(Materials.CHITIN_TOOL);
        setCreativeTab(CreativeTabs.tabTools);
    }
}
