package org.example;

public class Main {
    public static void weeksAndDays() {
        for (int week = 1; week <= 52; week++) {
            System.out.println("Week " + week);

            for (int day = 1; day <= 7; day++) {
                System.out.println("\tDay " + day);
            }
        }
    }

    public static void clock() {
        String printHours;
        String printMinutes;
        for (int hours = 0; hours <= 24; hours++)
            for (int minutes = 0; minutes <= 60; minutes++) {
                if (hours < 10) {
                    printHours = "0" + hours;
                } else {
                    printHours = Integer.toString(hours);
                }
                if (minutes < 10) {
                    printMinutes = "0" + minutes;
                } else {
                    printMinutes = Integer.toString(minutes);
                }
                System.out.println(printHours + ":" + printMinutes);
            }

    }

    public static void multiTable() {
        System.out.print("\t");
        for (int n = 1; n <= 9; n++) {
            System.out.print("  " + n);
        }
        System.out.println();
        System.out.println("-".repeat(30));

        for (int n = 1; n <= 9; n++) {
            System.out.print(n + " | ");

            for (int m = 1; m <= 9; m++) {
                int multi = m * n;
                if (multi < 10) {
                    System.out.print("  " + (multi));
                } else {
                    System.out.print(" " + (multi));
                }
            }
            System.out.println();
        }
    }

    public static void square(int n) {
        for (int height = 1; height <= n; height++) {
            for (int width = 1; width <= n; width++) {
                if (height == 1 || height == n || width == 1 || width == n) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        weeksAndDays();
        clock();
        multiTable();
        square(8);

    }

}
