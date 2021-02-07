package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();

        pw.println(NOD(a,b));
        pw.flush();
    }

    public static int NOD(int x, int y){
        if(x==0){
            return y;
        }else{
            return NOD(y%x,x);
        }
    }
}
