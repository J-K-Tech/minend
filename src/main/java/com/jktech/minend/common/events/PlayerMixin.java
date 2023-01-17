package com.jktech.minend.common.events;

import com.jktech.minend.common.extendings.waraxe;
import com.jktech.minend.registry.groups;
import com.jktech.util.types.Range;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
@Mixin(PlayerEntity.class)
public abstract class PlayerMixin extends LivingEntity {
    private PlayerMixin(EntityType<? extends LivingEntity> entityType, World world) {
    super(entityType, world);
    throw new AssertionError();
}
    @ModifyVariable(method = "attack",at=@At(value = "STORE",ordinal = 0),ordinal=1)
    private float minend$attacks(float h){
        ItemStack hand1 = this.getStackInHand(Hand.MAIN_HAND);
        if (hand1.getItem().getGroup()== groups.MINEND_WEAPONS){
            int dmg=0;
            if (hand1.hasNbt()){
                int lv=hand1.getNbt().getInt("level");
                if (lv<=7){dmg=((waraxe)(hand1.getItem())).DAMAGE.range.random()+lv;}
                else {
                    Range rng = new Range(((waraxe)(hand1.getItem())).DAMAGE.range.value1,((waraxe)(hand1.getItem())).DAMAGE.range.value2);
                    dmg=rng.value2+=lv;}
            }
            else{
            dmg=((waraxe)(hand1.getItem())).DAMAGE.range.random();}
            h+=dmg;}
        return h;
    }
}
