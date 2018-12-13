package PracticalTask02;

public class Task2 {
    public static void main(String[] args) {
        double a = Reader.read("Input a: ");
        double b = Reader.read("Input b: ");
        double c = Reader.read("Input c: ");

        Printer.print("The numbers is equal: "
                    + CheckEqualityOfNumbers.checkEquality(a, b, c));
    }
}
