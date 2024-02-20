package eo.classes.GeneralMixed;

import java.util.Scanner;

public class PerfectSquareGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        if (n % Math.sqrt(n) == 0) {
            System.out.println((int) Math.sqrt(n));
        } else {
            System.out.println("No");
        }
    }
}
