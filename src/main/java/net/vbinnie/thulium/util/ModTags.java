package net.vbinnie.thulium.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.vbinnie.thulium.Thulium;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> MADE_OF_THULIUM =
                createBlockTag("made_of_thulium");

        public static final TagKey<Block> DIVINE_WOODS =
                createBlockTag("divine_woods");

        public static final TagKey<Block> TEST_BLOCKS =
                createBlockTag("test_blocks");


        private  static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Thulium.MOD_ID, name));
        }

        private  static TagKey<Block> createCommonBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {

        public static final TagKey<Item> DIVINE_WOODS =
                createItemTag("divine_woods");
        private  static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Thulium.MOD_ID, name));

        }
    }

        private  static TagKey<Item> createCommonItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
    }
}
