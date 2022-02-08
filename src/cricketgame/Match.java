package cricketgame;

import java.util.ArrayList;
import java.util.List;

public class Match {

  final int toss = (int) (Math.random() * 2);

  public Result play(Team team1, Team team2) {
    Result result = new Result();
    Inning inning1 = new Inning();
    inning1.batting(team1, 366);
    System.out.println(team1.name + " going to bat first");
    System.out.println(
        "Final Score of "
            + team1.name
            + " team is: "
            + inning1.getRun()
            + "/"
            + inning1.getWicket());
    Inning inning2 = new Inning();
    inning2.batting(team2, inning1.getRun() + 1);
    System.out.println(
        "Final Score of "
            + team2.name
            + " team is: "
            + inning2.getRun()
            + "/"
            + inning2.getWicket());
    if (inning1.getRun() > inning2.getRun()) {
      result.setRun(inning1.getRun() - inning2.getRun());
      result.winnerTeam = team1.name;
    } else {
      result.winnerTeam = team2.name;
      result.setWicket(10 - inning2.getWicket());
    }
    return result;
  }
}
