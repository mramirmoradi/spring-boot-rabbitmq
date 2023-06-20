package com.theamirmoradi.springamp.core.service;

public interface MessageProducer {

    void publish(Object payload, String exchange, String routingKey);
}
