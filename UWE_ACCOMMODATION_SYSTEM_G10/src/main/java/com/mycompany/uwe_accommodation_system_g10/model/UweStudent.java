/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uwe_accommodation_system_g10.model;

/**
 *
 * @author User
 */
public class UweStudent {
    
    private int studentID;
    private String studentFullName;
    private Accommodation accommodation;
    private String mobileNumber;

    public UweStudent(int studentID, String studentFullName, Accommodation accommodation, String mobileNumber) {
        this.studentID = studentID;
        this.studentFullName = studentFullName;
        this.accommodation = accommodation;
        this.mobileNumber = mobileNumber;
    }

    public void requestAccommodation() {
        // Implementation for requesting accommodation
    }

    public void reviewRentalAgreement(RentalAgreement agreement) {
        // Implementation for reviewing the rental agreement
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return studentFullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

   

    void setAccommodation(Accommodation accommodation) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}