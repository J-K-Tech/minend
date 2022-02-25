package com.jktech.minend.common.events;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.jktech.minend.registry.LootpackItem;
import com.jktech.minend.registry.items;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(ItemEntity.class)
public abstract class lootevents extends Entity {

    @Shadow public abstract ItemStack getStack();

    @Shadow @Nullable public abstract UUID getThrower();

    @Shadow public abstract void setStack(ItemStack stack);

    // quiet IntelliJ, i am working
    public lootevents(EntityType<?> type, World world) {
        super(type, world);
    }

    private static boolean got;

    public void message(){System.out.println("!!!  [[ WOW!!! ]]  its sorting!!!");}

    // may want to make an enum
    public void sortloot(int entity){ //1-item 2-mob
        this.got = false;
        List<ItemStack> loot = Collections.emptyList();
        PlayerEntity player = this.world.getPlayerByUuid(this.getThrower());
        System.out.println("!!!  [[ WOW!!! ]]  its the  player!!!"+player);
        if (entity == 1){
            System.out.println("!!!  [[ WOW!!! ]]  its identiying!!!");
            if (this.getStack().isOf(items.TINY_PACK)){
                message();
                loot = items.TINY_PACK.sortloot(player);
                this.got = true;
            } else if (this.getStack().isOf(items.MEDIUM_PACK)) {
                message();
                loot = items.MEDIUM_PACK.sortloot(player);
                this.got = true;
            } else if (this.getStack().isOf(items.BIG_PACK)) {
                message();
                loot = items.BIG_PACK.sortloot(player);
                this.got = true;
            }
        }
        if (this.got == true){
            for (int i = 0;i < loot.size(); i++){
                this.dropStack(loot.get(i));
            }
        }
        this.discard();
    }

    @Inject(method = "tick",at = @At("HEAD"))
    public void ItemEntity_LootEvent_tick(CallbackInfo ci){
        System.out.println("!!!  [[ WOW!!! ]]  its ticking!!!");
        if (this.getStack().getItem() instanceof LootpackItem)
        {
            System.out.println("!!!  [[ WOW!!! ]]  its lootpack!!!");
            if (this.getThrower() != null){
                System.out.println("!!!  [[ WOW!!! ]]  its trying to sort!!!");
                this.sortloot(1);
            }
        }
    }
}
