package com.company;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        List<String> names = new ArrayList<String>();
        String s = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            String m =sc.next();
            names.add(m);
        }
        Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
        pw.print(s+": "+names.get(0)+", "+names.get(1)+", "+names.get(2));
        pw.flush();
    }
}
