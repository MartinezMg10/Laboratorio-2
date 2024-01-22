package org.example;

import org.example.Booking;
import org.example.Customer;
import org.example.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Management {
    private List<Vehicle> inventario;
    private List<Booking> reservas;
    private List<Customer> clientes;

    public Management() {
        this.inventario = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }


    public void addVehicle(Vehicle vehicle) {
        inventario.add(vehicle);
    }

    public void deleteVehicle(Vehicle vehicle) {
        inventario.remove(vehicle);
    }

    public void makeReservation(Booking reserva) {
        Vehicle vehicle = reserva.getVehicle();
        LocalDate startDate = reserva.getStartDate();
        LocalDate endDate = reserva.getEndingDate();

        for(Booking booking :reservas) {
            Vehicle vehicleToCompare = booking.getVehicle();
            if (vehicleToCompare.equals(vehicle)){
                if (!(endDate.isBefore(booking.getStartDate()) || startDate.isAfter(booking.getEndingDate()))) {
                    System.out.println("El vehículo " + vehicle.getModel() + " año: "+ vehicle.getYear() + " no está disponible para las fechas seleccionadas.");
                    return;
                }
            }
            System.out.println(reserva);
        }
        reservas.add(reserva);
    }

    public void cancelBooking(Booking reserva) {
        reservas.remove(reserva);
    }

    
    public RentalContract generateContract(Booking reserva, LocalDate rentalDuration, String price) {

        return new RentalContract(reserva, rentalDuration, price);
    }


    public void addClient(Customer cliente) {
        clientes.add(cliente);
    }

    public List<Vehicle> getInventario() {
        return inventario;
    }

    public List<Booking> getReservas() {
        return reservas;
    }

    public void printInventory() {
        System.out.println("Inventario:");
        for (Vehicle vehiculo : inventario) {
            System.out.println("Marca: " + vehiculo.getBrand() +
                    ", Modelo: " + vehiculo.getModel() +
                    ", Año: " + vehiculo.getYear() +
                    ", Kilometraje: " + vehiculo.getMileage());
        }
    }

    public void printReservations() {
        System.out.println("Reservas:");
        for (Booking reserva : reservas) {
            System.out.println("Cliente: " + reserva.getCustomer().getName() +
                    ", Vehículo: " + reserva.getVehicle().getBrand() + " " + reserva.getVehicle().getModel() +
                    ", Fecha de inicio: " + reserva.getStartDate() +
                    ", Fecha de fin: " + reserva.getEndingDate() +
                    ", Estado: " + reserva.getState());
        }
    }


}
