package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();
        a%=10;
        int c = 0;
        if(a == 0)
            pw.println(0);
        if(a==1)
            pw.println(1);
        if(a==2){
            c =(b-1)%4;
            if(c==0) pw.println(2);
            if(c==1) pw.println(4);
            if(c==2) pw.println(8);
            if(c==3) pw.println(6);
        }
        if(a==3){
            c =(b-1)%4;
            if(c==0) pw.println(3);
            if(c==1) pw.println(9);
            if(c==2) pw.println(7);
            if(c==3) pw.println(1);
        }
        if(a==4){
            c =(b-1)%2;
            if(c==0) pw.println(4);
            if(c==1) pw.println(6);
        }
        if(a==5) pw.println(5);
        if(a==6) pw.println(6);
        if(a==7){
            c =(b-1)%4;
            if(c==0) pw.println(7);
            if(c==1) pw.println(9);
            if(c==2) pw.println(3);
            if(c==3) pw.println(1);
        }
        if(a==8){
            c =(b-1)%4;
            if(c==0) pw.println(8);
            if(c==1) pw.println(4);
            if(c==2) pw.println(2);
            if(c==3) pw.println(6);
        }
        if(a==9){
            c =(b-1)%2;
            if(c==0) pw.println(9);
            if(c==1) pw.println(1);
        }

        pw.flush();
    }
}
