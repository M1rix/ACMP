package com.company;

import java.io.*;
import java.util.*;

public class A106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        if(n<=100) {
            int[] a = new int[n];

            int count1 = 0;
            int count2 = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    count1++;
                } else {
                    count2++;
                }
            }
            pw.println(min(count1, count2));
            pw.flush();

        }
    }

    private static int min(int _x,int _y){
        int x = _x;
        int y = _y;
        if(x>y)
            return y;
        if(x<y)
            return x;
        else
            return x;
    }
}
