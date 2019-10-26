package com.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Gallery {
    private String address;
    private double area;
    private List<Art> artList;

    Gallery(String address, double area) {
        this.address = address;
        this.area = area;

        this.artList = new ArrayList<>();
    }

    String getAddress() {
        return this.address;
    }

    double getArea() {
        return this.area;
    }

    List<Art> getArtList() {
        return this.artList;
    }

    void addArt(Art someArt) {
        this.artList.add(someArt);
    }

    void removeArt(Art someArt) {
        this.artList.remove(someArt);
    }

    Art getMostExpensiveArt() {
        return Collections.max(this.artList);
    }

    void sortArtList() {
        Collections.sort(this.artList);
    }

    int getArtCountByArea() {
        int areaSizePerArt = (int)this.area / this.artList.size();
        return (int)this.area / areaSizePerArt;
    }

    List<Art> getEveryThirdArt() {
        int skipped = 0;
        List<Art> result = new ArrayList<>();
        for (Art art : this.artList) {
            if (skipped == 2) {
                result.add(art);
                skipped = 0;
            }

            skipped++;
        }

        return result;
    }
}
