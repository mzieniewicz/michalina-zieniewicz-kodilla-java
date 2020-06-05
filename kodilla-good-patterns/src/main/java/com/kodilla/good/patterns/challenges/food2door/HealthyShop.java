package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class HealthyShop implements FoodProducent {

    private String healthyShopName = "HealthyShop";
    private Map<Product, Integer> assortmentList;

    @Override
    public void precessOrder(OrderRequest orderRequest) {
        System.out.println("Your order is being processed. Thank you for choosing "+ healthyShopName + " !");
    }

    @Override
    public Boolean isAvailable(OrderRequest orderRequestr) {
        return true;
    }
}
