package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.next();

        int hour = decode(s.substring(0,1));
        int minute = decode(s.substring(3,4));

        int aHour = sc.nextInt();
        int aMinute = sc.nextInt();

        int minutes1 = hour * 60 + minute;
        int minutes2 = aHour * 60 + aMinute;
        pw.println(minutes1 + "    " + hour + "    " + minute);
        int allMinutes = minutes1 + minutes2;
        pw.print(allMinutes / 60 + ":" + allMinutes % 60);

        pw.flush();

    }

    public static int decode(String nm) throws NumberFormatException {
        int i =0;
        if (nm.startsWith("0"))
            i = Integer.parseInt(nm.substring(1, 1));
        else
            i= Integer.parseInt(nm.substring(0, 1));
        return i;
     }
}






