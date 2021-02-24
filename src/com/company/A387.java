package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if(str.charAt(0) == str.charAt(3)){
                s++;
            }
        }
        pw.println(s);
        pw.flush();
    }
}
