package com.company;

import java.util.Scanner;

public class day16_Arithmetic {

    public int[] array;

    public day16_Arithmetic(int[] array) {
        this.array = array;
    }

    public void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
    }

    public int min() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int max() {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int avarage() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public boolean checkArithmeticProgression() {
        boolean indicator = true;
        int kof = array[1] - array[0];
        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] != kof) {
                indicator = false;
                break;
            }
        }
        return indicator;
    }

    public void binarySearch(int num) {
        bubbleSort();
       Mymethods.showarray(array);
        int max = array.length;
        int min = 0;
        while (array[(max + min) / 2] != num) {
            if (array[(max + min) / 2] > num) {
                max = (max + min) / 2;
            }
            if (array[(max + min) / 2] < num) {
                min = (max + min) / 2;
            }
        }
        System.out.println("\nyour number is " + (max + min) / 2 + "-th");
    }

    public void options() {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose option\n1-binarySearch\n2-checkArithmeticProgression\n3-avarage\n4-max\n5-min\n6-bubbleSort");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter the number you want to finde");
                binarySearch(scan.nextInt());
                break;
            case 2:
                System.out.println(checkArithmeticProgression());
                break;
            case 3:
                System.out.println( avarage());
                break;
            case 4:
                System.out.println(max());
                break;
            case 5:
                System.out.println(min());
                break;
            case 6:
                bubbleSort();
                break;
        }
    }
}