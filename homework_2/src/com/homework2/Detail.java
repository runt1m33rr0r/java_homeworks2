package com.homework2;

class Detail {
    private ColorType color;
    private Material material;

    Detail(ColorType color, Material material) {
        this.color = color;
        this.material = material;
    }

    Material getMaterial() {
        return this.material;
    }

    ColorType getColor() {
        return this.color;
    }
}
