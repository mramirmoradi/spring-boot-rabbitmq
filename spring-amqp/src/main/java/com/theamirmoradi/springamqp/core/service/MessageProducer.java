package com.theamirmoradi.springamqp.core.service;

public interface MessageProducer {

    void publish(Object payload, String exchange, String routingKey);
}
