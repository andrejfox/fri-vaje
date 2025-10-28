package vaje03;

import java.util.Scanner;

public class Sin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int my = sc.nextInt();
        int mx = sc.nextInt();

        double yScalar = 4;

        int c = mx / 2;

        for (int y = 1; y < my; y++) {
            int sinX = (int) (Math.sin((double) y / yScalar) * c);

            int count = 0;

            int spaces = c;
            if (sinX < 0) {
                spaces = c + sinX;
            }

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
                count++;
            }

            for (int i = 0; i <= Math.abs(sinX); i++) {
                if (count == c) {
                    System.out.print("|");
                } else {
                    System.out.print("*");
                }
                count++;
            }

            for (int i = 0; i < mx - count; i++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
