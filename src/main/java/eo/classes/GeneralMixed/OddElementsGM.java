package eo.classes.GeneralMixed;

import java.util.Scanner;

public class OddElementsGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            int a = scan.nextInt();
            if (a % 2 == 1) {
                System.out.print(a + " ");
            }
        }
    }
}
