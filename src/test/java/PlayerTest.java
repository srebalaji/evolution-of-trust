import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void shouldReturnCooperate() throws InvalidDecisionException {
        assertEquals(new Player(new AlwaysCooperativeBehaviour(), 1).getMove(), Decisions.COOPERATE);
    }

    @Test
    public void shouldReturnCheat() throws InvalidDecisionException {
        assertEquals(new Player(new AlwaysCheatBehaviour(), 2).getMove(), Decisions.CHEAT);
    }
}