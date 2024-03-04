package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class PreviousOddInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num - 1);
        } else {
            System.out.println(num - 2);
        }
    }
}
