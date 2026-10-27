package com.lostcities.logfilter.client;

import java.util.List;
import com.lostcities.logfilter.LostCitiesFilterMod;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientChatReceivedEvent;

@EventBusSubscriber(modid = LostCitiesFilterMod.MOD_ID, value = Dist.CLIENT)
public final class ChatMessageFilter {
    private static final List<String> FILTERED_MESSAGES = List.of(
            "There was an error generating a chunk",
            "Signature is missing from Property textures"
    );

    private ChatMessageFilter() {
    }

    @SubscribeEvent
    public static void onChatReceived(ClientChatReceivedEvent event) {
        String message = event.getMessage().getString();
        if (FILTERED_MESSAGES.stream().anyMatch(message::contains)) {
            event.setCanceled(true);
        }
    }
}
