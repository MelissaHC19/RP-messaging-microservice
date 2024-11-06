package com.pragma.messaging_microservice.application.handler;

import com.pragma.messaging_microservice.application.dto.request.SendMessageRequest;
import com.pragma.messaging_microservice.application.mapper.ISendMessageRequestMapper;
import com.pragma.messaging_microservice.domain.api.IMessageServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MessageHandler implements IMessageHandler{
    private final IMessageServicePort messageServicePort;
    private final ISendMessageRequestMapper sendMessageRequestMapper;

    @Override
    public void sendMessage(SendMessageRequest sendMessageRequest) {
        messageServicePort.sendMessage(sendMessageRequestMapper.requestToMessage(sendMessageRequest));
    }
}
