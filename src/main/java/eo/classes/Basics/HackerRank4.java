package eo.classes.Basics;

import java.util.Scanner;

public class HackerRank4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N >= 2 && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " " + "x" + " " + i + " " + "=" + " " + N * i);
            }
        }
    }
}
