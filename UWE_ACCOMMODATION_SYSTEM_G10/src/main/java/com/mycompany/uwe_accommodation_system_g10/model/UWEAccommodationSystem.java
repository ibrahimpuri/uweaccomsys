/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uwe_accommodation_system_g10.model;

import java.util.ArrayList;
import java.util.List;

public class UWEAccommodationSystem {

    public static UWEAccommodationSystem getSystem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Registry studentRegistry;
    private ArrayList<Hall> halls;

    public UWEAccommodationSystem() {
        this.studentRegistry = new Registry();
        this.halls = new ArrayList<>();
    }

    // Method to allocate accommodation to a student
    // Method to allocate accommodation to a student
public Accommodation allocateAccommodation(UweStudent student, AccommodationType accommodationType) {
    // Logic to allocate accommodation based on student and type
    // This method will need to interact with the student registry and hall managers
    // Implement the logic here
    Accommodation allocatedAccommodation = null;
    for (Hall hall : halls) {
        List<Accommodation> availableAccommodations = hall.getAvailableAccommodations();
        for (Accommodation accommodation : availableAccommodations) {
            if (accommodation.getAccommodationType().equals(accommodationType)) { // 
                // Check if accommodation can be allocated
                if (accommodation.isRentable()) {
                    // Allocate accommodation
                    allocatedAccommodation = accommodation;
                    hall.addAccommodation(accommodation);
                    student.setAccommodation(accommodation);
                    accommodation.setOccupancy(student.getFullName());
                    // Additional logic like updating registry or rental agreement to be added here
                    break;
                }
            }
        }
        if (allocatedAccommodation != null) {
            break;
        }
    }
    return allocatedAccommodation;
}

    // Method to monitor cleaning status of an accommodation
    public void monitorCleaning(Accommodation accommodation) {
        // logic
        if (accommodation.getCleaningStatus() == CleaningStatus.DIRTY) {
            // Notify cleaning staff or perform necessary actions
            System.out.println("Accommodation " + accommodation.getAccommodationNumber() + " requires cleaning.");
        } else {
            System.out.println("Accommodation " + accommodation.getAccommodationNumber() + " is clean.");
        }
    }

    // Method to register maintenance for an accommodation
    public void registerMaintenance(Accommodation accommodation) {
        // Logic to register maintenance
       
        accommodation.setCleaningStatus(CleaningStatus.DIRTY);
        System.out.println("Maintenance registered for accommodation " + accommodation.getAccommodationNumber());
    }

    // Method to search for available accommodations
    public List<Accommodation> searchAccommodation() {
        // Logic to search for available accommodations
      
        List<Accommodation> availableAccommodations = new ArrayList<>();
        for (Hall hall : halls) {
            availableAccommodations.addAll(hall.getAvailableAccommodations());
        }
        return availableAccommodations;
    }

    // Method to apply for accommodation
    public boolean applyForAccommodation(UweStudent student, Accommodation accommodation) {
        // Logic to apply for accommodation
        
        if (studentRegistry.getStudents().contains(student) && searchAccommodation().contains(accommodation)) {
            // Perform necessary actions like updating registry or rental agreement
            System.out.println("Application successful for accommodation " + accommodation.getAccommodationNumber() + " by student " + student.getFullName());
            return true;
        } else {
            System.out.println("Application unsuccessful for accommodation " + accommodation.getAccommodationNumber() + " by student " + student.getFullName());
            return false;
        }
    }

    // Method to add a hall to the system
    public void addHall(Hall hall) {
        this.halls.add(hall);
    }

    // Method to get the list of halls
    public ArrayList<Hall> getHalls() {
        return new ArrayList<>(this.halls);
    }
}
