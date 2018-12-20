package TestTask05;

import PracticalTask02.Printer;
import PracticalTask02.Reader;

public class TaskFactorial {
    public static void main(String[] args) {
        int number = Reader.readInt("Input number:");

        Printer.print("Factorial of number " + number + " is " + Factorial.calculateFactorial(number));
    }
}
