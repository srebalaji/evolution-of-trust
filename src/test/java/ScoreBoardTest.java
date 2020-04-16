import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreBoardTest {
    @Test
    public void checkForAddingScore() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Player player1 = new Player(new AlwaysCooperativeBehaviour(),1);

        scoreBoard.updateScore(player1, 1);
        assertEquals(scoreBoard.getScore(player1), 1);
    }
}