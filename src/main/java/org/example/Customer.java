package org.example;

import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String phone;
    private String drivingLicense;
    private List<String> record;

    public Customer(String name, String address, String phone, String drivingLicense, List<String> record) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.drivingLicense = drivingLicense;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public List<String> getRecord() {
        return record;
    }

    public void setRecord(List<String> record) {
        this.record = record;
    }
}
