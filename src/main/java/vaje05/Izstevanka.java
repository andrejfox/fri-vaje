package vaje05;

import java.util.Scanner;

public class Izstevanka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }

        for (int d = s.length; d > 1; d--) {
            int izpadNum = (k % d);

            if (izpadNum == 0) {
                continue;
            }

            for (int i = izpadNum - 1; i < d - 1; i++) {
                s[i] = s[i + 1];
            }
        }

        System.out.println(s[0]);
    }
}
