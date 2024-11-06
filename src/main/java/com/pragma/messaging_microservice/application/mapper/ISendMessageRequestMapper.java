package com.pragma.messaging_microservice.application.mapper;

import com.pragma.messaging_microservice.application.dto.request.SendMessageRequest;
import com.pragma.messaging_microservice.domain.model.Message;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ISendMessageRequestMapper {
    Message requestToMessage(SendMessageRequest sendMessageRequest);
}
