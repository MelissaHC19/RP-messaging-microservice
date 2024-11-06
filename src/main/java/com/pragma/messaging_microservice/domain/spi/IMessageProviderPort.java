package com.pragma.messaging_microservice.domain.spi;

import com.pragma.messaging_microservice.domain.model.Message;

public interface IMessageProviderPort {
    void sendMessage(Message message);
}
