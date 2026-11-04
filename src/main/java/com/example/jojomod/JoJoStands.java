package com.example.jojomod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JoJoStands {
    public static final DeferredRegister<Item> STANDS = DeferredRegister.create(ForgeRegistries.ITEMS, JoJoMod.MODID);

    public static final RegistryObject<Item> STAR_PLATINUM = STANDS.register("star_platinum", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> THE_WORLD = STANDS.register("the_world", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KILLER_QUEEN = STANDS.register("killer_queen", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STONE_FREE = STANDS.register("stone_free", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GOLD_EXPERIENCE = STANDS.register("gold_experience", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_BALL_RUN = STANDS.register("steel_ball_run", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KING_CRIMSON = STANDS.register("king_crimson", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HIEROPHANT_GREEN = STANDS.register("hierophant_green", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register() {
        STANDS.register();
    }
}