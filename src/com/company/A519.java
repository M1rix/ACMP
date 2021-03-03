package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Long n = sc.nextLong();
        String s = n.toString();
        char[] c = s.toCharArray();


        int count = 0;
        for (int i = 0; i <c.length ; i++) {
            if(c[i] == '0')
                count++;
        }
        Arrays.sort(c);
        pw.print(c[count]);
        for (int i = count-1; i>=0; i--) {
            pw.print(c[i]);
        }
        for (int i =c.length-1; i>0; i--) {
            pw.print(c[i]);
        }
        pw.print(":");
        for (int i = c.length-1; i >-1; i--) {
            pw.print(c[i]);
        }
        pw.flush();
    }
}

