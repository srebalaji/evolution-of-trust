import org.junit.Test;

import static org.junit.Assert.*;

public class GameEngineTest {
    @Test
    public void checkGamePlay() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Player player1 = new Player(new AlwaysCooperativeBehaviour());
        Player player2 = new Player(new AlwaysCooperativeBehaviour());

        new GameEngine(player1, player2, 1, scoreBoard).play();

        assertEquals(scoreBoard.getScore(player1), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints());
        assertEquals(scoreBoard.getScore(player2), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints());
    }
    
    @Test
    public void checkGamePlayForCooperativePlayerFiveRounds() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Player player1 = new Player(new AlwaysCooperativeBehaviour());
        Player player2 = new Player(new AlwaysCooperativeBehaviour());

        GameEngine gameEngine = new GameEngine(player1, player2, 5, scoreBoard);
        gameEngine.play();

        assertEquals(scoreBoard.getScore(player1), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints() * 5);
        assertEquals(scoreBoard.getScore(player2), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints() * 5);
        
    }
}