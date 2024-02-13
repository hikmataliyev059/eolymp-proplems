package eo.classes.Arrays;

import java.util.Scanner;

public class Rectangular2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        scan.close();
    }
}
