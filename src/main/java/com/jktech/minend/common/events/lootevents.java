package com.jktech.minend.common.events;

import java.util.Arrays;
import java.util.List;

import com.jktech.minend.registry.LootpackItem;
import com.jktech.minend.registry.items;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(ItemEntity.class)
public abstract class lootevents {
    private static Boolean got;
    public ItemStack getsta(){
        return ((ItemEntity)(Object)this).getStack();
    }
    public void setsta(ItemStack sta){
        System.out.println("!!!  [[ WOW!!! ]]  its changing!!!");
        ItemEntity newitem = EntityType.ITEM.create(((ItemEntity)(Object)this).world);
        newitem.setStack(sta);
        newitem.setPos(((ItemEntity)(Object)this).getX(),((ItemEntity)(Object)this).getY(),((ItemEntity)(Object)this).getZ());
    
        newitem.refreshPositionAndAngles(((ItemEntity)(Object)this).getX(),
                ((ItemEntity)(Object)this).getY(),((ItemEntity)(Object)this).getZ(), 0.0F, 0.0F);
    
        ((ItemEntity)(Object)this).world.spawnEntity(newitem);
        newitem.refreshPositionAndAngles(((ItemEntity)(Object)this).getX(),
        ((ItemEntity)(Object)this).getY(),((ItemEntity)(Object)this).getZ(), 0.0F, 0.0F);
        System.out.println("!!!  [[ WOW!!! ]]  it changed!!!");
    }
    public void message(){System.out.println("!!!  [[ WOW!!! ]]  its sorting!!!");}
    public void sortloot(int entity){ //1-item 2-mob
        this.got = false;
        List<ItemStack> loot = Arrays.asList();
        PlayerEntity player = ((ItemEntity)(Object)this).world.getPlayerByUuid(((ItemEntity)(Object)this).getThrower());
        System.out.println("!!!  [[ WOW!!! ]]  its the  player!!!"+player);
        if (entity == 1){
            System.out.println("!!!  [[ WOW!!! ]]  its identiying!!!");
            if (this.getsta().isOf(items.TINY_PACK)){message();loot = items.TINY_PACK.sortloot(player);this.got = true;}
            else if (this.getsta().isOf(items.MEDIUM_PACK)){message();loot = items.MEDIUM_PACK.sortloot(player);this.got = true;}
            else if (this.getsta().isOf(items.BIG_PACK)){message();loot = items.BIG_PACK.sortloot(player);this.got = true;}}
    if (this.got == true){for (int i = 0;i < loot.size(); i++){this.setsta(loot.get(i));}}else{;}
    ((ItemEntity)(Object)this).discard();
    }




    @Inject(method = "tick",at = @At("HEAD"))
    public void tick(CallbackInfo ci){System.out.println("!!!  [[ WOW!!! ]]  its ticking!!!");
        if ((((ItemEntity)(Object)this).getStack().getItem() instanceof LootpackItem))
        {System.out.println("!!!  [[ WOW!!! ]]  its lootpack!!!");
        if (((ItemEntity)(Object)this).getThrower() != null){System.out.println("!!!  [[ WOW!!! ]]  its trying to sort!!!");
        this.sortloot(1);}}}
}
