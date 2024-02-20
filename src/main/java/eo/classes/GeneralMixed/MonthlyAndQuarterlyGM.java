package eo.classes.GeneralMixed;

import java.util.Scanner;

public class MonthlyAndQuarterlyGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 1 && n <= 3) {
            System.out.println("First");
        } else if (n >= 4 && n <= 6) {
            System.out.println("Second");
        } else if (n >= 7 && n <= 9) {
            System.out.println("Third");
        } else if (n >= 10 && n <= 12) {
            System.out.println("Fourth");
        } else {
            System.out.println("Invalid The quarter");
        }
    }
}
