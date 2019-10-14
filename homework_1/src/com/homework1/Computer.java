package com.homework1;

class Computer {

    private static class MotherBoard {
        private String model;
        private double price;

        MotherBoard(String model, double price) {
            this.model = model;
            this.price = price;
        }
    }

    private static class CPU {
        private double price;
        private double frequency;

        CPU(double price, double frequency) {
            this.price = price;
            this.frequency = frequency;
        }
    }

    private static class HardDrive {
        private double price;
        private double capacity;

        HardDrive(double price, double capacity) {
            this.price = price;
            this.capacity = capacity;
        }
    }

    private MotherBoard motherBoard;
    private CPU cpu;
    private HardDrive hardDrive;

    Computer(
            String motherBoardModel,
            double motherBoardPrice,
            double cpuPrice,
            double cpuFrequency,
            double hardDrivePrice,
            double hardDriveCapacity) {
        this.motherBoard = new MotherBoard(motherBoardModel, motherBoardPrice);
        this.cpu = new CPU(cpuPrice, cpuFrequency);
        this.hardDrive = new HardDrive(hardDrivePrice, hardDriveCapacity);
    }

    double getPrice() {
        return this.motherBoard.price + this.cpu.price + this.hardDrive.price;
    }
}
