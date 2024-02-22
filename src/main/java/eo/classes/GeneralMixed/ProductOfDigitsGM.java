package eo.classes.GeneralMixed;

import java.util.Scanner;

public class ProductOfDigitsGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 1;
        for (int i = 0; i < 3; i++) {
            int a = num % 10;
            num /= 10;
            sum *= a;
        }
        System.out.println(sum);
    }
}
