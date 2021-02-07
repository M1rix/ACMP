package com.company;

import java.io.*;
import java.util.*;

public class A61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int a4 = sc.nextInt();
        int b4 = sc.nextInt();

        int A = a1+a2+a3+a4;
        int B = b1+b2+b3+b4;

        if(A>B){
            pw.println(1);
            pw.flush();
        }
        if(A<B){
            pw.println(2);
            pw.flush();
        }
        if(A==B){
            pw.println("DRAW");
            pw.flush();
        }
    }
}
