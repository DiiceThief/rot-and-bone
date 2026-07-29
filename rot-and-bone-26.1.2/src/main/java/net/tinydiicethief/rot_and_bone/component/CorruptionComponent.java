package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.ladysnake.cca.api.v8.component.CardinalComponent;

public class CorruptionComponent implements CardinalComponent {

    //Are these right?
    private int maxCorruption = 100;

    private int baseCorruption = 0;

    public static void initialize() {}

    @Override
    public void readData(ValueInput valueInput) {

    }

    @Override
    public void writeData(ValueOutput valueOutput) {

    }

    public int getMaxCorruption() {
        return maxCorruption;
    }

    public void setMaxCorruption(int maxCorruption) {
        this.maxCorruption = maxCorruption;
    }

    public int getBaseCorruption() {
        return baseCorruption;
    }

    public void setBaseCorruption(int baseCorruption) {
        this.baseCorruption = baseCorruption;
    }
}
