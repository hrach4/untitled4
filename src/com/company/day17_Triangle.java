package com.company;

public class day17_Triangle {
    private int sideA, sideB, sideC;

    day17_Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    day17_Triangle() {
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideA(int sideA) {
        if (sideA >= 1 && sideA <= 20) {
            this.sideA = sideA;
        }
    }

    public void setSideB(int sideB) {
        if (sideB >= 1 && sideB <= 20) {

            this.sideB = sideB;
        }
    }

    public void setSideC(int sideC) {
        if (sideC >= 1 && sideC <= 20) {
            this.sideC = sideC;
        }
    }

    private static boolean IsTriangle(day17_Triangle triangle) {
        if (triangle.sideA + triangle.sideB <= triangle.sideC) {
            return false;
        }
        if (triangle.sideA + triangle.sideC <= triangle.sideB) {
            return false;
        }
        if (triangle.sideB + triangle.sideC <= triangle.sideA) {
            return false;
        }
        return true;
    }

    public static void check(day17_Triangle triangle) {
        System.out.println(IsTriangle(triangle));
    }


    public boolean RightTriangelCheck() {
        if (sideA * sideA + sideB * sideB == sideC * sideC) {
            return true;
        }
        if (sideA * sideA + sideC * sideC == sideB * sideB) {
            return true;
        }
        if (sideB * sideB + sideC * sideC == sideA * sideA) {
            return true;
        }
        return false;
    }

     //verjin pahanj@ ahavor vata grac,chihaskacvum!!
}
