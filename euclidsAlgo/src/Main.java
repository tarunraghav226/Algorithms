import euclidsAlgo.EuclidsAlgorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EuclidsAlgorithm euclidsAlgorithm = new EuclidsAlgorithm();
        Scanner scan = new Scanner(System.in);
        euclidsAlgorithm.setFirstNumber(scan.nextInt());
        euclidsAlgorithm.setSecondNumber(scan.nextInt());
        System.out.println("GCD of given two numbers is --> " + euclidsAlgorithm.getGcd());
    }
}
