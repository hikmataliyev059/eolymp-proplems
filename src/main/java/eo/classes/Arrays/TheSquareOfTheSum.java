package eo.classes.Arrays;

import java.util.Scanner;

public class TheSquareOfTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int squareOfSum = (int) Math.pow(((n / 10) + (n % 10)), 2);
        System.out.println(squareOfSum);
    }
}
