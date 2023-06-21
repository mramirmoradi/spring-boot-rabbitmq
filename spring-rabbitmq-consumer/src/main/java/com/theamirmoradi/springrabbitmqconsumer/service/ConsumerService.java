package com.theamirmoradi.springrabbitmqconsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    @RabbitListener(queues = "${rabbitmq.queue.one}")
    public void queueOneConsumer(Object payload) {
        log.info("QUEUE ONE: Message Consumed {}", payload);
    }

    @RabbitListener(queues = "${rabbitmq.queue.two}")
    public void queueTwoConsumer(Object payload) {
        log.info("QUEUE TWO: Message Consumed: {}", payload);
    }

    @RabbitListener(queues = "${rabbitmq.queue.three}")
    public void queueThreeConsumer(Object payload) {
        log.info("QUEUE THREE: Message Consumed: {}", payload);
    }

    @RabbitListener(queues = "${rabbitmq.queue.four}")
    public void queueFourConsumer(Object payload) {
        log.info("QUEUE FOUR: Message Consumed: {}", payload);
    }

    @RabbitListener(queues = "${rabbitmq.queue.five}")
    public void queueFiveConsumer(Object payload) {
        log.info("QUEUE FIVE: Message Consumed: {}", payload);
    }
}
