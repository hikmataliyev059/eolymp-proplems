package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class OneDigitNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num / 10 == 0) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
