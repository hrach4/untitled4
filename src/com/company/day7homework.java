package com.company;

import java.util.Scanner;

public class day7homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //1
/*
        int x = scan.nextInt(), y = scan.nextInt();
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
*/
        //2
/*
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
*/
        //3
/*
        double a = scan.nextDouble(), b = scan.nextDouble();
        for (double i = a; i <= b; i++) {
            double y = Math.sqrt(i);
            if (y % 1 == 0) {
                System.out.println(i);
            }
        }
*/
        //4
/*
        int x = scan.nextInt(), s = 0, k = 10;
        byte d = scan.nextByte();
        String str = String.valueOf(x);
        int nums[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            nums[i] = ((x % k) - (x % (k / 10))) / (k / 10);
            k *= 10;
        }
        for (int v = 0; v < str.length(); v++) {
            if (nums[v] == d) {
                s++;
            }
        }
        System.out.print(s);
*/
        //5
/*
        int x = scan.nextInt(), k = 10;
        String str = String.valueOf(x);
        int nums[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            nums[i] = ((x % k) - (x % (k / 10))) / (k / 10);
            k *= 10;
        }
        for (int v = 0; v < str.length(); v++) {
            System.out.println(nums[v]);
        }
*/
        //6
/*
        int x = scan.nextInt(), i = 2;
        for (i = 2; i <= (x / 2) + 1; i++) {
            if (x % i == 0) {
                System.out.print(i);
                break;
            }
        }
        if (i > (x / 2)) {
            System.out.println(x);
        }
*/

        //7
/*
        int x = scan.nextInt();
        for (int i = 1; i <= (x / 2); i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(x);
*/
        //8
/*
        int x = scan.nextInt(), s = 2;
        for (int i = 2; i <= (x / 2); i++) {
            if (x % i == 0) {
                s++;
            }
        }
        System.out.println(s);
*/
        //9
/*
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s += scan.nextInt();
        }
        System.out.print(s);
*/
        //10?
        //11
/*
        int n = scan.nextInt(), positive = 0, negative = 0, zero = 0;
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
            }
            if (nums[i] > 0) {
                positive++;
            }
            if (nums[i] < 0) {
                negative++;
            }
        }
        System.out.print("zero " + zero + " positive " + positive + " negative " + negative);
*/
        //12
/*
        int x = scan.nextInt(), k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                k++;
                if (k == x) {
                    System.exit(0);
                }
            }
        }
*/
        //13
/*
        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
*/
        //14
/*
        int n = scan.nextInt(), x = 0, y = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                y++;
                if (y % 2 == 0) System.out.print("#");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
*/
        //15
/*
        int x = scan.nextInt();
        int nums[][] = new int[x][x];
        for (int i = 0; i < x; i++) {
            nums[i][0] = i;
            nums[0][i] = i;
        }
        for (int s = 1; s < x; s++) {
            for (int a = 1; a < x; a++) {
                nums[s][a] = s * a;
            }
        }
        for (int g = 0; g < x; g++) {
            for (int h = 0; h < x; h++) {
                System.out.print(nums[g][h] + " ");
            }
            System.out.println();
        }
*/
        //16.1
/*
        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //16.2
/*
        int x = scan.nextInt();
        for (int i = x; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //16.3
/*
        int x = scan.nextInt();
        for (int i = x; i > 0; i--) {
            for (int r = 0; r < x - i; r++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //16.4
/*
        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {

            for (int r = x - i - 1; r > 0; r--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

    }
}