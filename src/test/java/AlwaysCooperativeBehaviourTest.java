import org.junit.Test;

import static org.junit.Assert.*;

public class AlwaysCooperativeBehaviourTest {
    public void shouldReturnCheat() {
        assertEquals(new AlwaysCheatBehaviour(), Decisions.COOPERATE);
    }
}