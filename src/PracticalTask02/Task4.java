package PracticalTask02;

public class Task4 {
    public static void main(String[] args) {
        int number = Reader.readInt("Input four-digit number:");

        Printer.print("The digits of number " + number + " increase: "
                + CheckIncreaseOfNumbers.checkIncrease(number));
    }
}
