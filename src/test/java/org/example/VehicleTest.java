package org.example;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void testVehicleCreation() {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);

        Assert.assertEquals("Toyota", vehicle.getBrand());
        Assert.assertEquals("Camry", vehicle.getModel());
        Assert.assertEquals(2022, vehicle.getYear());
        Assert.assertEquals(15000.5, vehicle.getMileage(), 0.01);
        Assert.assertTrue(vehicle.isAvailability());
    }

    @Test
    public void testVehicleUpdate() {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022, 15000.5, true);

        vehicle.setAvailability(false);
        vehicle.setMileage(16000.2);

        Assert.assertFalse(vehicle.isAvailability());
        Assert.assertEquals(16000.2, vehicle.getMileage(), 0.01);
    }
}

