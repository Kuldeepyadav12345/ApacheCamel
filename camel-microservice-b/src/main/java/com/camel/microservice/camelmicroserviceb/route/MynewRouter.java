package com.camel.microservice.camelmicroserviceb.route;

import java.util.StringTokenizer;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MynewRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("file:E:\\11111\\Apache_Camel\\Source").process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				/* By using exchange read input message */
				Message input = exchange.getIn();
				/* from input get the message body */
				String data = input.getBody(String.class);
				StringTokenizer str = new StringTokenizer(data, ",");
				String eid = str.nextToken();
				String ename = str.nextToken();
				String esal = str.nextToken();
				/* Formating the outpur data into JSON format */
				String dataModified = "{eid:" + eid + ", ename:" + ename + ", salary:" + esal + "}";

				/* read output message reference */
				Message output = exchange.getMessage();

				// set data into output
				output.setBody(dataModified);

			}
		}).to("file:E:\\11111\\Apache_Camel\\Destination?fileName=EmpData.json");
	}

}
