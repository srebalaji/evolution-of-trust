import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void shouldReturnCooperate() {
        assertEquals(new Player().getMove(), Decisions.COOPERATE);
    }
}