package eo.classes.GeneralMixed;

import java.util.Scanner;

public class OddAndEvenNumbersGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 || a % 2 == 1 && b % 2 == 1 && c % 2 == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
