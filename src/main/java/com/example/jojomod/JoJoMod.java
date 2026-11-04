package com.example.jojomod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JoJoMod implements ModInitializer {
    public static final String MODID = "jojo_mod";

    // Register items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> STAR_PLATINUM_PICKAXE = ITEMS.register("star_platinum_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    // Register blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final RegistryObject<Block> STAR_PLATINUM_BLOCK = BLOCKS.register("star_platinum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f, 6.0f)));

    @Override
    public void onInitialize() {
        // Initialize your mod here
        ITEMS.register();
        BLOCKS.register();
    }
}