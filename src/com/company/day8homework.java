package com.company;

import java.util.Scanner;

public class day8homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1
/*
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] % 2 == 0) {
                System.out.println(nums[j]);
            }
        }
*/
        //2
/*
        System.out.println("how many items in your list");
        int[] nums = new int[scan.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = 1; i < nums.length; i += 2) {
            System.out.println(nums[i]);
        }
*/
        //3
/*
        short s = 0;
        int nums[] = {-1, 2, 63, -92, -62, 14, 0, -233, 1, -6, 0, 655, -4, -36,};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                s++;
            }
        }
        System.out.print(s);
*/
        //4
/*
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                System.out.println(nums[i]);
            }
        }
*/
        //5
/*
        int nums[] = {-1, 2, 63, -92, -62, 14, 0, -233, 1, -6, 0, 655, -4, -36,};
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] * nums[i - 1] > 0) {
                System.out.println(nums[i - 1] + " " + nums[i]);
                break;
            }
        }
*/
        //6
/*
        int k = 0, c = 0;
        int nums[] = {-1, 2, 63, -92, -62, 14, 0, -233, 1, -6, 0, 655, -4, -36,};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > k) {
                k = nums[i];
                c = i;
            }
        }
        System.out.println("The largest is " + k + " index is " + c);
*/
        //7
/*
        int c = 0;
        int nums[] = {-1, 2, 63, -92, -62, 14, 0, -233,1, -6, 0, 655, -4, -36,};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                c = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < c && nums[i] > 0) {
                c = nums[i];
            }
        }
        System.out.println("the smsllest positive number is " + c);
*/
        //8
/*
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 7, 7, 7, 9, 9, 9, 9,};
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                c++;
            }
        }
        System.out.println(c);
*/
        //9
/*
        System.out.println("How many items are on your list");
        int x = scan.nextInt();
        int list[] = new int[x];
        for (int i = 0; i < x; i++) {
            list[i] = scan.nextInt();
        }
        for (int i = 0; i < x / 2; i++) {
            int k = list[i];
            list[i] = list[x - i - 1];
            list[x - i - 1] = k;
        }
        for (int i = 0; i < x; i++) {
            System.out.println(list[i]);
        }
*/
        //10
/*
        System.out.println("How many items are on your list");
        int x = scan.nextInt();
        int list[] = new int[x];
        for (int i = 0; i < x; i++) {
            list[i] = scan.nextInt();
        }
        for (int i = 0; i < x / 2; i++) {
            int k = list[i];
            list[i] = list[x - i - 1];
            list[x - i - 1] = k;
        }
        for (int i = 0; i < x; i++) {
            System.out.println(list[i]);
        }
*/
        //11
/*
        System.out.println("How many items are on your list");
        int x = scan.nextInt();
        int list[] = new int[x];
        for (int i = 0; i < x; i++) {
            list[i] = scan.nextInt();
        }
        byte z = 0;
        if (x % 2 != 0) {
            z = 1;
        }
        for (int i = 1; i < list.length - z; i += 2) {
            int k = list[i];
            list[i] = list[i - 1];
            list[i - 1] = k;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
 */
        //12
/*
        System.out.println("How many items are on your list");
        int x = scan.nextInt();
        int list[] = new int[x];
        for (int i = 0; i < x; i++) {
            list[i] = scan.nextInt();
        }
        int d = list[x - 1];
        for (int i = 1; i < list.length; i++) {
            list[x - i] = list[x - i - 1];
        }
        list[0] = d;
        for (int i = 0; i < x; i++) {
            System.out.println(list[i]);
        }
*/
        //13
/*
        int[] nums = {13, 29, 63, 92, 62, 14, 4, 233, 19, 6, 10, 655, 42, 37,};
        int numofmin = 0, numofmax = 0, k = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                k = nums[i];
                numofmin = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > k) {
                k = nums[i];
                numofmax = i;
            }
        }
        nums[numofmax] = nums[numofmin];
        nums[numofmin] = k;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
*/
        //14
/*
        int[] nums = {13, 29, 63, 92, 62, 14, 4, 233, 19, 6, 10, 655, 42, 37,};
        Mymethods.showarray(nums);
        System.out.println("<-- enter the number of the item wich you wont to remove");
        int indexofremove = scan.nextInt() - 1;
        for (int i = indexofremove; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
*/
        //15
/*
        int[] nums = {1, 2, 2, 3, 3, 3,};
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    k = 1;
                }
            }
            if (k == 1) {
                k = 0;
                continue;
            }
            System.out.println(nums[i]);
        }
*/
        //16
/*
        int[] nums = {1, 0, 3, 0, 5, 0, 0, 0, 1, 0, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
*/
    }
}
