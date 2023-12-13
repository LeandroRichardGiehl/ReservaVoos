/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.reservavooos;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 *
 * @author richa
 */
public class ReservaVooosTest {
    
    ReservationSystem system = new ReservationSystem();
    
     @Test
    public void testSuccessfulReservation() {
        ReservaVooos flight = new ReservaVooos("Porto Alegre", "São Paulo", "2023-01-01", 100);
        system.addFlight(flight);

        system.reserveSeats("Porto Alegre", "São Paulo", "2023-01-01", 5);

        assertEquals(95, flight.getAvailableSeats());
    }

    @Test
    public void testUnavailableSeats() {
        ReservaVooos flight = new ReservaVooos("Porto Alegre", "São Paulo", "2023-01-01", 10);
        system.addFlight(flight);

        system.reserveSeats("Porto Alegre", "São Paulo", "2023-01-01", 15);

        assertEquals(10, flight.getAvailableSeats());
    }

    @Test
    public void testCancelReservation() {
        ReservaVooos flight = new ReservaVooos("Porto Alegre", "São Paulo", "2023-01-01", 5);
        system.addFlight(flight);

        system.reserveSeats("Porto Alegre", "São Paulo", "2023-01-01", 5);
        system.cancelReservation("Porto Alegre", "São Paulo", "2023-01-01", 5);

        assertEquals(5, flight.getAvailableSeats());
    }
}
