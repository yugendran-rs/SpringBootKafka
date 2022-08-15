package com.yugen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yugen.service.UserProducerService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserProducerService userProducerService;

	@GetMapping("/publish")
	public void sendUserData(@RequestParam String name, @RequestParam String age) {
		userProducerService.sendUserData(name, Integer.parseInt(age));
	}
}
