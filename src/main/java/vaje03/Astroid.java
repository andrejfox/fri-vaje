package vaje03;

import java.util.Scanner;

public class Astroid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mx = sc.nextInt();

        double xMultiply = 3d;
        double yMultiply = 2d;

        for (int x = -mx / 2 - 2; x < mx / 2 + 2; x++) {
            for (int y = -mx / 2 - 2; y < mx / 2 + 2; y++) {
                double r = Math.pow(Math.pow(Math.abs(x) * xMultiply, 2d / 3) + Math.pow(Math.abs(y) * yMultiply, 2d / 3), 3d / 2);

                if ( r < mx) {
                    if (Math.abs(r - mx) < 7) {
                        System.out.print("~");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
