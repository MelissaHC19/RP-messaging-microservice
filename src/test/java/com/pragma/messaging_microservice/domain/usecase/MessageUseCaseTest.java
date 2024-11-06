package com.pragma.messaging_microservice.domain.usecase;

import com.pragma.messaging_microservice.domain.model.Message;
import com.pragma.messaging_microservice.domain.spi.IMessageProviderPort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MessageUseCaseTest {
    @Mock
    private IMessageProviderPort messageProviderPort;

    @InjectMocks
    private MessageUseCase messageUseCase;

    @Test
    @DisplayName("Sends message successfully")
    void sendMessage() {
        Message message = new Message("+573205898802", "Test message");

        messageUseCase.sendMessage(message);

        Mockito.verify(messageProviderPort, Mockito.times(1)).sendMessage(message);
    }
}