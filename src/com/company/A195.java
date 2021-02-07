package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        pw.println((a*b*n)*2);
        pw.flush();
    }
}
