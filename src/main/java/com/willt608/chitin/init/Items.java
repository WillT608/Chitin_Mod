package com.willt608.chitin.init;

import com.willt608.chitin.item.*;
import com.google.common.base.CaseFormat;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class Items {

    public static Item chitinShell;

    public static Item chitinSword;

    public static Item chitinHelmet;
    public static Item chitinChestplate;
    public static Item chitinLeggings;
    public static Item chitinBoots;

    public static Item chitinShovel;
    public static Item chitinPickaxe;
    public static Item chitinAxe;
    public static Item chitinHoe;

    private Items() {
    }

    public static void preInit() {
        chitinShell = new ItemChitinShell();

        chitinSword = new ItemChitinSword();

        chitinHelmet = new ItemChitinArmor(0);
        chitinChestplate = new ItemChitinArmor(1);
        chitinLeggings = new ItemChitinArmor(2);
        chitinBoots = new ItemChitinArmor(3);

        chitinShovel = new ItemChitinShovel();
        chitinPickaxe = new ItemChitinPickaxe();
        chitinAxe = new ItemChitinAxe();
        chitinHoe = new ItemChitinHoe();

        register (chitinShell, "chitinShell");

        register(chitinSword, "chitinSword");

        register(chitinHelmet, "chitinHelmet");
        register(chitinChestplate, "chitinChestplate");
        register(chitinLeggings, "chitinLeggings");
        register(chitinBoots, "chitinBoots");

        register(chitinShovel, "chitinShovel");
        register(chitinPickaxe, "chitinPickaxe");
        register(chitinAxe, "chitinAxe");
        register(chitinHoe, "chitinHoe");
    }

    private static void register(Item item, String name) {
        String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        item.setUnlocalizedName(itemName);
        item.setTextureName("chitin:" + itemName);
        GameRegistry.registerItem(item, itemName);
    }
}
