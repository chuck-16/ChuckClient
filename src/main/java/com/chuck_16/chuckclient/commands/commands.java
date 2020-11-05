package com.chuck_16.chuckclient.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class commands {
    public static String[] commands;
    private static LivingEntity player = Minecraft.getInstance().player;
    @SubscribeEvent
    private static void onCommand(ClientChatEvent event){
        event.setCanceled(true);
        player.setJumping(true);
        event.setCanceled(false);
    }
}
