package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] a = new int[n+2];
        int max = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        a[n]=a[0];
        a[n+1] = a[1];

        for (int i = 1; i <n+1 ; i++) {
            int b = a[i-1]+a[i]+a[i+1];
            if(b>max)
               // pw.println(a[i-1]+"+"+a[i]+"+"+a[i+1]+"="+b);
                max=b;
        }


        pw.println(max);
        pw.flush();
    }
}
