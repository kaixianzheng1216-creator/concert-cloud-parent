package com.example.concert.common.config;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TracingConfig {
    @Bean
    @Primary
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}