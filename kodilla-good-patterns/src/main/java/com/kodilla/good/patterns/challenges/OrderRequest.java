package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private DetailsOfTheOrder detailsOfTheOrder;
    private LocalDateTime orderTime;

    public OrderRequest(User user, DetailsOfTheOrder detailsOfTheOrder, LocalDateTime orderTime) {
        this.user = user;
        this.detailsOfTheOrder = detailsOfTheOrder;
        this.orderTime = orderTime;
    }

    public User getUser() {
        return user;
    }

    public DetailsOfTheOrder getDetailsOfTheOrder() {
        return detailsOfTheOrder;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}





