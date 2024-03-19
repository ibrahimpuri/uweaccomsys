package com.mycompany.uwe_accommodation_system_g10.model;



import java.util.Arrays;
import java.util.List;

public class Accommodation {
    private int accommodationNumber;
    private AccommodationType type;
    private double price;
    private CleaningStatus cleaningStatus;
    private List<String> inventory;
    private RentalAgreement rentalAgreement;
    private String description;

    public Accommodation(AccommodationType type) {
        this.type = type;
        setDefaultsBasedOnType(type);
        this.cleaningStatus = CleaningStatus.CLEAN;
    }

    private void setDefaultsBasedOnType(AccommodationType type) {
        switch (type) {
            case STANDARD:
                this.price = 700.00;
                this.description = "Standard Room with basic amenities";
                this.inventory = Arrays.asList("Single bed", "Wardrobe", "Desk", "Chair", "Bookshelves", "Bedside cabinet", "Mirror", "En-suite wet room");
                break;
            case SUPERIOR:
                this.price = 750.00;
                this.description = "Superior Room with advanced amenities";
                this.inventory = Arrays.asList("Single bed", "Wardrobe", "Large desk", "Chair", "Bookshelves", "Bedside cabinet", "Mirror", "Large En-suite wet room");
                break;
            default:
                // Default case: set empty values
                this.price = 0.00;
                this.description = "Unknown Room";
                this.inventory = Arrays.asList("No inventory");
        }
    }

    // Getters and setters
    public int getAccommodationNumber() {
        return accommodationNumber;
    }

    public void setAccommodationNumber(int accommodationNumber) {
        this.accommodationNumber = accommodationNumber;
    }

    public AccommodationType getType() {
        return type;
    }

    public void setType(AccommodationType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CleaningStatus getCleaningStatus() {
        return cleaningStatus;
    }

    public void setCleaningStatus(CleaningStatus cleaningStatus) {
        this.cleaningStatus = cleaningStatus;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public RentalAgreement getRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Other methods?
}
