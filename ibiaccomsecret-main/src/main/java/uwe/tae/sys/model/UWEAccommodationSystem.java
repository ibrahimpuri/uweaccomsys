package uwe.tae.sys.model;

public class UWEAccommodationSystem {
    private static UWEAccommodationSystem system;

    public static synchronized UWEAccommodationSystem getSystem() {
	    if (system == null) {
	        system = new UWEAccommodationSystem();
	    }
	    return system;
    }

    private UWEAccommodationSystem() {
    }

}
