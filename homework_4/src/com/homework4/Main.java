package com.homework4;

public class Main {

    public static void main(String[] args) {
	    Checkpoint checkpoint = new Checkpoint();
	    Vehicle vehicle1 = new Vehicle(10, false);
	    Vehicle vehicle2 = new Vehicle(20, true);
	    Vehicle vehicle3 = new Vehicle(30, true);
	    Vehicle vehicle4 = new Vehicle(40, false);
	    Vehicle vehicle5 = new Vehicle(50, false);

	    checkpoint.addVehicle(vehicle5);
	    checkpoint.addVehicle(vehicle4);
	    checkpoint.addVehicle(vehicle3);
	    checkpoint.addVehicle(vehicle2);
	    checkpoint.addVehicle(vehicle1);

        System.out.println(checkpoint.releaseVehicle().getWeight());
		System.out.println(checkpoint.releaseVehicle().getWeight());
		System.out.println(checkpoint.releaseVehicle().getWeight());
		System.out.println(checkpoint.releaseVehicle().getWeight());
		System.out.println(checkpoint.releaseVehicle().getWeight());
    }
}
