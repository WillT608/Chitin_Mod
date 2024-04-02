package com.willt608.chitin.item;

import com.willt608.chitin.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemChitinPickaxe extends ItemPickaxe {
    public ItemChitinPickaxe() {
        super(Materials.CHITIN_TOOL);
        setCreativeTab(CreativeTabs.tabTools);
    }
}
