package cricketgame;

public class Player {
  private int score;

  public int getScore() {
    return score;
  }

  public void setScore(int hitPerBall) {
    score += hitPerBall;
  }

  public int doBat() {
    return (int) (Math.random() * 8);
  }
}
