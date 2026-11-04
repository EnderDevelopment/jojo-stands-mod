package com.example.jojomod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screens.MenuScreens;

public class JoJoModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MenuScreens.register(StandMenuHandler.STAND_MENU, StandMenuScreen::new);
    }
}