package eo.classes.GeneralMixed;

import java.util.Scanner;

public class MultiplyDivideSumGM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double sum = 0;
        double multiply = 1;
        for (int i = 0; i <= num; i++) {
            int a = num % 10;
            num /= 10;
            multiply *= a;
            sum += a;
        }
        System.out.printf("%.3f", multiply / sum);
    }
}
