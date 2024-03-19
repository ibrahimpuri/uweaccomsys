package com.mycompany.uwe_accommodation_system_g10.model;

public enum AvailabilityStatus {
    AVAILABLE {
        @Override
        public String toString() {
            return "AVAILABLE";
        }
    },
    UNAVAILABLE {
        @Override
        public String toString() {
            return "UNAVAILABLE";
        }
    };
}
