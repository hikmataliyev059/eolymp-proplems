package eo.classes.Arrays;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] numbs = new int[num];
        for (int i = 0; i < numbs.length; i++) {
            int random = (int) (Math.random() * 101);
            System.out.print(random + " - ");
        }
    }
}
