package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("white")
                .sauce("Spicy")
                .burgers(1)
                .ingredient("onions")
                .ingredient("lettuce")
                .ingredient("cucumber")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
    @Test
    public void testBigmacNewWithoutSauce() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("white")
                .burgers(2)
                .ingredient("onions")
                .ingredient("lettuce")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
