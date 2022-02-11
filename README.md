### GAME OF CRICKET

## PHASE 1

"Game of Cricket:  Write classes CricketGame, Player, Match and MatchController and any class thet they think is
required. Write a random function which returns 0,1,2,3,4,5,6 or W. That is for every ball it says runs or wicket. Match
controller to take 2 teams and uses the sequence of random function calls and prints the results. Run multiple times and
print results"
please create your individual repository on git every time I give an enhancement on the project.. it should be checked
in as a new branch let me know if you have any questions on this please use intellij for creating the project... and it
should be a spring boot project

## PHASE 2

- Enhance the above project to create Score Board 
- Score board has:
  Total score of a team. Batting Score Card: Each player, noOfBalls played, noOfRuns, noOf boundaries Bowling Score
  Card: Each player - noOfOvers, runs given, wickets taken, maiden overs

- make sure each player is defined as BatsMan or Bowler. Modify the random function to returns runs in high probability
  than wicket for the Batsman. Add support for player rating. Apply rating in probability of random function to return
  wicket or runs

- Install MongoDB and store real time scorecards in the database

- convert to a spring boot project and expose apis
    - API 1: given matchId, display scorecard , results
    - API 2: show all live games running .