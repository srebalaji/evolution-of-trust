import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class DecisionsTest {
    @Test
    public void shouldReturnCheatForCHInput() throws InvalidDecisionException {
        assertEquals(Decisions.CHEAT, Decisions.getDecision("CH"));
    }

    @Test
    public void shouldReturnCooperateForCOInput() throws InvalidDecisionException {
        assertEquals(Decisions.COOPERATE, Decisions.getDecision("CO"));
    }

    @Test(expected = InvalidDecisionException.class)
    public void shouldReturnNullForInvalidInput() throws InvalidDecisionException {
        Decisions.getDecision("");
    }

}