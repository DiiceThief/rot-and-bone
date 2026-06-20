package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.nbt.CompoundTag;

public interface ComponentInterface {
    void readFromNbt(CompoundTag tag);
    void writeToNbt(CompoundTag tag);

    static void initialize() {}
}
