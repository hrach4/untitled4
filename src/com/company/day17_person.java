package com.company;

public class day17_person {


    private String firstName, lastName, sex, nationality, pasportId;
    private int age;

    public day17_person() {
    }

    public day17_person(String firstName, String lastName, String sex, String nationality, String pasportId, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.nationality = nationality;
        this.pasportId = pasportId;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPasportId() {
        return pasportId;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15) {
            this.firstName = firstName;
        } else {
            System.out.println("illegal firstname");
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 6 && lastName.length() <= 20) {
            this.lastName = lastName;
        } else {
            System.out.println("illegal lastname");
        }
    }

    public void setSex(String sex) {
        if (sex.equals("male") || sex.equals("female")) {
            this.sex = sex;
        } else {
            System.out.println("illegal sex");
        }
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPasportId(String pasportId) {
        if (pasportId.substring(0, 2).equals("AN") && (pasportId.substring(2).matches("[0-9]+")) && pasportId.length() == 8) {
            this.pasportId = pasportId;
        } else {
            System.out.println("illegal pasportid");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 99) {
            this.age = age;
        } else {
            System.out.println("illegal age");
        }
    }
}
