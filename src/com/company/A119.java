package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] a = new int[n];
        int h;
        int m;
        int s;
        for (int i = 0; i < n; i++) {
            h = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
            a[i] = h*3600+m*60+s;
        }
        Arrays.sort(a);
        for (int i = 0; i <n ; i++) {
            h = a[i]/3600;
            m = (a[i]/60)%60;
            s = a[i]%60;
            pw.println(h +" "+m+" "+s);
        }
        pw.flush();
    }
}
