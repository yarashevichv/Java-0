package PracticalTask02;

public class DinosaurWeight {
    private static final int MILLIGRAMM_RATIO = 1_000_000;
    private static final int GRAM_RATIO = 1_000;
    private static final int TON_RATIO = 1_000;

    public static double getMilligrammy(double weight) {
        return weight * MILLIGRAMM_RATIO;
    }

    public static double getGrams(double weight) {
        return weight * GRAM_RATIO;
    }

    public static double getTons(double weight) {
        return weight / TON_RATIO;
    }
}
