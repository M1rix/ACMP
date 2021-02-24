package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        String s = sc.next();
        int c = 0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='0' || s.charAt(i)=='6' || s.charAt(i)=='9' )
                c++;
            if(s.charAt(i)=='8')
                c+=2;
        }
        pw.println(c);
        pw.flush();
    }
}
