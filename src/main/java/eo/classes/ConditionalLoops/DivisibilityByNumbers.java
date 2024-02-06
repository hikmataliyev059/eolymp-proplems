package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class DivisibilityByNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a % b == 0 && a % c == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
