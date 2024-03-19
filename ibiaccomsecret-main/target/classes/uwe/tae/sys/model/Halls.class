/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uwe_accommodation_system_g10.model;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class Hall {
    private String hallName;
    private String phoneNumber;
    private HallManager hallManager;
    private int totalRooms;
    private int availableRooms;
    private int roomsRequiringCleaning;
    private int offlineRooms;
    private ArrayList<Accommodation> accommodations;

    public Hall(String hallName, String phoneNumber, HallManager hallManager, int totalRooms) {
        this.hallName = hallName;
        this.phoneNumber = phoneNumber;
        this.hallManager = hallManager;
        this.totalRooms = totalRooms;
        this.availableRooms = totalRooms;
        this.roomsRequiringCleaning = 0; // Assuming none initially require cleaning
        this.offlineRooms = 0; // Assuming none are offline initially
        this.accommodations = new ArrayList<>();
    }

    public String getHallInformation() {
        StringBuilder info = new StringBuilder();
        info.append("Hall Name: ").append(hallName).append("\n");
        info.append("Phone Number: ").append(phoneNumber).append("\n");
        info.append("Hall Manager: ").append(hallManager.getName()).append("\n");
        info.append("Total Rooms: ").append(totalRooms).append("\n");
        info.append("Available Rooms: ").append(availableRooms).append("\n");
        info.append("Rooms Requiring Cleaning: ").append(roomsRequiringCleaning).append("\n");
        info.append("Offline Rooms: ").append(offlineRooms).append("\n");
        return info.toString();
    }

    public List<String> viewAccommodationInformation() {
        List<String> accommodationInfo = new ArrayList<>();
        for (Accommodation accommodation : accommodations) {
            accommodationInfo.add(accommodation.getAccommodationType() + " - " + accommodation.getOccupancy());
        }
        return accommodationInfo;
    }

    public void changeCleaningStatus(Accommodation accommodation, CleaningStatus newStatus) {
        accommodation.setCleaningStatus(newStatus);
        if (newStatus == CleaningStatus.DIRTY) {
            roomsRequiringCleaning++;
        } else if (newStatus == CleaningStatus.CLEAN) {
            roomsRequiringCleaning--;
        }
    }

    public void addAccommodation(Accommodation accommodation) {
        accommodations.add(accommodation);
        availableRooms--;
    }

    public void removeAccommodation(Accommodation accommodation) {
        accommodations.remove(accommodation);
        availableRooms++;
    }

    // Getters and setters
    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HallManager getHallManager() {
        return hallManager;
    }

    public void setHallManager(HallManager hallManager) {
        this.hallManager = hallManager;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public int getRoomsRequiringCleaning() {
        return roomsRequiringCleaning;
    }

    public void setRoomsRequiringCleaning(int roomsRequiringCleaning) {
        this.roomsRequiringCleaning = roomsRequiringCleaning;
    }

    public int getOfflineRooms() {
        return offlineRooms;
    }

    public void setOfflineRooms(int offlineRooms) {
        this.offlineRooms = offlineRooms;
    }

    public ArrayList<Accommodation> getAccommodations() {
        return accommodations;
    }

    public void setAccommodations(ArrayList<Accommodation> accommodations) {
        this.accommodations = accommodations;
    }
}
