package cricketgame;

import java.util.ArrayList;
import java.util.List;

public class Team {
  List<Player> players = new ArrayList<>();

  public Team() {

    for (int i = 0; i < 11; i++) {
      players.add(new Player());
    }
  }
}
