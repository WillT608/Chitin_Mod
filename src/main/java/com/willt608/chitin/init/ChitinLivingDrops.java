package com.willt608.chitin.init;

import static com.willt608.chitin.init.Items.chitinShell;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ChitinLivingDrops {

    public static double rand;

    @SubscribeEvent
    public void playerKilledSpider(LivingDeathEvent event) {
        World world = event.entity.worldObj;
        if (event.entityLiving instanceof EntitySpider && event.source.getSourceOfDamage() instanceof EntityPlayer) {
            EntitySpider spider = (EntitySpider) event.entity;
            ItemStack item = new ItemStack(chitinShell, 1);
            EntityItem entityitem = new EntityItem(
                world,
                (double) spider.posX,
                (double) spider.posY + 0.5d,
                (double) spider.posZ,
                item);
            entityitem.delayBeforeCanPickup = 10;
            if (world.rand.nextFloat() < 0.5F) {
                world.spawnEntityInWorld(entityitem);
            }
        }
    }

    public void playerKilledCaveSpider(LivingDeathEvent event) {
        World world = event.entity.worldObj;
        if (event.entityLiving instanceof EntityCaveSpider
            && event.source.getSourceOfDamage() instanceof EntityPlayer) {
            EntityCaveSpider cavespider = (EntityCaveSpider) event.entity;
            ItemStack item = new ItemStack(chitinShell, 1);
            EntityItem entityitem = new EntityItem(
                world,
                (double) cavespider.posX,
                (double) cavespider.posY + 0.5d,
                (double) cavespider.posZ,
                item);
            entityitem.delayBeforeCanPickup = 10;
            if (world.rand.nextFloat() < 0.5F) {
                world.spawnEntityInWorld(entityitem);
            }
        }
    }

}
