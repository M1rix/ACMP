package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        long n = sc.nextLong();
        long max =0;
        long a ,b;
        long min = 100000*100000;
        a = n/6;
        b=  n%6;
        max = n*6;

        if (b==1) {
            min=a+6;
        }
        if (b==2) {
            min=a+5;
        }
        if (b==3) {
            min=a+4;
        }
        if (b==4) {
            min=a+3;
        }
        if (b==5) {
            min=a+2;
        }
        if (b==0) {
            min=a;
        }

        pw.println(min+" "+max);
        pw.flush();
    }
}


