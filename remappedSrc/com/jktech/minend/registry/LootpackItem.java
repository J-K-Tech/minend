package com.jktech.minend.registry;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.item.EggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static com.jktech.minend.registry.items.COINS;


public class LootpackItem extends EggItem {
    public loot loots;

    public LootpackItem(Settings settings,loot lootss) {
        super(settings);
        this.loots = lootss;
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!world.isClient) {
            EggEntity eggEntity = new EggEntity(world, user);
            eggEntity.setItem(itemStack);
            eggEntity.setProperties(user, user.getPitch(), user.getYaw(), 0.0F, 0.3F, 0.1F);
            world.spawnEntity(eggEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
    public void setloot(loot lotss){
        this.loots = lotss;
    }
    public List<ItemStack> sortloot(PlayerEntity player){
        List<ItemStack> list = new ArrayList<ItemStack>();
        for (int i = 0;i < loots.stacks.size();i++){
        double min = 0;
        double max = 100;
        Random r = new Random();
        double rr = min + (max - min) * r.nextDouble();
        if (rr >= (100-loots.chances.get(i))){list.add(loots.stacks.get(i));}
    }sortcoin(player);return list;}
    public void sortcoin(PlayerEntity player){
        Random r = new Random();
        player.increaseStat(COINS,loots.coins + (loots.range * r.nextInt()));
    }

}
