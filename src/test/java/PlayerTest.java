import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void shouldReturnCooperate() throws InvalidDecisionException {
        assertEquals(new Player(new AlwaysCooperativeBehaviour()).getMove(), Decisions.COOPERATE);
    }

    @Test
    public void shouldReturnCheat() throws InvalidDecisionException {
        assertEquals(new Player(new AlwaysCheatBehaviour()).getMove(), Decisions.CHEAT);
    }
}