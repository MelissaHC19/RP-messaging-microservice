package com.pragma.messaging_microservice.domain.usecase;

import com.pragma.messaging_microservice.domain.api.IMessageServicePort;
import com.pragma.messaging_microservice.domain.model.Message;
import com.pragma.messaging_microservice.domain.spi.IMessageProviderPort;

public class MessageUseCase implements IMessageServicePort {
    private final IMessageProviderPort messageProviderPort;

    public MessageUseCase(IMessageProviderPort messageProviderPort) {
        this.messageProviderPort = messageProviderPort;
    }

    @Override
    public void sendMessage(Message message) {
        messageProviderPort.sendMessage(message);
    }
}
