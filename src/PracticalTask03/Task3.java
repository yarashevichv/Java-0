package PracticalTask03;

import PracticalTask02.Printer;
import PracticalTask02.Reader;

public class Task3 {
    public static void main(String[] args) {
        char letter = Reader.readChar("Input letter:");

        Printer.print("The letter is vowel: " + Vowel.isVowel1(letter));
        Printer.print("\nThe letter is vowel: " + Vowel.isVowel2(letter));
        Printer.print("\nThe letter is vowel: " + Vowel.isVowel3(letter));
        Printer.print("\nThe letter is vowel: " + Vowel.isVowel4(letter));
    }
}
