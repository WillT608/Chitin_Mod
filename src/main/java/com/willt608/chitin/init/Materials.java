package com.willt608.chitin.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("WeakerAccess")
public class Materials {

    public static final ItemArmor.ArmorMaterial CHITIN_ARMOR;
    public static final Item.ToolMaterial CHITIN_TOOL;

    private Materials() {}

    static {
        CHITIN_ARMOR = EnumHelper.addArmorMaterial("chitin", 9, new int[] { 2, 3, 2, 2 }, 15);
        CHITIN_ARMOR.customCraftingMaterial = new ItemStack(Items.chitinShell).getItem();
        CHITIN_TOOL = EnumHelper.addToolMaterial("chitin", 1, 175, 4.0f, 1.0f, 15);
        CHITIN_TOOL.setRepairItem(new ItemStack(Items.chitinShell));
    }
}
