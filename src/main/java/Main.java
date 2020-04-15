import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        Player player1 = new Player(new ConsolePlayerBehaviour(new BufferedReader(new InputStreamReader(System.in))));
        Player player2 = new Player(new ConsolePlayerBehaviour(new BufferedReader(new InputStreamReader(System.in))));
        GameEngine gameEngine = new GameEngine(player1, player2, 3, new ScoreBoard());

        gameEngine.play();
    }
}
