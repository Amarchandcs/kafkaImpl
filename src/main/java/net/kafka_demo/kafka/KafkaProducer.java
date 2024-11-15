package net.kafka_demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	
	@Autowired
	private KafkaTemplate<String, String> kaTemplate;
	
	public void sendMessage(String message) {
		
		kaTemplate.send("T1", message);
	}
}
