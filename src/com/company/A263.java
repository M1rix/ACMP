package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        int a = Math.abs(i - j) - 1;
        if(i>j){
            int x = i;
            i = j ;
            j = x;
        }
        int b = Math.abs(N - j) +(i-1);
        pw.println(Math.min(a, b));
        pw.flush();

    }
}
