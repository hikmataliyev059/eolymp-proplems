package eo.classes.Basics;

import java.util.Scanner;

public class ExamApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x + y) + (x * y) == 111) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
