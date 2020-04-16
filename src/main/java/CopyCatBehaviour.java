import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class CopyCatBehaviour implements PlayerBehavior, Observer {
    private Decisions copyCatMove = Decisions.COOPERATE;
    private int opponentIdentifier;

    CopyCatBehaviour(int identifier) {
        this.opponentIdentifier = identifier;
    }

    @Override
    public Decisions getMove() throws InvalidDecisionException {
        return copyCatMove;
    }

    @Override
    public void update(Observable o, Object arg) {
        Map<Integer, Decisions> playerMap = (Map) arg;
        this.copyCatMove = playerMap.get(opponentIdentifier);
    }
}
