import minimax.MinimaxAlgo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter");
        String game = scan.nextLine();
        MinimaxAlgo algo = new MinimaxAlgo();
        algo.setStateOfGame(game);
        algo.bestMove();
        System.out.println(algo.toString());
    }
}
