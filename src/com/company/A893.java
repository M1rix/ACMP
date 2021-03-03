package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A893 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long n = sc.nextLong();
        if (n < 3)
            pw.println(n);
        else {
            pw.println(n * (n - 1) * (n - 2));
        }
        pw.flush();
    }
}
//    static long factorial(long n ){
//        long fact =0;
//
//        if( n <= 1){
//            fact = 1;
//        }
//        else{
//            fact = factorial(n-1);
//        }
//        return fact;
//    }


