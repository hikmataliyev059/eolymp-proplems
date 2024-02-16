package eo.classes.GeneralMixed;

import java.util.Scanner;

public class FindTheSumGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += n * (n + 1) / n;
        }
        System.out.printf("%.6f", (double) sum);
    }
}
