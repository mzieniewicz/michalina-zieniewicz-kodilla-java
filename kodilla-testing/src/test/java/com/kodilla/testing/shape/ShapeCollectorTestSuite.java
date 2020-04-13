package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter =0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of test.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute tests #"+testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        Circle testCircle = new Circle(3.0);
        ShapeCollector testShape = new  ShapeCollector(testCircle);
        //When
        testShape.addFigure(testCircle);
        //Then
        Assert.assertEquals(1, testShape.getFigureQuantity());
    }
    @Test
    public void testGetFigure(){
        Circle testCircle = new Circle(3.0);
        ShapeCollector testShape = new  ShapeCollector(testCircle);
        testShape.addFigure(testCircle);
        //When
        Shape retrivedFigure = testShape.getFigure(0);
        //Then
        Assert.assertEquals(testCircle,retrivedFigure);
        }
    @Test
    public void testGetFigureIndexIsLessThan0(){
        Circle testCircle = new Circle(3.0);
        ShapeCollector testShape = new  ShapeCollector(testCircle);
        testShape.addFigure(testCircle);
        //When
        Shape retrivedFigure = testShape.getFigure(-1);
        //Then
        Assert.assertNull(retrivedFigure);
    }
    @Test
    public void testGetFigureIfIndexIsMoreThanNumberOfFigures(){
        Circle testCircle = new Circle(3.0);
        ShapeCollector testShape = new  ShapeCollector(testCircle);
        testShape.addFigure(testCircle);
        //When
        Shape retrivedFigure = testShape.getFigure(100);
        //Then
        Assert.assertNull(retrivedFigure);
    }
    @Test
    public void testRemoveFigureNotExisting(){
        Circle testCircle = new Circle(3.0);
        ShapeCollector testShape = new  ShapeCollector(testCircle);
        //When
        boolean result = testShape.removeFigure(testCircle);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveFigure(){
        Circle testCircle = new Circle(3.0);
        ShapeCollector testShape = new  ShapeCollector(testCircle);
        testShape.addFigure(testCircle);
        //When
        boolean result = testShape.removeFigure(testCircle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,testShape.getFigureQuantity());
    }


}
