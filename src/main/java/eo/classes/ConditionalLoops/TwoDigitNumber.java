package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n = Math.abs(num / 10);
        if (n > 0 && n < 10) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
