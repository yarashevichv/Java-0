package PracticalTask02;

public class Task2 {
    public static void main(String[] args) {
        double a = Reader.readDouble("Input a: ");
        double b = Reader.readDouble("Input b: ");
        double c = Reader.readDouble("Input c: ");

        Printer.print("The numbers is equal: "
                    + CheckEqualityOfNumbers.checkEquality(a, b, c));
    }
}
