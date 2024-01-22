package org.example;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean availability;

    // Constructor
    public Vehicle(String brand, String model, int year, double mileage, boolean availability) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.availability = availability;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
