package PracticalTask03;

public class NumberGenerator {

    public static final int BASE = 10;

    public static int generateNumber() {
        return (int) (Math.random() * BASE);
    }
}
