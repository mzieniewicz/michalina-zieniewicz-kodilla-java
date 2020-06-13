package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

public class ReaderTestSuite {
    @Test
    public void testRead(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);
        //When & Then
        reader.read();
    }
    @Test
    public void testConditional(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        //Then
        boolean book2exists = context.containsBean("book2");
        //Then
        System.out.println("Bean book2 was found in the container: " + book2exists);
    }
}
