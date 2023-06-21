package com.theamirmoradi.springrabbitmqproducer.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DirectExchangeConfig {

    private final AppProperties properties;
    private final QueueConfig queueConfig;

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(properties.getDirectExchange());
    }

    //Bindings
    @Bean
    public Binding queueOneExchangeBinding() {
        return BindingBuilder
                .bind(queueConfig.queueOne())
                .to(directExchange())
                .with(properties.getOneRoutingKey());
    }
}
