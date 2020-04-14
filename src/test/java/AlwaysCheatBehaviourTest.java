import org.junit.Test;

import static org.junit.Assert.*;

public class AlwaysCheatBehaviourTest {
    public void shouldReturnCheat() {
        assertEquals(new AlwaysCheatBehaviour(), Decisions.CHEAT);
    }
}