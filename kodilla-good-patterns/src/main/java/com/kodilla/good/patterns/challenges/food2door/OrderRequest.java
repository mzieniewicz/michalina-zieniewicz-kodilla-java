package com.kodilla.good.patterns.challenges.food2door;


import java.util.Map;

public class OrderRequest {
    private User user;
    private Map<Product, Integer> orderList;

    public OrderRequest(User user, Map<Product, Integer> orderList) {
        this.user = user;
        this.orderList = orderList;
    }

    public User getUser() {
        return user;
    }

    public Map<Product, Integer> getOrderList() {
        return orderList;
    }
}





