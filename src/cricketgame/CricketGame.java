package cricketgame;

import java.util.Scanner;

public class CricketGame {
  public static void main(String[] args) {

    String teamName1;
    String teamName2;

    Scanner sc = new Scanner(System.in);

    teamName1 = sc.nextLine();

    teamName2 = sc.nextLine();
    Team team1 = new Team(teamName1);
    Team team2 = new Team(teamName2);

    MatchController matchController = new MatchController();
    matchController.start(team1, team2);
  }
}
