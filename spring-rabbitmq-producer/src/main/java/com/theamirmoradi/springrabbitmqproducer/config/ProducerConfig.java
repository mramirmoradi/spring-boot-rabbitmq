package com.theamirmoradi.springrabbitmqproducer.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ProducerConfig {

    @Value("${rabbitmq.queue.direct}")
    private String directQueue;

    @Value("${rabbitmq.routing-key.direct}")
    private String directRoutingKey;

    @Value("${rabbitmq.exchange.direct}")
    private String directExchange;

    @Value("${rabbitmq.exchange.fanout}")
    private String fanoutExchange;

    public String getDirectQueue() {
        return directQueue;
    }

    public String getDirectRoutingKey() {
        return directRoutingKey;
    }

    public String getDirectExchange() {
        return directExchange;
    }

    public String getFanoutExchange() {
        return fanoutExchange;
    }
}
