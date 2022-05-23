package com.camel.microservice.camelmicroserviceb.route;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component 
public class putMessagesOnActiveMQ extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("E:\\11111\\Apache_Camel\\Source\\.camel")
		.process(new Processor()
				{

					@Override
					public void process(Exchange exchange) throws Exception {
						Message input=exchange.getIn();
						String data=input.getBody(String.class);
						Message output=exchange.getMessage();
						output.setBody(data);
					}
			
				})
		.split().tokenize(",")
		.to("jms:queue:queueMessage");
	}
}
