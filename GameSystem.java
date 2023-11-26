package TreasureHunt;

import java.util.ArrayList;

public class GameSystem {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Player> winnerComparator = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Map newGame(int rows, int columns, Treasure[] treasures) {
        Map map = new Map(rows, columns, treasures);
        return map;
    }

    public Player getWinner() {

        int maxScore = 0;
        winnerComparator.add(players.get(0));
        int leastSteps = 0;
        Player winner = players.get(0);

        for (int i = 1; i < players.size(); i++) {
            maxScore = Math.max(players.get(i - 1).getScore(), players.get(i).getScore());
        }
        for (int j = 0; j < players.size(); j++) {
            if (players.get(j).getScore() == maxScore) {
                winnerComparator.add(players.get(j));
            }
        }

        if (winnerComparator.size() > 1) {
            for (int k = 1; k < winnerComparator.size(); k++) {
                leastSteps = Math.min(winnerComparator.get(k - 1).getSteps(), winnerComparator.get(k).getSteps());
            }
            for (int n = 0; n < winnerComparator.size(); n++) {
                if (winnerComparator.get(n).getSteps() == leastSteps) {
                    winner = winnerComparator.get(n);
                }
            }
        }

        return winner;

    }

}
