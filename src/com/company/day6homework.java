package com.company;

import java.util.Scanner;

public class day6homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1
/*
      int n = 1;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
*/
        //2
/*
       int n = 1;
        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
*/
        //3
/*
        double x = scan.nextDouble();
        for (double z = 1; z <= x; z++) {
            double y = Math.sqrt(z);
            if (y % 1 == 0) {
                System.out.println(z);
            }
        }
*/
        //4
/*
        int x = scan.nextInt();
        for (int k = 2; k <= (x); k++) {
            if (x % k == 0) {
                System.out.print(k);
                break;
            }
       }
*/
        //5
/*
        int k = 1;
        int x = scan.nextInt();
        do {
            System.out.println(k);
            k *= 2;
        } while (k <= x);
*/
        //6
/*
        int i = scan.nextInt();
        while (i > 0) {
            i--;
            System.out.println(i);
        }
*/
        //7
/*
        int i = scan.nextInt();
        if (i % 2 == 1) {
            i -= 1;
        }
        while (i > 0) {
            System.out.println(i);
            i -= 2;
        }
*/
        //8
/*
        byte z = 0;
        int y = 0;
        while (z == 0) {
            y++;
            double i = scan.nextDouble();
            int d = (int) i;
            while (i >= 2) {
                i = i / 2;
                if (i == 1) {
                    z = 1;
                }
            }
            if (z == 1) {
                System.out.println("n=" + d + " inputed integers " + y);
            }
        }
*/
        //9
/*
        int i = scan.nextInt();
int x=1,c=0;
        while(x<=i){
            c++;
            x*=2;
        }
System.out.print(c);
*/

        //10?
        //11
/*
        int x = 0, i = scan.nextInt();
        while (x <= i) {
            if (x % 3 != 0) {
                System.out.println(x);
            }
            x++;
        }
*/
        //16
/*
        double i = Math.random() * 100;
        int x = (int) i;
        while (1 > 0) {
            int y = scan.nextInt();
            if (y == x) {
                System.out.print("yes");
                break;
            }
            if (y > x) {

                System.out.print("Too high, try again");

            } else {
                System.out.print("Too low, try again");
            }
        }
*/
        //17
/*
        int x = scan.nextInt(), k = 10, c = 0, l = 0;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            c = ((x % k) - (x % (k / 10))) / (k / 10);
            k *= 10;
            l += c;
        }
        System.out.println(l);
*/

    }
}
