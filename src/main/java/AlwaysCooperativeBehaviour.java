public class AlwaysCooperativeBehaviour implements PlayerBehavior {
    @Override
    public Decisions getMove() {
        return Decisions.COOPERATE;
    }
}