/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

import java.util.Scanner;

public class ParkingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingManager manager = new ParkingManager();

        while (true) {

            System.out.println("\n===== Vehicle Parking System =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Owner Name: ");
                String owner = sc.nextLine();

                System.out.print("Vehicle Name: ");
                String vname = sc.nextLine();

                System.out.print("Vehicle Number: ");
                String number = sc.nextLine();

                System.out.print("Vehicle Type (2 or 4): ");
                String type = sc.nextLine();

                Vehicle v = new Vehicle(owner, vname, number, type);

                manager.parkVehicle(v);

            } else if (choice == 2) {

                System.out.print("Enter Vehicle Number: ");
                String num = sc.nextLine();

                manager.removeVehicle(num);

            } else if (choice == 3) {

                System.out.println("Thank you!");
                break;
            }
        }

    }

}