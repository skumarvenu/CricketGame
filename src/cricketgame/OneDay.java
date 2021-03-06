package cricketgame;

public class OneDay implements Match{

    @Override
    public Result play(Team team1, Team team2) {
        Result result = new Result();
        Inning inning1 = new Inning();
        System.out.println(team1.name + " going to bat first");
        inning1.batting(team1, 366);

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
            result.setWinnerTeam(team1.name);
        } else {
            result.setWinnerTeam(team2.name);
            result.setWicket(10 - inning2.getWicket());
        }
        return result;
    }
}
