/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uwe_accommodation_system_g10.model;

public class RentalAgreement {
    private int leaseNumber;
    private Accommodation roomToRent;
    private String studentFullName;
    private String studentID;
    private String studentMobileNumber;

    // Constructor
    public RentalAgreement(int leaseNumber, Accommodation roomToRent, String studentFullName, String studentID, String studentMobileNumber) {
        this.leaseNumber = leaseNumber;
        this.roomToRent = roomToRent;
        this.studentFullName = studentFullName;
        this.studentID = studentID;
        this.studentMobileNumber = studentMobileNumber;
    }

    // Method to generate agreement
    public void generateAgreement() {
        // Gotta implement logic to generate rental agreement
    }

    // Method to display agreement details
    public void displayAgreementDetails() {
        // logic to display rental agreement details
    }

    public int getLeaseNumber() {
        return leaseNumber;
    }

    public Accommodation getRoomToRent() {
        return roomToRent;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentMobileNumber() {
        return studentMobileNumber;
    }

    Accommodation getAccommodation() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

