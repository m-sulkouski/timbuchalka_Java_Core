package com.m_sulkouski.github.timbuchalka.MyGenericClass;

public class Main {
    public static void main(String[] args) {
        FootballPlayer ronaldo = new FootballPlayer("Christiano Ronaldo");
        HockeyPlayer ovi = new HockeyPlayer("Alexander Ovechkin");
        BaseballPlayer joe = new BaseballPlayer("John Doe");

        Team<FootballPlayer> juventus = new Team("Juventus F.C.");
        juventus.addPlayer(ronaldo);
        juventus.addPlayer(new FootballPlayer("Bonucci"));
        juventus.addPlayer(new FootballPlayer("Douglas Costa"));
        juventus

        System.out.println(allStars.countPlayers());
    }
}
