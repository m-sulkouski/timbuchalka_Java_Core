package com.m_sulkouski.github.timbuchalka.MyGenericClass;

public class Main {
    public static void main(String[] args) {
        FootballPlayer ronaldo = new FootballPlayer("Christiano Ronaldo");
        HockeyPlayer ovi = new HockeyPlayer("Alexander Ovechkin");
        BaseballPlayer joe = new BaseballPlayer("John Doe");

        Team allStars = new Team("All stars");
        allStars.addPlayer(ronaldo);
        allStars.addPlayer(ovi);
        allStars.addPlayer(joe);

        System.out.println(allStars.countPlayers());
    }
}
