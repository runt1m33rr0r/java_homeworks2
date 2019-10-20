package com.homework2;

abstract class Item {
    private double price;
    private boolean isDefective = false;

    Item(double workPrice, double materialsPrice) {
        this.price = workPrice + materialsPrice;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    boolean isDefective() {
        return this.isDefective;
    }

    void setDefective(boolean defective) {
        this.isDefective = defective;
    }
}
