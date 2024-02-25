package eo.classes.GeneralMixed;

import java.util.Scanner;

public class SumOfSquaresGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        int sum = (int) ((int) (a * a) + (b * b));
        System.out.println(sum);
    }
}
