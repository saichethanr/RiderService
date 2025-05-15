package com.example.RiderService.service;

import com.example.RiderService.model.RideDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final String TOPIC  =  "ride-requests";

    @Autowired
    private KafkaTemplate<String, RideDetails> kafkaTemplate;

    public void sendtokafka(RideDetails details){
        kafkaTemplate.send(TOPIC,details);
    }
}
