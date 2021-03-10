package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        for (int i = 1; i <100000 ; i++) {
            if (sum(i)/count(i)==Math.pow(10,count(i)))
                pw.println(i);
        }
    }

    public static int sum(int x ){
        int s = 0;
        s+=x%10;
        x/=10;
        return s;
    }
    public static int count(int x ){
        int c = 0;
        while(x!=0){
            x%=10;
            x/=10;
            c++;
        }
        return c;
    }
}
