package eo.classes.GeneralMixed;

import java.util.Scanner;

public class Function2GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = (Math.sqrt(x)) + 2 * x + (Math.sin(x));
        System.out.printf("%.4f", y);
    }
}
