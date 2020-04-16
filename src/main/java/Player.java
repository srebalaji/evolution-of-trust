public class Player {
    private PlayerBehavior playerBehavior;
    private int id;

    public Player(PlayerBehavior playerBehavior, int id) {
        this.playerBehavior = playerBehavior;
        this.id = id;
    }

    public int getId(){
        return this.id;
    }


    public Decisions getMove() throws InvalidDecisionException {
        return playerBehavior.getMove();
    }
}
