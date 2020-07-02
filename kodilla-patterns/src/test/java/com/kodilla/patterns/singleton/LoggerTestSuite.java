package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger1 = Logger.getInstance();
        String log1 = "log1";
        //When
        logger1.log(log1);
        //Then
        Assert.assertEquals(log1, logger1.getLastLog());
    }
}