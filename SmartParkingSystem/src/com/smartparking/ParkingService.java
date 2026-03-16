/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartparking;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingService {

    private ParkingLot lot;

    public ParkingService(ParkingLot lot) {
        this.lot = lot;
    }

    // PARK VEHICLE
    public void parkVehicle(String vehicleNumber, String carName, String ownerName) {

        ParkingSlot slot = lot.getAvailableSlot();

        if (slot == null) {
            System.out.println("Parking Full!");
            return;
        }

        Vehicle vehicle = new Vehicle(vehicleNumber, carName, ownerName);

        slot.parkVehicle(vehicle);

        System.out.println("\n========= VEHICLE PARKED =========");
        System.out.println("Owner Name     : " + vehicle.getOwnerName());
        System.out.println("Car Name       : " + vehicle.getCarName());
        System.out.println("Vehicle Number : " + vehicle.getVehicleNumber());
        System.out.println("----------------------------------");
        System.out.println("Slot Number    : " + slot.getSlotNumber());
        System.out.println("Entry Time     : " + vehicle.getEntryTime());
        System.out.println("==================================");
    }

    // REMOVE VEHICLE
    public void removeVehicle(String vehicleNumber) {

        for (ParkingSlot slot : lot.getSlots()) {

            if (!slot.isAvailable() &&
                slot.getVehicle().getVehicleNumber().equals(vehicleNumber)) {

                Vehicle v = slot.getVehicle();

                LocalDateTime exitTime = LocalDateTime.now();

                Duration duration = Duration.between(v.getEntryTime(), exitTime);

                long minutes = duration.toMinutes();

                if (minutes == 0) {
                    minutes = 1;
                }

                double fee = minutes * 100;

                System.out.println("\n=========== VEHICLE DETAILS ===========");
                System.out.println("Owner Name     : " + v.getOwnerName());
                System.out.println("Car Name       : " + v.getCarName());
                System.out.println("Vehicle Number : " + v.getVehicleNumber());
                System.out.println("---------------------------------------");
                System.out.println("Entry Time     : " + v.getEntryTime());
                System.out.println("Exit Time      : " + exitTime);
                System.out.println("Parking Time   : " + minutes + " minutes");
                System.out.println("Parking Fee    : Rs" + fee);
                System.out.println("=======================================");

                slot.removeVehicle();

                System.out.println("Vehicle Removed from Slot " + slot.getSlotNumber());

                return;
            }
        }

        System.out.println("Vehicle Not Found!");
    }
}