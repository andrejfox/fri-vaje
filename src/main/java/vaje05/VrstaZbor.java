package vaje05;

import java.util.Scanner;

public class VrstaZbor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean noneFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr.length > 1 && arr[i] <= arr[i + 1]) {
                    System.out.println(i);
                    noneFlag = false;
                }
            } else if (i == arr.length - 1) {
                if (arr[i - 1] <= arr[i]) {
                    System.out.println(i);
                    noneFlag = false;
                }
            } else {
                if (arr[i - 1] <= arr[i] && arr[i] <= arr[i + 1]) {
                    System.out.println(i);
                    noneFlag = false;
                }
            }
        }

        if (noneFlag) {
            System.out.println("NOBEDEN");
        }
    }
}
