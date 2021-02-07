package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long a = sc.nextInt();
        long b = a/10;
        pw.println(
                100*b*(b+1)+25
        );
        pw.flush();


    }
}
