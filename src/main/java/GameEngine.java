public class GameEngine {
    private Player player1;
    private Player player2;
    private int rounds;
    private ScoreBoard scoreBoard;

    public GameEngine(Player player1, Player player2, int rounds, ScoreBoard scoreboard) {
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
        this.scoreBoard = scoreboard;
    }

    public void play() {
        for(int i=0; i<rounds; i+=1) {
            int scores[] = TrustMachine.getScore(player1.getMove(), player2.getMove());
            scoreBoard.updateScore(player1, scores[0]);
            scoreBoard.updateScore(player2, scores[1]);
            System.out.println("Player1: "+ scoreBoard.getScore(player1) + " Player2: " + scoreBoard.getScore(player2));
        }
    }
}
