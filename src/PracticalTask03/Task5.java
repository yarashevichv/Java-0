package PracticalTask03;

import PracticalTask02.Printer;
import PracticalTask02.Reader;

public class Task5 {
    public static void main(String[] args) {
        int day = Reader.readInt("Input day:");
        int month = Reader.readInt("Input month:");
        int year = Reader.readInt("Input year:");

        Printer.print("Tomorrow is " + GregorianCalendar.calculateTomorrow(day, month, year));
    }
}
