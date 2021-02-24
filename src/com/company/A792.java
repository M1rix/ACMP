package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A792 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n1 = sc.nextInt();
        int p1 = sc.nextInt();
        int n2 = sc.nextInt();
        int p2 = sc.nextInt();

        if(sumNums(n1,p1) == sumNums(n2,p2))
            pw.println(sumNums(n1,p1));
        else
            pw.println(0);
        pw.flush();
    }
    static int sumNums (int n, int p){
        int sum = 0;
        while(n>0){
            sum+=n%p;
            n/=p;
        }
        return sum;
    }
}
