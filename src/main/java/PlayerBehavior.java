public interface PlayerBehavior {
    Decisions getMove() throws InvalidDecisionException;
}
