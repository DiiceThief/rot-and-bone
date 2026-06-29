package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.ladysnake.cca.api.v8.component.CardinalComponent;

public class FocusAndClarity implements CardinalComponent {
    public static void initialize() {}

    //I don't know what these do but was told to use them. Why does it return 0?
    int getFocus() {
        return FOCUS;
    }

    void setFocus(int focus) {

    }

    int getMaxFocus() {
        return 0;
    }
    int getClarity() {
        return CLARITY;
    }
    void setClarity(int clarity) {
    }

    int getMaxClarity() {
        return 0;
    }
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
    public void readData(ValueInput readView) {

    }

    @Override
    public void writeData(ValueOutput writeView) {

    }
}