package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class ConditionalOperator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextInt();
        long y;
        if (x >= 10) {
            y = (x * x * x) + (5 * x);
        } else {
            y = (x * x) - (2 * x) + 4;
        }
        System.out.println(y);
    }
}
