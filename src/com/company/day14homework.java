package com.company;

import com.sun.jdi.connect.Connector;

public class day14homework {

    //1.1
/*
    public static int sum(int[] nums, int x) {
        if (x == 1) {
            return nums[0];
        } else {
            return nums[x - 1] + sum(nums, x - 1);
        }
    }
*/
    //1.2
/*
    public static int fak(int a) {
        if (a == 1) return 1;
        else return a * fak(a - 1);
    }
*/
    //2
/*
    public static int fib(int a) {
        if (a == 1) return 1;
        if (a == 2) return 2;
        else return fib(a - 1) + fib(a - 2);
    }
*/
    //3
/*
    public static int triangles(int a) {
        if (a == 0) return 0;
        return a + triangles(a - 1);
    }
*/
    //4
/*
        public static int split(int a) {
            int k = 0;
            if (a / 10 == 0) {
                return a;
            }
            return a % 10 + split(a / 10);
        }
*/
    //5
/*
    public static int sevencounter(int a) {
        if (a == 7) {
            return a / 7;
        }
        if (a / 10 == 0) {
            return 0;
        }
        if ((a % 10) % 7 == 0) {
            return 1 + sevencounter(a / 10);
        } else {
            return sevencounter(a / 10);
        }
    }
*/
    //6
/*
    public static int charcounter(String a){
        if( a.length()==1 && a.equals("x"))  return 1;
        if(a.length()==1) return 0;
        if('x'==(a.charAt(a.length()-1))) return 1+charcounter(a.substring( 0,a.length() - 1));
        else return charcounter( a.substring( 0,a.length() - 1));
    }
*/
    //7
/*
    public static String xdeleter(String s) {
        if (s.length() == 0) return s;
        if (s.charAt(0) == 'x') return xdeleter(s.substring(1));
        return s.charAt(0) + xdeleter(s.substring(1));
     }
*/
    //8
/*
    public static String revers(String a) {
        if (a.length() == 0) return a;
        return a.substring(a.length() - 1, a.length()) + revers(a.substring(0, a.length() - 1));
    }
*/
               // mnacac@ djvar en bayc chem handznvum,@ntacqum kanem.

}











