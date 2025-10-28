package vaje03;

import java.util.Scanner;

public class Piramida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();

        int stPresledkov = h - 1;
        int stZvezdic = 1;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < stPresledkov; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stZvezdic; j++) {
                System.out.print("*");
            }
            System.out.println();

            stPresledkov--;
            stZvezdic += 2;
        }
    }
}
