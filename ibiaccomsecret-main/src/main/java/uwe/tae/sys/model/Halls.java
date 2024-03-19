package uwe.tae.sys.model;

import java.util.ArrayList;
import java.util.List;

public class Halls {
    private List<Halls> halls;
    private String hallName;
    private List<Accommodation> hallAccommodations;

    public Hall(String hallName) {
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
        return Accommodations;
    }
}
