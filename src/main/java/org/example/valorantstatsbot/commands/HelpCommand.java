package org.example.valorantstatsbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.springframework.stereotype.Component;

@Component
public class HelpCommand implements Command{

    @Override
    public void execute(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equals("/help")) {
            event.getChannel().sendMessage("Pong!").queue();
        }
    }
}
