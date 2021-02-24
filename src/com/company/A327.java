package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A327 {
    static boolean happy (int n){
        int a1,a2,a3,a4,a5,a6;
        a6 =n%10;
        a5 =n/10%10;
        a4 =n/100%10;
        a3 =n/1000%10;
        a2 =n/10000%10;
        a1 =n/100000;

        return (a1+a2+a3) == (a4+a5+a6);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if(happy(a+1) || happy(a-1))
                pw.println("Yes");
            else
                pw.println("No");

        }
        pw.flush();

    }
}


//        int n = sc.nextInt();
//        for(int i = 0; i<n;i++) {
//            String m = sc.next();
//            String num = "00000"+m;
//            int a3 = getSumNumber(num.substring(num.length()-2,num.length()));
//            int a2 = getSumNumber(num.substring(num.length()-4,num.length()-2));
//            int a1 = getSumNumber(num.substring(num.length()-6,num.length()-4));
//            pw.println(num.substring(num.length()-6,num.length()-4));
//
//            pw.println(num.substring(num.length()-4,num.length()-2));
//            pw.println(num.substring(num.length()-2,num.length()));
//
//
//
//            if(a2+a3+1 == a1 || a2+a3-1 == a1){
//                pw.println("YES");
//            }else
//                pw.println("NO");
//        }
//
//        pw.flush();
//    }
//
//    private static int getSumNumber(String number){
//        int sum =0;
//        for(int i=0; i<number.length(); i++){
//            sum = sum + Integer.valueOf(number.substring(i,i+1));
//        }
//        return sum;
//    }
//}
//    int a1 = num / 100000;
//    int a2 = num / 10000 - (a1 * 10);
//    int a3 = num / 1000 - (a1 * 100 + (a2 * 10));
//    int a4 = num / 100 - (a1 * 1000 + a2 * 100 + a3 * 10);
//    int a5 = num % 100 / 10;
//    int a6 = num % 10;