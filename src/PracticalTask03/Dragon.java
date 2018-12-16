package PracticalTask03;

public class Dragon {

    private static final int NUMBER_OF_HEAD_BEFORE_200 = 3;
    private static final int NUMBER_OF_HEAD_BEFORE_300 = 2;
    private static final int NUMBER_OF_HEAD_AFTER_300 = 1;
    private static final int NUMBER_OF_EYES = 2;

    public static int calculationNumberOfHeads(int age) {
        int result = 0;

        if (age > 0) {
            for (int i = 0; i <= age; i++) {
                if (i < 200) {
                    result += NUMBER_OF_HEAD_BEFORE_200;
                } else if (i >= 200 && i < 300) {
                    result += NUMBER_OF_HEAD_BEFORE_300;
                } else {
                    result += NUMBER_OF_HEAD_AFTER_300;
                }
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
