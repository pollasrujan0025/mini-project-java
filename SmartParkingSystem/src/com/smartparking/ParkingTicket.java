/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartparking;

import java.time.LocalTime;

public class ParkingTicket {

    private String vehicleNumber;
    private LocalTime entryTime;

    public ParkingTicket(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.entryTime = LocalTime.now();
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }
}
