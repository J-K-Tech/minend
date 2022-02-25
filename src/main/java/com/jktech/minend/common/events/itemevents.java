/**
 * my custom events
 *
 * @author  JKTech
 * @version 0.1
 * @since   2021-07-23
 */

package com.jktech.minend.common.events;
import com.jktech.minend.registry.items;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ItemEntity.class)
public abstract class itemevents extends Entity {

    // fake constructor to make the ide quiet
    public itemevents(EntityType<?> type, World world) {
        super(type, world);
    }
    // shadowed things to access members and methods of ItemEntity.class
    @Shadow public abstract ItemStack getStack();
    @Shadow public abstract void setStack(ItemStack stack);
    @Shadow private int health;

    //private int health;
    // not sure why you need to create a brand new itementity when there is a perfectly good setStack method already
//    public void setStack(ItemStack sta){
//        System.out.println("!!!  [[ WOW!!! ]]  its changing!!!");
//        ItemEntity newitem = EntityType.ITEM.create(this.world);
//        newitem.setStack(sta);
//        newitem.setPos(this.getX(),this.getY(),this.getZ());
//
//        newitem.refreshPositionAndAngles(this.getX(),
//                this.getY(),this.getZ(), 0.0F, 0.0F);
//
//        this.world.spawnEntity(newitem);
//        newitem.refreshPositionAndAngles(this.getX(),
//        this.getY(),this.getZ(), 0.0F, 0.0F);
//        System.out.println("!!!  [[ WOW!!! ]]  it changed!!!");
//    }

    protected void schedule() {((ItemEntity)(Object)this).velocityModified = true;}


    public boolean unburnable(){
        if (this.getStack().isOf(Items.IRON_INGOT) || this.getStack().isOf(Items.GOLD_INGOT) || this.getStack().isOf(Items.COOKED_COD) ||
                this.getStack().isOf(Items.COOKED_BEEF) || this.getStack().isOf(Items.COOKED_CHICKEN) || this.getStack().isOf(Items.COOKED_MUTTON) ||
                this.getStack().isOf(Items.COOKED_PORKCHOP) || this.getStack().isOf(Items.COOKED_RABBIT) || this.getStack().isOf(Items.COOKED_SALMON) ||
                this.getStack().isOf(Items.CHARCOAL) || this.getStack().isOf(Items.STONE) || this.getStack().isOf(Items.DEEPSLATE) ||this.getStack().isOf(Items.BRICK) ||
                this.getStack().isOf(Items.GLASS) || this.getStack().isOf(Items.NETHER_BRICK) ||this.getStack().isOf(items.RESIN)){
            return true;
        }
        else {return false;}
    }
    public boolean islog(){
        if (this.getStack().isOf(Items.ACACIA_LOG) || this.getStack().isOf(Items.BIRCH_LOG) || this.getStack().isOf(Items.OAK_LOG) ||
                this.getStack().isOf(Items.DARK_OAK_LOG) || this.getStack().isOf(Items.JUNGLE_LOG) || this.getStack().isOf(Items.SPRUCE_LOG)||
                this.getStack().isOf(Items.CRIMSON_STEM) || this.getStack().isOf(Items.WARPED_STEM)){return true;}
        else {return false;}
    }
    public boolean changeable(){
        if (this.getStack().isOf(Items.RAW_IRON) || this.getStack().isOf(Items.RAW_GOLD) || this.getStack().isOf(Items.COD) ||
                this.getStack().isOf(Items.BEEF) || this.getStack().isOf(Items.CHICKEN) || this.getStack().isOf(Items.MUTTON) ||
                this.getStack().isOf(Items.PORKCHOP) || this.getStack().isOf(Items.RABBIT) || this.getStack().isOf(Items.SALMON) ||
                this.islog() || this.getStack().isOf(Items.COBBLESTONE) || this.getStack().isOf(Items.COBBLED_DEEPSLATE) ||
                this.getStack().isOf(Items.CLAY_BALL) ||
                this.getStack().isOf(Items.SAND) || this.getStack().isOf(Items.NETHERRACK) || this.getStack().isOf(items.RESIN)){
            return true;
        }
        else {return false;}
    }
    public void transform(){
        System.out.println("!!!  [[ WOW!!! ]]  its trying to change!!!");
        if (this.islog()){this.setStack(new ItemStack(Items.CHARCOAL,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.RAW_IRON)){this.setStack(new ItemStack(Items.IRON_INGOT,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.RAW_GOLD)){this.setStack(new ItemStack(Items.GOLD_INGOT,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.RAW_COPPER)){this.setStack(new ItemStack(Items.COPPER_INGOT,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.BEEF)){this.setStack(new ItemStack(Items.COOKED_BEEF,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.CHICKEN)){this.setStack(new ItemStack(Items.COOKED_CHICKEN,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.COD)){this.setStack(new ItemStack(Items.COOKED_COD,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.SALMON)){this.setStack(new ItemStack(Items.COOKED_SALMON,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.MUTTON)){this.setStack(new ItemStack(Items.COOKED_MUTTON,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.PORKCHOP)){this.setStack(new ItemStack(Items.COOKED_PORKCHOP,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.RABBIT)){this.setStack(new ItemStack(Items.COOKED_RABBIT,this.getStack().getCount()));}
        else if (this.getStack().isOf(items.RESIN)){this.setStack(new ItemStack(items.PLASTIC,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.COBBLESTONE)){this.setStack(new ItemStack(Items.STONE,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.COBBLED_DEEPSLATE)){this.setStack(new ItemStack(Items.DEEPSLATE,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.SAND)){this.setStack(new ItemStack(Items.GLASS,this.getStack().getCount()));}
        else if (this.getStack().isOf(Items.NETHERRACK)){this.setStack(new ItemStack(Items.NETHER_BRICK,this.getStack().getCount()));}
        
    }






    @Inject(method = "damage",at = @At("HEAD"), cancellable = true)
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> ci) {
        if (this.isInvulnerableTo(source) || this.unburnable()) {
            System.out.println("!!!  [[ WOW!!! ]]  its unburnable!!!");
            ci.setReturnValue(false);
        } else if (this.changeable()){
            System.out.println("!!!  [[ WOW!!! ]]  its burnable!!!");
            this.schedule();
            this.health = (int)((float)this.health - amount);
            this.emitGameEvent(GameEvent.ENTITY_DAMAGED, source.getAttacker());
            if (this.health <= 0) {
                System.out.println("!!!  [[ WOW!!! ]]  its health is 0 or less!!!");
                this.transform();
                this.getStack().onItemEntityDestroyed(((ItemEntity)(Object)this));
                this.discard();
            }}

            ci.setReturnValue(true);
    }
}
