package com.company;

public class day13homework {


    //1
 /*
    public static int lenhgt(String a){
        return a.length();
    }
*/
    //2
/*
    public static char findechar(String a, int index) {
        return a.charAt(index);
    }
*/
    //3
/*
    public static boolean charchec(String str, char ch) {
        boolean a = str.contains(String.valueOf(ch));
        return a;
    }
*/
    //4
/*
    public static int vowels(String a) {
        char[] chars = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y'};
        short sum = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < chars.length; j++) {
                if (a.charAt(i) == chars[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }
*/
    //5
/*
    public static void reversstring(String str) {
        System.out.print("the revers of the string " + str + " is ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - 1 - i));
        }
    }
*/
    //6
/*
    public static void countVowelsDigits(String s) {
        char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < chars.length; j++) {
                if (s.charAt(i) == chars[j]) {
                    sum++;
                }
            }
        }
        double kofd = 100.0 / s.length() * sum;
        double kofv = 100.0 / s.length() * vowels(s);
        System.out.println("Number of digits: " + sum + " (" + (kofd * 100 - (kofd * 100) % 1) / 100 + "%)");
        System.out.println("number of vowels: " + vowels(s) + " (" + (kofv * 100 - kofv * 100 % 1) / 100 + "%)");

    }
*/
    //7
/*
    public static void CaesarsCode(String txt) {
        for (int i = 0; i < txt.length(); i++) {
            System.out.print((char) (String.valueOf(txt.charAt(i)).codePointAt(0) + 3));
        }
    }
*/
    //8
/*
    public static boolean ispalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }
*/
    //9
/*
    public static boolean checkBinStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') return false;
        }
        return true;
    }
*/
    //10
/*
    public static boolean ishexstring(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c < 48 || (c > 57 && c < 97) || c > 102) {
                return false;
            }
        }
        return true;
    }
*/
    //11    //VERJAPES HASKACA REKURSYAN :))
/*
    public static int bin2Dec(String str) {
        if (checkBinStr(str) == false) return -1;
        if (str.length() == 1) return Integer.parseInt(str);
        if (str.charAt(0) == '1') return ((int) Math.pow(2, str.length() - 1) + bin2Dec(str.substring(1)));
        return bin2Dec(str.substring(1));
    }
*/
    //12
/*
    public static int hmdublicats(String str) {
        String nodubl = new String();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (nodubl.contains(String.valueOf(str.charAt(i))) == true) sum++;
            else {
                nodubl += String.valueOf(str.charAt(i));
            }
        }
        return sum;
    }
*/
    //13
/*
    public static char firstdublicat(String str) {
        String nodubl = new String();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (nodubl.contains(String.valueOf(str.charAt(i))) == true) return str.charAt(i);
            else {
                nodubl += String.valueOf(str.charAt(i));
            }
        }
        return '0';
    }
*/
    //14
/*
    public static int charsearch(String str, char a) {
        if (str.length() == 0) return 0;
        if (str.charAt(0) == a) return 1 + charsearch(str.substring(1), a);
        return charsearch(str.substring(1), a);
    }
*/
    //15 ??

}
