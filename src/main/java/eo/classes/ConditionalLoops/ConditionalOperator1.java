package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class ConditionalOperator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int firstCondition = (x * x) - (3 * x) + 4;
        int secondCondition = x + 7;
        if (x < 5) {
            System.out.println(firstCondition);
        } else if (x >= 5) {
            System.out.println(secondCondition);
        }
    }
}
