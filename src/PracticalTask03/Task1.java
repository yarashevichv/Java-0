package PracticalTask03;

import PracticalTask02.Printer;
import PracticalTask02.Reader;

public class Task1 {
    public static void main(String[] args) {
        int age = Reader.readInt("Input dragon age: ");

        Printer.print("The number of head is " + Dragon.calculationNumberOfHeads(age)
                + "\nThe number of eyes is " + Dragon.calculationNumberOfEyes(age));
    }
}
