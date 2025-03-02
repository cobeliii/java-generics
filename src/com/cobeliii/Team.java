package com.cobeliii;

public interface Team {
    void addTeamMember(Player player);
    void listTeamMembers();
    int ranking();
    String setScore(int ourScore, int theirScore);
}
