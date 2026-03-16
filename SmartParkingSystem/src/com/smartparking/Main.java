/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartparking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot(5);
        ParkingService service = new ParkingService(lot);
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n====== SMART PARKING SYSTEM ======");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Parking Slots");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Vehicle Number: ");
                    String vehicleNo = sc.nextLine();

                    System.out.print("Enter Car Name: ");
                    String carName = sc.nextLine();

                    System.out.print("Enter Owner Name: ");
                    String ownerName = sc.nextLine();

                    service.parkVehicle(vehicleNo, carName, ownerName);

                    break;

                case 2:

                    System.out.print("Enter Vehicle Number: ");
                    String vno = sc.nextLine();
                    service.removeVehicle(vno);

                    break;

                case 3:

                    lot.displaySlots();

                    break;

                case 4:

                    System.out.println("Thank you for using Smart Parking System");
                    System.exit(0);
            }
        }
    }
}