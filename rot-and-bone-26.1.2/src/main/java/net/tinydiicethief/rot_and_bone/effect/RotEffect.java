package net.tinydiicethief.rot_and_bone.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class RotEffect extends MobEffect {
    protected RotEffect(MobEffectCategory category, int duration) {
        super(MobEffectCategory.HARMFUL, 816060);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        if (entity instanceof Player) {
            ((Player) entity).giveExperiencePoints(1 << amplifier);
        }

        return super.applyEffectTick(level, entity, amplifier);
    }
}
