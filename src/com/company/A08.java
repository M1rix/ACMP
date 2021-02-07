package com.company;

import java.io.*;
import java.util.*;

public class A08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a*b == c ){
            pw.println("YES");
            pw.flush();
        }else{
            pw.println("NO");
            pw.flush();
        }
    }
}
