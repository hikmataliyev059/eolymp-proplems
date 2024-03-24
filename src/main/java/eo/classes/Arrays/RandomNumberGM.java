package eo.classes.Arrays;

import java.util.Scanner;

public class RandomNumberGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] numbs = new int[num];
        for (int i = 0; i < numbs.length; i++) {
            int a = (int) (Math.random() * num);
            System.out.print(a + " ");
        }
        for (int i = 0; i < numbs.length; i++) {
            int a = (int) (Math.random() * num);
            System.out.println(Math.min(a, num));
        }
    }
}
