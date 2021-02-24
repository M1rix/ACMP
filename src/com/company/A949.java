package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long result = 0;
        long d = 0;
        long x =0;
        for (int i = 1; i<n-1 ; i++) {
            x = b ;
            b = a;
            a = x-a ;

        }
        if(a==1)
            pw.println(a+" "+a);
        else
            pw.println(a+" "+b);
        pw.flush();
    }
}
