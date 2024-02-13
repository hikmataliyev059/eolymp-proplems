package eo.classes.Arrays;

import java.util.Scanner;

public class UseTheFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double maxXY = Math.max(x, y);
        double maxYZ = Math.max(y, z);
        double sum = x + y + z;
        double min = Math.min(maxXY, maxYZ);
        System.out.printf("%.2f", Math.min(sum, min));
    }
}
