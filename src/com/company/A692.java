package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A692 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        if (n < 1) {
            pw.println("NO");
            pw.flush();
            return;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
        pw.flush();
    }
}
