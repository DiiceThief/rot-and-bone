package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.ladysnake.cca.api.v8.component.CardinalComponent;

public class CorruptionComponent implements CardinalComponent {

    private int corruption = 0;
    private int overflowTimer = 0;
    private static final int MAX = 100;

    @Override
    public int getCorruption() {
        return corruption;
    }

    @Override
    public int getMaxCorruption() {
        return MAX;
    }

    @Override
    public void addCorruption(int amount) {
        corruption += amount;
    }

    @Override
    public void removeCorruption(int amount) {
        corruption = Math.max(0, corruption - amount);
    }

    @Override
    public boolean isOverflowing() {
        return corruption > MAX;
    }

    @Override
    public void tick(ServerPlayer player) {
        if(player.age % 100 == 0) {
            removeCorruption(1);
        }

        if(isOverflowing()) {
            overflowTimer++;
            if(overflowTimer > overflowTimer >= 200) {
                spawnSpirit(player);

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
