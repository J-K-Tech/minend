package com.jktech.minend.common.events;

import java.util.ArrayList;
import java.util.List;

import com.jktech.minend.registry.LootpackItem;
import com.jktech.minend.registry.items;

import net.minecraft.util.hit.HitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;

@Mixin(EggEntity.class)
public abstract class lootevents {
    private Boolean got;
    public final EggEntity ent = ((EggEntity)(Object)this);
    public void setsta(ItemStack sta){
        System.out.println("!!!  [[ WOW!!! ]]  its changing!!!");
        ItemEntity newitem = EntityType.ITEM.create(ent.world);
        newitem.setStack(sta);
        newitem.setPos(ent.getX(),ent.getY(),ent.getZ());

        newitem.refreshPositionAndAngles(ent.getX(),
                ent.getY(),ent.getZ(), 0.0F, 0.0F);

        ent.world.spawnEntity(newitem);
        newitem.refreshPositionAndAngles(ent.getX(),
                ent.getY(),ent.getZ(), 0.0F, 0.0F);
        System.out.println("!!!  [[ WOW!!! ]]  it changed!!!");
    }
    public void message(){System.out.println("!!!  [[ WOW!!! ]]  its sorting!!!");}
    public void sortloot(int entity){ //1-item 2-mob
        this.got = false;
        List<ItemStack> loot = new ArrayList<ItemStack>();
        PlayerEntity player = ent.world.getPlayerByUuid(ent.getOwner().getUuid());
        System.out.println("!!!  [[ WOW!!! ]]  its the  player!!!"+player);
        if (entity == 1){
            System.out.println("!!!  [[ WOW!!! ]]  its identiying!!!");
            if (ent.getStack().isOf(items.TINY_PACK)){message();loot = items.TINY_PACK.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.MEDIUM_PACK)){message();loot = items.MEDIUM_PACK.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.BIG_PACK)){message();loot = items.BIG_PACK.sortloot(player);this.got = true;}}
        if (this.got == true){for (int i = 0;i < loot.size(); i++){this.setsta(loot.get(i));}}else{;}
        ent.discard();
    }




    @Inject(method = "onCollision",at = @At("HEAD"))
    public void onCollision(HitResult hitResult,CallbackInfo ci){if ((ent.getStack().getItem() instanceof LootpackItem))
        {System.out.println("!!!  [[ WOW!!! ]]  its trying to sort!!!");this.sortloot(1);return;}}
}
