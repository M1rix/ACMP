package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String str = sc.next().toUpperCase();
        char[] alphabet = str.toCharArray();
        Arrays.sort(alphabet);
        int k = 0;
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        for (char c = 'A'; c <= 'Z'; c++) {
            int t = -1;
            for (int j = 0; j < 26; j++) {
                if ((alphabet[j] >= c && ((t == -1))) || (alphabet[j] < alphabet[t])) t = j;
                if(t == -1) {
                    pw.print("NO");
                    pw.flush();
                    return;
                }
                a[k] = t + 1;
                k++;
                alphabet[t] = '.';
            }
        }
        pw.println("YES");
        for (int i = 0; i < 26; i++) {
            pw.print(a[i] + " ");
        }
        pw.flush();
    }
}
