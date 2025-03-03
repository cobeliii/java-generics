import com.cobeliii.BaseballTeam;
import com.cobeliii.Player;
import com.cobeliii.PlayerInterface;
import com.cobeliii.Team;

public class Main {
    public static void main(String[] args) {
//        PlayerInterface phillies = new BaseballTeam("Philadelphia Phillies");
//        PlayerInterface astros = new BaseballTeam("Houston Astros");

        Team<BaseballTeam> phillies = new Team<>("Philadelphia Phillies");
        Team<BaseballTeam> astros = new Team<>("Houston Astros");

        scoreResult(phillies, 3, astros, 5);

        var harper = new Player("B Harper", "Right Fielder");
        var marsh = new Player("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();
    }

    //Fix this later
    public static void scoreResult(Team team1, int team1Score, Team team2, int team2Score) {
        String message = team1.setScore(team1Score, team2Score);
        team2.setScore(team2Score, team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
    
}
