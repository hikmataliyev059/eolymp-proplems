package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class NumbersMultiply {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int first = num / 100;
        int second = (num / 10) % 10;
        int third = num % 10;
        System.out.println(first * second + third);
    }
}
