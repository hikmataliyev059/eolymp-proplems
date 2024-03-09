package eo.classes.Arrays;

import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] nums = new int[a];
        for (int i = 0; i < nums.length; i++) {
            int num = scan.nextInt();
            nums[i] = num;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
