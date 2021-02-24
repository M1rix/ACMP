package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A643 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int s = 0;
        int t = n;
        while(t>0){
            if(t%2==1){
                t/=2;
                s++;
            }
            else
                t/=2;

        }
        pw.println(n+s);
        pw.flush();

    }
}
