package eo.classes.GeneralMixed;

import java.util.Scanner;

public class HackerRank6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();
        if (B <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else if (H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else System.out.println(B * H);
    }
}
