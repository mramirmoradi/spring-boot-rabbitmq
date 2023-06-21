package com.theamirmoradi.springrabbitmqproducer.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class QueueConfig {

    private final AppProperties properties;

    @Bean
    public Queue queueOne() {
        return new Queue(properties.getQueueOne());
    }

    @Bean
    public Queue queueTwo() {
        return new Queue(properties.getQueueTwo());
    }

    @Bean
    public Queue queueThree() {
        return new Queue(properties.getQueueThree());
    }

    @Bean
    public Queue queueFour() {
        return new Queue(properties.getQueueFour());
    }

    @Bean
    public Queue queueFive() {
        return new Queue(properties.getQueueFive());
    }
}
