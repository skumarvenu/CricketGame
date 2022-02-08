package cricketgame;

public class Result {
  String winnerTeam;
  private int run;
  private int wicket;

  public void setRun(int run) {
    this.run = run;
  }

  public int getRun() {
    return run;
  }

  public void setWicket(int wicket) {
    this.wicket = wicket;
  }

  public int getWicket() {
    return wicket;
  }

  public void setWinnerTeam(String winnerTeam) {
    this.winnerTeam = winnerTeam;
  }

  public String getWinnerTeam() {
    return winnerTeam;
  }
}
