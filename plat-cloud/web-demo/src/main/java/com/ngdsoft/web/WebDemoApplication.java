package com.ngdsoft.web;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.ngdsoft.client.**")//单独 jar 包需要指定 package
@SpringBootApplication
public class WebDemoApplication {

    @Bean
    Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebDemoApplication.class, args);
    }
}
