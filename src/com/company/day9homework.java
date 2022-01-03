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
        int z = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                nums[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (nums[i][j] != nums[j][i]) {
                    x = 1;
                }
            }
        }
        if (x == 1) {
            System.out.println("NO");
        } else {
            System.out.println("Yes");
        }
*/
        //4
/*
        System.out.println("enter the number of athleties and throws");
        int n = scan.nextInt(), m = scan.nextInt(), sum = 0, v = 0, ind = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the results of athlete N " + i);
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
                v += arr[i][j];
            }
            if (v > sum) {
                sum = v;
                ind = i;
            }
            v = 0;
        }
        Mymethods.showarry(arr);
        System.out.println("max resoult is " + sum + "  line is " + ind);
*/
        //5
/*
        System.out.println("enter the number of athleties and throws");
        int n = scan.nextInt(), m = scan.nextInt(), line = 0, col = 0, max = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the results of athlete N " + i);
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    line = i;
                    col = j;
                }
            }
        }
        Mymethods.showarry(arr);
        System.out.println("max resoult is " + max + " from line " + line + " column " + col);
*/
        //6
/*
        System.out.println("enter the number of athleties and throws");
        int n = scan.nextInt(), m = scan.nextInt(), maxsumline = 0, maxrez = 0, x = 0, maxrezline = 0, sum = 0, maxline = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the results of athlete N " + i);
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
                if (arr[i][j] > maxrez) {
                    maxrez = arr[i][j];
                    maxrezline = i;
                }
                sum += arr[i][j];
            }
            if (sum > maxsumline) {
                maxsumline = sum;
                maxline = i;
            }
            sum = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == maxrez && i != maxrezline) {
                    x = 1;
                }
            }
        }
        if (x == 1) {
            System.out.println("the winer is the athlete N " + maxline + " in total " + maxsumline + " points");
        } else {
            System.out.println("the winer is the athlete N " + maxrezline + " best throw " + maxrez + " points");
        }
*/
        //7        day 9 um xndir 7 chka
        //8
/*
        System.out.println("enter the size of your matrix");
        int s = scan.nextInt();
        System.out.println("enter the first matrix");
        int[][] arr1 = new int[s][s];
        int[][] arr2 = new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.println("enter the second matrix");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }
        int sum[][] = new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        Mymethods.showarry(sum);
*/
        //9
/*
        System.out.println("etner the size");
        int s = scan.nextInt();
        int[][] arr = new int[s][s];
        for (int i = 0; i < s; i++) {
            arr[0][i] = 1;
            arr[s - 1][i] = 1;
            arr[i][s - 1] = 1;
        }
        int x = s - 2, y = 0;
        for (int k = 0; k < s; k++) {
            while (arr[x - 1][y] == 0) {
                arr[x][y] = 1;
                if (arr[x - 2][y] == 1) {
                    break;
                }
                x -= 1;
            }
            while (arr[x][y + 1] == 0) {
                arr[x][y] = 1;
                if (arr[x][y + 2] == 1) {
                    break;
                }
                y++;
            }
            while (arr[x + 1][y] == 0) {
                arr[x][y] = 1;
                if (arr[x + 2][y] == 1) {
                    break;
                }
                x++;
            }
            while (arr[x][y - 1] == 0) {
                arr[x][y] = 1;
                if (arr[x][y - 2] == 1) {
                    break;
                }
                y--;
            }
        }
        Mymethods.showarry(arr);
*/
        //10                anhaskanali patcharnerov cragri@ shxatuma miayn 3 mutq anelu depqum
/*
        System.out.println("enter size");
        int s = scan.nextInt();
        int[][] arr = new int[2 * s + 1][2 * s + 1];

        int x = arr.length;

        for (int i = 0; i < x; i++) {
            arr[0][i] = i;
            arr[i][x - 1] = x + i - 1;
            arr[x - 1][x - i - 1] = 2 * x + i - 2;
        }
        arr[0][0] = 10;
        int t = x - 2, c = 0;

        for (int i = 19; i < (2 * s + 1) * (2 * s + 1); i += 0) {

            while (arr[t][c] == 0) {
                arr[t][c] = i;
                i++;
                t--;
            }
            t++;
            c++;
            while (arr[t][c] == 0) {
                arr[t][c] = i;
                i++;
                c++;
            }
            c--;
            t++;
            while (arr[t][c] == 0) {
                arr[t][c] = i;
                i++;
                t++;
            }
            t--;
            c--;
            while (arr[t][c] == 0) {
                arr[t][c] = i;
                i++;
                c--;
            }
            t--;
            c++;


        }
        arr[0][0] = 0;

        Mymethods.showarry(arr);
*/

    }
}
