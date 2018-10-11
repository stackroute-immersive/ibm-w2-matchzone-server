package com.matchzone.consumerservice;


import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.matchzone.model.Certification;


import java.util.HashMap;
import java.util.Map;

//Annotate the class with @EnableKafka and @Configuration

@EnableKafka
@Configuration
public class ConsumerKafkaConfig 

{

// kafka consumer for certification
    @Bean
    public ConsumerFactory<String, Certification> certiConsumerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "certi1_json");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(),
                new JsonDeserializer<>(Certification.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Certification> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, Certification> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(certiConsumerFactory());
        return factory;
    }
}
