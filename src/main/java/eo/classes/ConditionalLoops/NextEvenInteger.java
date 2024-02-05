package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class NextEvenInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + 2);
        } else {
            System.out.println(num + 1);
        }
    }
}
