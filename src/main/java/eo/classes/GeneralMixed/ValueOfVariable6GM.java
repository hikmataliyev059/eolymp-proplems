package eo.classes.GeneralMixed;

import java.util.Scanner;

public class ValueOfVariable6GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = (Math.sqrt((x * x * x * x) + 1) / (x * x)) - (Math.sqrt((x * x) / ((x * x) + 1)));
        System.out.printf("%.3f", y);
    }
}
