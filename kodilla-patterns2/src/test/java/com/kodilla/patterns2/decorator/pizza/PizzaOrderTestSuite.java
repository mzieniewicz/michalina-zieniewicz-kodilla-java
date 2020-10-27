package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = thePizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        //When
        String description = thePizzaOrder.getDescription();
        //Then
        assertEquals("Basic pizza (tomato sauce with cheese)", description);
    }
    @Test
    public void testThickDoughPizzaDecoratorWithMushroomsAndExtraCheeseGetCost() {
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        thePizzaOrder = new ThickDoughPizzaDecorator(thePizzaOrder);
        thePizzaOrder = new MushroomsPizzaDecorator(thePizzaOrder);
        thePizzaOrder = new ExtraCheesePizzaDecorator(thePizzaOrder);
        System.out.println(thePizzaOrder.getCost());
        //When
        BigDecimal theCost = thePizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }
    @Test
    public void testThickDoughPizzaDecoratorWithMushroomsAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        thePizzaOrder = new ThickDoughPizzaDecorator(thePizzaOrder);
        thePizzaOrder = new MushroomsPizzaDecorator(thePizzaOrder);
        thePizzaOrder = new ExtraCheesePizzaDecorator(thePizzaOrder);
        System.out.println(thePizzaOrder.getDescription());
        //When
        String description = thePizzaOrder.getDescription();
        //Then
        assertEquals("Basic pizza (tomato sauce with cheese) on thick dough + mushrooms + extra cheese",description);
    }
    @Test
    public void testPizzaOrderWithHamWithCornWithChickenGetCost(){
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        thePizzaOrder = new HamPizzaDecorator(thePizzaOrder);
        thePizzaOrder = new CornPizzaDecorator(thePizzaOrder);
        thePizzaOrder = new ChickenPizzaDecorator(thePizzaOrder);
        System.out.println(thePizzaOrder.getCost());
        //When
        BigDecimal theCost = thePizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24), theCost);
    }
    @Test
    public void testPizzaOrderWithHamWithCornWithChickenGetDescription(){
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        thePizzaOrder = new HamPizzaDecorator(thePizzaOrder);
        thePizzaOrder = new CornPizzaDecorator(thePizzaOrder);
        thePizzaOrder = new ChickenPizzaDecorator(thePizzaOrder);
        System.out.println(thePizzaOrder.getDescription());
        //When
        String description = thePizzaOrder.getDescription();
        //Then
        assertEquals("Basic pizza (tomato sauce with cheese) + ham + corn + chicken",description);
    }
}
