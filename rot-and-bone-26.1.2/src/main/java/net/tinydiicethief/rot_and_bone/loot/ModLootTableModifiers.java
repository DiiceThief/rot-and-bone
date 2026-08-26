package net.tinydiicethief.rot_and_bone.loot;

import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.tinydiicethief.rot_and_bone.item.ModItems;

public class ModLootTableModifiers {
    public static void initialize() {}

    public static void modifyLootTables(ResourceKey<LootTable> key, FabricLootTableBuilder builder,
                                        LootTableSource source, HolderLookup.Provider provider) {
        if(key.identifier().equals(Identifier.withDefaultNamespace("entities/zombie"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1f))
                    .when(MatchTool.toolMatches(ItemPredicate.Builder.item()
                                    .of(provider.lookupOrThrow(Registries.ITEM), ModItems.ROTTING_BONE_SICKLE)))
                    .add(LootItem.lootTableItem(ModItems.BRITTLE_FLESH))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1f, 2f)).build());
            builder.pool(poolBuilder.build());
        }
    }
}
