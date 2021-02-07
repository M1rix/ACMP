package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        String str = sc.next();
        String s = str.trim();
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (i == a - 1)
                continue;
            else
                pw.print(c[i]);
        }
        pw.flush();

    }
}
