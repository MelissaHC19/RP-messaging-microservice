package com.pragma.messaging_microservice.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SendMessageRequest {
    private String phoneNumber;
    private String message;
}
