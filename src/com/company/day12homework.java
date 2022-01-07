package com.company;

public class day12homework {

    //1
/*
    public static void add(int a, int b) {
        System.out.println("method  sum of 2 intagers,resoult is " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("method  sum of 3 intagers,resoult is " + (a + b + c));
    }

    public static void add(int a, float b) {
        System.out.println("method  sum of intager and float,resoult is " + (a + b));
    }

    public static void add(float b, int a) {
        System.out.println("method  sum of float and intager,resoult is " + (a + b));
    }
*/
    //2
/*
    public static float add(float b, int a) {
        return (a + b);
    }
    public static int add(float b, int a) {
        return (int)(a + b);
    }
*/
    //3
/*
    public static float add(float b, int a) {
        return (a + b);
    }
    public static int add(int a,float b) {
        return (int) (a + b);
    }
*/
    //4
/*
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                continue;
            }
            System.out.print(arr[i] + ", ");
        }
    }

    public static void print(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                continue;
            }
            System.out.print(arr[i] + ", ");
        }
    }

    public static void print(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                continue;
            }
            System.out.print(arr[i] + ", ");
        }
    }
*/
    //5
/*
    public static int search(int[] arr) {
        return arr.length;
    }

    public static int search(int[] arr, int arg) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arg) {
                return i;
            }
        }
        return 0;
    }

    public static boolean search(int[] arr, int arg, int index) {
        if (arr[index] == arg) {
            return true;
        } else {
            return false;
        }
    }
*/
    //6
/*
    public static double square(int a) {
        return 3.14 * a * a;
    }

    public static double square(float a) {
        return a * a;
    }

    public static float square(float a, float b) {
        return a * b;
    }
*/
    //7
/*
    public static int max(int... arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

*/
    //8
/*
    public static double distance(int x1, int x2, int x3, int x4) {
        return Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(x4 - x2, 2));
    }
*/
    //9
/*
    public static void farcels(double c, int ch) {
        if (ch == 1) System.out.println(c + "f=" + (5 / 9) * (c - 32) + "c");
        else {
            if (ch == 0) System.out.println(c + "c=" + (9 / 5) * (c + 32) + "f");
        }

    }
*/
    //10
/*
    public static int reminder(int a) {
        int sum = 0;
        int[] arr = Mymethods.splittodigits(a);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int reminder(int a, int b) {
        int sum = 0;
        int[] arr = Mymethods.splittodigits(a);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum % b;
    }
*/
}
