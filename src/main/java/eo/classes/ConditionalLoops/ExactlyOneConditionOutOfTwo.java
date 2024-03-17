package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class ExactlyOneConditionOutOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean check1 = n % 2 == 0;
        boolean check2 = n < 0 && n % 3 == 0;
        if (check1 != check2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
