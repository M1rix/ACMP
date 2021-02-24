package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n =sc.nextInt();
        int count =0;

        while(n%5 != 0){
                n-=3;
                count++;
        }
        pw.println((n/5)+" "+count);
        pw.flush();
    }
}
