package com.company;

import java.util.Scanner;

public class day9homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1
/*
        System.out.println("enter a number which should be the size of your matrix");
        int x = scan.nextInt();
        int[][] nums = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    nums[i][j] = 1;
                    continue;
                }
                nums[i][j] = 0;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(nums[i][j]);
                if (i % x == 0) {
                }
            }
            System.out.println();
        }
*/
        //2
/*
        System.out.println("enter a number which should be the size of your matrix");
        int x = scan.nextInt();
        int[][] nums = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    nums[i][j] = 1;
                }
                if (i > j) {
                    nums[i][j] = 2;
                }
                if (i < j) {
                    nums[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(nums[i][j]);
                if (i % x == 0) {
                }
            }
            System.out.println();
        }
*/
        //3
/*
        System.out.println("enter a number which should be the size of your matrix");
        int x = scan.nextInt();
        int[][] nums = new int[x][x];
        System.out.println("enter your matrix from left to right top to bottom");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                nums[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i <x; i++) {
            for (int j = 0; j <x; j++) {

            }
        }
*/

        System.out.println("enter a number which should be the size of your matrix");
        int x = scan.nextInt();
        int[][] nums = new int[x][x];
        System.out.println("enter your matrix from left to right top to bottom");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                nums[i][j] = scan.nextInt();
            }
        }
        Mymethods.showarry(nums);


    }
}
