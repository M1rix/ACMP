package com.company;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class A648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();

        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cards.add(sc.nextInt());
        }
//        for (Integer card : cards) pw.print(card + " ");
//        pw.print("\n");
        cards.sort(Comparator.reverseOrder());
//        for (Integer card : cards) pw.print(card + " ");
//        pw.print("\n");
        long diller = 0;
        long shrek = 0;
        for (int i = 0; i < cards.size() / 2; i++) {
            shrek += cards.get(i);
        }
        for (int i = cards.size() / 2; i < cards.size(); i++) {
            diller+= cards.get(i);
        }
        pw.println(shrek - diller);
        pw.flush();
    }
}
