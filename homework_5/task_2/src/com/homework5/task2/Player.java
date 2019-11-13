package com.homework5.task2;

class Player implements Comparable<Player> {
    private String name;
    private SportType playedSport;

    Player(String name, SportType playedSport) {
        this.name = name;
        this.playedSport = playedSport;
    }

    String getName() {
        return this.name;
    }

    SportType getPlayedSport() {
        return this.playedSport;
    }

    @Override
    public int compareTo(Player player) {
        return this.getName().compareTo(player.getName());
    }
}
