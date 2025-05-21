package org.example.valorantstatsbot.services.Impl;

import jakarta.annotation.PostConstruct;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.example.valorantstatsbot.listeners.MessageListener;
import org.example.valorantstatsbot.services.BotService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BotServiceImpl implements BotService {

    @Value("${api.token}")
    String botToken;

    @PostConstruct
    public void printToken() {
        System.out.println("Test" + botToken);
    }

    @Override
    public void startBot() {
        MessageListener messageListener = new MessageListener();
//        String botToken = System.getenv("DISCORD_BOT_TOKEN");
        System.out.println("Bottoken"+ botToken);
        try {
            JDABuilder.createDefault(botToken, GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.DIRECT_MESSAGES)
                    .setActivity(Activity.playing("Type /help"))
                    .addEventListeners(messageListener)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
