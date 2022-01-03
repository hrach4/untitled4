package com.company;

import java.util.Scanner;


public class day11homework {

    //1
/*
    public static void min(int a, int b, int c) {
        if (b < a) {
            a = b;
        }
        if (c < a) {
            a = c;
        }
        System.out.println("the minimal int is " + a);
    }
*/
    //2
/*
    public static void power(double a, int b) {
        a = Math.pow(a, b);
        System.out.println(a);
    }
*/
    //3
/*
    public static boolean xor(boolean a, boolean b) {
        if (a != b) {
           return true;
        } else {
       return false;
        }
    }
*/
    //4
/*
    public static boolean election(boolean a, boolean b, boolean c) {
        if (a == b) {
            return a;
        } else {
            return c;
        }
    }
*/
    //5
/*
    public static boolean isprime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }
*/
    //6
/*
    public static int fib(int a) {
        int x = 0, y = 1, z = 0;
        for (int i = 0; i < a; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return z;

    }
*/
    //7
/*
    public static int factorial(int a) {
        int f = 1;
        for (int i = 2; i <= a; i++) {
            f *= i;
        }
        return f;
    }
*/
    //8   !! the program works only with English letters !!
/*
    public static boolean isVowel(String a) {
        String[] arr = {"A", "a", "E", "e", "I", "i", "O", "o", "U", "u", "Y", "y"};
        for (int i = 0; i < 12; i++) {
            if (arr[i].equals(a)) {
                return true;
            }
        }
        return false;
    }
*/
    //9
/*
    public static boolean isPalindrome(int a) {
        int k = 10, c = 0, l = 0;
        String str = String.valueOf(a);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c = ((a % k) - (a % (k / 10))) / (k / 10);
            k *= 10;
            l += c;
            arr[i] = c;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (arr[i] != arr[str.length() - 1 - i]) {
                return false;
            }
        }
        return true;
   }
*/
    //9 program for testing
/*
public static void test(){
    System.out.println("enter your number");
    int a=scan.nextInt();
    System.out.println(day11homework.isPalindrome(a));
}
*/
    //10
/*
    public static boolean hasEight(int number) {
        String num = String.valueOf(number);
        if (num.contains("8")) {
            return true;
        }
        return false;
    }
*/
    //11
/*
    public static void MagicSum() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (1 > 0) {
            System.out.println("Enter a positive integer or -1 to end");
            int x = scan.nextInt();
            if (x == -1) {
                System.out.println("the magic sum is " + sum);
                break;
            }
            if (day11homework.hasEight(x) == true) {
                sum += x;
            }
        }
    }
*/
    //12    xndir 12@ u 13@ 99% ov nuyn xndirna et patcharov miayn 13 nem anum

    //13
/*
    public static int search(int[] array, int kay) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == kay) {
                return i;
            }
        }
        return -1;
    }
*/
    //13 test program
/*
    public static void test() {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 63, 92, 62, 14, 0, 233, 1, 6, 0, 655, 4, 36,};
        System.out.println("enter the integer wich you wont to finde");
        int kay = scan.nextInt();
        System.out.println(day11homework.search(arr, kay));
    }
*/
    //14
/*
    public static int[] copyof(int[] array) {
        int[] arrcopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrcopy[i] = array[i];
        }
        return array;
    }
*/
    //15
/*
    public static void studentseshell() {
        Scanner scan = new Scanner(System.in);

        System.out.println("how many students are in your group");
        int numStudents = scan.nextInt(), maxrez = 0, minrez = 100;
        double sum = 0;
        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the grade for student " + (i + 1));
            grades[i] = scan.nextInt();
            sum += grades[i];
            if (grades[i] < minrez) {
                minrez = grades[i];
            }
            if (grades[i] > maxrez) {
                maxrez = grades[i];
            }
        }
        double s = sum / numStudents * 100;
        double avarage = Math.round(s);
        avarage /= 100;
        System.out.println("avarage is " + (avarage) + " the minimum " + minrez + " the maximum " + maxrez);
    }
*/
}



















