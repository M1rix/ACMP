package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A970 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b == c || a + c == b || c + b == a) {
            pw.println("YES");
            pw.flush();
        } else {
            pw.println("NO");
            pw.flush();
        }

    }
}
