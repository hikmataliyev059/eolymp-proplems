package eo.classes.GeneralMixed;

import java.util.Scanner;

public class Function6GM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = 1 + x + (x * x);
        System.out.println(y);
    }
}
