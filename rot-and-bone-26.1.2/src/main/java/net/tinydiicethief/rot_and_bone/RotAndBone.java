package net.tinydiicethief.rot_and_bone;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.tinydiicethief.rot_and_bone.block.ModBlockFamilies;
import net.tinydiicethief.rot_and_bone.block.ModBlocks;
import net.tinydiicethief.rot_and_bone.item.ModItemGroups;
import net.tinydiicethief.rot_and_bone.item.ModItems;
import net.tinydiicethief.rot_and_bone.item.custom.CatalystItem;
import net.tinydiicethief.rot_and_bone.item.custom.SickleItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RotAndBone implements ModInitializer {
	public static final String MOD_ID = "rot_and_bone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		//Classes
		ModItems.initialize();
		ModBlocks.initialize();
		ModItemGroups.initialize();
		ModBlockFamilies.initialize();
		CatalystItem.initialize();
		SickleItem.initialize();

		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
				ModItemGroups.ROT_AND_BONE_TAB_KEY, ModItemGroups.ROT_AND_BONE_TAB);

		//Loot Table Modifications
		LootTableEvents.MODIFY.register(((resourceKey,
										  builder,
										  lootTableSource,
										  provider) -> {
			if (resourceKey.equals(EntityType.ZOMBIE.getDefaultLootTable())) {
				LootPool.Builder pool = LootPool.lootPool()
						.add(LootItem.lootTableItem(ModItems.BRITTLE_FLESH))
						.when(MatchTool.toolMatches
								(ItemPredicate.Builder.item()
										.of((HolderGetter<Item>)
												ModItems.ROTTING_BONE_SICKLE)
								)
						);
				lootTableSource.isBuiltin();
			}
		}));

		LOGGER.info("Testing Message");
	}
}