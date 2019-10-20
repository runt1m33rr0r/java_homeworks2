package com.homework2;

public interface IProductionStage<T extends Item> {
    void runStage(T item);
}
