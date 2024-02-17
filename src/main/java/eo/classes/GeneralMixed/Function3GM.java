package eo.classes.GeneralMixed;

import java.util.Scanner;

public class Function3GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double result = (x * x) + (Math.sin(x * y) - (y * y));
        System.out.printf("%.4f", result);
    }
}
