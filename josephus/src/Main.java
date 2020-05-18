import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of people:");
        int n = scan.nextInt();
        System.out.println("Enter elimination number:");
        int k = scan.nextInt();
        System.out.println(JosephusProblem.solve(n, k));
    }
}
