package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.resources.Identifier;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;

public class ModComponentRegistry {
    public static final ComponentKey<FocusAndClarity> FOCUS_AND_CLARITY =
            ComponentRegistry.getOrCreate
                    (Identifier.fromNamespaceAndPath("rotandbone", "focusandclarity"),
                            FocusAndClarity.class);
}