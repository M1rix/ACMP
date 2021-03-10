package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A694 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] v = new int[n*2];

        for (int i = 0; i < n*2-1; i+=2) {
            String s = sc.next();
            String[] c = s.split(" ");
            v[i] = Integer.valueOf(c[0]);
            v[i+1] = Integer.valueOf(c[1]);
        }
        for (int i = 0; i < n*2-2; i+=2) {
            if(v[i+1]>v[i+2]){
                pw.println("YES");
            }else
                pw.println("NO");
        }
        pw.flush();
    }
}
