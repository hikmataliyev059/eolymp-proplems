package eo.classes.GeneralMixed;

import java.util.Scanner;

public class SeasonGM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 3 && n <= 5) {
            System.out.println("Spring");
        } else if (n >= 6 && n <= 8) {
            System.out.println("Summer");
        } else if (n >= 9 && n <= 11) {
            System.out.println("Autumun");
        } else if (n == 12 || n <= 2) {
            System.out.println("Winter");
        } else {
            System.out.println("Invalid The Season");
        }
    }
}
