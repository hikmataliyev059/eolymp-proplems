package eo.classes.GeneralMixed;

import java.util.Scanner;

public class TransformationGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num / 2);
        } else {
            System.out.println((num + 1) / 2);
            //sehvdi
        }
    }
}
