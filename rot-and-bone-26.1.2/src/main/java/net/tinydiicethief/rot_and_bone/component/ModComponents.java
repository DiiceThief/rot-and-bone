package net.tinydiicethief.rot_and_bone.component;

import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;

public final class ModComponents implements EntityComponentInitializer {
    public static final ComponentKey<FocusAndClarity> FOCUS_AND_CLARITY =

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerFor(FOCUS_AND_CLARITY,);
    }
}
