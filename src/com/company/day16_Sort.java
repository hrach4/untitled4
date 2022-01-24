package com.company;

public class day16_Sort {
    public static void sortbyage(day16_Student[] students) {
        day16_Student[] students1 = new day16_Student[students.length];
        day16_Student temp = new day16_Student();
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < (students.length - i); j++) {
                if (students[j - 1].age > students[j].age) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Students sorted by age");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }
    }

    public static void sortbyweight(day16_Student[] students) {
        day16_Student[] students1 = new day16_Student[students.length];
        day16_Student temp = new day16_Student();
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < (students.length - i); j++) {
                if (students[j - 1].weight > students[j].weight) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Students sorted by weight");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }
    }

    public static void sortbyname(day16_Student[] students) {
        day16_Student[] students1 = new day16_Student[students.length];
        day16_Student temp = new day16_Student();
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < (students.length - i); j++) {
                if (students[j - 1].name.compareTo(students[j].name) > 0) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Students sorted by name");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }
    }


}
