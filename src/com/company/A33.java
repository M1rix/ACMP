package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();

        pw.println(b-1);
        pw.flush();
        pw.println(a-1);
        pw.flush();

    }
}
