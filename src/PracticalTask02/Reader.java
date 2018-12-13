package PracticalTask02;

import java.util.Scanner;

public class Reader {

    private static final Scanner in = new Scanner(System.in);

    public static double read(String msg) {
        System.out.println(msg);
        return in.nextDouble();
    }
}
