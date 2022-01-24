package com.company;


import java.util.Scanner;

public class day16homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1
/*
        day16_Employer office1 = new day16_Employer("office1", 24, "idk1", 320000);
        day16_Employer office2 = new day16_Employer("office2", 50, "idk2", 400000);
        office1.info();
        office2.info();
*/
        //2
/*
        System.out.println("how many goods do you want");
        int countOfproduct = scan.nextInt();
        day16_Shop pyatyorchka = new day16_Shop("Пятёрочка", "Москва", 1000000, 2000, 500);
        if (pyatyorchka.checkOrder(countOfproduct) == true) {
            System.out.println("Мы можем предоставить данное количество товара\nЕсли вы хотите совершить покупку, пожалуйста, нажмите 1 если вы не хотите совершить покупку, нажмите любую другую Кнопку");
            String choys = scan.next();
            if (choys.equals("1") == true) {
                System.out.println("вы должны заплатить " + pyatyorchka.calculateOrder(countOfproduct));
                pyatyorchka.addToShopBalance(pyatyorchka.calculateOrder(countOfproduct));
            }
        } else {
            System.out.println("извините,на данный момент мы не можем предоставить данное количество товара");
        }
        System.out.println(pyatyorchka.shopBalance);
*/
        //3
/*
        day16_university politex = new day16_university("politex", 200, 350, 29, 17);
        politex.admission();
        System.out.println("choose the course you want");
        byte choice = scan.nextByte();
        if (choice >= 1 && choice <= 3) {
            System.out.println("please enter your age");
            if (politex.checkAge(scan.nextByte()) == true) {
                System.out.println("Congratulations, you are succeed");
                politex.register();
            } else {
                System.out.println("go EPH");
            }
        }
        politex.display();
*/
        //4
/*
        int[] nums = {1, 10, 11, 9, 31, 32, 4, 67, 100};
        day16_Arithmetic math = new day16_Arithmetic(nums);
        math.options();
        System.out.println(System.currentTimeMillis());
*/
        //5
/*
        day16_Student Armen = new day16_Student("Armen", 24, 69);
        day16_Student Davo = new day16_Student("Davo", 14, 99);
        day16_Student Ashot = new day16_Student("Ashot", 20, 34);
        day16_Student students[] = {Ashot, Armen, Davo};

        day16_Sort.sortbyage(students);

        day16_Sort.sortbyweight(students);

        day16_Sort.sortbyname(students);

*/
    }
}
