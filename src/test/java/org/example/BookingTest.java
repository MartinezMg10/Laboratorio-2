package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class BookingTest {

    @Test
    public void testBookingCreation() {
        Customer customer = new Customer("John Doe", "john@example.com", "123-456-7890","100210010", Arrays.asList("Default Insurance"));
        Vehicle vehicle = new Vehicle("Prado", "Toyota", 2018,257697, true);
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 5);

        Booking booking = new Booking(customer, vehicle, startDate, endDate, "Confirmed");

        Assert.assertEquals(customer, booking.getCustomer());
        Assert.assertEquals(vehicle, booking.getVehicle());
        Assert.assertEquals(startDate, booking.getStartDate());
        Assert.assertEquals(endDate, booking.getEndingDate());
        Assert.assertEquals("Confirmed", booking.getState());
    }

    @Test
    public void testBookingStateUpdate() {
        Customer customer = new Customer("John Doe", "john@example.com", "123-456-7890","100210010", Arrays.asList("Default Insurance"));
        Vehicle vehicle = new Vehicle("Prado", "Toyota", 2018,257697, true);
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 5);

        Booking booking = new Booking(customer, vehicle, startDate, endDate, "Confirmed");

        booking.setState("Cancelled");
        Assert.assertEquals("Cancelled", booking.getState());
    }

}
