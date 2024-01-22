package org.example;

import java.time.LocalDate;

public class Booking {
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endingDate;
    private String state;

    public Booking(Customer customer, Vehicle vehicle, LocalDate startDate, LocalDate endingDate, String state) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endingDate = endingDate;
        this.state = state;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
