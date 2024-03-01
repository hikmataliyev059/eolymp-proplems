package eo.classes.GeneralMixed;

import java.util.Scanner;

public class MatrixGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
