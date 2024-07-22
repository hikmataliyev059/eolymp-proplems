package eo.classes.ConditionalLoops;

import java.util.Scanner;

public class Task2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Please, enter a value:");
            int num = scan.nextInt();
            nums[i] = num;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
