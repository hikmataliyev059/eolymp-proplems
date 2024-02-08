package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class AtLeastOneConditionOutOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 != 0 || (num > 99 && num < 1000)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
