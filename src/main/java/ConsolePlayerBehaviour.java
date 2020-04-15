public class ConsolePlayerBehaviour implements PlayerBehavior {
    @Override
    public Decisions getMove() {
        return Decisions.CHEAT;
    }
}
