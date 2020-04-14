public class AlwaysCheatBehaviour implements PlayerBehavior {
    @Override
    public Decisions getMove() {
        return Decisions.CHEAT;
    }
}
