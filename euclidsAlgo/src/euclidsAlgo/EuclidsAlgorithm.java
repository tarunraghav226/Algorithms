package euclidsAlgo;

public class EuclidsAlgorithm {
    private int firstNumber;
    private int secondNumber;
    private int gcd;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    private int euclidsAlgorithm(int num1, int num2) {
        /**Below is the optimized euclids algorithm for finding gcd of two numbers.
         */
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 % num2 == 0)
            return num2;
        return euclidsAlgorithm(num2, num1 % num2);
    }

    public int getGcd() {
        return euclidsAlgorithm(this.firstNumber, this.secondNumber);
    }
}
