import javafx.util.Pair;

public class TrustMachine {
    private Player p1;
    private Player p2;

    public TrustMachine(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int[] getScore(Decisions p1Decision, Decisions p2Decision) {
        int[] score = new int[2];

        if (p1Decision == Decisions.COOPERATE && p2Decision == Decisions.COOPERATE) {
            score[0] = DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints();
            score[1] = DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints();

        } else if (p1Decision == Decisions.COOPERATE && p2Decision == Decisions.CHEAT) {

            score[0] = DecisionPoints.POINT_LOST_WHEN_CHEATED.getPoints();
            score[1] = DecisionPoints.POINT_GAINED_WHEN_CHEATED.getPoints();

        } else if (p1Decision == Decisions.CHEAT && p2Decision == Decisions.CHEAT) {

            score[0] = DecisionPoints.POINT_GAINED_WHEN_BOTH_CHEATED.getPoints();
            score[1] = DecisionPoints.POINT_GAINED_WHEN_BOTH_CHEATED.getPoints();

        } else if (p1Decision == Decisions.CHEAT && p2Decision == Decisions.COOPERATE) {

            score[0] = DecisionPoints.POINT_GAINED_WHEN_CHEATED.getPoints();
            score[1] = DecisionPoints.POINT_LOST_WHEN_CHEATED.getPoints();

        }

        return score;
    }

    public int[] play() {
       return getScore(p1.getMove(), p2.getMove());
    }
}
