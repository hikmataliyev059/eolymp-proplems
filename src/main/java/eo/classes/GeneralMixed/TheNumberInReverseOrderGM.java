package eo.classes.GeneralMixed;

import java.util.Scanner;

public class TheNumberInReverseOrderGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int a = 0;
        do {
            a = (a * 10) + (number % 10);
            number /= 10;
        } while (number != 0);
        System.out.println("Reversed number: " + a);
        scan.close();
    }
}
