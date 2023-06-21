package com.theamirmoradi.springrabbitmqproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.theamirmoradi.springrabbitmqproducer",
		"com.theamirmoradi.springamqp",
})
public class SpringRabbitmqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitmqProducerApplication.class, args);
	}

}
