package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String str = sc.next();
        int s = 0;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                s++;
                if(s>max)
                    max = s;
            }
            else
                s = 0;
        }
        pw.println(max);
        pw.flush();
    }
}
