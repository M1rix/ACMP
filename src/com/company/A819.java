package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A819 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        //wrong at the 7-th test !

        pw.println(((a * c) * 2) + ((a * b) * 2)+ ((c * b) * 2));
        pw.println(a*b *c );
        pw.flush();

    }
}
