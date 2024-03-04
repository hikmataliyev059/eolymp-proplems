package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class WaterAndIce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("Water");
        } else {
            System.out.println("Ice");
        }
    }
}
