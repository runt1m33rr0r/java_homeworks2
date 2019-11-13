package com.homework5.task2;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

class Team {
    private String name;
    private double budget;
    private SportType sportType;
    private int maxPlayersCount;
    private int maxReservesCount;
    private Trainer trainer;
    private TreeMap<Player, Double> players;
    private TreeMap<Player, Double> reserves;

    Team(String name, double budget, SportType sportType, Trainer trainer) {
        this.name = name;
        this.budget = budget;
        this.sportType = sportType;
        this.players = new TreeMap<>();
        this.reserves = new TreeMap<>();

        if (trainer.getQualifiedSport() == this.sportType) {
            this.trainer = trainer;
        }

        switch (this.sportType) {
            case Football:
                this.maxPlayersCount = 11;
                this.maxReservesCount = 5;
                break;
            case Basketball:
                this.maxPlayersCount = 12;
                this.maxReservesCount = 7;
                break;
            default:
                this.maxPlayersCount = 6;
                this.maxReservesCount = 3;
                break;
        }
    }

    String getName() {
        return this.name;
    }

    double getBudget() {
        return this.budget;
    }

    SportType getSportType() {
        return this.sportType;
    }

    int getMaxPlayersCount() {
        return this.maxPlayersCount;
    }

    int getMaxReservesCount() {
        return this.maxReservesCount;
    }

    Trainer getTrainer() {
        return this.trainer;
    }

    NavigableMap<Player, Double> getPlayers() {
        return this.players;
    }

    NavigableMap<Player, Double> getReserves() {
        return this.reserves;
    }

    void addPlayer(Player somePlayer, double transferPrice, boolean isReserve) {
        if (somePlayer.getPlayedSport() != this.sportType) {
            return;
        }

        if (isReserve) {
            if (this.reserves.size() >= this.getMaxReservesCount()) {
                return;
            }

            this.reserves.put(somePlayer, transferPrice);
        } else {
            if (this.players.size() >= this.getMaxPlayersCount()) {
                return;
            }

            this.players.put(somePlayer, transferPrice);
        }
    }

    void removePlayer(Player somePlayer) {
        if (this.players.containsKey(somePlayer)) {
            this.players.remove(somePlayer);

            Map.Entry<Player, Double> firstReserve = this.reserves.firstEntry();
            if (firstReserve != null) {
                this.players.put(firstReserve.getKey(), firstReserve.getValue());
                this.reserves.remove(firstReserve.getKey());
            }
        } else {
            this.reserves.remove(somePlayer);
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Team team = (Team) other;
        return Double.compare(team.budget, budget) == 0 &&
                maxPlayersCount == team.maxPlayersCount &&
                maxReservesCount == team.maxReservesCount &&
                Objects.equals(name, team.name) &&
                sportType == team.sportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, sportType, maxPlayersCount, maxReservesCount);
    }
}
