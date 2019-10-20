package com.homework2;

public class DefectCheckStage<T extends Item> implements IProductionStage<T> {
    private int defectDiscount;

    DefectCheckStage(int defectDiscount) {
        this.defectDiscount = defectDiscount;
    }

    @Override
    public void runStage(T item) {
        System.out.println("checking for defects");

        if (item.isDefective()) {
            double discountedAmount = item.getPrice() * this.defectDiscount / 100.0;
            item.setPrice(item.getPrice() - discountedAmount);
        }
    }
}
