package net.kafka_demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	

	@KafkaListener(topics = "T1", groupId = "myGroup")
	public void consume(String message) {
		System.out.println("received : "+message);
	}
}
