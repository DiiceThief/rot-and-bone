package net.tinydiicethief.rot_and_bone.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.tinydiicethief.rot_and_bone.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output,
                             CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider
            (HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                //Shaped Recipe List
                shaped(RecipeCategory.COMBAT, ModItems.ROTTING_BONE_SICKLE, 1)
                        .pattern("##")
                        .pattern(" S")
                        .pattern(" S")
                        .define('#', ModItems.ROTTING_BONE)
                        .define('S', Items.STICK)
                        .group("multi_bench")
                        .unlockedBy(getHasName(ModItems.ROTTING_BONE), has(ModItems.ROTTING_BONE))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.SIMPLE_CATALYST, 1)
                        .pattern("#")
                        .pattern("S")
                        .pattern("S")
                        .define('#', Items.DIAMOND)
                        .define('S', Items.STICK)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.GRAVE_STEEL_SICKLE, 1)
                        .pattern("##")
                        .pattern(" S")
                        .pattern(" S")
                        .define('#', ModItems.GRAVE_STEEL_INGOT)
                        .define('S', Items.STICK)
                        .group("multi_bench")
                        .unlockedBy(getHasName(ModItems.GRAVE_STEEL_INGOT), has(ModItems.GRAVE_STEEL_INGOT))
                        .save(output);

                //Shapeless Recipe List
                shapeless(RecipeCategory.MISC, ModItems.BRITTLE_FLESH)
                        .requires(Items.ROTTEN_FLESH)
                        .requires(Items.BONE_MEAL)
                        .unlockedBy(getHasName(Items.BONE_MEAL), has(Items.BONE_MEAL))
                        .unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                        .save(output);
                shapeless(RecipeCategory.MISC, ModItems.ROTTING_BONE)
                        .requires(Items.BONE)
                        .requires(Items.ROTTEN_FLESH)
                        .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                        .unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                        .save(output);

                //smelting recipes
                oreSmelting(
                        List.of(ModItems.RAW_GRAVE_STEEL),
                        RecipeCategory.MISC,
                        CookingBookCategory.MISC,
                        ModItems.GRAVE_STEEL_INGOT,
                        0.1f,
                        300,
                        "rot_and_bone"
                );
            }
        };
    }

    @Override
    public String getName() {
        return "ModRecipeProvider";
    }
}
