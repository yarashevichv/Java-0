package PracticalTask03;

public class Vowel {

    private static final char[] VOWELS = {'e', 'y', 'u', 'i', 'o', 'a'};

    public static boolean isVowel1(char letter) {

        boolean result = false;
        letter = Character.toLowerCase(letter);

        if (letter == 'e' || letter == 'y' || letter == 'u'
            || letter == 'i' || letter == 'o' || letter == 'a') {
            result = true;
        }

        return result;
    }

    public static boolean isVowel2(char letter) {

        boolean result = false;
        letter = Character.toLowerCase(letter);

        switch (letter) {
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'a': {
                result = true;
            }
        }

        return result;
    }

    public static boolean isVowel3(char letter) {
        letter = Character.toLowerCase(letter);

        return letter == 'e' || letter == 'y' || letter == 'u'
                || letter == 'i' || letter == 'o' || letter == 'a';
    }

    public static boolean isVowel4(char letter) {

        boolean result = false;
        letter = Character.toLowerCase(letter);

        for (char vowel : VOWELS) {
            if (letter == vowel) {
                result = true;
            }
        }

        return result;
    }
}
