package com.spring.boot2.configuration.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.demo")
public class DemoConfiguration {

    private Duration duration;
}
