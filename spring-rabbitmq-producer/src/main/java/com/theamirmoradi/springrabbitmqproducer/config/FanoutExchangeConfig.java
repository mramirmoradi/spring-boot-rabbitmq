package com.theamirmoradi.springrabbitmqproducer.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FanoutExchangeConfig {

    private final AppProperties properties;
    private final QueueConfig queueConfig;

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(properties.getFanoutExchange());
    }

    //Bindings
    @Bean
    public Binding queueTwoExchangeBinding() {
        return BindingBuilder
                .bind(queueConfig.queueTwo())
                .to(fanoutExchange());
    }

    @Bean
    public Binding queueThreeExchangeBinding() {
        return BindingBuilder
                .bind(queueConfig.queueThree())
                .to(fanoutExchange());
    }
}
