//package com.example.inndata;
//
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableKafka
//public class CustomKafkaTemplateConfig {
//
//    private final String bootstrapServers = "your-kafka-broker:9092";
//
//    @Bean
//    public ProducerFactory<String, String> customProducerFactory() {
//        Map<String, Object> producerConfig = new HashMap<>();
//        producerConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//        producerConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        producerConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//
//        return new DefaultKafkaProducerFactory<>(producerConfig);
//    }
//
//    @Bean
//    public KafkaTemplate<String, String> customKafkaTemplate() {
//        return new KafkaTemplate<>(customProducerFactory());
//    }
//}
//
