package org.example.valorantstatsbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.example.valorantstatsbot.listeners.BotListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValorantStatsBotApplication {

    public static void main(String[] args) {
        String botToken = System.getenv("DISCORD_BOT_TOKEN");
        JDABuilder.createDefault(botToken, GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT)
                .setActivity(Activity.playing("Type !ping"))
                .addEventListeners(new BotListener())
                .build();
        SpringApplication.run(ValorantStatsBotApplication.class, args);
        SpringApplication.run(ValorantStatsBotApplication.class, args);
    }

}
