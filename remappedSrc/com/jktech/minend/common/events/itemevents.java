/**
 * my custom events
 *
 * @author  JKTech
 * @version 0.1
 * @since   2021-07-23
 */

package com.jktech.minend.common.events;

import com.jktech.minend.registry.items;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ItemEntity.class)
public abstract class itemevents{
    private int health;
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

    protected void schedule() {((ItemEntity)(Object)this).velocityModified = true;}


    public boolean unburnable(){
        if (this.getsta().isOf(Items.IRON_INGOT) || this.getsta().isOf(Items.GOLD_INGOT) || this.getsta().isOf(Items.COOKED_COD) ||
                this.getsta().isOf(Items.COOKED_BEEF) || this.getsta().isOf(Items.COOKED_CHICKEN) || this.getsta().isOf(Items.COOKED_MUTTON) ||
                this.getsta().isOf(Items.COOKED_PORKCHOP) || this.getsta().isOf(Items.COOKED_RABBIT) || this.getsta().isOf(Items.COOKED_SALMON) ||
                this.getsta().isOf(Items.CHARCOAL) || this.getsta().isOf(Items.STONE) || this.getsta().isOf(Items.total) ||this.getsta().isOf(Items.BRICK) ||
                this.getsta().isOf(Items.GLASS) || this.getsta().isOf(Items.NETHER_BRICK) ||this.getsta().isOf(items.RESIN)){
            return true;
        }
        else {return false;}
    }
    public boolean islog(){
        if (this.getsta().isOf(Items.ACACIA_LOG) || this.getsta().isOf(Items.BIRCH_LOG) || this.getsta().isOf(Items.OAK_LOG) ||
                this.getsta().isOf(Items.DARK_OAK_LOG) || this.getsta().isOf(Items.JUNGLE_LOG) || this.getsta().isOf(Items.SPRUCE_LOG)||
                this.getsta().isOf(Items.CRIMSON_STEM) || this.getsta().isOf(Items.WARPED_STEM)){return true;}
        else {return false;}
    }
    public boolean changeable(){
        if (this.getsta().isOf(Items.RAW_IRON) || this.getsta().isOf(Items.RAW_GOLD) || this.getsta().isOf(Items.COD) ||
                this.getsta().isOf(Items.BEEF) || this.getsta().isOf(Items.CHICKEN) || this.getsta().isOf(Items.MUTTON) ||
                this.getsta().isOf(Items.PORKCHOP) || this.getsta().isOf(Items.RABBIT) || this.getsta().isOf(Items.SALMON) ||
                this.islog() || this.getsta().isOf(Items.COBBLESTONE) || this.getsta().isOf(Items.COBBLED_DEEPSLATE) ||
                this.getsta().isOf(Items.CLAY_BALL) ||
                this.getsta().isOf(Items.SAND) || this.getsta().isOf(Items.NETHERRACK) || this.getsta().isOf(items.RESIN)){
            return true;
        }
        else {return false;}
    }
    public void transform(){
        System.out.println("!!!  [[ WOW!!! ]]  its trying to change!!!");
        if (this.islog()){this.setsta(new ItemStack(Items.CHARCOAL,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.RAW_IRON)){this.setsta(new ItemStack(Items.IRON_INGOT,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.RAW_GOLD)){this.setsta(new ItemStack(Items.GOLD_INGOT,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.RAW_COPPER)){this.setsta(new ItemStack(Items.COPPER_INGOT,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.BEEF)){this.setsta(new ItemStack(Items.COOKED_BEEF,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.CHICKEN)){this.setsta(new ItemStack(Items.COOKED_CHICKEN,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.COD)){this.setsta(new ItemStack(Items.COOKED_COD,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.SALMON)){this.setsta(new ItemStack(Items.COOKED_SALMON,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.MUTTON)){this.setsta(new ItemStack(Items.COOKED_MUTTON,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.PORKCHOP)){this.setsta(new ItemStack(Items.COOKED_PORKCHOP,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.RABBIT)){this.setsta(new ItemStack(Items.COOKED_RABBIT,this.getsta().getCount()));}
        else if (this.getsta().isOf(items.RESIN)){this.setsta(new ItemStack(items.PLASTIC,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.COBBLESTONE)){this.setsta(new ItemStack(Items.STONE,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.COBBLED_DEEPSLATE)){this.setsta(new ItemStack(Items.total,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.SAND)){this.setsta(new ItemStack(Items.GLASS,this.getsta().getCount()));}
        else if (this.getsta().isOf(Items.NETHERRACK)){this.setsta(new ItemStack(Items.NETHER_BRICK,this.getsta().getCount()));}
        
    }






    @Inject(method = "damage",at = @At("HEAD"))
    public boolean damage(DamageSource source, float amount, CallbackInfoReturnable<?> ci) {
        if (((ItemEntity)(Object)this).isInvulnerableTo(source) || this.unburnable()) {
            System.out.println("!!!  [[ WOW!!! ]]  its unburnable!!!");
            return false;
        } else if (this.changeable()){
            System.out.println("!!!  [[ WOW!!! ]]  its burnable!!!");
            this.schedule();
            this.health = (int)((float)this.health - amount);
            ((ItemEntity)(Object)this).emitGameEvent(GameEvent.ENTITY_DAMAGED, source.getAttacker());
            if (this.health <= 0) {
                System.out.println("!!!  [[ WOW!!! ]]  its health is 0 or less!!!");
                this.transform();
                this.getsta().onItemEntityDestroyed(((ItemEntity)(Object)this));
                ((ItemEntity)(Object)this).discard();
            }}

            return true;
    }
}
