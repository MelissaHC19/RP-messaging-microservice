package com.pragma.messaging_microservice.infrastructure.constants;

public class AwsConstants {
    private AwsConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String ACCESS_KEY_NAME = "access_key";
    public static final String SECRET_ACCESS_KEY_NAME = "secret_access_key";
    public static final String ACCESS_KEY = System.getenv(ACCESS_KEY_NAME);
    public static final String SECRET_ACCESS_KEY = System.getenv(SECRET_ACCESS_KEY_NAME);
}
