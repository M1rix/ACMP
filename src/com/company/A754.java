package com.company;
// presentation error
import java.io.*;
import java.util.*;

public class A754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int max= Math.max(m1,Math.max(m2,m3));
        if (m1 >= 94 && m1 <= 727 && m2 >= 94 && m2 <= 727 && m3 >= 94 && m3 <= 727) {
            pw.print(max);
            pw.flush();
        }
        else{
            pw.print("Error");
            pw.flush();
        }
    }
}
