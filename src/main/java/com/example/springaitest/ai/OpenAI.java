package com.example.springaitest.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.stereotype.Component;

@Component
public class OpenAI {

    private final ChatClient chatClient;

    OpenAI(ChatClient chatClient){
        this.chatClient = chatClient;
        chatTest();
    }

    public void chatTest(){
        ChatResponse chatResponse = chatClient.prompt()
                .user("Tell me a joke")
                .system("123")
                .call()
                .chatResponse();
        chatResponse.getResult().getOutput().getContent();
        System.out.println("测试完毕");
    }
}
