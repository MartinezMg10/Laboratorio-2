package org.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class RentalContract {
    private Booking booking;
    private String tyc;
    private LocalDate rentalDuration;
    private String price;
    private List<String> insuranceOptions;
    private List<String> additionalServices;

    public RentalContract(Booking booking, LocalDate rentalDuration, String price) {
        this.booking = booking;
        this.tyc = "Default TYC";
        this.rentalDuration = rentalDuration;
        this.price = price;
        this.insuranceOptions = Arrays.asList("Default Insurance");
        this.additionalServices = Arrays.asList("Default Service");
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getTyc() {
        return tyc;
    }

    public void setTyc(String tyc) {
        this.tyc = tyc;
    }

    public LocalDate getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(LocalDate rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getInsuranceOptions() {
        return insuranceOptions;
    }

    public void setInsuranceOptions(List<String> insuranceOptions) {
        this.insuranceOptions = insuranceOptions;
    }

    public List<String> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(List<String> additionalServices) {
        this.additionalServices = additionalServices;
    }
}
