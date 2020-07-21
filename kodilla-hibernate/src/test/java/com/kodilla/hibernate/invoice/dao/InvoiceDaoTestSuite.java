package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product testProduct1 = new Product("testProduct");
        Product testProduct2 = new Product("testProduct");

        Item item1 = new Item(new BigDecimal(20), 10, testProduct1);
        Item item2 = new Item(new BigDecimal(20), 50, testProduct1);
        Item item3 = new Item(new BigDecimal(100), 30, testProduct2);

        Invoice testInvoice = new Invoice("1-01-2020");

        testInvoice.getItems().add(item1);
        testInvoice.getItems().add(item2);
        testInvoice.getItems().add(item3);

        item1.setInvoice(testInvoice);
        item2.setInvoice(testInvoice);
        item3.setInvoice(testInvoice);
        //When
        invoiceDao.save(testInvoice);
        int id = testInvoice.getId();
        //Then
        Assert.assertNotEquals(0,id);
        //CleanUp
        invoiceDao.deleteById(id);

    }

}
