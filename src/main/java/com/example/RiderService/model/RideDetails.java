package com.example.RiderService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ride-requests")
public class RideDetails {
    @Id
    private String userId;
    private double currentLat;
    private double currentLong;
    private double destLat;
    private double destLong;
    private int required_seats;
}
