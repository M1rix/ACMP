package com.company;

import java.io.PrintWriter;
import java.util.Scanner;
public class A85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int m =NOD(A,B);
        for (int i = 1; i <=m ; i++) {
            pw.print("1");
        }
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
