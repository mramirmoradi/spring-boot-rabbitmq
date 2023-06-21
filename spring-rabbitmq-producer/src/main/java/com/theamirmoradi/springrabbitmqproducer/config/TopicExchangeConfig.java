package com.theamirmoradi.springrabbitmqproducer.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TopicExchangeConfig {

    private final AppProperties properties;
    private final QueueConfig queueConfig;

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(properties.getTopicExchange());
    }

    //Bindings
    @Bean
    public Binding queueFourBinding() {
        return BindingBuilder
                .bind(queueConfig.queueFour())
                .to(topicExchange())
                .with(properties.getFourRoutingKey());
    }

    @Bean
    public Binding queueFiveBinding() {
        return BindingBuilder
                .bind(queueConfig.queueFive())
                .to(topicExchange())
                .with(properties.getFiveRoutingKey());
    }
}
