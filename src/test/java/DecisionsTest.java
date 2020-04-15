import org.junit.Test;

import static org.junit.Assert.*;

public class DecisionsTest {
    @Test
    public void shouldReturnCheatForCHInput() {
        assertEquals(Decisions.CHEAT, Decisions.getDecision("CH"));
    }

    @Test
    public void shouldReturnCooperateForCOInput() {
        assertEquals(Decisions.COOPERATE, Decisions.getDecision("CO"));
    }

    @Test
    public void shouldReturnNullForInvalidInput() {
        assertEquals(null, Decisions.getDecision(""));
    }

}