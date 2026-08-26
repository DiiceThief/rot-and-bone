package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.ladysnake.cca.api.v8.component.CardinalComponent;

public class corruptioncomponent implements CardinalComponent {

    private int corruption = 0;
    private int overflowTimer = 0;
    private static final int MAX = 100;

    public int getCorruption() {
        return corruption;
    }

    public int getMaxCorruption() {
        return MAX;
    }

    public void addCorruption(int amount) {
        corruption += amount;
    }

    public void removeCorruption(int amount) {
        corruption = Math.max(0, corruption - amount);
    }

    public boolean isOverflowing() {
        return corruption > MAX;
    }

    public void tick(ServerPlayer player) {

        if(isOverflowing()) {
            overflowTimer++;
            if(overflowTimer >= 200) {

                overflowTimer = 0;
            }
        } else {
            overflowTimer = 0;
        }
    }

    @Override
    public void readData(ValueInput valueInput) {

    }

    @Override
    public void writeData(ValueOutput valueOutput) {

    }
}
