package com.cobeliii;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends PlayerInterface>{
    private T t;
    private String teamName;
    private List<Player> teamMembers;
    private int ranking;
    private int totalWins;
    private int totalLosses;
    private int totalDraws;

    public Team(String teamName) {
        this.teamName = teamName;
        teamMembers = new ArrayList<>();
        this.totalWins = 0;
        this.totalLosses = 0;
        this.totalDraws = 0;
    }


    public void addTeamMember(Player player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }


    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
    }


    public int ranking() {
        return (totalLosses * 2) + totalDraws + 1;
    }


    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            this.totalWins++;
            message = "wins";
        }else if (ourScore < theirScore) {
            this.totalLosses++;
        }else {
            this.totalDraws++;
            message = "draw";
        }

        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
