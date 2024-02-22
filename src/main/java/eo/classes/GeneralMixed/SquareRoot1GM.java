package eo.classes.GeneralMixed;

import java.util.Scanner;

public class SquareRoot1GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        System.out.printf("%.6f", Math.sqrt(n));
    }
}
