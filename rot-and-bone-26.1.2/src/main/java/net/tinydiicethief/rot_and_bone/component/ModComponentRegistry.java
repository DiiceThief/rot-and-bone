package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.resources.Identifier;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;

public class ModComponentRegistry {
    public static final ComponentKey<corruptioncomponent> CORRUPTION_COMPONENT_KEY =
            ComponentRegistry.getOrCreate
                    (Identifier.fromNamespaceAndPath("rotandbone", "corruptionComponent"),
                            corruptioncomponent.class);
}