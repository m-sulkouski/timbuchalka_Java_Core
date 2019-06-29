package com.m_sulkouski.github.timbuchalka.MyGenericClass;

import java.util.ArrayList;

public class Team<T> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (players.contains(player)) {
            System.out.println("Player " + ((Player)player).getName() + " is already in the team!");
            return false;
        }
        else {
            players.add(player);
            System.out.println("Player " + player.getName() + " added to the team!");
        }
        return true;
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void setMatchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        }
        else if (theirScore > ourScore) {
            lost++;
        }
        else
            tied++;
                if (opponent != null) {
            opponent.setMatchResult(null, theirScore, ourScore);
        }
    }

    public int getPointsEarned() {
        return (won * 3) + tied;
    }
}
