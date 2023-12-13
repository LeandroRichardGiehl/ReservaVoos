/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.reservavooos;

/**
 *
 * @author richa
 */
import java.util.ArrayList;
import java.util.List;

class ReservaVooos {

    private String origin;
    private String destination;
    private String date;
    private int availableSeats;

    public ReservaVooos(String origin, String destination, String date, int totalSeats) {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.availableSeats = totalSeats;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void reserveSeats(int numberOfSeats) {
        try {
            if (numberOfSeats > 0 && numberOfSeats <= availableSeats) {
                availableSeats -= numberOfSeats;
                System.out.println("Reserva bem-sucedida para " + numberOfSeats + " assentos.");
            } else {
                throw new IllegalArgumentException("Falha na reserva. Assentos insuficientes ou quantidade inválida.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

public void cancelReservation(int numberOfSeats) {
        try{
        int totalSeats = 0;
        if (numberOfSeats > 0 && numberOfSeats <= (totalSeats - availableSeats)) {
            availableSeats += numberOfSeats;
            System.out.println("Cancelamento de reserva bem-sucedido para " + numberOfSeats + " assentos.");
        } else {
            throw  new IllegalArgumentException("Falha no cancelamento de reserva. Número inválido de assentos.");
        }
        }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
        }
    }
}
