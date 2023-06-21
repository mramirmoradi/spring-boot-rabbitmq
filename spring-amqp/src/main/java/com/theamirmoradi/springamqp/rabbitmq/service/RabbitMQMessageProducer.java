package com.theamirmoradi.springamqp.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQMessageProducer {

    private final AmqpTemplate amqpTemplate;

    public RabbitMQMessageProducer(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void directPublish(Object payload, String exchange, String routingKey) {
        amqpTemplate.convertAndSend(exchange, routingKey, payload);
    }

    public void fanoutPublish(Object payload, String exchange) {
        amqpTemplate.convertAndSend(exchange, "", payload);
    }

    public void topicPublish(Object payload, String exchange, String routingKey) {
        amqpTemplate.convertAndSend(exchange, routingKey, payload);
    }
}
