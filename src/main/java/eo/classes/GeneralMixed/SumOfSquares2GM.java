package eo.classes.GeneralMixed;

import java.util.Scanner;

public class SumOfSquares2GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int c = (int) Math.pow(i, 2);
            sum += c;
        }
        System.out.println(sum);
    }
}
