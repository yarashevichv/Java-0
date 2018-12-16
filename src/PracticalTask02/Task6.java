package PracticalTask02;

public class Task6 {
    public static void main(String[] args) {
        int number = Reader.readInt("Input seven-digit number:");

        Printer.print("The result of flip " + number + " is: "
                + NumberFlip.flipNumber(number));
    }
}
