package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;

public class FocusAndClarity extends MagicData {

    //I don't know why these do things twice?
    private final Player player;

    public FocusAndClarity(Player player) {
        this.player = player;
    }

    //These should be right?
    private int FOCUS = 100;
    private int CLARITY = 100;

    public FocusAndClarity(Player player, int FOCUS, int CLARITY) {
        this.player = player;
    }
    @Override
    public int getFocus() {
        return FOCUS;
    }

    //why must I not understand this?
    @Override
    public void setFocus(int Focus) {
        this.FOCUS = Math.clamp(getMaxFocus(), 0, Focus);

        FocusAndClarity.FOCUS.sync(player);
    }

    @Override
    public int getMaxFocus() {
        return FOCUS;
    }

    @Override
    public int getClarity() {
        return CLARITY;
    }

    @Override
    public void setClarity(int Clarity) {
        this.CLARITY = Math.clamp(getMaxClarity(), 0, Clarity);

        FocusAndClarity.CLARITY.sync(player);
    }

    @Override
    public int getMaxClarity() {
        return CLARITY;
    }

    @Override
    public void readData(ValueInput readView) {

    }

    @Override
    public void writeData(ValueOutput writeView) {

    }
}
