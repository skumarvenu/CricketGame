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

  public int randomFunction() {
    return (int) (Math.random() * 8);
  }

  public void batting(Team team, int target) {
    int striker = 0;
    int nonStriker = 1;
    for (int i = 0; i < OVER; i++) {
      for (int j = 0; j < BALLS; j++) {
        int perBallHit = randomFunction();
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
          System.out.println(team.players.get(striker).playerName + " hit " + perBallHit);
        } else {
          System.out.println(
              team.players.get(striker).playerName
                  + striker
                  + " out on "
                  + team.players.get(striker).getScore());
          wicket++;
          System.out.println("Current scoreboard of " + team.name + " is: " + run + "/" + wicket);
          striker = Math.max(striker, nonStriker);
          striker++;

          if (wicket == 10) break;
        }
      }
      int temp = striker;
      striker = nonStriker;
      nonStriker = temp;
      if (wicket == 10) {
        System.out.println("All out " + team.name);
        break;
      }
    }
  }
}
