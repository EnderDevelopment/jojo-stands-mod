package com.example.jojomod;

import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.network.IContainerFactory;

public class StandMenuHandler {
    public static final MenuType<StandMenuContainer> STAND_MENU = new MenuType<>(new IContainerFactory<StandMenuContainer>() {
        @Override
        public StandMenuContainer create(int windowId, Inventory inv, Player player) {
            return new StandMenuContainer(windowId, inv, player);
        }
    });

    public static class StandMenuProvider implements MenuProvider {
        @Override
        public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
            return new StandMenuContainer(STAND_MENU, id, inventory);
        }

        @Override
        public Component getDisplayName() {
            return Component.literal("Stand Menu");
        }
    }
}