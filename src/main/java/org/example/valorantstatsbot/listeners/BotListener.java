package org.example.valorantstatsbot.listeners;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equals("!ping")) {
            event.getChannel().sendMessage("Pong!").queue();
        }
    }
}
