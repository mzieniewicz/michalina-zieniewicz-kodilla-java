package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.stream.Stream;

public final class Country {
private final String name;
private BigDecimal peopleQuantity;

    public Country(String name, BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
