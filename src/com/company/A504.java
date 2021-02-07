package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String[] fs = new String[]{"G","C","V"};
        String a= "";

        int k = sc.nextInt();
        for(int i = 0;i<k;i++){
            a = fs[1];
            fs[1]=fs[2];
            fs[2]=a;

            a = fs[0];
            fs[0] = fs[1];
            fs[1] = a ;
        }
        for(int i = 0;i<3;i++){
            pw.print(fs[i]);
        }
        pw.flush();
    }
}
