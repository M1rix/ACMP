package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int c = 0;
        int t = 0;

        int[] a = new int[n];

        for(int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n;i++){
            if(a[i] %2 !=0){
                pw.print(a[i]+" ");
                t++;
            }
        }
        pw.println("");
        for(int i = 0; i<n;i++){
            if(a[i] %2 ==0){
                pw.print(a[i]+" ");
                c++;
            }
        }
        pw.println("");
        if(c>=t)
            pw.println("YES");
        else
            pw.println("NO");

        pw.flush();
    }
}
