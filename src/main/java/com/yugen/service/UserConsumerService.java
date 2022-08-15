package com.yugen.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumerService {

	@KafkaListener(topics = { "user-topic" }, groupId = "user-group")
	public void consumeUserData(Integer age) {
		System.out.println("User Info Received : Age - " + age);
	}
}
