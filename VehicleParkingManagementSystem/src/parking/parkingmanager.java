/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingManager {

    Map<String, Vehicle> parkedVehicles = new HashMap<>();

    int twoWheelerRate = 10;
    int fourWheelerRate = 20;

    int twoWheelerEntryFee = 5;
    int fourWheelerEntryFee = 10;

    int timeLimit = 2;
    int fineRate = 50;

    public void parkVehicle(Vehicle v) {

        parkedVehicles.put(v.vehicleNumber, v);

        System.out.println("\nVehicle Parked Successfully");
        System.out.println("Entry Time: " + v.entryTime);
    }

    public void removeVehicle(String number) {

        if (!parkedVehicles.containsKey(number)) {
            System.out.println("Vehicle not found");
            return;
        }

        Vehicle v = parkedVehicles.get(number);

        LocalDateTime exitTime = LocalDateTime.now();

        long minutes = Duration.between(v.entryTime, exitTime).toMinutes();

        double hours = minutes / 60.0;

        double fee;
        double entryFee;

        if (v.vehicleType.equals("2")) {

            fee = hours * twoWheelerRate;
            entryFee = twoWheelerEntryFee;

        } else {

            fee = hours * fourWheelerRate;
            entryFee = fourWheelerEntryFee;
        }

        double fine = 0;

        if (hours > timeLimit) {

            fine = (hours - timeLimit) * fineRate;
        }

        double total = fee + fine + entryFee;

        System.out.println("\n------ Parking Details ------");

        System.out.println("Owner Name: " + v.ownerName);
        System.out.println("Vehicle Name: " + v.vehicleName);
        System.out.println("Vehicle Number: " + v.vehicleNumber);

        System.out.println("Entry Time: " + v.entryTime);
        System.out.println("Exit Time: " + exitTime);

        System.out.println("Parking Hours: " + hours);

        System.out.println("Entry Fee: " + entryFee);
        System.out.println("Parking Fee: " + fee);
        System.out.println("Fine: " + fine);

        System.out.println("Total Amount: " + total);

        parkedVehicles.remove(number);
    }

}