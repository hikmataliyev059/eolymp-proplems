package eo.classes.GeneralMixed;

import java.util.Scanner;

public class Function1GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = (x * x * x) + 2 * (x * x) - 3;
        System.out.printf("%.4f", y);
    }

}
