package eo.classes.GeneralMixed;

import java.util.Scanner;

public class TheNumbersInReverseOrderGM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        do {
            System.out.print(num % 10);
            num /= 10;
        }
        while (num > 0);
    }
}
