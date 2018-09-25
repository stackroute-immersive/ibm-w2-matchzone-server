package com.stackroute.downstream.Kafkalistener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.downstream.model.User;

@Service
public class KafkaConsumer {

	private SimpMessagingTemplate template;

	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void consume(String message)
	{
		System.out.println("Consumed message: " + message);
	}

	@KafkaListener(topics = "Kafka_Example_json", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user)
	{
		template.convertAndSend("/api/v1/register", user);
	}
}
