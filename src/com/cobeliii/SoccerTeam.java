package com.cobeliii;

import java.util.ArrayList;
import java.util.List;

public class SoccerTeam implements Team{
    private String teamName;
    private List<Player> teamMembers;

    private int totalWins;
    private int totalLosses;
    private int totalDraws;

    public SoccerTeam(String teamName) {
        this.teamName = teamName;
        this.teamMembers = new ArrayList<>();
        this.totalWins = 0;
        this.totalLosses = 0;
        this.totalDraws = 0;
    }

    @Override
    public void addTeamMember(Player player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    @Override
    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
    }

    @Override
    public int ranking(){
        return (totalLosses * 2) + totalDraws + 1;
    }

    @Override
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
