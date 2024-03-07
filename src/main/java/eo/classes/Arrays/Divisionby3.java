package eo.classes.Arrays;

import java.util.Scanner;

public class Divisionby3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n / 3];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
