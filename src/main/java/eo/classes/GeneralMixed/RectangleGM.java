package eo.classes.GeneralMixed;

import java.util.Scanner;

public class RectangleGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        scan.close();
    }
}

