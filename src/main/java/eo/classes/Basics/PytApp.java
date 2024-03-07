package eo.classes.Basics;

public class PytApp {
    public static void main(String[] args) {
        double a = 0.001;
        double b = 1;
        double currentSum = 0;
        int n = 1;
        while (b > a) {
            currentSum += b;
            n++;
            b = 1.0 / (n * n);
        }
        System.out.println("Sum = " + currentSum);
    }
}
