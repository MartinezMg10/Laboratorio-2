package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RentalContractTest {

    @Test
    public void testRentalContractCreation() {
        Customer customer = new Customer("John Doe", "123 Main St", "555-1234", "ABC123", Arrays.asList("Booking 1"));
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 5);
        Booking booking = new Booking(customer, vehicle, startDate, endDate, "Confirmed");

        LocalDate rentalDuration = LocalDate.of(2024, 1, 5);
        String price = "100.00";

        RentalContract rentalContract = new RentalContract(booking, rentalDuration, price);

        Assert.assertEquals(booking, rentalContract.getBooking());
        Assert.assertEquals("Default TYC", rentalContract.getTyc());
        Assert.assertEquals(rentalDuration, rentalContract.getRentalDuration());
        Assert.assertEquals(price, rentalContract.getPrice());
        Assert.assertEquals(Arrays.asList("Default Insurance"), rentalContract.getInsuranceOptions());
        Assert.assertEquals(Arrays.asList("Default Service"), rentalContract.getAdditionalServices());
    }

    @Test
    public void testRentalContractUpdate() {
        Customer customer = new Customer("John Doe", "123 Main St", "555-1234", "ABC123", Arrays.asList("Booking 1"));
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 5);
        Booking booking = new Booking(customer, vehicle, startDate, endDate, "Confirmed");

        LocalDate rentalDuration = LocalDate.of(2024, 1, 5);
        String price = "100.00";

        RentalContract rentalContract = new RentalContract(booking, rentalDuration, price);

        // Crear nuevas listas mutables para permitir operaciones de modificación
        List<String> newInsuranceOptions = new ArrayList<>(Arrays.asList("Default Insurance"));
        List<String> newAdditionalServices = new ArrayList<>(Arrays.asList("Default Service"));

        rentalContract.setTyc("Updated TYC");
        rentalContract.setPrice("120.00");
        newInsuranceOptions.add("Custom Insurance");
        newAdditionalServices.add("Custom Service");

        rentalContract.setInsuranceOptions(newInsuranceOptions);
        rentalContract.setAdditionalServices(newAdditionalServices);

        Assert.assertEquals("Updated TYC", rentalContract.getTyc());
        Assert.assertEquals("120.00", rentalContract.getPrice());
        Assert.assertTrue(rentalContract.getInsuranceOptions().contains("Custom Insurance"));
        Assert.assertTrue(rentalContract.getAdditionalServices().contains("Custom Service"));
    }

}
