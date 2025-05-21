package org.example.valorantstatsbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private final Map<String, Command> commands = new HashMap<>();

    public CommandFactory() {
        commands.put("/help", new HelpCommand());
        // Thêm các lệnh khác tại đây
    }

    public Command getCommand(MessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();
        if (event.getMessage().getContentRaw().equals("/help")) {
            event.getChannel().sendMessage("Pong!").queue();
        }




        return commands.getOrDefault(message, null);
    }
}
