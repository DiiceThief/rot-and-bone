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

public class ModComponentRegistry implements EntityComponentFactoryRegistry {
    public static final ComponentKey<corruptioncomponent> CORRUPTION_COMPONENT_KEY =
            ComponentRegistry.getOrCreate
                    (Identifier.fromNamespaceAndPath("rotandbone", "corruptioncomponent"),
                            corruptioncomponent.class);

    @Override
    public <C extends CardinalComponent,
            E extends Entity> void registerFor
            (Class<E> aClass, ComponentKey<C> componentKey,
             ComponentFactory<E, ? extends C> componentFactory) {

    }

    @Override
    public <C extends CardinalComponent>
    void registerFor(Predicate<Class<? extends Entity>> predicate, ComponentKey<C>
            componentKey, ComponentFactory<Entity, C> componentFactory) {

    }

    @Override
    public <C extends CardinalComponent,
            E extends Entity> Registration<C, E>
    beginRegistration(Class<E> aClass, ComponentKey<C> componentKey) {
        return null;
    }

    @Override
    public <C extends RespawnableComponent<? super C>>
    void registerForPlayers(ComponentKey<? super C> componentKey,
                            ComponentFactory<Player, C> componentFactory) {

    }

    @Override
    public <C extends CardinalComponent, P extends C>
    void registerForPlayers(ComponentKey<C> componentKey,
                            ComponentFactory<Player, P> componentFactory,
                            RespawnCopyStrategy<? super P> respawnCopyStrategy) {

    }
}