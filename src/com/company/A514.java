package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int k = sc.nextInt();
        int s =0;
        for (int i = 1; i <=10000000 ; i++) {
            s+=i;
            if(s==k){
                pw.println(i);
                break;
            }
            if(s>k){
                pw.println(i-1);
                break;
            }
        }
        pw.flush();
    }
}
