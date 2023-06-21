package com.theamirmoradi.springrabbitmqproducer.service;

import com.theamirmoradi.springamqp.rabbitmq.service.RabbitMQMessageProducer;
import com.theamirmoradi.springrabbitmqproducer.config.AppProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final RabbitMQMessageProducer rabbitMQProducer;
    private final AppProperties config;

    //Queue one declared to direct exchange only
    public void directPublish(Object payload) {
        rabbitMQProducer.directPublish(
                payload,
                config.getDirectExchange(),
                config.getOneRoutingKey()
        );
    }

    //Queue two, Three declared to fanout exchange only
    public void fanoutPublish(Object payload) {
        rabbitMQProducer.fanoutPublish(
                payload,
                config.getFanoutExchange()
        );
    }

    //Queue four, five declared to topic exchange only with these routing keys (four: sport.*, five: sport.#)
    public void topicPublish(Object payload, String routingKey) {
        rabbitMQProducer.topicPublish(
                payload,
                config.getTopicExchange(),
                routingKey
        );
    }

}
