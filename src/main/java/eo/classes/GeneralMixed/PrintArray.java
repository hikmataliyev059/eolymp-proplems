package eo.classes.GeneralMixed;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
