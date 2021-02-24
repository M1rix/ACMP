package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A147 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        pw.println(fib(N));
        pw.flush();

    }
    static int fib(int n){
        if(n<2)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}

