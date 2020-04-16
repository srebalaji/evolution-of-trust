import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        Player player1 = new Player(new ConsolePlayerBehaviour(new BufferedReader(new InputStreamReader(System.in))),3);
//        Player player2 = new Player(new ConsolePlayerBehaviour(new BufferedReader(new InputStreamReader(System.in))));

        CopyCatBehaviour copyCatBehaviour = new CopyCatBehaviour(player1.getId());
        Player player2 = new Player(copyCatBehaviour,4);
        GameEngine gameEngine = new GameEngine(player1, player2, 2, new ScoreBoard());

        gameEngine.addObserver(copyCatBehaviour);
        gameEngine.play();

    }
}
