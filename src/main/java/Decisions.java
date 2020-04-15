import java.awt.*;
import java.util.stream.Stream;

public enum Decisions {
    COOPERATE("CO"),
    CHEAT("CH")
    ;

    private String input;

    Decisions(String input) {
        this.input = input;
    }

    private String getInput() {
        return this.input;
    }

    public static Decisions getDecision (String input) throws InvalidDecisionException {
        if(input.equalsIgnoreCase(COOPERATE.getInput())) {
            return COOPERATE;
        } else if(input.equalsIgnoreCase(CHEAT.getInput())) {
            return CHEAT;
        }
        throw new InvalidDecisionException("Invalid Decisions");
    }
}
