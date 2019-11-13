package com.homework5.task2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    OlympicGame game = new OlympicGame("some location", new Date());
	    Team team1 = new Team(
	            "team1",
                3000,
                SportType.Basketball,
                new Trainer("trainer1", 20, SportType.Basketball));
	    Player player1 = new Player("player1", SportType.Basketball);
	    Player player2 = new Player("player2", SportType.Basketball);
		Player player3 = new Player("player3", SportType.Basketball);
	    team1.addPlayer(player1, 100, false);
		team1.addPlayer(player3, 100, true);
		team1.addPlayer(player2, 100, true);

	    Team team2 = new Team(
	            "team2",
                5000,
                SportType.Football,
                new Trainer("trainer2", 15, SportType.Football));
        team2.addPlayer(new Player("player3", SportType.Basketball), 100, false);

        game.addTeam(team1);
        game.addTeam(team2);

        team1.removePlayer(player1);
		System.out.println(team1.getPlayers().firstEntry().getKey().getName());
		System.out.println(team1.getReserves().size());
    }
}
