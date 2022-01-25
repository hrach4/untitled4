package com.company;

public class day17_Store {
    private int countOfWorkers;
    private String name, phoneNumber;
    private String[] productnumbers;

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("[0-9]+") && phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public String[] getProductnumbers() {
        return productnumbers;
    }

    public void setProductnumbers(String[] productnumbers) {
        this.productnumbers = productnumbers;
    }

    public void sell() {
        System.out.println("enter the numbers of the items you want to buy");

        for (int i = 0; i < productnumbers.length; i++) {
            System.out.println(i + "." + productnumbers[i]);
        }

    }
}
