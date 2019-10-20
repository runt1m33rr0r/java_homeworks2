package com.homework2;

public class PackagingStage<T extends Item> implements IProductionStage<T> {
    @Override
    public void runStage(T item) {
        System.out.println("packaging");
    }
}
