package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = Math.min(a,b);
        long min = Math.max(a,b);
        if(min %2==0)
        pw.println(min/2+" "+max);
        else{
            pw.println((min+1)/2+" "+max);
        }
        pw.flush();
    }
}
