package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A246 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
       int a = sc.nextInt();
       int count = 0;
        for (int i = 1; i < n; i++) {
            int b  = sc.nextInt();
            if(a!=(b-1)) count++;
            a=b;
        }
       
        pw.println(count);
        pw.flush();
    }
}

