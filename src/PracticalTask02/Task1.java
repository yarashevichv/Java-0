package PracticalTask02;

public class Task1 {
    public static void main(String[] args) {
        double weight = Reader.readDouble("Input dinosaur weight:");

        Printer.print("Dinosaur weight in mg: "
                    + DinosaurWeight.getMilligrammy(weight));
        Printer.print("Dinosaur weight in gram: "
                    + DinosaurWeight.getGrams(weight));
        Printer.print("Dinosaur weight in ton: "
                    + DinosaurWeight.getTons(weight));
    }
}
