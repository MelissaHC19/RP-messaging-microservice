package com.pragma.messaging_microservice.infrastructure.output.sns;

import com.pragma.messaging_microservice.domain.model.Message;
import com.pragma.messaging_microservice.domain.spi.IMessageProviderPort;
import lombok.RequiredArgsConstructor;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;

@RequiredArgsConstructor
public class SnsAdapter implements IMessageProviderPort {
    private final SnsClient snsClient;

    @Override
    public void sendMessage(Message message) {
        PublishRequest request = PublishRequest.builder()
                .message(message.getMessage())
                .phoneNumber(message.getPhoneNumber())
                .build();
        snsClient.publish(request);
    }
}
