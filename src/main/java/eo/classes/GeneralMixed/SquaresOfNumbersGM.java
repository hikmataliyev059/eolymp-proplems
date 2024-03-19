package eo.classes.GeneralMixed;

import java.util.Scanner;

public class SquaresOfNumbersGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int c = (int) Math.pow(i, 2);
            if (c <= n) {
                System.out.print(c + " ");
            }
        }
    }
}
