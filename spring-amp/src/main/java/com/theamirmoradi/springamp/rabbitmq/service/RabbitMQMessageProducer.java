package com.theamirmoradi.springamp.rabbitmq.service;

import com.theamirmoradi.springamp.core.service.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RabbitMQMessageProducer implements MessageProducer {

    private final AmqpTemplate amqpTemplate;

    public void publish(Object payload, String exchange, String routingKey) {
        amqpTemplate.convertAndSend(exchange, routingKey, payload);
    }
}
