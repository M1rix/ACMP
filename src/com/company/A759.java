package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a,0,n);

//        for (int i = 0; i < n; i++) {
//            pw.print(a[i]+" ");
//        }
//        pw.println("");
        int s = 0;

        for (int i = n-m; i < n; i++) {
            if(a[i]<0)
                continue;
            else
                s+=a[i];
        }
        pw.println(s);
        pw.flush();
    }
}
