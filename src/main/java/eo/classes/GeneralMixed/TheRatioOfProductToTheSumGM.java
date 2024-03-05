package eo.classes.GeneralMixed;

import java.util.Scanner;

public class TheRatioOfProductToTheSumGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 1;
        int plural = 0;
        for (int i = 0; i <= N; i++) {
            int a = N % 10;
            N /= 10;
            sum *= a;
            plural += a;
        }
        System.out.printf("%.3f", (double) sum / plural);
    }
}
