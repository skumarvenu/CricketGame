package cricketgame;

import java.util.ArrayList;
import java.util.List;

public class Team {
  String name;
  List<Player> players = new ArrayList<>();

  public Team(String name) {
    this.name = name;

    for (int i = 0; i < 11; i++) {
      Integer iWrap = new Integer(i);
      players.add(new Player(Integer.toString(iWrap)));
    }
  }
}
