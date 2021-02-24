package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = 100000001;
        int s = 0;
        int idx = 0;
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            s*=0;
            for (int j = 0; j < m; j++) {
                int lap = sc.nextInt();
                s += lap;
            }
            if (s < min) {
                min = s;
                idx = i;
            }
        }
        pw.println(names[idx]);
        pw.flush();
    }
}
