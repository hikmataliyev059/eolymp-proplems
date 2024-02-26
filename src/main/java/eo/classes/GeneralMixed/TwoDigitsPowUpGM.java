package eo.classes.GeneralMixed;

import java.util.Scanner;

public class TwoDigitsPowUpGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = (int) Math.pow(3, a) + (int) Math.pow(3, b);
        System.out.println(result);
    }
}
