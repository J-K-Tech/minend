package com.jktech.minend.common.extendings;

import java.util.ArrayList;
import java.util.List;

import com.jktech.minend.registry.LootpackItem;
import com.jktech.minend.registry.items;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;

public class lootevents extends EggEntity {
    private Boolean got;
    public final ThrownItemEntity ent = ((ThrownItemEntity)(Object)this);
    public static EntityType<lootevents> looteventsEntityType;
    public lootevents(World world, LivingEntity owner) {
        super(world, owner);
    }




    public lootevents(EntityType<Entity> entityType,LivingEntity owner, World world) {
        super(looteventsEntityType, world);
    }

    public void handleStatus(byte status) {
        if (status == 3) {
            double d = 0.08D;

            for(int i = 0; i < 8; ++i) {
                this.world.addParticle(new ItemStackParticleEffect(ParticleTypes.ITEM, this.getStack()), this.getX(), this.getY(), this.getZ(), ((double)this.random.nextFloat() - 0.5D) * 0.08D, ((double)this.random.nextFloat() - 0.5D) * 0.08D, ((double)this.random.nextFloat() - 0.5D) * 0.08D);
            }
        }

    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        entityHitResult.getEntity().damage(DamageSource.thrownProjectile(this, this.getOwner()), 0.0F);
    }
    @Override
    protected Item getDefaultItem() {
        return null;
    }


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
            else if (ent.getStack().isOf(items.BIG_PACK)){message();loot = items.BIG_PACK.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.BOX_1)){message();loot = items.BOX_1.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.BOX_2)){message();loot = items.BOX_2.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.BOX_3)){message();loot = items.BOX_3.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.BOX_4)){message();loot = items.BOX_4.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.BOX_5)){message();loot = items.BOX_5.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.BOX_6)){message();loot = items.BOX_6.sortloot(player);this.got = true;}
            else if (ent.getStack().isOf(items.BOX_7)){message();loot = items.BOX_7.sortloot(player);this.got = true;}}
        if (this.got == true){for (int i = 0;i < loot.size(); i++){this.setsta(loot.get(i));}}else{;}
        ent.discard();
    }



    @Override
    public void onCollision(HitResult hitResult){if ((ent.getStack().getItem() instanceof LootpackItem))
        {System.out.println("!!!  [[ WOW!!! ]]  its trying to sort!!!");this.sortloot(1);this.discard();return;}}
}
