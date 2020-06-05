package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class GlutenFreeShop implements FoodProducent{

    private String glutenFreeShopName = "GlutenFreeShop";
    private Map<Product, Integer> assortmentList;

    @Override
    public void precessOrder(OrderRequest orderRequest) {
        System.out.println("Your order will arrive soon - "+glutenFreeShopName);
    }

    @Override
    public Boolean isAvailable(OrderRequest orderRequest) {
        return null;
    }
}
