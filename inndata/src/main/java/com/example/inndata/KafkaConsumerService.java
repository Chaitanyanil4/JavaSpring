package com.example.inndata;


import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Configuration
public class KafkaConsumerService {
	
	@Bean
	public NewTopic inndata() {
		return TopicBuilder.name("inndata").build();
	}
		
	@KafkaListener(topics = "inndata")
	public void listen(String message) {
	    // Process the Kafka message here
	    System.out.println("Received message: " + message);
	}


}

