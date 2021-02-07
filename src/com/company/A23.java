package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int s = 0;

        for(int i = 1; i<=n;i++){
            if(n%i==0)
                s+=i;
        }
        pw.println(s);
        pw.flush();

    }
}
