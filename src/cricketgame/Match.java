package cricketgame;

import java.util.ArrayList;
import java.util.List;

public class Match {
  List<Team> teams = new ArrayList<>();

  final int toss = (int) (Math.random() * 2);

  public Match() {
    for (int i = 0; i < 2; i++) teams.add(new Team());
  }

  public void play() {
    List<Inning> innings = new ArrayList<>();
    for (int i = 0; i < 2; i++) innings.add(new Inning());
    System.out.println("Team " + toss + " going to first bat");
    innings.get(0).batting(teams.get(toss));
    System.out.println(
        "Final Score of team "
            + toss
            + " is: "
            + innings.get(0).getRun()
            + "/"
            + innings.get(0).getWicket());
    innings.get(1).batting(teams.get(1 - toss), innings.get(0).getRun() + 1, (1 - toss));
    System.out.println(
        "Final Score of team "
            + (1 - toss)
            + " is: "
            + innings.get(1).getRun()
            + "/"
            + innings.get(1).getWicket());
    if (innings.get(1).getRun() >= innings.get(0).getRun()) {
      System.out.println(
          "Team " + (1 - toss) + " won by " + (10 - innings.get(1).getWicket()) + " wicket");
    } else {
      System.out.println(
          "Team "
              + toss
              + " won by "
              + (innings.get(0).getRun() - innings.get(1).getRun())
              + " runs");
    }
  }
}
