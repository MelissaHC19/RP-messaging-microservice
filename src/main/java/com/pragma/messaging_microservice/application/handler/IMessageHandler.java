package com.pragma.messaging_microservice.application.handler;

import com.pragma.messaging_microservice.application.dto.request.SendMessageRequest;

public interface IMessageHandler {
    void sendMessage(SendMessageRequest sendMessageRequest);
}
