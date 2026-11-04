package com.example.jojomod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.InteractionResult;

public class StandMenuItem extends Item {
    public StandMenuItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        if (player != null) {
            player.openMenu(new StandMenuHandler.StandMenuProvider());
        }
        return InteractionResult.SUCCESS;
    }
}