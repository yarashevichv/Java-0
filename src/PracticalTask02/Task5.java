package PracticalTask02;

public class Task5 {
    public static void main(String[] args) {
        int number = Reader.readInt("Input six-digit number:");

        Printer.print("Arithmetic average of number " + number + " is: "
                + AverageOfNumbers.findArithmeticAverage(number) + "\n");
        Printer.print("Geometric average of number " + number + " is: "
                + AverageOfNumbers.findGeometricAverage(number) + "\n");
    }
}
