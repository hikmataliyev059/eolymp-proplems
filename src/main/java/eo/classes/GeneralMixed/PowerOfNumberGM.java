package eo.classes.GeneralMixed;

import java.util.Scanner;

public class PowerOfNumberGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double n = scan.nextDouble();
        System.out.println((int) Math.pow(a, n));
    }
}
