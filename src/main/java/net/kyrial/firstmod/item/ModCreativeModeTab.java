package net.kyrial.firstmod.item;

import net.kyrial.firstmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FIRST_TAB = new CreativeModeTab("firsttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CITRINE_BLOCK.get());
        }
    };
}
