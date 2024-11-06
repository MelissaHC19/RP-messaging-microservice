package com.pragma.messaging_microservice.infrastructure.configuration;

import com.pragma.messaging_microservice.domain.api.IMessageServicePort;
import com.pragma.messaging_microservice.domain.spi.IMessageProviderPort;
import com.pragma.messaging_microservice.domain.usecase.MessageUseCase;
import com.pragma.messaging_microservice.infrastructure.constants.AwsConstants;
import com.pragma.messaging_microservice.infrastructure.output.sns.SnsAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    @Bean
    public SnsClient snsClient() {
        return SnsClient.builder()
                .region(Region.US_EAST_1)
                .credentialsProvider(StaticCredentialsProvider.create(
                        AwsBasicCredentials.create(
                                AwsConstants.ACCESS_KEY,
                                AwsConstants.SECRET_ACCESS_KEY)
                ))
                .build();
    }

    @Bean
    public IMessageProviderPort messageProviderPort() {
        return new SnsAdapter(snsClient());
    }

    @Bean
    public IMessageServicePort messageServicePort() {
        return new MessageUseCase(messageProviderPort());
    }
}
