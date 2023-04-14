package org.starminer_reborn.starminer.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.starminer_reborn.starminer.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab STARMIER_TAB = new CreativeModeTab("Starminer_Reborn") {
        @Override
        public ItemStack makeIcon() {
        return new ItemStack(ModBlocks.CAMELIA_FLOWER.get());
        }
    };
}
//e