package PracticalTask03;

public class Triangle {
    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static boolean isTriangle(int x1, int y1, int x2,
                                     int y2, int x3, int y3) {

        boolean result = false;

        double a = Triangle.calculateLength(x1, y1, x2, y2);
        double b = Triangle.calculateLength(x2, y2, x3, y3);
        double c = Triangle.calculateLength(x1, y1, x3, y3);

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            result = true;
        }

        return result;
    }

    public static boolean isRectangular(int x1, int y1, int x2,
                                        int y2, int x3, int y3) {

        boolean result = false;

        int vectorX1 = x2 - x1;
        int vectorY1 = y2 - y1;
        int vectorX2 = x3 - x1;
        int vectorY2 = y3 - y1;
        int vectorX3 = x3 - x2;
        int vectorY3 = y3 - y2;

        if (Triangle.isTriangle(x1, y1, x2, y2, x3, y3)) {
            if (vectorX1*vectorX2 + vectorY1*vectorY2 == 0
                || vectorX2*vectorX3 + vectorY2*vectorY3 == 0
                || vectorX1*vectorX3 + vectorY1*vectorY3 == 0) {
                result = true;
            }
        }

        return result;
    }
}
