package PracticalTask02;

public class Task7 {
    public static void main(String[] args) {
        int a = Reader.readInt("Input a:");
        int b = Reader.readInt("Input b:");

        Printer.print("The variables before replace: a = " + a
                + ", b = " + b);

        Printer.print("\nThe variables after replace: " + ReplacingNumbers.replaceNumbers(a, b));
    }
}
