package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {

    public final List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalQuantity = continents.stream()
                 .flatMap(continent -> continent.getCountries().stream())
                  .map(country -> country.getPeopleQuantity() )
                 .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));

        return totalQuantity;

    }
}
