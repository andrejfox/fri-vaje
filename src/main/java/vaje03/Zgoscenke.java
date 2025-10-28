package vaje03;

import java.util.Scanner;

public class Zgoscenke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int i = 1;
        int curZgosceneka = 0;

        while (sc.hasNextInt()) {
            if (i > n) break;
            int nextFile = sc.nextInt();

            if (curZgosceneka + nextFile > k) {
                if (i == n) break;
                curZgosceneka = nextFile;
                System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", nextFile, i + 1, curZgosceneka);
                i++;
            } else if (curZgosceneka + nextFile == k) {
                System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", nextFile, i, k);
                curZgosceneka = 0;
                i++;
            } else {
                curZgosceneka += nextFile;
                System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", nextFile, i, curZgosceneka);
            }
        }
    }
}
