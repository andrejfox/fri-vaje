package vaje03;

import java.util.Scanner;

public class Krog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mx = sc.nextInt();

        double xMultiply = 2.6d;
        double c = mx / 2d;

        for (int x = 0; x < mx / 2; x++) {
            for (int y = 0; y <= mx; y++) {
                int r = (int) Math.sqrt(Math.pow(x * xMultiply - c, 2) + Math.pow(y - c, 2));

                if (r <= mx / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
