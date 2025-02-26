package com.cobeliii;

record BaseballPlayer(String name, String position) {}

public class Main {
    public static void main(String[] args) {
        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");

        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);

        phillies.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int team1Score,BaseballTeam team2, int team2Score) {
        String message = team1.setScore(team1Score, team2Score);
        team2.setScore(team2Score, team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
