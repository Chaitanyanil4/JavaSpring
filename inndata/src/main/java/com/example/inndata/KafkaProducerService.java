package com.example.inndata;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class KafkaProducerService {
//
//  @KafkaListener(topics = "inndata", groupId = "mygroup")
//  public void listen(String message) {
//      // Process the received message
//      System.out.println("Received message: " + message);
//  }
	Logger log=LoggerFactory.getLogger(KafkaConsumerService.class);
	
  private KafkaTemplate<String, String> customKafkaTemplate;

    @Autowired
    public void KafkaProducerService(KafkaTemplate<String, String> customKafkaTemplate) {
        this.customKafkaTemplate = customKafkaTemplate;
    }

    public void sendMessage(List<CompanyEntity> list) {
    	
    	ObjectMapper objectMapper = new ObjectMapper(); 
    	try {
    	    String jsonList = objectMapper.writeValueAsString(list);
    	    customKafkaTemplate.send("inndata", jsonList);
    	} catch (JsonProcessingException e) {
    	    log.error("Error converting list to JSON: {}", e.getMessage());
    	}

    }
}

