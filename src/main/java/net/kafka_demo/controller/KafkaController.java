package net.kafka_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.kafka_demo.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {

    
	@Autowired
	private KafkaProducer kafkaProducer;

    @GetMapping(value = "/produce")
    public String sendMessage(@RequestParam String msg){

         kafkaProducer.sendMessage(msg);
         
         return "meg : success";
    }
}
