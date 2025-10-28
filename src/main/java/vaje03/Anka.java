package vaje03;

import java.util.Scanner;

public class Anka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;

        for (int a = 1; a < 10; a += 2) {
            for (int b = m + 1; b < 10; b++) {
                for (int c = 0; c < 10; c += d) {
                    System.out.printf("%d-%d-%d\n", a, b, c);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
