package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManagementTest {

    private Management rentalManagement;

    @Before
    public void setUp() {
        rentalManagement = new Management();
    }

    @Test
    public void testAddVehicle() {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);
        rentalManagement.addVehicle(vehicle);

        List<Vehicle> inventory = rentalManagement.getInventario();
        Assert.assertEquals(1, inventory.size());
        Assert.assertTrue(inventory.contains(vehicle));
    }

    @Test
    public void testDeleteVehicle() {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);
        rentalManagement.addVehicle(vehicle);

        rentalManagement.deleteVehicle(vehicle);

        List<Vehicle> inventory = rentalManagement.getInventario();
        Assert.assertEquals(0, inventory.size());
    }

    @Test
    public void testMakeReservation() {
        Customer customer = new Customer("John Doe", "123 Main St", "555-1234", "ABC123", new ArrayList<>());
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 5);
        Booking booking = new Booking(customer, vehicle, startDate, endDate, "Confirmed");

        rentalManagement.makeReservation(booking);

        List<Booking> reservations = rentalManagement.getReservas();
        Assert.assertEquals(1, reservations.size());
        Assert.assertTrue(reservations.contains(booking));
    }

    @Test
    public void testCancelBooking() {
        Customer customer = new Customer("John Doe", "123 Main St", "555-1234", "ABC123", new ArrayList<>());
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 5);
        Booking booking = new Booking(customer, vehicle, startDate, endDate, "Confirmed");

        rentalManagement.makeReservation(booking);
        rentalManagement.cancelBooking(booking);

        List<Booking> reservations = rentalManagement.getReservas();
        Assert.assertEquals(0, reservations.size());
    }

    @Test
    public void testGenerateContract() {
        Customer customer = new Customer("John Doe", "123 Main St", "555-1234", "ABC123", new ArrayList<>());
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 5);
        Booking booking = new Booking(customer, vehicle, startDate, endDate, "Confirmed");

        LocalDate rentalDuration = LocalDate.of(2024, 1, 5);
        String price = "100.00";

        RentalContract contract = rentalManagement.generateContract(booking, rentalDuration, price);

        Assert.assertNotNull(contract);
        Assert.assertEquals(booking, contract.getBooking());
        Assert.assertEquals(rentalDuration, contract.getRentalDuration());
        Assert.assertEquals(price, contract.getPrice());
    }

}

