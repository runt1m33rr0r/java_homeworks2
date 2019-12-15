package com.homework4;

import java.util.PriorityQueue;

public class Checkpoint {
    private PriorityQueue<Vehicle> vehicles;

    Checkpoint() {
        this.vehicles = new PriorityQueue<>((firstVehicle, secondVehicle) -> {
            int emergencyComparison = Boolean.compare(
                    secondVehicle.getIsEmergencyVehicle(),
                    firstVehicle.getIsEmergencyVehicle());
            if (emergencyComparison != 0) {
                return  emergencyComparison;
            }

            return Double.compare(firstVehicle.getWeight(), secondVehicle.getWeight());
        });
    }

    void addVehicle(Vehicle someVehicle) {
        this.vehicles.add(someVehicle);
    }

    Vehicle releaseVehicle() {
        return vehicles.poll();
    }
}
