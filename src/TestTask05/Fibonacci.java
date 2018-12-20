package TestTask05;

public class Fibonacci {

    public static final int ZERO_NUMBER = 0;
    public static final int FIRST_NUMBER = 1;

    public static int calculateFibonacci(int number) {
        int result;
        int a = ZERO_NUMBER;
        int b = FIRST_NUMBER;
        int c;

        if (number == ZERO_NUMBER) {
            result = a;
        } else {
            for (int i = FIRST_NUMBER + 1; i <= number; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            result = b;
        }

        return result;
    }

}
