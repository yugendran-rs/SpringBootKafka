package com.yugen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserProducerService {

	@Autowired
	private KafkaTemplate<String, Integer> kafkaTemplate;

	public void sendUserData(String name, Integer age) {
		kafkaTemplate.send("user-topic", name, age);
	}

}