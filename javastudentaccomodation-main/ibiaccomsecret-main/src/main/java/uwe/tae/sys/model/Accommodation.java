package uwe.tae.sys.model;

import java.util.Arrays;
import java.util.List;


public class Accommodation {
    private int accommodationNumber;
    private double price;
    private String type;
    private String availabilityStatus;
    private String cleaningStatus;
    private String occupancyStatus;
    private RentalAgreement rentalAgreement;


    //MAKE CONSTRUCTOR
    public Accommodation() {

    }


    //SET VARIABLES ETC ETC
    public String getPrice() {
	String priceString = "£" + String.format("%.2f", price);
	return priceString;
    }

    public void setPrice(String price) {
	this.price = Double.parseDouble(price);
    }

    public RentalAgreement getRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public void createRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public void deleteRentalAgreement() {
        this.rentalAgreement = null;
    }

    public int getID() {
        return accommodationNumber;
    }

    public void setID(int accommodationNumber) {
        this.accommodationNumber = accommodationNumber;
    }

}
