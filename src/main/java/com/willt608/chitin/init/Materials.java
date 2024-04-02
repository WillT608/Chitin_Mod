package com.willt608.chitin.init;

import com.willt608.chitin.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("WeakerAccess")
public class Materials {
    public static final ItemArmor.ArmorMaterial CHITIN_ARMOR;
    public static final Item.ToolMaterial CHITIN_TOOL;

    private Materials() {
    }

    static {
        CHITIN_ARMOR = EnumHelper.addArmorMaterial("chitin", 33, new int[]{3, 6, 8, 3}, 10);
        CHITIN_ARMOR.customCraftingMaterial = new ItemStack(Items.chitinShell).getItem();
        CHITIN_TOOL = EnumHelper.addToolMaterial("chitin", 3, 1561, 8.0f, 3.0f, 10);
        CHITIN_TOOL.setRepairItem(new ItemStack(Items.chitinShell));
    }
}
