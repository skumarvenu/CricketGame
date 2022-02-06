package cricketgame;

public class Inning {
  private int wicket;
  private int run;
  static final int OVER = 10;
  static final int BALLS = 6;

  public int getWicket() {
    return wicket;
  }

  public int getRun() {
    return run;
  }

  public void batting(Team team) {
    int striker = 0;
    int nonStriker = 1;
    for (int i = 0; i < OVER; i++) {
      for (int j = 0; j < BALLS; j++) {
        int perBallHit = team.players.get(striker).doBat();
        if (perBallHit < 7) {
          team.players.get(striker).setScore(perBallHit);
          run += perBallHit;
          System.out.println("playerNo " + striker + " hit " + perBallHit);
          if (perBallHit % 2 != 0) {
            int temp = striker;
            striker = nonStriker;
            nonStriker = temp;
          }
        } else {
          System.out.println(
              "playerNo " + striker + " out on " + team.players.get(striker).getScore());
          wicket++;
          System.out.println("Current scoreboard is: " + run + "/" + wicket);
          striker = Math.max(striker, nonStriker);
          striker++;
          if (wicket == 10) break;
        }
      }
      int temp = striker;
      striker = nonStriker;
      nonStriker = temp;
      if (wicket == 10) {
        System.out.println("All out teamA");
        break;
      }
    }
  }

  public void batting(Team team, int target, int toss) {
    int striker = 0;
    int nonStriker = 1;
    for (int i = 0; i < OVER; i++) {
      for (int j = 0; j < BALLS; j++) {
        int perBallHit = team.players.get(striker).doBat();
        if (perBallHit < 7) {
          team.players.get(striker).setScore(perBallHit);
          run += perBallHit;
          if (perBallHit % 2 != 0) {
            int temp = striker;
            striker = nonStriker;
            nonStriker = temp;
          }
          if (run >= target) {
            return;
          }
          System.out.println("playerNo " + striker + " hit " + perBallHit);
        } else {
          System.out.println(
              "playerNo " + striker + " out on " + team.players.get(striker).getScore());
          wicket++;
          System.out.println("Current scoreboard is: " + run + "/" + wicket);
          striker = Math.max(striker, nonStriker);
          striker++;

          if (wicket == 10) break;
        }
      }
      int temp = striker;
      striker = nonStriker;
      nonStriker = temp;
      if (wicket == 10) {
        System.out.println("All out teamA");
        break;
      }
    }
  }
}
