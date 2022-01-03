package com.company;

public class Mymethods {
    public static void showarry(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");

            }

            System.out.println();
        }
    }

    public static void showarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }


}
