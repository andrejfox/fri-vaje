package vaje04;

import java.util.Scanner;

public class Smreka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        smreka(n);
    }

    private static void smreka(int n) {
        int odmik = 0;
        piramida(n, odmik);
        for (int i = 0; i < Math.log(n); i++) {
            znaki(odmik, ' ');
            znaki(n - 1, ' ');
            System.out.println("*");
        }
    }

    private static void piramida(int n, int odmik) {
        int stPresledkov = n - 1;
        int stZvezdic = 1;

        for (int i = 0; i < n; i++) {
            znaki(odmik, ' ');
            znaki(stPresledkov, ' ');
            znaki(stZvezdic, '*');
            System.out.println();

            stPresledkov--;
            stZvezdic += 2;
        }
    }

    private static void znaki(int n, char znak) {
        for (int i = 0; i < n; i++) {
            System.out.print(znak);
        }
    }
}
