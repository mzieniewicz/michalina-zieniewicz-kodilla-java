package com.kodilla.good.patterns.challenges.food2door;


public interface FoodProducent {

    void precessOrder(OrderRequest orderRequest);

    Boolean isAvailable(OrderRequest orderRequest);
}
