package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];

        int bl = 0;
        int r = 0;
        int g = 0;
        int b = 0;
        //fill an array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] % 5 == 0)
                    b++;
                else if (nums[i][j] % 3 == 0)
                    g++;
                else if (nums[i][j] % 2 == 0)
                    r++;
                else
                    bl++;
            }
        }

        pw.println("RED : " + r);
        pw.println("GREEN : " + g);
        pw.println("BLUE : " + b);
        pw.println("BLACK : " + bl);
        pw.flush();
    }
}
