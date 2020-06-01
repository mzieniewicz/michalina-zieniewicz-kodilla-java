package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    void createRental(User user, DetailsOfTheOrder detailsOfTheOrder, LocalDateTime orderTime);
}
