package com.homework4;

class Vehicle {
    private double weight;
    private boolean isEmergencyVehicle;

    Vehicle(double weight, boolean isEmergencyVehicle) {
        this.weight = weight;
        this.isEmergencyVehicle = isEmergencyVehicle;
    }

    double getWeight() {
        return this.weight;
    }

    boolean getIsEmergencyVehicle() {
        return this.isEmergencyVehicle;
    }
}
