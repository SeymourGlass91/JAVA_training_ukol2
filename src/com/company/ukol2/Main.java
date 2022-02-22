package com.company.ukol2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());
        Rooms room1 = new Rooms(1, 1, true, true, 1000);
        System.out.println(room1.getDescription());
        Rooms room2 = new Rooms(2, 1, true, true, 1000);
        System.out.println(room2.getDescription());
        Rooms room3 = new Rooms(3, 3, false, true, 2400);
        System.out.println(room3.getDescription());
        // - Adéla izba č.1 od 19. do 26. 7. 2021.
        MakeReservation makeReservation = new MakeReservation();
        Reservation reservation  = new Reservation(adela, room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfReservation.HOLIDAY);
        makeReservation.addReservation(reservation);
        // - obaja na izbe č. 3 od 1. do 14. 9. 2021.
        reservation = new Reservation(adela, room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfReservation.WORK);
        reservation.addGuest(jan);
        makeReservation.addReservation(reservation);
        makeReservation.printReservation();
    }
}
