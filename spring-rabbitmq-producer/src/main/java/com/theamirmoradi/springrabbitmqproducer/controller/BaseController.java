package com.theamirmoradi.springrabbitmqproducer.controller;

import com.theamirmoradi.springrabbitmqproducer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exchanges")
@RequiredArgsConstructor
public class BaseController {

    private final ProducerService producerService;

    @PostMapping("/direct")
    public ResponseEntity<String> directExchangeAPI(@RequestBody Object payload) {
        producerService.directPublish(payload);
        return ResponseEntity.ok("Message published throw direct exchange.");
    }

    @PostMapping("/fanout")
    public ResponseEntity<String> fanoutExchangeAPI(@RequestBody Object payload) {
        producerService.fanoutPublish(payload);
        return ResponseEntity.ok("Message published throw fanout exchange.");
    }


    @PostMapping("/topic/{routingKey}")
    public ResponseEntity<String> topicExchangeAPI(@RequestBody Object payload, @PathVariable String routingKey) {
        producerService.topicPublish(payload, routingKey);
        return ResponseEntity.ok("Message published throw topic exchange.");
    }
}
