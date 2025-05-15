package com.example.RiderService.controller;


import com.example.RiderService.model.RideDetails;
import com.example.RiderService.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/riderservice")
public class RiderController {

    @Autowired
    private RiderService service;

    @PostMapping("/ridedetails")
    public RideDetails submitRiderDetails(@RequestBody RideDetails details) {
        return service.saveAndPublish(details);
    }
}