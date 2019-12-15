package com.homework5.task2;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

class OlympicGame {
    private Date date;
    private String location;
    private Collection<Team> teams;

    OlympicGame(String location, Date date) {
        this.location = location;
        this.date = date;
        this.teams = new HashSet<>();
    }

    Date getDate() {
        return this.date;
    }

    String getLocation() {
        return this.location;
    }

    Collection<Team> getTeams() {
        return this.teams;
    }

    void addTeam(Team someTeam) {
        this.teams.add(someTeam);
    }

    void removeTeam(Team someTeam) {
        this.teams.remove(someTeam);
    }
}
