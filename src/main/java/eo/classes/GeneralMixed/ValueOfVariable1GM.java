package eo.classes.GeneralMixed;

import java.util.Scanner;

public class ValueOfVariable1GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double y = (n * n * n) - ((5 * n * n) / 7) + (9 * n) - (3 / n) + 1;
        System.out.printf("%.3f", y);
    }
}

