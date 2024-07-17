package com.example.springaitest.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    ChatClient chatClient(ChatClient.Builder builder){
        return builder.build();
    }

}
