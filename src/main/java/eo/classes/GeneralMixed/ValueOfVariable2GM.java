package eo.classes.GeneralMixed;

import java.util.Scanner;

public class ValueOfVariable2GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = x - ((x * x + 4) / 2) + (x * x * x) - (3 / (x + 7));
        System.out.printf("%.3f", y);
    }
}
