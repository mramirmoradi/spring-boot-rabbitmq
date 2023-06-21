package com.theamirmoradi.springrabbitmqproducer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppProperties {

    @Value("${rabbitmq.queue.one}")
    private String queueOne;

    @Value("${rabbitmq.queue.two}")
    private String queueTwo;

    @Value("${rabbitmq.queue.three}")
    private String queueThree;

    @Value("${rabbitmq.queue.four}")
    private String queueFour;

    @Value("${rabbitmq.queue.five}")
    private String queueFive;

    @Value("${rabbitmq.routing-key.one}")
    private String oneRoutingKey;

    @Value("${rabbitmq.routing-key.two}")
    private String twoRoutingKey;

    @Value("${rabbitmq.routing-key.three}")
    private String threeRoutingKey;

    @Value("${rabbitmq.routing-key.four}")
    private String fourRoutingKey;

    @Value("${rabbitmq.routing-key.five}")
    private String fiveRoutingKey;

    @Value("${rabbitmq.exchange.direct}")
    private String directExchange;

    @Value("${rabbitmq.exchange.fanout}")
    private String fanoutExchange;

    @Value("${rabbitmq.exchange.topic}")
    private String topicExchange;


    public String getQueueOne() {
        return queueOne;
    }

    public String getQueueTwo() {
        return queueTwo;
    }

    public String getQueueThree() {
        return queueThree;
    }

    public String getQueueFour() {
        return queueFour;
    }

    public String getQueueFive() {
        return queueFive;
    }

    public String getOneRoutingKey() {
        return oneRoutingKey;
    }

    public String getTwoRoutingKey() {
        return twoRoutingKey;
    }

    public String getThreeRoutingKey() {
        return threeRoutingKey;
    }

    public String getFourRoutingKey() {
        return fourRoutingKey;
    }

    public String getFiveRoutingKey() {
        return fiveRoutingKey;
    }

    public String getDirectExchange() {
        return directExchange;
    }

    public String getFanoutExchange() {
        return fanoutExchange;
    }

    public String getTopicExchange() {
        return topicExchange;
    }
}
