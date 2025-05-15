package com.example.RiderService.service;

import com.example.RiderService.model.RideDetails;
import com.example.RiderService.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiderService {
    @Autowired
    private RiderRepository repository;

    @Autowired
    private KafkaProducer producer;

    public RideDetails saveAndPublish(RideDetails details){
        RideDetails  saved = repository.save(details);
        producer.sendtokafka(saved);
        return saved;
    }
}
