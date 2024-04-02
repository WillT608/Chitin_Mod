package com.willt608.chitin.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.willt608.chitin.init.Items.*;

@SuppressWarnings("WeakerAccess")
public class Recipes {
    private Recipes() {
    }

    public static void preInit() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(chitinSword), "C", "C", "/", 'C', chitinShell, '/', Items.stick));

        GameRegistry.addRecipe(new ItemStack(chitinHelmet), "CCC", "C C", 'C', chitinShell);
        GameRegistry.addRecipe(new ItemStack(chitinChestplate), "C C", "CCC", "CCC", 'C', chitinShell);
        GameRegistry.addRecipe(new ItemStack(chitinLeggings), "CCC", "C C", "C C", 'C', chitinShell);
        GameRegistry.addRecipe(new ItemStack(chitinBoots), "C C", "C C", 'C', chitinShell);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(chitinShovel), "C", "/", "/", 'C', chitinShell, '/', Items.stick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(chitinPickaxe), "CCC", " / ", " / ", 'D', Blocks.dirt, '/', Items.stick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(chitinAxe), "CC", "C/", " /", 'C', Blocks.dirt, '/', Items.stick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(chitinHoe), "CC", " /", " /", 'C', Blocks.dirt, '/', Items.stick));
    }
}
