package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.ladysnake.cca.api.v3.component.ComponentFactory;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.component.ComponentV3;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;
import org.ladysnake.cca.api.v3.entity.RespawnableComponent;
import org.ladysnake.cca.api.v8.component.CardinalComponent;
import org.ladysnake.cca.internal.base.ComponentRegistrationInitializer;

import java.util.function.Predicate;

public class ModComponentRegistry implements ComponentRegistrationInitializer {
    public static final ComponentKey<corruptioncomponent> CORRUPTION =
            ComponentRegistry.getOrCreate
                    (Identifier.fromNamespaceAndPath("rotandbone", "corruptioncomponent"),
                            corruptioncomponent.class);
}