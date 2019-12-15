package com.homework5.task1;

class PlasticGoods implements Comparable<PlasticGoods> {
    private String name;
    private double price;

    PlasticGoods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    @Override
    public int compareTo(PlasticGoods other) {
        return Double.compare(this.price, other.getPrice());
    }
}
