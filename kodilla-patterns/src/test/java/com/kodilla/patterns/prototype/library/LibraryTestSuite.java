package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("The original library");
        Book book1 = new Book("book1","author1", 2000,10,5);
        Book book2 = new Book("book2","author2", 2001,2,2);
        Book book3 = new Book("book3","author3", 2002,11,15);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow clone of object Library
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("The shallow-copy library");

        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        //making a deep clone of object Library
        Library deepClonedLibrary =null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("The deep-copy library");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
       library.getBooks().remove(book2);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,clonedLibrary.getBooks().size());
        Assert.assertEquals(3,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());

    }
}
