/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

import java.time.LocalDateTime;

public class Vehicle {

    String ownerName;
    String vehicleName;
    String vehicleNumber;
    String vehicleType;

    LocalDateTime entryTime;

    public Vehicle(String ownerName, String vehicleName, String vehicleNumber, String vehicleType) {

        this.ownerName = ownerName;
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;

        this.entryTime = LocalDateTime.now();
    }

}