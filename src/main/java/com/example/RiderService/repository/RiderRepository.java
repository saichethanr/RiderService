package com.example.RiderService.repository;

import com.example.RiderService.model.RideDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<RideDetails,String> {
}
