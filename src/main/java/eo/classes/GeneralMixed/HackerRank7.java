package eo.classes.GeneralMixed;

import java.util.Scanner;

public class HackerRank7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = -100; i <= 100; i++) {
            int n = scan.nextInt();
            if (n == i) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
                //yarimciqdi
            }
        }
    }
}
