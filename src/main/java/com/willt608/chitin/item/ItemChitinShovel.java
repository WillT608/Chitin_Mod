package com.willt608.chitin.item;

import com.willt608.chitin.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemChitinShovel extends ItemSpade {
    public ItemChitinShovel() {
        super(Materials.CHITIN_TOOL);
        setCreativeTab(CreativeTabs.tabTools);
    }
}

