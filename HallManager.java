/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uwe_accommodation_system_g10.model;

public class HallManager {
    private String name;
    private Hall associatedHall;
    private Registry studentRegistry;

    // Constructor
    public HallManager(String name, Hall associatedHall, Registry studentRegistry) {
        this.name = name;
        this.associatedHall = associatedHall;
        this.studentRegistry = studentRegistry;
    }

    // Method to view hall information
    public void viewHallInformation(Hall hall) {
        System.out.println(hall.getHallInformation());
    }

    // Method to view accommodation information
    public void viewAccommodationInformation(Hall hall) {
        System.out.println(hall.viewAccommodationInformation());
    }

    // Method to create rental agreement
    public RentalAgreement createRentalAgreement(Accommodation accommodation, UweStudent student) {
        // Implement logic to create rental agreement
        return null; // Placeholder return
    }

    // Method to delete rental agreement
    public void deleteRentalAgreement(RentalAgreement rentalAgreement) {
        // Implement logic to delete rental agreement
    }

    // Method to change cleaning status of accommodation
    public void changeCleaningStatus(Accommodation accommodation, String newStatus) {
        associatedHall.changeCleaningStatus(accommodation, newStatus);
    }

    // Method to allocate accommodation to a student
    public Accommodation allocateAccommodation(UweStudent student, AccommodationType accommodationType) {
        // Implement logic to allocate accommodation
        return null; // Placeholder return
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}