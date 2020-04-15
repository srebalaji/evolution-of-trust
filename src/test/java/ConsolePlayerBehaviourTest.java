import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ConsolePlayerBehaviourTest {
    private BufferedReader bufferedReader;
    @Before
    public void setUp() {
        bufferedReader = Mockito.mock(BufferedReader.class);
    }

    @Test
    public void shouldReturnCheatForCH() throws Exception {
        when(bufferedReader.readLine()).thenReturn("CH");
        ConsolePlayerBehaviour consolePlayer = new ConsolePlayerBehaviour(bufferedReader);
        assertEquals(Decisions.CHEAT,consolePlayer.getMove());
    }

    @Test
    public void shouldReturnCooperateForCO() throws Exception {
        when(bufferedReader.readLine()).thenReturn("CO");
        ConsolePlayerBehaviour consolePlayer = new ConsolePlayerBehaviour(bufferedReader);
        assertEquals(Decisions.COOPERATE,consolePlayer.getMove());
    }

    @Test(expected=InvalidDecisionException.class)
    public void shouldReturnWrongBehaviourForInvalid() throws Exception {
        when(bufferedReader.readLine()).thenReturn("COOP");
        ConsolePlayerBehaviour consolePlayer = new ConsolePlayerBehaviour(bufferedReader);
        consolePlayer.getMove();
    }
}