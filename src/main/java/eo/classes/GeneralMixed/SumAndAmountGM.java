package eo.classes.GeneralMixed;

import java.util.Scanner;

public class SumAndAmountGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Please, enter " + (i + 1) + ". element of array: ");
            numbers[i] = scan.nextInt();
            count++;
            sum += numbers[i];
        }
        System.out.print(count + " ");
        System.out.print(sum + " ");
    }
}
