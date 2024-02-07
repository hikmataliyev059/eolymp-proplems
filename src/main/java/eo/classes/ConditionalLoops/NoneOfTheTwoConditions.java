package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class NoneOfTheTwoConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if ((num % 2 == 0 && num > 0) || (num % 2 != 0 && num < 0)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
