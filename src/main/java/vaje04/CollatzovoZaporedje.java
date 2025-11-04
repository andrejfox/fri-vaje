package vaje04;

import java.util.Scanner;

public class CollatzovoZaporedje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int maxLength = collLength(a, 0);
        int maxIndex = a;
        for (int i = a + 1; i < b; i++) {
            int curSum = collLength(i, 0);
            if (curSum > maxLength) {
                maxLength = curSum;
                maxIndex = i;
            }
        }

        System.out.printf("%d\n%d\n", maxIndex, maxLength);
    }

    public static int collLength(int num, int sum) {
        sum++;
        if (num == 1) {
            return sum;
        } else if (num % 2 == 0) {
            num /= 2;
        } else {
            num *= 3;
            num++;
        }
        return collLength(num, sum);
    }
}
