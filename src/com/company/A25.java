package com.company;

import java.io.*;
import java.util.*;

public class A25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            pw.println('>');
            pw.flush();
        }
        if(a<b) {
            pw.println('<');
            pw.flush();
        }
        if(a==b) {
            pw.println('=');
            pw.flush();
        }

    }
}
