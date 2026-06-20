package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.component.ComponentV3;

public class MagicData implements ComponentV3 {
    public static void initialize() {}

    @Override
    public void readData(ValueInput readView) {

    }

    @Override
    public void writeData(ValueOutput writeView) {

    }

    public static final ComponentKey<MagicData> FOCUS =
            ComponentRegistry.getOrCreate(Identifier.fromNamespaceAndPath
                    ("RotAndBone", "MagicData"), MagicData.class);
}
