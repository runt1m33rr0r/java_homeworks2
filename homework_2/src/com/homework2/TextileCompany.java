package com.homework2;

class TextileCompany {
    private double workPricePerItem;
    private int deffectDiscountPercent;

    TextileCompany(double workPricePerItem, int deffectDiscountPercent) {
        this.workPricePerItem = workPricePerItem;
        this.deffectDiscountPercent = deffectDiscountPercent;
    }

    private <T extends Item> void processItem(T item) {
        SewingStage<T> sewingStage = new SewingStage<>();
        sewingStage.runStage(item);

        DefectCheckStage<T> defectCheckStage = new DefectCheckStage<>(this.deffectDiscountPercent);
        defectCheckStage.runStage(item);

        PackagingStage<T> packagingStage = new PackagingStage<>();
        packagingStage.runStage(item);
    }

    Blouse produceBlouse(ColorType color) {
        Material blouseMaterial = new Material(5);
        Blouse someBlouse = new Blouse(this.workPricePerItem, color, blouseMaterial);
        this.processItem(someBlouse);

        return someBlouse;
    }

    Pants producePants(ColorType pantsColor, ColorType beltColor) {
        Material pantsMaterial = new Material(10);
        Material beltMaterial = new Material(3);
        Pants somePants = new Pants(
                this.workPricePerItem,
                pantsColor,
                pantsMaterial,
                beltColor,
                beltMaterial);
        this.processItem(somePants);

        return somePants;
    }
}
