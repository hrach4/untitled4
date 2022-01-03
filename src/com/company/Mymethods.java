package com.company;

public class Mymethods {
    public static void showarry(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");

            }

            System.out.println();
        }
    }

    public static void showarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] splittodigits(int a) {
        int k = 10, c = 0, l = 0;
        String str = String.valueOf(a);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c = ((a % k) - (a % (k / 10))) / (k / 10);
            k *= 10;
            l += c;
            arr[i] = c;
        }
        return arr;
    }
}