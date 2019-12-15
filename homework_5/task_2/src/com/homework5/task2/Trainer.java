package com.homework5.task2;

class Trainer {
    private String name;
    private int experience;
    private SportType qualifiedSport;

    Trainer(String name, int experience, SportType qualifiedSport) {
        this.name = name;
        this.experience = experience;
        this.qualifiedSport = qualifiedSport;
    }

    String getName() {
        return this.name;
    }

    int getExperience() {
        return this.experience;
    }

    SportType getQualifiedSport() {
        return this.qualifiedSport;
    }
}
