package minimax;

import java.util.HashMap;

public class MinimaxAlgo {

    private StringBuffer stateOfGame;
    private HashMap<Character, Integer> hashMap;

    public void setStateOfGame(String stateOfGame) {
        this.stateOfGame = new StringBuffer(stateOfGame);
        setHashMap();
    }

    private void setHashMap() {
        hashMap=new HashMap<>();
        hashMap.put('X', 10);
        hashMap.put('O', -10);
        hashMap.put('N', 0);
    }

    private char checkWinner() {
        //a 2D array consiting all winning position
        int[][] a = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 4, 8},
                {2, 4, 6},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8}
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
        if (stateOfGame.indexOf(" ") == -1)
            return "Draw";
        return "None";
    }

    private int minimax(int depth, boolean isMax) {
        char winner = checkWinner();
        //terminal condition for minimax tree
        if (winner != ' ') {
            System.out.println(hashMap.get(winner));
            return hashMap.get(winner)-depth;
        }

        if (isMax) {
            int bestScore = -10000;
            for (int i = 0; i < stateOfGame.length(); i++) {
                if (stateOfGame.charAt(i) == ' ') {
                    stateOfGame.setCharAt(i,'X');
                    int score = minimax(depth + 1, false);
                    stateOfGame.setCharAt(i,' ');
                    bestScore = Math.max(score, bestScore);
                }
            }
            return bestScore;
        } else {
            int bestScore = 10000;
            for (int i = 0; i < stateOfGame.length(); i++) {
                if (stateOfGame.charAt(i) == ' ') {
                    stateOfGame.setCharAt(i,'O');
                    int score = minimax(depth + 1, true);
                    stateOfGame.setCharAt(i,' ');
                    bestScore = Math.min(score, bestScore);
                }
            }
            return bestScore;
        }
    }

    public void bestMove(){
        int bestScore=-1000;
        int moveI=0;
        for(int i=0;i<stateOfGame.length();i++){
            if(stateOfGame.charAt(i)==' ') {
                stateOfGame.setCharAt(i,'X');
                int score = minimax(0,false);
                stateOfGame.setCharAt(i,' ');
                if(score>bestScore){
                    bestScore=score;
                    moveI=i;
                }
            }
        }
        stateOfGame.setCharAt(moveI,'X');
    }

    @Override
    public String toString() {
        return stateOfGame.charAt(0) + " " + stateOfGame.charAt(1) + " " + stateOfGame.charAt(2) + "\n" +
                stateOfGame.charAt(3) + " " + stateOfGame.charAt(4) + " " + stateOfGame.charAt(5) + "\n" +
                stateOfGame.charAt(6) + " " + stateOfGame.charAt(7) + " " + stateOfGame.charAt(8) + "\n";
    }
}