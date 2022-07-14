package com.psl.alp.UserManagement.kafkaConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.psl.alp.UserManagement.Entity.UsersLicense;
import com.psl.alp.UserManagement.service.UserService;

@Component
public class KafkaConsumer {

	@Autowired
	private UserService userService;
	
    @KafkaListener(topics = "myTopic", groupId = "group_id")
    public void consume(UsersLicense message)
    {
    	userService.updateLicense(message.getLicenseKey(), message.getUserId());
    }
}