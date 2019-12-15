package com.homework2;

import java.util.Random;

class SewingStage<T extends Item> implements IProductionStage<T> {
    private Random randomGenerator;

    SewingStage() {
        this.randomGenerator = new Random();
    }

    @Override
    public void runStage(T item) {
        System.out.println("sewing");

        boolean isDefective = this.randomGenerator.nextBoolean();
        item.setDefective(isDefective);
    }
}
