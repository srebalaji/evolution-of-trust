public class Player {
    private int score;
    public Decisions getMove() {
        return Decisions.COOPERATE;
    }

    public void updateScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
