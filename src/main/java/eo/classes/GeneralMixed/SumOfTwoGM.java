package eo.classes.GeneralMixed;

import java.util.Scanner;

public class SumOfTwoGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            int num = scan.nextInt();
            size = num;
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.print(a + b + " ");
            //yarimciq
        }
    }
}
