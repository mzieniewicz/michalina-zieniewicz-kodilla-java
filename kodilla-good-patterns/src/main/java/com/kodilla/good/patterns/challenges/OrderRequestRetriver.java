package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {

    public OrderRequest retrive(){
        User user = new User("Anna", "Modra","AnnaM");
        DetailsOfTheOrder detailsOfTheOrder = new DetailsOfTheOrder("Shoes",1);
        LocalDateTime orderTime = LocalDateTime.of(2020,5,25,14,20);

        return new OrderRequest(user, detailsOfTheOrder,orderTime);
    }
}
