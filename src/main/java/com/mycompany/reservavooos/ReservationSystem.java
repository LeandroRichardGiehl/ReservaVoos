/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservavooos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno tds
 */
public class ReservationSystem {
    private List<ReservaVooos> flights;

    public ReservationSystem() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(ReservaVooos flight) {
        flights.add(flight);
    }

    public void reserveSeats(String origin, String destination, String date, int numberOfSeats) {
        for (ReservaVooos flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)
                    && flight.getDate().equals(date)) {
                flight.reserveSeats(numberOfSeats);
                return;
            }
        }
        System.out.println("Falha na reserva. Voo não encontrado.");
    }

    public void cancelReservation(String origin, String destination, String date, int numberOfSeats) {
        for (ReservaVooos flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)
                    && flight.getDate().equals(date)) {
                flight.cancelReservation(numberOfSeats);
                return;
            }
        }
        System.out.println("Falha no cancelamento de reserva. Voo não encontrado.");
        }
}
