package TestTask06;

public class Reverse {
    public static int[] reverseArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }

        return array;
    }
}
