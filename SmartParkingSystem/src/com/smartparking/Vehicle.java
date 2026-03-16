/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartparking;

import java.time.LocalDateTime;

public class Vehicle {

    private String vehicleNumber;
    private String carName;
    private String ownerName;
    private LocalDateTime entryTime;

    public Vehicle(String vehicleNumber, String carName, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.carName = carName;
        this.ownerName = ownerName;
        this.entryTime = LocalDateTime.now();
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getCarName() {
        return carName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}