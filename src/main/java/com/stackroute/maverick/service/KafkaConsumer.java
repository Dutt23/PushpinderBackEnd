package com.stackroute.maverick.service;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.maverick.domain.User;
import com.stackroute.maverick.repository.UserRepository;



@Service
public class KafkaConsumer {
    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
   @Autowired
    private UserRepository userRepository;
   
   
    @KafkaListener(topics="testing.t")
   public void processEvent(User user) {
        System.out.println("calling from kafka consumer recommendation");
        System.out.println("received content = " + user.toString());
        log.info("received content = '{}'", user.toString());

   }
}