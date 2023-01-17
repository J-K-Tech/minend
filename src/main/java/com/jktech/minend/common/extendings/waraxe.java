package com.jktech.minend.common.extendings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.WolfBegGoal;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.jktech.minend.registry.items;
import com.jktech.util.types.Range;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class waraxe extends Item{
    @Nullable
    private String translationKey;
    public attribute NAME = new attribute("");
    public attribute DAMAGE = new attribute("damage",0);
    public attribute SPEED = new attribute("speed",0);
    private final int maxCount=1;
	public waraxe(Settings settings,String name,int dmgmin,int dmgmax,int spd) {
		super(settings);
        Range dmg = new Range(dmgmin,dmgmax);
        NAME.setname(name);DAMAGE.setrange(dmg);SPEED.setvalue(spd);}


    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        if (!itemStack.hasNbt())
        {
            String str1 = "";
            String str2 = "common";
            tooltip.add(new LiteralText("║  " + str1 + "   " + str2));
            tooltip.add(new LiteralText("╚════━━━━━━╾─────"));
            tooltip.add(new LiteralText("\u00A7fDamage: \u00A74" + DAMAGE.range.value1 + " - " + DAMAGE.range.value2));
            tooltip.add(new LiteralText("\u00A7fSpeed: \u00A73" + SPEED.value));
        }
        else{
            int LEVEL = itemStack.getNbt().getInt("level");
            String str1 = "";
            String str2 = "level: ";
            if (LEVEL == -1) {
                str1 = "\u00A77";
                str2 = "inferior";
            } else if (LEVEL >= 1) {
                if (LEVEL <= 7) {
                    str1 = "\u00A7b";
                } else if (7 < LEVEL && LEVEL <= 12) {
                    str1 = "\u00A76";
                } else if (LEVEL > 12 && LEVEL<= 16) {
                    str1 = "\u00A7d";
                }
                str2 += LEVEL;
            } else if (LEVEL> 16 || LEVEL < -1) {
                str1 = "\u00A76\u00A7kfrhuhteahfurhushd";
            }
            tooltip.add(new LiteralText("║  " + str1 + "" + str2));
            tooltip.add(new LiteralText("╚════━━━━━━╾─────"));
            if (LEVEL>=7){tooltip.add(new LiteralText("\u00A7fDamage: \u00A74" + (DAMAGE.range.value1+LEVEL) + " - " + (DAMAGE.range.value2+LEVEL)));}
            if (LEVEL<7){tooltip.add(new LiteralText("\u00A7fDamage: \u00A74" + DAMAGE.range.value1 + " - " + (DAMAGE.range.value2+LEVEL)));}
            tooltip.add(new LiteralText("\u00A7fSpeed: \u00A73" + SPEED.value));

        }

    }
}