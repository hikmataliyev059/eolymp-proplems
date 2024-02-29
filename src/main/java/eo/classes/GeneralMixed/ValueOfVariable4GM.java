package eo.classes.GeneralMixed;

import java.util.Scanner;

public class ValueOfVariable4GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = ((2 * x - 1) / (x * x)) + (Math.sqrt((x * x + 1)) / 2);
        System.out.printf("%.3f", y);
    }
}
