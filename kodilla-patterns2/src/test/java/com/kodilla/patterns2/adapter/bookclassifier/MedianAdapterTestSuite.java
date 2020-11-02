package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        Set<Book> bookASet = new HashSet<>();
        Book libraryABook1 = new Book ("testTitle1","TestAuthor1",2000,"Sign1");
        Book libraryABook2 = new Book ("testTitle2","TestAuthor2",2001,"Sign2");
        Book libraryABook3= new Book ("testTitle3","TestAuthor3",2002,"Sign3");
        bookASet.add(libraryABook1);
        bookASet.add(libraryABook2);
        bookASet.add(libraryABook3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int mediana = medianAdapter.publictionYearMedian(bookASet);
        //Then
        System.out.println(mediana);
        assertEquals(2001,mediana);


    }
}
