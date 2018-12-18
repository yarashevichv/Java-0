package PracticalTask03;

import PracticalTask02.Printer;

public class Task4 {
    public static void main(String[] args) {
        int number = NumberGenerator.generateNumber();

        Printer.print("Your mood is: " + MoodSensor.calculateKaomoji(number));
    }
}
