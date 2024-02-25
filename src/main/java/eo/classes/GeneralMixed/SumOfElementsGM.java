package eo.classes.GeneralMixed;

import java.util.Scanner;

public class SumOfElementsGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double number = scan.nextDouble();
            sum += number;
        }
        System.out.println(sum);
    }
}
