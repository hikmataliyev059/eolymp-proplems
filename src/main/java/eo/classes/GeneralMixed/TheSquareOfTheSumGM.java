package eo.classes.GeneralMixed;

import java.util.Scanner;

public class TheSquareOfTheSumGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n = scan.nextFloat();
        int squareOfSum = (int) Math.pow(((n / 10) + (n % 10)), 2);
        System.out.println(squareOfSum);
    }
}
