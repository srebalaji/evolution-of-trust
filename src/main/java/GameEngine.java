import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class GameEngine extends Observable {
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

    public void play() throws InvalidDecisionException {
        for (int i = 0; i < rounds; i += 1) {
            Decisions player1Decision = player1.getMove();
            Decisions player2Decision = player2.getMove();

            Map<Integer, Decisions> playersDecision = new HashMap<Integer, Decisions>();
            playersDecision.put(player1.getId(), player1Decision);
            playersDecision.put(player2.getId(), player2Decision);

            int scores[] = TrustMachine.getScore(player1Decision, player2Decision);
            scoreBoard.updateScore(player1, scores[0]);
            scoreBoard.updateScore(player2, scores[1]);
            publishMove(playersDecision);

            System.out.println("Player1: " + scoreBoard.getScore(player1) + " Player2: " + scoreBoard.getScore(player2));
        }
    }

    private void publishMove(Map<Integer, Decisions> playersDecision) {
        setChanged();
        notifyObservers(playersDecision);
    }
}
