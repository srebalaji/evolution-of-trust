public enum DecisionPoints {
    POINT_LOST_WHEN_CHEATED (-1),
    POINT_GAINED_WITH_COOPERATION(2),
    POINT_GAINED_WHEN_CHEATED (3),
    POINT_GAINED_WHEN_BOTH_CHEATED(0)
    ;

    private int i;

    DecisionPoints(int i) {

        this.i = i;
    }

    public int getPoints() {
        return this.i;
    }
}
