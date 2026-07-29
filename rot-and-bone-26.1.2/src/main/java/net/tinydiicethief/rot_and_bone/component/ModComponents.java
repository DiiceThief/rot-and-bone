package net.tinydiicethief.rot_and_bone.component;

import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;

public final class ModComponents implements EntityComponentInitializer {
    public static final ComponentKey<CorruptionComponent> CORRUPTION =

    @Override
    public void registerEntityComponentFactories(
            EntityComponentFactoryRegistry entityComponentFactoryRegistry) {
        entityComponentFactoryRegistry.registerForPlayers(
                CORRUPTION, PlayerIntComponent::new);
    }
}
