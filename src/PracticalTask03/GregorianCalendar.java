package PracticalTask03;

public class GregorianCalendar {

    public static final int FIRST_DURATION = 31;
    public static final int SECOND_DURATION = 28;
    public static final int THIRD_DURATION = 30;
    public static final int COUNT_OF_MONTHS = 12;

    public static String calculateTomorrow(int day, int month, int year) {
        int endDay;
        int endMonth;
        int endYear;

        if (day == findCountDays(month, year) && month == COUNT_OF_MONTHS) {
            endDay = 1;
            endMonth = 1;
            endYear = year + 1;
        } else if (day == findCountDays(month, year)) {
            endDay = 1;
            endMonth = month + 1;
            endYear = year;
        } else {
            endDay = day + 1;
            endMonth = month;
            endYear = year;
        }

        return endDay + "." + endMonth + "." + endYear;
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;

        if (year % 4 == 0) {
            result = true;
        } else if (year % 100 == 0) {
            result = false;
        } else if (year % 400 == 0) {
            result = true;
        }

        return result;
    }

    public static int findCountDays(int month, int year) {
        int result = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                result = FIRST_DURATION;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                result = THIRD_DURATION;
                break;
            }
            case 2: {
                if (isLeapYear(year)) {
                    result = SECOND_DURATION + 1;
                } else {
                    result = SECOND_DURATION;
                }
                break;
            }
        }

        return result;
    }
}
