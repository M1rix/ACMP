package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int shishki = sc.nextInt();
        int orex = sc.nextInt();
        int NOrex = sc.nextInt();

        if((shishki*orex)>=NOrex){
            pw.println("YES");
            pw.flush();
        }else{
            pw.println("NO");
            pw.flush();
        }
    }
}
