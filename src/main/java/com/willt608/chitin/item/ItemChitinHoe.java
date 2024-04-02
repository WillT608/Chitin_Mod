package com.willt608.chitin.item;

import com.willt608.chitin.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemChitinHoe extends ItemHoe {
    public ItemChitinHoe() {
        super(Materials.CHITIN_TOOL);
        setCreativeTab(CreativeTabs.tabTools);
    }
}
