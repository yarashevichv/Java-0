package TestTask05;

import PracticalTask02.Printer;
import PracticalTask02.Reader;

public class TaskFibonacci {
    public static void main(String[] args) {
        int number = Reader.readInt("Input number: ");

        Printer.print("The result of calculation is " + Fibonacci.calculateFibonacci(number));
    }
}
