package minimax;

import java.util.HashMap;

public class MinimaxAlgo {

    private String stateOfGame;
    private HashMap<String, Integer> hashMap;

    public void setStateOfGame(String stateOfGame) {
        this.stateOfGame = stateOfGame;
    }

    private void setHashMap() {
        hashMap.put("X", 10);
        hashMap.put("O", -10);
        hashMap.put("N", 0);
    }

    private char checkWinner() {
        //a 2D array consiting all winning position
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 5, 9},
                {3, 5, 7},
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        for (int i = 0; i < 8; i++) {
            if (stateOfGame.charAt(a[i][0]) == stateOfGame.charAt(a[i][1]) && stateOfGame.charAt(a[i][1]) == stateOfGame.charAt(a[i][2]))
                return stateOfGame.charAt(a[i][0]);
        }
        if (checkDraw().compareTo("Draw") == 0)
            return 'N';
        return ' ';
    }

    public String checkDraw() {
        if (stateOfGame.indexOf(' ') == -1)
            return "Draw";
        return "None";
    }

    private int minimax(int depth, boolean isMax) {
        char winner = checkWinner();

        //terminal condition for minimax tree
        if (winner != ' ')
            return hashMap.get(winner);

        if (isMax) {
            int bestScore = -10000;
            for (int i = 0; i < stateOfGame.length(); i++) {
                if (stateOfGame.charAt(i) == ' ') {
                    stateOfGame = stateOfGame.substring(0, i) + "X" + stateOfGame.substring(i + 1);
                    int score = minimax(depth + 1, false);
                    stateOfGame = stateOfGame.substring(0, i) + " " + stateOfGame.substring(i + 1);
                    bestScore = Math.max(score, bestScore);
                }
            }
            return bestScore;
        } else {
            int bestScore = 10000;
            for (int i = 0; i < stateOfGame.length(); i++) {
                if (stateOfGame.charAt(i) == ' ') {
                    stateOfGame = stateOfGame.substring(0, i) + "O" + stateOfGame.substring(i + 1);
                    int score = minimax(depth + 1, true);
                    stateOfGame = stateOfGame.substring(0, i) + " " + stateOfGame.substring(i + 1);
                    bestScore = Math.max(score, bestScore);
                }
            }
            return bestScore;
        }
    }

    @Override
    public String toString() {
        return stateOfGame.charAt(0) + " " + stateOfGame.charAt(1) + " " + stateOfGame.charAt(2) + "\n" +
                stateOfGame.charAt(3) + " " + stateOfGame.charAt(4) + " " + stateOfGame.charAt(5) + "\n" +
                stateOfGame.charAt(6) + " " + stateOfGame.charAt(7) + " " + stateOfGame.charAt(8) + "\n";
    }
}