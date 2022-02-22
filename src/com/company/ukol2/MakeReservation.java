package com.company.ukol2;

import java.util.ArrayList;
import java.util.List;

public class MakeReservation {
    List<Reservation> makeReservation = new ArrayList<Reservation>();

    public void addReservation(Reservation newReservation) { makeReservation.add(newReservation);}
    public void printReservation() {
        for (Reservation reservation :makeReservation) {
            System.out.println(reservation.getDescription());
        }

    }
}
