import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {
    private Map<Player, Integer> playerTable;

    public ScoreBoard() {
        playerTable = new HashMap<Player, Integer>();
    }

    public int getScore(Player player) {
        return playerTable.get(player);
    }

    public void updateScore(Player player, int score) {
        playerTable.put(player,playerTable.getOrDefault(player,0)  + score);
    }
}
