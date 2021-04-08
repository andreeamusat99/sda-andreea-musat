package com.sda.andreea.enums;

public enum LengthUnit {
    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025);

    private final double value;

    LengthUnit(double value){
        this.value = value;
    }
    // return - length in meters
    public double convertToMeters() {
        return value;
    }

}
