package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A777 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            pw.println(b-(12-(12-a)));
            pw.flush();
        }
        if (a > b) {
            pw.println((12-a)+(12-(12-b)));
            pw.flush();
        }
    }
}
