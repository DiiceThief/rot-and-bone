package net.tinydiicethief.rot_and_bone.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.tinydiicethief.rot_and_bone.RotAndBone;

import java.util.function.Function;

public class ModBlocks {

    //initializer
    public static void initialize() {}

    private static Block register(String name, Function<BlockBehaviour.Properties, Block>
            blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));
        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(RotAndBone.MOD_ID, name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(RotAndBone.MOD_ID, name));
    }
    public static final Block GRAVESOIL = register("gravesoil",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.ROOTED_DIRT),
            true);

    //Gravebricks
    public static final Block GRAVEBRICKS = register("gravebricks",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);
    public static final Block GRAVEBRICK_STAIRS = register("gravebrick_stairs",
            settings -> new StairBlock(GRAVEBRICKS.defaultBlockState(), settings),
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);
    public static final Block GRAVEBRICK_SLAB = register("gravebrick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);
    public static final Block GRAVEBRICK_WALL = register("gravebrick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);
    public static final Block CHISELED_GRAVEBRICKS = register("chiseled_gravebricks",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);

    //Cracked Gravebricks
    public static final Block CRACKED_GRAVEBRICKS = register("cracked_gravebricks",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);
    public static final Block CRACKED_GRAVEBRICK_STAIRS = register("cracked_gravebrick_stairs",
            settings -> new StairBlock(CRACKED_GRAVEBRICKS.defaultBlockState(), settings),
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);
    public static final Block CRACKED_GRAVEBRICK_SLAB = register("cracked_gravebrick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);
    public static final Block CRACKED_GRAVEBRICK_WALL = register("cracked_gravebrick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS),
            true);
}