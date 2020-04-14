import org.junit.Test;

import static org.junit.Assert.*;

public class TrustMachineTest {

    @Test
    public void checkMachineForCooperativePlayers() {
        int[] score = new TrustMachine(new Player(), new Player()).play();
        assertArrayEquals(score,
        new int[]{DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints(), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints()});
    }

//    @Test
//    public void checkMachineForCooperateAndCheat() {
//        int[] score = new TrustMachine().getScore(Decisions.COOPERATE, Decisions.CHEAT);
//        assertArrayEquals(score,
//        new int[]{DecisionPoints.POINT_LOST_WHEN_CHEATED.getPoints(), DecisionPoints.POINT_GAINED_WHEN_CHEATED.getPoints()});
//    }
//
//    @Test
//    public void checkMachineForCooperateAndCooperate() {
//        int[] score = new TrustMachine().getScore(Decisions.COOPERATE, Decisions.COOPERATE);
//        assertArrayEquals(score,
//        new int[]{DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints(), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints()});
//    }
//
//    @Test
//    public void checkMachineForCheatAndCheat() {
//        int[] score = new TrustMachine().getScore(Decisions.CHEAT, Decisions.CHEAT);
//        assertArrayEquals(score,
//        new int[]{DecisionPoints.POINT_GAINED_WHEN_BOTH_CHEATED.getPoints(), DecisionPoints.POINT_GAINED_WHEN_BOTH_CHEATED.getPoints()});
//    }
//
//    @Test
//    public void checkMachineForCheatAndCooperate() {
//        int[] score = new TrustMachine().getScore(Decisions.CHEAT, Decisions.COOPERATE);
//        assertArrayEquals(score,
//        new int[]{DecisionPoints.POINT_GAINED_WHEN_CHEATED.getPoints(), DecisionPoints.POINT_LOST_WHEN_CHEATED.getPoints()});
//    }
}