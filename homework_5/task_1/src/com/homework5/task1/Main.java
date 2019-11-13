package com.homework5.task1;

public class Main {

    public static void main(String[] args) {
	    PlasticGoodsManufacturer manufacturer = new PlasticGoodsManufacturer("manufacturer");
	    PlasticGoods goods1 = new PlasticGoods("goods1", 100);
	    PlasticGoods goods2 = new PlasticGoods("goods2", 300);
	    PlasticGoods goods3 = new PlasticGoods("goods3", 50);

	    manufacturer.addGoods(goods1);
	    manufacturer.addGoods(goods2);
	    manufacturer.addGoods(goods3);

        System.out.println(manufacturer.getAverageGoods().getPrice());
        System.out.println(manufacturer.getGoodsClosestToAverage().getName());
        System.out.println(manufacturer.getGoodsHigherThanAverage().getName());
        System.out.println(manufacturer.getGoodsLowerThanAverage().getName());
    }
}
