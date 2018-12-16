package PracticalTask02;

import java.util.Scanner;

public class Reader {

    private static final Scanner IN = new Scanner(System.in);

    public static double readDouble(String msg) {
        System.out.println(msg);
        return IN.nextDouble();
    }

    public static int readInt(String msg) {
        System.out.println(msg);
        return IN.nextInt();
    }

    public static char readChar(String msg) {
        System.out.println(msg);
        return IN.next().charAt(0);
    }
}
