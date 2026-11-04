package com.example.jojomod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class StarPlatinumBlock extends Block {
    public StarPlatinumBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f, 6.0f));
    }
}