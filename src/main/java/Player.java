public class Player {
    private PlayerBehavior playerBehavior;

    public Player(PlayerBehavior playerBehavior) {
        this.playerBehavior = playerBehavior;
    }

    public Decisions getMove() {
        return playerBehavior.getMove();
    }
}
