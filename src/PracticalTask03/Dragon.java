package PracticalTask03;

public class Dragon {

    public static final int NUMBER_OF_HEAD_FIRST_PERIOD = 3;
    public static final int NUMBER_OF_HEAD_SECOND_PERIOD = 2;
    public static final int NUMBER_OF_HEAD_THIRD_PERIOD = 1;
    public static final int NUMBER_OF_EYES = 2;
    public static final int FIRST_PERIOD = 200;
    public static final int SECOND_PERIOD = 300;

    public static int calculationNumberOfHeads(int age) {
        int result = 0;

        if (age > 0) {
            if (age < FIRST_PERIOD) {
                result += NUMBER_OF_HEAD_FIRST_PERIOD * (age + 1);
            } else if (age < SECOND_PERIOD) {
                result += NUMBER_OF_HEAD_FIRST_PERIOD * FIRST_PERIOD;
                result += NUMBER_OF_HEAD_SECOND_PERIOD * (age - FIRST_PERIOD + 1);
            } else {
                result += NUMBER_OF_HEAD_FIRST_PERIOD * FIRST_PERIOD;
                result += NUMBER_OF_HEAD_SECOND_PERIOD * (SECOND_PERIOD - FIRST_PERIOD);
                result += NUMBER_OF_HEAD_THIRD_PERIOD * (age - SECOND_PERIOD + 1);
            }
        }

        return result;
    }

    public static int calculationNumberOfEyes(int age) {
        int result = 0;

        if (age > 0) {
            result = Dragon.calculationNumberOfHeads(age) * NUMBER_OF_EYES;
        }

        return result;
    }
}
