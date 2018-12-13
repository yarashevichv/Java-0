package PracticalTask01;

public class DataTypeTester {
    public static void testInt() {

        int a = 5;
        int b = 2;
        int c;

        System.out.println("\n***** Arithmetical Operators *****");

        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        // c = a / 0;
        // c = a % 0;

        a = 5;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        a = -5;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        a = 5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        // c %= 0;
        // c /= 0;

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");

        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                    (a > b) && (a > 0));

        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                    (a > b) & (a > 0));

        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                    (a >= b) || (b != 0));

        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                    (a >= b) | (b != 0));

        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                    (a >= b) ^ (b != 0));

        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                    (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                    bool);
    }

    public static void testFloat() {

        float a = 5.3f;
        float b =  2.5f;
        float c;

        System.out.println("\n***** Arithmetical Operators *****");

        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        // c = a / 0;
        // c = a % 0;

        a = 5.0f;
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        a = 5.0f;
        System.out.printf("++%f = %f\n", a, ++a);
        a = 5.0f;
        System.out.printf("%f++ = %f\n", a, a++);
        a = 5.0f;
        System.out.printf("--%f = %f\n", a, --a);
        a = 5.0f;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        // c = a & b;
        // c = a | b;
        // c = a ^ b;
        // c = ~b;
        // c = a << 1;
        // c = a >> 1;
        // c = a >>> 1;

        System.out.println("\n***** Assignment Operators *****");

        c = 7.0f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        // c /= 0;
        // c %= 0;

        // c |= a;
        // c &= a;
        // c ^= a;
        // c >>= 1;
        // c <<= 1;
        // c >>>= 1;

        System.out.println("\n***** Relational Operators *****");

        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                    (a > b) && (a > 0));

        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                    (a > b) & (a > 0));

        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                    (a >= b) || (b != 0));

        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                    (a >= b) | (b != 0));

        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                    (a >= b) ^ (b != 0));

        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                    (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        int f = 12;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = (float) l;
        System.out.printf("float = long: c = (float)%d --> c = %f\n", l, c);
        c = (float) f;
        System.out.printf("float = int: c = (float)%d --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
        // c = (float) bool;
        System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
    }

    public static void testDouble() {

        double a = 5.;
        double b = 2.;
        double c;

        System.out.println("\n***** Arithmetical Operators *****");

        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        // c = a / 0;
        // c = a % 0;

        a = 5.0;
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        a = 5.0;
        System.out.printf("++%f = %f\n", a, ++a);
        a = 5.0;
        System.out.printf("%f++ = %f\n", a, a++);
        a = 5.0;
        System.out.printf("--%f = %f\n", a, --a);
        a = 5.0;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        // c = a & b;
        // c = a | b;
        // c = a ^ b;
        // c = ~b;
        // c = a << 1;
        // c = a >> 1;
        // c = a >>> 1;

        System.out.println("\n***** Assignment Operators *****");

        c = 7.0;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        // c |= a;
        // c &= a;
        // c ^= a;
        // c >>= 1;
        // c <<= 1;
        // c >>>= 1;

        System.out.println("\n***** Relational Operators *****");

        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                    (a > b) && (a > 0));

        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                    (a > b) & (a > 0));

        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                    (a >= b) || (b != 0));

        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                    (a >= b) | (b != 0));

        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                    (a >= b) ^ (b != 0));

        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                    (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        int f = 12;
        float d = 1239.625f;
        boolean bool = true;

        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
        c = (double) l;
        System.out.printf("double = long: c = (float)%d --> c = %f\n", l, c);
        c = (double) f;
        System.out.printf("double = int: c = (float)%d --> c = %f\n", f, c);
        c = (double) d;
        System.out.printf("double = float: c = (float)%f --> c = %f\n", d, c);
        // c = (double) bool;
        System.out.printf("double = boolean: c = (float)%b --> Compile Error\n", bool);
    }

    public static void testLong() {

        long a = 5L;
        long b = 2L;
        long c;

        System.out.println("\n***** Arithmetical Operators *****");

        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        // c = a / 0;
        // c = a % 0;

        a = 5L;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);

        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        a = 5L;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5L;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5L;
        System.out.printf("--%d = %d\n", a, --a);
        a = 5L;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);

        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);

        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);

        c = ~a;
        System.out.printf("~%d = %d\n", a, c);

        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);

        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);

        a = -5L;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);

        a = 5L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);

        a = -5L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);

        System.out.println("\n***** Assignment Operators *****");

        c = 7L;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        // c /= 0;
        // c %= 0;

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");

        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                    (a > b) && (a > 0));

        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                    (a > b) & (a > 0));

        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                    (a >= b) || (b != 0));

        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                    (a >= b) | (b != 0));

        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                    (a >= b) ^ (b != 0));

        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                    (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int l = 1000000;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = (long) l;
        System.out.printf("long = int: c = (long)%d --> c = %d\n", l, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        // c = (long) bool;
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
    }

    public static void testChar() {

        char a = 'v';
        char b = 'y';
        char c;

        System.out.println("\n***** Arithmetic Operators *****");

        c = ++a;
        System.out.printf("++%c = %c\n", a, ++a);
        c = a++;
        System.out.printf("%c++ = %c\n", a, a++);
        c = --a;
        System.out.printf("--%c = %c\n", a, --a);
        c = a--;
        System.out.printf("%c-- = %c\n", a, a--);

        // c = a + b;
        // c = a - b;
        // c = a * b;
        // c = a / b;
        // c = a % b;
        // c = -a;
        // c = +a;

        System.out.println("\n***** Bitwise Operators *****");

        // c = a & b;
        // c = a | b;
        // c = a ^ b;
        // c = ~a;
        // c = a << 1;
        // c = a >> 1;
        // c = a >>> 1;

        System.out.println("\n***** Assignment Operators *****");

        c = 'b';
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);

        // c /= 0;
        // c %= 0;

        System.out.println("\n***** Relational Operators *****");

        a = 'v';
        b = 'y';

        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,
                    (a > b) && (a > 0));

        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,
                    (a > b) & (a > 0));

        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,
                    (a >= b) || (b != 0));

        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
                    (a >= b) | (b != 0));

        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
                    (a >= b) ^ (b != 0));

        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");

        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b,
                    (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int in = 2;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = (char) bt;
        System.out.printf("char = byte: c = %s --> c = %s\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = %s --> c = %s\n", sh, c);
        c = ch;
        System.out.printf("char = char: c = %s --> c = %s\n", ch, c);
        c = (char) in;
        System.out.printf("char = int: c = '%c' --> c = %s\n", in, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%s --> c = %s\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %s\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%s --> c = %s\n", d, c);
        // c = (char) bool;
        System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool);
    }

    public static void testShort() {
        short a = 5;
        short b = 2;
        short c;

        System.out.println("\n***** Arithmetical Operators *****");

        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        // c = (short) a / 0;
        // c = (short) a % 0;

        a = 5;
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        c = (short) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        c = (short) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 5;
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        // c /= 0;
        // c %= 0;

        System.out.println("\n***** Relational Operators *****");

        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                    (a > b) && (a > 0));

        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                    (a > b) & (a > 0));

        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                    (a >= b) || (b != 0));

        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                    (a >= b) | (b != 0));

        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                    (a >= b) ^ (b != 0));

        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                    (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        int sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = (short) sh;
        System.out.printf("short = int: c = %d --> c = %d\n", sh, c);
        c = (short) ch;
        System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        // c = (short) bool;
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
    }

    public static void testByte() {
        byte a = 34;
        byte b = 12;
        byte c;

        System.out.println("\n***** Arithmetic *****");

        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        // c = (byte) a / 0;
        // c = (byte) a % 0;

        a = 5;
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);
        c = (byte) +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise operators *****\n");

        c = (byte) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                    Integer.toBinaryString(c));

        c = (byte) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                    Integer.toBinaryString(c));

        c = (byte) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
                    Integer.toBinaryString(c));

        c = (byte) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        a = 5;
        c = (byte) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        a = -5;
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        a = 5;
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        a = -5;
        c = (byte)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                    Integer.toBinaryString(c));

        System.out.println("\n***** Assignment operators *****\n");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);


        // c %= 0;
        // c /= 0;

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >> 1 --> c = %d\n", c, c >> a);
        System.out.printf("%d << 1 --> c = %d\n", c, c << a);
        System.out.printf("%d >>> 1 --> c = %d\n", c, c >>> a);

        System.out.println("\n***** Relational operators *****\n");

        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical operators *****\n");

        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                    (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                    (a > b) & (a > 0));
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a,
                    (a > b) || (a > 0));
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a,
                    (a > b) | (a > 0));
        System.out.printf("(%d > %d) ^ (%d > 0) --> %b\n", a, b, a,
                    (a > b) ^ (a > 0));
        System.out.printf("!(%d > %d) --> %b\n", a, b, !(a > b));

        System.out.println("\n***** Misc operators *****\n");

        System.out.println("\nCondition operator:\n");

        System.out.printf("%d > %d ? %d --> %d\n", a, b, a, b,
                    (a > b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = 1;
        short sh = -32000;
        char  ch = '\u0002';
        long l = 1000000000L;
        float f = 1.9F;
        double d = 123456.78;
        boolean bool = true;

        c = bt;
        System.out.printf("byte = byte: c = %d --> c = %d\n", bt, c);
        c = (byte) sh;
        System.out.printf("byte = short: c = %d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
        // c = (byte) bool;
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error: You can't cast to boolean!\n",
                bool);
    }

    public static void testBoolean() {
        boolean a = true;
        boolean b = false;
        boolean c;

        System.out.println("\n***** Arithmetical Operators *****");

        // c = a + b;
        // c = a - b;
        // c = a * b;
        // c = a / b;
        // c = a % b;
        // c = -a;
        // c = +a;
        // c = ++a;
        // c = a++;
        // c = --a;
        // c = a--;

        System.out.println("\n***** Bitwise Operators *****");

        c = a & b;
        System.out.printf("%b & %b = %b\n", a, b, c);

        c = a | b;
        System.out.printf("%b | %b = %b\n", a, b, c);

        c = a ^ b;
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        // c = ~a;
        // c = a << 1;
        // c = a >> 1;
        // c = a >>> 1;

        System.out.println("\n***** Assignment Operators *****");

        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

        // c += a;
        // c -= a;
        // c *= a;
        // c /= a;
        // c %= a;
        // c >>= 1;
        // c <<= 1;
        // c >>>= 1;

        System.out.println("\n***** Relational Operators *****");

        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        System.out.printf("%b != %b --> %b\n", a, b, a != b);

        // c = a > b;
        // c = a >= b;
        // c = a < b;
        // c = a <= b;

        System.out.println("\n***** Logical Operations *****");

        c = a && b;
        System.out.printf("%b && %b = %b\n", a, b, c);

        c = a || b;
        System.out.printf("%b || %b = %b\n", a, b, c);

        c = a ^ b;
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        System.out.printf("!%b --> %b\n", a, !a);

        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");

        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));

        System.out.println("\nType Cast Operator:");

        // byte bt = 1;
        // short sh = -32000;
        // char ch = '\u0002';
        // long l = 100000000000000000L;
        // float f = 1.9f;
        // double d = 123456789.625;
        boolean bool = true;

        // c = (boolean) bt;
        // c = (boolean) sh;
        // c = (boolean) ch;
        // c = (boolean) l;
        // c = (boolean) f;
        // c = (boolean) d;
        c = bool;

        System.out.println(bool);
    }

    public static void testString() {
        String a = "abc";
        String b = "zyxw";
        String c;
         boolean test;


        System.out.println("\n***** Arithmetical Operators *****");

        System.out.printf("%s + %s = %s\n", a, b, c = a + b);

        // c = a - b;
        // c = a * b;
        // c = a / b;
        // c = a % b;
        // c = -a;
        // c = +a;
        // c = ++a;
        // c = a++;
        // c = --a;
        // c = a--;

        System.out.println("\n****** Bitwise Operators *****");

        // c = a & b;
        // c = a | b;
        // c = a ^ b;
        // c = ~a;
        //c = a << 1;
        // c = a >> 1;
        // c = a >>> 1;

        System.out.println("\n***** Assignment Operators *****");

        c = "test";
        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);

        // c -= a;
        // c *= a;
        // c /= a;
        // c %= a;
        // c |= a;
        // c &= a;
        // c ^= a;
        // c >>= 1;
        // c <<= 1;
        // c >>>= 1;

        System.out.println("\n***** Relational Operators *****");

        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        System.out.printf("%s != %s --> %b\n", a, b, a != b);

        // test = a > b;
        // test = a >= b;
        // test = a < b;
        // test = a <= b;

        System.out.println("\n***** Logical Operations *****");

        System.out.printf("(%s == %s) && (%s != %s) --> %b", a, b, a, b,
                    (a == b) && (a != b));

        System.out.printf("(%s == %s) || (%s != %s) --> %b", a, b, a, b,
                    (a == b) || (a != b));

        System.out.printf("(%s == %s) ^ (%s != %s) --> %b", a, b, a, b,
                    (a == b) || (a != b));

        System.out.printf("!(%s == %s) --> %b", a, b, !(a == b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("(%s == %s) ? \"Yes\" : \"No\" --> %s", a, b,
                    (a == b ? "Yes" : "No"));

        System.out.println("\nType Cast Operator:");

        // byte bt = 1;
        // short sh = -32000;
        // char ch = '\u0002';
        // long l = 100000000000000000L;
        // float f = 1.9f;
        // double d = 123456789.625;
        // boolean bool = true;

        // c = (String) bt;
        // c = (String) sh;
        // c = (String) ch;
        // c = (String) l;
        // c = (String) f;
        // c = (String) d;
        // c = (String) bool;
    }
}
