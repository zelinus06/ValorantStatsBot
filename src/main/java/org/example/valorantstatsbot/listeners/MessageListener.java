package org.example.valorantstatsbot.listeners;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.example.valorantstatsbot.commands.Command;
import org.example.valorantstatsbot.commands.CommandFactory;
import org.example.valorantstatsbot.commands.HelpCommand;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        CommandFactory commandFactory = new CommandFactory();
        commandFactory.getCommand(event);
    }
}
