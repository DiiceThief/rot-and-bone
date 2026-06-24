package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.ladysnake.cca.api.v3.component.ComponentV3;

public class MagicData implements ComponentV3 {
    //initialize
    public static void initialize() {
    }

    //I don't know what these do but was told to use them. Why does it return 0?
    int getFocus() {
        return 0;
    }

    void setFocus(int focus) {

    }

    int getMaxFocus() {
        return 0;
    }
    int getClarity() {
        return 0;
    }
    void setClarity(int clarity) {
    }

    int getMaxClarity() {
        return 0;
    }

    @Override
    public void readData(ValueInput readView) {

    }

    @Override
    public void writeData(ValueOutput writeView) {

    }
}
