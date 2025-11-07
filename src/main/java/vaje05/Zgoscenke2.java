package vaje05;

import java.util.Arrays;
import java.util.Scanner;

public class Zgoscenke2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        while (sc.hasNext()) {
            int curNum = sc.nextInt();
            int sIndex = getSmallestIndex(arr);

            if (curNum > k - arr[sIndex]) {
                break;
            }

            arr[sIndex] += curNum;

            System.out.printf("%d EP -> zgoscenka %d %s%n", curNum, sIndex + 1, Arrays.toString(arr));
        }
    }

    private static int getSmallestIndex(int[] arr) {
        int ret = 0;
        for (int i = 1; i < arr.length; i++) {
            int curNum = arr[i];
            if (curNum < arr[ret]) {
                ret = i;
            }
        }
        return ret;
    }
}
