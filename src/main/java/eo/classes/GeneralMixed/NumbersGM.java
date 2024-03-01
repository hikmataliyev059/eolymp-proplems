package eo.classes.GeneralMixed;

import java.util.Scanner;

public class NumbersGM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = String.valueOf(n).length();
        System.out.println(a);
        scanner.close();
    }
}
