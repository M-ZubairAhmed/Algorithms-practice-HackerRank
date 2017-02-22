package Challenges;

import java.util.Scanner;

public class DayOfProgrammer {
    public static void test() {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        scan.close();

        char calendarSystem = getCalendarSystem(year);
        switch (calendarSystem) {
            case 'J':
                if (isLeapYear(year, 'J')) {
                    System.out.println("12.09." + year);
                } else {
                    System.out.println("13.09." + year);
                }
                break;
            case 'G':
                if (isLeapYear(year, 'G')) {
                    System.out.println("12.09." + year);
                } else {
                    System.out.println("13.09." + year);
                }
                break;
            default:
                System.out.println("26.09." + year);
        }

    }

    private static char getCalendarSystem(int year) {
        if (year <= 1917) {
            return 'J';
        } else if (year >= 1919) {
            return 'G';
        } else {
            return 'X';
        }
    }

    private static boolean isLeapYear(int year, char calendarSystem) {
        switch (calendarSystem) {
            case 'J':
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            case 'G':
                if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0) {
                    return true;
                } else {
                    return false;
                }
            default:
                return true;
        }
    }
}
