package PracticalTask02;

public class ReplacingNumbers {
    public static String replaceNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        return "a = " + a + ", b = " + b;
    }
}
