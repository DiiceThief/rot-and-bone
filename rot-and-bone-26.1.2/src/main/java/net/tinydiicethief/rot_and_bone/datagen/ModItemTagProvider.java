package net.tinydiicethief.rot_and_bone.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.tinydiicethief.rot_and_bone.RotAndBone;
import net.tinydiicethief.rot_and_bone.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output,
                              CompletableFuture<HolderLookup.Provider>
                                      registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(SICKLES)
                .add(ModItems.ROTTING_BONE_SICKLE)
                .setReplace(true);

        valueLookupBuilder(DECAYED_ITEMS)
                .add(ModItems.BRITTLE_FLESH)
                .add(ModItems.ROTTING_BONE)
                .setReplace(true);}
    public static final TagKey<Item> SICKLES = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(RotAndBone.MOD_ID, "sickles"));
    public static final TagKey<Item> DECAYED_ITEMS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(RotAndBone.MOD_ID, "decayed_items"));
}