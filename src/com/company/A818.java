package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int s = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c= sc.nextInt();
            if (n == 1 && c == 1)
                s += c;
            else {
                s += c - 1;
            }
        }
        if (n == 1 && c == 1)
            pw.println(s);
        else {
            pw.println(s+1);
        }

        pw.flush();
    }
}
