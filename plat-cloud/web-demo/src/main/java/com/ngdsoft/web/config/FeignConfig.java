package com.ngdsoft.web.config;

import com.ngdsoft.client.user.UserServiceClient;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }

    //@Bean
    public UserServiceClient.DefaultFallback userServiceClientFallback() {
        return new UserServiceClient.DefaultFallback();
    }
}
