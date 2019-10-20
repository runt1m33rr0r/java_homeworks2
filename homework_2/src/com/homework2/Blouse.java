package com.homework2;

class Blouse extends Item {
    private Detail frontSide;
    private Detail backSide;
    private Detail firstSleeve;
    private Detail secondSleeve;

    Blouse(double workPrice, ColorType color, Material material) {
        super(workPrice, material.getPrice());

        this.frontSide = new Detail(color, material);
        this.backSide = new Detail(color, material);
        this.firstSleeve = new Detail(color, material);
        this.secondSleeve = new Detail(color, material);
    }

    Detail getFrontSide() {
        return this.frontSide;
    }

    Detail getBackSide() {
        return this.backSide;
    }

    Detail getFirstSleeve() {
        return this.firstSleeve;
    }

    Detail getSecondSleeve() {
        return this.secondSleeve;
    }
}
