package cricketgame;

public class Player {
  private int score;
  String playerName;

  public Player(String name) {
    playerName = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int hitPerBall) {
    score += hitPerBall;
  }
}
