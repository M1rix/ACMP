package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] cdesk = new char[n][m];
        int s = 0;
        int min = 100000000;
        for (int i = 0; i < n; i++) {
            s = 0;
            String str = sc.next();
            char[] ch = str.toCharArray();
            for (int j = 0; j < m; j++) {
                if (ch[j] == '.') {
                    s++;
                }
            }
            if (s <= min)
                min = s;
        }
        pw.println(min);
        pw.flush();

    }
}
