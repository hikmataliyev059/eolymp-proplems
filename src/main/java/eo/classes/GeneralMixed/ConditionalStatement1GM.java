package eo.classes.GeneralMixed;

import java.util.Scanner;

public class ConditionalStatement1GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = 0;
        if (x < 5) {
        y = (x * x) - (3 * x) + 4;
        } else if (x >= 5) {
            y = x + 7;
        }
        System.out.println(y);
    }
}
