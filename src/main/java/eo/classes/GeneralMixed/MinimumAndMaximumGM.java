package eo.classes.GeneralMixed;

import java.util.Scanner;

public class MinimumAndMaximumGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(Math.min(a, b) + " " + Math.max(a, b));
    }
}
