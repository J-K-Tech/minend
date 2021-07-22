package com.jktech.minend.common.events;
import com.jktech.minend.registry.items;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;


@Mixin(ItemEntity.class)
public class itemevents extends ItemEntity {

    private int health;
    public itemevents(World world, double x, double y, double z, ItemStack stack, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y, z, stack, velocityX, velocityY, velocityZ);
    }

    public boolean unburnable(){
        if (this.getStack().isOf(Items.IRON_INGOT) || this.getStack().isOf(Items.GOLD_INGOT) || this.getStack().isOf(Items.COOKED_COD) ||
                this.getStack().isOf(Items.COOKED_BEEF) || this.getStack().isOf(Items.COOKED_CHICKEN) || this.getStack().isOf(Items.COOKED_MUTTON) ||
                this.getStack().isOf(Items.COOKED_PORKCHOP) || this.getStack().isOf(Items.COOKED_RABBIT) || this.getStack().isOf(Items.COOKED_SALMON) ||
                this.getStack().isOf(Items.CHARCOAL) || this.getStack().isOf(Items.STONE) || this.getStack().isOf(Items.DEEPSLATE) || this.getStack().isOf(Items.BRICK) ||
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
                this.islog() || this.getStack().isOf(Items.COBBLESTONE) || this.getStack().isOf(Items.COBBLED_DEEPSLATE) || this.getStack().isOf(Items.CLAY_BALL) ||
                this.getStack().isOf(Items.SAND) || this.getStack().isOf(Items.NETHERRACK) || this.getStack().isOf(items.RESIN)){
            return true;
        }
        else {return false;}
    }
    public void transform(){
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
    public boolean isloot(){
        if (this.getStack().isOf(items.TINY_PACK) || this.getStack().isOf(items.MEDIUM_PACK) || this.getStack().isOf(items.BIG_PACK)){return true;}
        else {return false;}}


    @Inject(method = "tick" ,at = @At("HEAD"))
    public void tick(){
        if (this.getThrower() != null && this.isloot()) {

        }
    }
    @Override
    public boolean damage(DamageSource source, float amount) {
        if (this.isInvulnerableTo(source) || this.unburnable()) {
            return false;
        } else if (!this.getStack().isEmpty() && this.getStack().isOf(Items.NETHER_STAR) && source.isExplosive()) {
            return false;
        } else if (!this.getStack().getItem().damage(source)) {
            return false;
        } else {
            this.scheduleVelocityUpdate();
            this.health = (int)((float)this.health - amount);
            this.emitGameEvent(GameEvent.ENTITY_DAMAGED, source.getAttacker());
            if (this.health <= 0) {
                if (this.changeable()){
                this.transform();
                }
                else{
                this.getStack().onItemEntityDestroyed(this);
                this.discard();
            }}

            return true;
        }
    }
}