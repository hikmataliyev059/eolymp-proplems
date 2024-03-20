package eo.classes.Arrays;

import java.util.Scanner;

public class SnakeMatrix {
    public static void mainV1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = counter++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = counter++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row % 2 == 0) {
                    System.out.print(counter++ + "\t");
                } else {
                    System.out.print(--counter + "\t");
                }
            }
            counter += n;
            System.out.println();
        }
    }
}
