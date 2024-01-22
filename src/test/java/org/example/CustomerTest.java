package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

    @Test
    public void testCustomerCreation() {
        List<String> record = new ArrayList<>();
        record.add("Booking 1");
        record.add("Booking 2");

        Customer customer = new Customer("John Doe", "123 Main St", "555-1234", "ABC123", record);

        Assert.assertEquals("John Doe", customer.getName());
        Assert.assertEquals("123 Main St", customer.getAddress());
        Assert.assertEquals("555-1234", customer.getPhone());
        Assert.assertEquals("ABC123", customer.getDrivingLicense());
        Assert.assertEquals(record, customer.getRecord());
    }

    @Test
    public void testCustomerUpdate() {
        List<String> record = new ArrayList<>();
        record.add("Booking 1");
        record.add("Booking 2");

        Customer customer = new Customer("John Doe", "123 Main St", "555-1234", "ABC123", record);

        // Actualizar información del cliente y comprobar
        customer.setAddress("456 Oak St");
        customer.getRecord().add("Booking 3");

        Assert.assertEquals("456 Oak St", customer.getAddress());
        Assert.assertTrue(customer.getRecord().contains("Booking 3"));
    }
}
