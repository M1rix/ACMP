package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int k = sc.nextInt();
        int m = sc.nextInt();

        pw.println((k*k)*m);
        pw.flush();
    }
}
