package com.jktech.minend.common.events;

import com.jktech.minend.registry.items;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Arrays;
import java.util.List;


@Mixin(LivingEntity.class)
public class entitydrops{
//
//    public void setsta(ItemStack sta){
//        ItemEntity newitem = EntityType.ITEM.create(((ItemEntity)(Object)this).world);
//        newitem.setStack(sta);
//        newitem.setPos(((ItemEntity)(Object)this).getX(),((ItemEntity)(Object)this).getY(),((ItemEntity)(Object)this).getZ());
//
//        newitem.refreshPositionAndAngles(((ItemEntity)(Object)this).getX(),
//                ((ItemEntity)(Object)this).getY(),((ItemEntity)(Object)this).getZ(), 0.0F, 0.0F);
//
//        ((ItemEntity)(Object)this).world.spawnEntity(newitem);
//        newitem.refreshPositionAndAngles(((ItemEntity)(Object)this).getX(),
//                ((ItemEntity)(Object)this).getY(),((ItemEntity)(Object)this).getZ(), 0.0F, 0.0F);
//
//    }
//
//    public void sortloot(int val){
//        boolean got = false;
//        List<ItemStack> loot = Arrays.asList();
//        PlayerEntity player = ((ItemEntity)(Object)this).world.getPlayerByUuid(((ItemEntity)(Object)this).getThrower());
//        if (val == 1){loot = items.TINY_PACK.sortloot(player);got = true;}
//        if (got == true){for (int i = 0;i < loot.size(); i++){this.setsta(loot.get(i));}}else{;}
//    }
//
//    @Inject(method = "damage",at = @At("HEAD"))
//    public boolean damage(DamageSource source, float ammount, CallbackInfoReturnable ci){if (!checks(source)){return false;}else{
//            if (((LivingEntity)(Object)this) instanceof PassiveEntity){float health = ((LivingEntity)(Object)this).getHealth();
//        if ((health - ammount) <= 0){sortloot(1);}
//            }return true;}}
//
//
//    public boolean checks(DamageSource source){
//        if (((LivingEntity)(Object)this).isInvulnerableTo(source)) {
//            return false;
//        } else if (((LivingEntity)(Object)this).world.isClient) {
//            return false;
//        } else if (((LivingEntity)(Object)this).isDead()) {
//            return false;
//        } else if (source.isFire() && ((LivingEntity)(Object)this).hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
//            return false;
//        } else {
//            if (((LivingEntity)(Object)this).isSleeping() && !((LivingEntity)(Object)this).world.isClient) {
//                ((LivingEntity)(Object)this).wakeUp();
//            }return true;}}
}
