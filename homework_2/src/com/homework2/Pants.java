package com.homework2;

class Pants extends Item {
    private Detail firstLeg;
    private Detail secondLeg;
    private Detail belt;

    Pants(
            double workPrice,
            ColorType pantsColor,
            Material pantsMaterial,
            ColorType beltColor,
            Material beltMaterial) {
        super(workPrice,pantsMaterial.getPrice() + pantsMaterial.getPrice() + beltMaterial.getPrice());

        this.firstLeg = new Detail(pantsColor, pantsMaterial);
        this.secondLeg = new Detail(pantsColor, pantsMaterial);
        this.belt = new Detail(beltColor, beltMaterial);
    }

    Detail getFirstLeg() {
        return this.firstLeg;
    }

    Detail getSecondLeg() {
        return this.secondLeg;
    }

    Detail getBelt() {
        return this.belt;
    }
}
