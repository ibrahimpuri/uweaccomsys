package uwe.tae.sys.model;

import java.util.ArrayList;
import java.util.List;

public class Halls {
    private String hallName;
    private List<Accommodation> hallAccommodations;

    public Halls(String hallName) { // Constructor name corrected
        this.hallName = hallName;
        this.hallAccommodations = new ArrayList<>();
    }

    public String getName() {
        return hallName;
    }

    public void setName(String hallName) {
        this.hallName = hallName;
    }

    public List<Accommodation> getHallAccommodations() {
        return hallAccommodations; // Corrected to return the proper field
    }
}

