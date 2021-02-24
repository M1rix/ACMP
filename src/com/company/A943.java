package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();//rows
        int m = sc.nextInt();//columns
        int x = sc.nextInt();//targetRow
        int y = sc.nextInt();//targetColumn

        if(x==1){
            pw.println((y-x));
        }
        if(x==2){
            pw.println((n+m)-(y-1));
        }
        if(x!=2 && x%2==0){
           pw.println((n+m)+m*2);
        }
        pw.flush();

    }

}
