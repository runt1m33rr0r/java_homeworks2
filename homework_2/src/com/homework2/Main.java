package com.homework2;

public class Main {

    public static void main(String[] args) {
        TextileCompany company = new TextileCompany(10, 5);
        Blouse blouse = company.produceBlouse(ColorType.Blue);
        Pants pants = company.producePants(ColorType.Green, ColorType.Blue);

        System.out.println("blouse price: " + blouse.getPrice());
        System.out.println("pants price: " + pants.getPrice());
    }
}
