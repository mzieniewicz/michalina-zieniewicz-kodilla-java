package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        World testWorld = new World();
        Continent europa = new Continent("europa");
        Continent asia = new Continent("asia");
        Continent africa = new Continent("africa");

        Country germany = new Country("germany",new BigDecimal("10000000000"));
        Country france = new Country("france",new BigDecimal("10000000000"));
        Country poland = new Country("poland", new BigDecimal("10000000000"));
        europa.addCountries(germany);
        europa.addCountries(france);
        europa.addCountries(poland);

        Country sudan = new Country("sudan", new BigDecimal("10000000000"));
        Country kongo = new Country("kongo", new BigDecimal("10000000000"));
        Country iran = new Country("iran", new BigDecimal("10000000000"));
        africa.addCountries(sudan);
        africa.addCountries(kongo);
        africa.addCountries(iran);

        Country india = new Country("india", new BigDecimal("10000000000"));
        Country china = new Country("china", new BigDecimal("10000000000"));
        asia.addCountries(india);
        asia.addCountries(china);


        testWorld.addContinents(europa);
        testWorld.addContinents(africa);
        testWorld.addContinents(asia);

        //When
        BigDecimal totalPeople = testWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalPeople= new BigDecimal("80000000000");
        Assert.assertEquals( expectedTotalPeople, totalPeople);




    }
}
