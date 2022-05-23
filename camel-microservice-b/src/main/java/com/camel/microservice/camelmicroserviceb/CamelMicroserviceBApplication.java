package com.camel.microservice.camelmicroserviceb;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;

import org.springframework.util.SimpleRouteMatcher;

import com.camel.microservice.camelmicroserviceb.route.putMessagesOnActiveMQ;

@SpringBootApplication
public class CamelMicroserviceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelMicroserviceBApplication.class, args);
		putMessagesOnActiveMQ route=new putMessagesOnActiveMQ();
		CamelContext tx=new DefaultCamelContext();
	
	}

}
