package com.company;

public class day16_Shop {
    String name, address;
    int countOfProduct, shopBalance, priceForProduct;

    public day16_Shop(String name, String address, int shopBalance, int countOfProduct, int priceForProduct) {
        this.name = name;
        this.shopBalance = shopBalance;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
    }

    public day16_Shop() {
    }

    public boolean checkOrder(int countoforder) {
        if (countoforder > this.countOfProduct) {
            return false;
        }
        return true;
    }

    public int calculateOrder(int countoforder) {
        return countoforder * priceForProduct;
    }

    public void addToShopBalance(int calculateOrder) {
        this.shopBalance += calculateOrder;
    }
}
