package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class OutsideTheInterval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (x >= a && x <= b) {
            System.out.println("In");
        } else {
            System.out.println("NO");
        }
    }
}
