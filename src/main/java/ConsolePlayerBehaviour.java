import java.io.BufferedReader;
import java.io.IOException;

public class ConsolePlayerBehaviour implements PlayerBehavior {
    private BufferedReader bufferedReader;

    public ConsolePlayerBehaviour(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public Decisions getMove() throws InvalidDecisionException {
        String input = null;
        try {
            System.out.println("Enter your move");
            input = this.bufferedReader.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Decisions.getDecision(input);
    }
}
