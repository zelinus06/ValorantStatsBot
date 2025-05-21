package org.example.valorantstatsbot;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.valorantstatsbot.services.BotService;
import org.example.valorantstatsbot.services.Impl.BotServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ValorantStatsBotApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ValorantStatsBotApplication.class, args);
        BotService botService = context.getBean(BotService.class);
        botService.startBot();
    }
}
