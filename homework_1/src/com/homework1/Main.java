package com.homework1;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer(
                "Asus",
                300,
                400,
                5,
                200,
                5000);
        System.out.println("Computer price: " + computer.getPrice());
    }
}
