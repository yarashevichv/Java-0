package TestTask05;

public class Factorial {
    public static int calculateFactorial(int number) {
        int result = 0;

        if (number > 0) {
            result = 1;

            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }

        return result;
    }
}
