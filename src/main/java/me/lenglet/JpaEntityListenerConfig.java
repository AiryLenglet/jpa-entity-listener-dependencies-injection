package me.lenglet;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class JpaEntityListenerConfig {

    @EventListener(ApplicationReadyEvent.class)
    public void BookListenerConfiguration() {
        BookListener.Dependencies.INSTANCE.set(() -> {
        });
    }
}
