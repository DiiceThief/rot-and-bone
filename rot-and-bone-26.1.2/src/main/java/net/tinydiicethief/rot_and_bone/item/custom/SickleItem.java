package net.tinydiicethief.rot_and_bone.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SickleItem extends Item {
    public SickleItem(Properties properties) {
        super(properties);
    }

    public static void initialize() {}

    @Override
    public void hurtEnemy (ItemStack stack,
                           LivingEntity target,
                           LivingEntity attacker) {
        super.hurtEnemy(stack, target, attacker);
    }
}