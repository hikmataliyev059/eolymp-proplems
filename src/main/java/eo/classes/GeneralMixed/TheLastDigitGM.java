package eo.classes.GeneralMixed;

import java.util.Scanner;

public class TheLastDigitGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num % 10);
    }
}
