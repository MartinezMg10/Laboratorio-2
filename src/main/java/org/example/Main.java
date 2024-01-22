package org.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Management sistema = new Management();

        Vehicle vehiculo1 = new Vehicle("Toyota", "Camry", 2022, 15000.0, true);
        Vehicle vehiculo2 = new Vehicle("Honda", "Civic", 2021, 12000.0, true);

        sistema.addVehicle(vehiculo1);
        sistema.addVehicle(vehiculo2);

        Customer cliente = new Customer("John Doe", "john@example.com", "123456789","1000494028", Arrays.asList("Default Service"));

        sistema.addClient(cliente);

        Booking reserva = new Booking(cliente, vehiculo1, LocalDate.now(), LocalDate.now().plusDays(5), "pendiente");
        Booking reserva2 = new Booking(cliente, vehiculo1, LocalDate.now(), LocalDate.now().plusDays(5), "pendiente");

        sistema.makeReservation(reserva);
        sistema.makeReservation(reserva2);

        sistema.printInventory();
        sistema.printReservations();

    }
}