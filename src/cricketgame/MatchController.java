package cricketgame;

public class MatchController {
private final Match match;

  public MatchController(Match match) {
    this.match = match;
  }

  public void start(Team team1, Team team2) {

    Result result = match.play(team1, team2);
    if (result.getRun() != 0) {
      System.out.println(result.getWinnerTeam() + " won by " + result.getRun() + " runs.");
    } else {
      System.out.println(result.getWinnerTeam() + " won by " + result.getWicket() + " wickets.");
    }
  }
}
