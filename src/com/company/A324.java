package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int a1 = n / 1000;
        int a2 = n / 100 - (a1 * 10);
        int a3 = n / 10 - (a1 * 100 + a2 * 10);
        int a4 = n % 10;

        if (a1 == a4 && a2 == a3) {
            pw.println("YES");
            pw.flush();
        }else{
            pw.println("NO");
            pw.flush();
        }
    }
}
