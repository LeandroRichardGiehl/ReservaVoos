/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.reservavoos;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author richa
 */
public class ReservaVoosTest {
     @Test
    public void testSuccessfulReservation() {
        ReservationSystem system = new ReservationSystem();
        ReservaVoos flight = new ReservaVoos("City A", "City B", "2023-01-01", 100);
        system.addFlight(flight);

        system.reserveSeats("City A", "City B", "2023-01-01", 5);

        assertEquals(95, flight.getAvailableSeats());
    }

    @Test
    public void testUnavailableSeats() {
        ReservationSystem system = new ReservationSystem();
        ReservaVoos flight = new ReservaVoos("City A", "City B", "2023-01-01", 10);
        system.addFlight(flight);

        system.reserveSeats("City A", "City B", "2023-01-01", 15);

        assertEquals(10, flight.getAvailableSeats());
    }

    @Test
    public void testCancelReservation() {
        ReservationSystem system = new ReservationSystem();
        ReservaVoos flight = new ReservaVoos("City A", "City B", "2023-01-01", 100);
        system.addFlight(flight);

        system.reserveSeats("City A", "City B", "2023-01-01", 5);
        system.cancelReservation("City A", "City B", "2023-01-01", 2);

        assertEquals(97, flight.getAvailableSeats());
    }
}
