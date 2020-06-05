package com.kodilla.good.patterns.challenges.food2door;


import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriver {

    public OrderRequest retrive(){
        User user = new User("Anna", "Modra","AnnaM","ul. Prosta 3, 12-123 Warszawa");

        Map<Product, Integer> orderList = new HashMap<>();


        Product kale = new Product("kale",3.1);
        Product tomato = new Product("tomato", 2.5);
        orderList.put(kale,5);
        orderList.put(tomato,4);

        return new OrderRequest(user, orderList);
    }
}
