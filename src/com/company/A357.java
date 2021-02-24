package com.company;

import java.io.PrintWriter;
import java.util.*;

public class A357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.next();
        long sum1 = 0;
        long sum2 = 0;
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i+=2) {
            sum1+=(int)c[i]-48;
        }
        for (int i = 1; i < c.length; i+=2) {
            sum2+=(int)c[i]-48;
        }
        if((sum1-sum2)%11==0)
            pw.println("YES");
        else
            pw.println("NO");
        pw.flush();
    }
}
