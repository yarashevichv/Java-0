package TestTask06;

import PracticalTask02.Printer;
import PracticalTask02.Reader;

public class TaskArray {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = Reader.readInt("Input " + i + "th element of array:");
        }

        array = Reverse.reverseArray(array);

        for (int i = 0; i < array.length; i++) {
            Printer.print("\nThe " + i + "th element of array is " + array[i]);
        }
    }
}
