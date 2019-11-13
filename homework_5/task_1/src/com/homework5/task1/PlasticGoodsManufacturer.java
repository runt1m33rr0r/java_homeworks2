package com.homework5.task1;

import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

class PlasticGoodsManufacturer {
    private String name;
    private NavigableSet<PlasticGoods> goodsToManufacture;

    PlasticGoodsManufacturer(String name) {
        this.name = name;

        this.goodsToManufacture = new TreeSet<>();
    }

    String getName() {
        return this.name;
    }

    void addGoods(PlasticGoods someGoods) {
        this.goodsToManufacture.add(someGoods);
    }

    PlasticGoods getGoodsClosestToAverage() {
        PlasticGoods average = this.getAverageGoods();
        PlasticGoods ceiling = this.goodsToManufacture.ceiling(average);
        PlasticGoods floor = this.goodsToManufacture.floor(average);
        double ceilingDistance = Objects.requireNonNull(ceiling).getPrice() - average.getPrice();
        double floorDistance = average.getPrice() - Objects.requireNonNull(floor).getPrice();

        if (ceilingDistance <= floorDistance) {
            return ceiling;
        } else {
            return floor;
        }
    }

    PlasticGoods getGoodsHigherThanAverage() {
        return this.goodsToManufacture.higher(this.getAverageGoods());
    }

    PlasticGoods getGoodsLowerThanAverage() {
        return this.goodsToManufacture.lower(this.getAverageGoods());
    }

    PlasticGoods getAverageGoods() {
        double allPrice = 0;
        for (PlasticGoods goods : this.goodsToManufacture) {
            allPrice += goods.getPrice();
        }

        double averagePrice = allPrice / this.goodsToManufacture.size();

        return new PlasticGoods("test", averagePrice);
    }
}
