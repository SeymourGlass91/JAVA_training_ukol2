package com.company.ukol2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    Guest mainGuest;
    List<Guest> otherGuests = new ArrayList<>();
    Rooms rooms;
    LocalDate begin;
    LocalDate end;
    TypeOfReservation type;

    public Reservation (Guest mainGuest, Rooms rooms,LocalDate begin, LocalDate end, TypeOfReservation type){
        this.mainGuest = mainGuest;
        this.rooms = rooms;
        this.begin = begin;
        this.end = end;
        this.type = type;
    }

    public Guest getMainGuest() {
        return mainGuest;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public TypeOfReservation getType() {
        return type;
    }

    public void setType(TypeOfReservation type) {
        this.type = type;
    }
    public void addGuest(Guest newGuest) {
        otherGuests.add(newGuest);
    }

    public String getDescription() {
        StringBuilder result = new StringBuilder("Reservation for "+mainGuest.getFullName()+" ("+type
                +") from " + begin.toString() + " to " + end.toString() + " other guests: ");
        for (Guest guest : otherGuests) {
            result.append(guest.getFullName()).append(" , ");
        }
        return result.toString();
    }
}
