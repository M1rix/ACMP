package com.company;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            Set<Character> c1 = new HashSet<>();
            Set<Character> c2 = new HashSet<>();
            Set<Character> result = new HashSet<>(c1);
            String s1 = sc.next();
            String s2 = sc.next();
            for (char item : s1.toCharArray())
                c1.add(item);
            for (char item : s2.toCharArray())
                c2.add(item);
            result = new HashSet<>(c1);
            c1.removeAll(c2);
            c2.removeAll(result);
            if (c1.isEmpty() && c2.isEmpty()) pw.println("YES");
            else pw.println("NO");
        }
        pw.flush();
    }
}
