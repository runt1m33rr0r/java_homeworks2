package com.homework3;

class Art implements Comparable<Art> {
    private String name;
    private double price;
    private ArtType artType;

    Art(String name, double price, ArtType artType) {
        this.name = name;
        this.price = price;
        this.artType = artType;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    ArtType getArtType() {
        return this.artType;
    }

    @Override
    public int compareTo(Art art) {
        return Double.compare(this.getPrice(), art.getPrice());
    }
}
