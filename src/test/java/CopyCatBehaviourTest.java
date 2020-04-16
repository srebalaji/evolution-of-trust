import org.junit.Test;

import static org.junit.Assert.*;

public class CopyCatBehaviourTest {
    @Test
    public void testCopyCatFirstMove() throws InvalidDecisionException {
        assertEquals(Decisions.COOPERATE, new CopyCatBehaviour(1).getMove());
    }

}