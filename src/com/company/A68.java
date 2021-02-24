package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String place = sc.next();
        int amount = sc.nextInt();

        switch (place) {
            case "Home":
                pw.println("Yes");
                break;
            case "School":
                if(amount%2 == 1)
                    pw.println("Yes");
                else
                    pw.println("No");
                break;
        }
        pw.flush();
    }
}
