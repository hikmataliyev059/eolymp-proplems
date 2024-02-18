package eo.classes.GeneralMixed;

import java.util.Scanner;

public class Function5GM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int f = (x * y * z) + x + ((int) Math.pow(y, 2)) + ((int) Math.pow(z, 3));
        System.out.println(f);
        //// yarimciqdi
    }
}
