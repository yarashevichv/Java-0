package PracticalTask02;

public class Task3 {
    public static void main(String[] args) {
        double radius1 = Reader.readDouble("Input first radius:");
        double radius2 = Reader.readDouble("Input second radius:");

        Printer.print("The ring area is "
                    + RingArea.getRingArea(radius1, radius2));
    }
}
