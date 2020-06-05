package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class ExtraFoodShop implements FoodProducent{

    private String extraFoodShopName = "ExtraFoodShop";
    private Map<Product, Integer> assortmentList;

    @Override
    public void precessOrder(OrderRequest orderRequest) {
        System.out.println("We have started the order processing process -"+extraFoodShopName);
    }

    @Override
    public Boolean isAvailable(OrderRequest orderRequest) {
        return null;
    }
}
