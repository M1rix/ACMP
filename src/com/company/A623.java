package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long n = sc.nextLong();
        long n1 = 1, n2 = 1, n3 = 0;
        for (int i = 2; i <=n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2%=10;
            n3%=10;
            n2 = n3;
        }
        if(n==0)
            pw.println(1);
        if(n==1)
            pw.println(1);
        else {
            pw.println(n3);
        }
        pw.flush();
    }
}
