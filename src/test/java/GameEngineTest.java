import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GameEngineTest {
    ScoreBoard scoreBoard;
    Player player;

    @Before
    public void setUp() {
        scoreBoard= Mockito.mock(ScoreBoard.class);
        player= Mockito.mock(Player.class);
    }

    @Test
    public void testGameEngine() {
        when(scoreBoard.getScore(player)).thenReturn(DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints());
        assertEquals(scoreBoard.getScore(player), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints());
    }
    @Test
    public void checkGamePlay() throws InvalidDecisionException {
        ScoreBoard scoreBoard = new ScoreBoard();
        Player player1 = new Player(new AlwaysCooperativeBehaviour());
        Player player2 = new Player(new AlwaysCooperativeBehaviour());

        new GameEngine(player1, player2, 1, scoreBoard).play();

        assertEquals(scoreBoard.getScore(player1), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints());
        assertEquals(scoreBoard.getScore(player2), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints());
    }
    
    @Test
    public void checkGamePlayForCooperativePlayerFiveRounds() throws InvalidDecisionException {
        ScoreBoard scoreBoard = new ScoreBoard();
        Player player1 = new Player(new AlwaysCooperativeBehaviour());
        Player player2 = new Player(new AlwaysCooperativeBehaviour());

        GameEngine gameEngine = new GameEngine(player1, player2, 5, scoreBoard);
        gameEngine.play();

        assertEquals(scoreBoard.getScore(player1), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints() * 5);
        assertEquals(scoreBoard.getScore(player2), DecisionPoints.POINT_GAINED_WITH_COOPERATION.getPoints() * 5);
        
    }

}