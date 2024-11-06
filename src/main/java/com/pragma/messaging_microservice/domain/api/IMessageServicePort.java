package com.pragma.messaging_microservice.domain.api;

import com.pragma.messaging_microservice.domain.model.Message;

public interface IMessageServicePort {
    void sendMessage(Message message);
}
