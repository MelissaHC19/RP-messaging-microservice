package com.pragma.messaging_microservice.infrastructure.input.rest;

import com.pragma.messaging_microservice.application.dto.request.SendMessageRequest;
import com.pragma.messaging_microservice.application.handler.IMessageHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
@RequiredArgsConstructor
public class MessageRestControllerAdapter {
    private final IMessageHandler messageHandler;

    @PostMapping("/send-message")
    public ResponseEntity<Void> sendMessage(@RequestBody SendMessageRequest sendMessageRequest) {
        messageHandler.sendMessage(sendMessageRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
