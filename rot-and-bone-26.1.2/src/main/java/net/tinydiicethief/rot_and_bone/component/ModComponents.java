package net.tinydiicethief.rot_and_bone.component;

import net.minecraft.resources.Identifier;
import net.tinydiicethief.rot_and_bone.RotAndBone;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;

public final class ModComponents implements EntityComponentInitializer {
    public static final ComponentKey<CorruptionComponent> CORRUPTION =
            ComponentRegistry.getOrCreate(Identifier.fromNamespaceAndPath(
                    RotAndBone.MOD_ID, "corruption"), CorruptionComponent.class);

    @Override
    public void registerEntityComponentFactories(
            EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(CORRUPTION, it -> PlayerIntComponent);
    }
}