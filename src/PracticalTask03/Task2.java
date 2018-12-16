package PracticalTask03;

import PracticalTask02.Printer;
import PracticalTask02.Reader;

public class Task2 {
    public static void main(String[] args) {
        int x1 = Reader.readInt("Input x1:");
        int y1 = Reader.readInt("Input y1:");
        int x2 = Reader.readInt("Input x2:");
        int y2 = Reader.readInt("Input y2:");
        int x3 = Reader.readInt("Input x3:");
        int y3 = Reader.readInt("Input y3:");

        Printer.print("The triangle exists: "
                + Triangle.isTriangle(x1, y1, x2, y2, x3, y3)
                + "\nThe triangle is rectangular: "
                + Triangle.isRectangular(x1, y1, x2, y2, x3, y3));
    }
}
