/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartparking;

public class ParkingLot {

    private ParkingSlot[] slots;

    public ParkingLot(int size) {

        slots = new ParkingSlot[size];

        for (int i = 0; i < size; i++) {
            slots[i] = new ParkingSlot(i + 1);
        }
    }

    public ParkingSlot getAvailableSlot() {

        for (ParkingSlot slot : slots) {
            if (slot.isAvailable()) {
                return slot;
            }
        }

        return null;
    }

    public ParkingSlot[] getSlots() {
        return slots;
    }

    public void displaySlots() {

        System.out.println("\nParking Slot Status");

        for (ParkingSlot slot : slots) {

            if (slot.isAvailable()) {
                System.out.println("Slot " + slot.getSlotNumber() + " : Free");
            } else {
                System.out.println("Slot " + slot.getSlotNumber() + " : Occupied");
            }
        }
    }
}
