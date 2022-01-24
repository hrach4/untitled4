package com.company;

public class day16_university {
    String name;
    int countOfStudents, maxcountOfStudents, maxAgeOfStudent, minAgeOfStudent;

    public day16_university(String name, int countOfStudents, int maxcountOfStudents, int maxAgeOfStudent, int minAgeOfStudent) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxcountOfStudents = maxcountOfStudents;
        this.maxAgeOfStudent = maxAgeOfStudent;
        this.minAgeOfStudent = minAgeOfStudent;
    }

    public day16_university() {
    }

    public void printinfo() {
        System.out.println("name-" + name + "\ncountOfStudents-" + countOfStudents + "\nmaxcountOfStudents-" + maxcountOfStudents + "\nmaxAgeOfStudent-" + maxAgeOfStudent + "\nminAgeOfStudent-" + minAgeOfStudent);
    }

    public boolean checkAge(int age) {
        if (age >= minAgeOfStudent && age <= maxAgeOfStudent) {
            return true;
        }
        return false;
    }

    public void admission() {
        System.out.println("our courses\n" + "1-math analysis\n" + "2-analytic geometry\n" + "3-fizc");
    }

    public void register() {
        countOfStudents++;
    }
public void display(){
    System.out.println("now we have "+countOfStudents+"students");
}
}

