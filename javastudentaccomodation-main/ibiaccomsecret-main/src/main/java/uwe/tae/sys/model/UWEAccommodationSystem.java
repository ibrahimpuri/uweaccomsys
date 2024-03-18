package uwe.tae.sys.model;

import java.util.List;
import java.util.ArrayList;

public class UWEAccommodationSystem {
    private static UWEAccommodationSystem system;
    private List<Halls> halls;

    public static synchronized UWEAccommodationSystem getSystem() {
	    if (system == null) {
	        system = new UWEAccommodationSystem();
	    }
	    return system;
    }

    private UWEAccommodationSystem() {
	this.halls = new ArrayList<>();
    }

    public Halls getHalls() {
        return List<Halls> halls;
    }

}
