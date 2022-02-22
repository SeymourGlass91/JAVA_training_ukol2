package com.company.ukol2;

public class Rooms {
    int roomNumber;
    int capacityOfRoom;
    boolean balcony;
    boolean viewToSea;
    int pricePerNight;

    public Rooms (int roomNumber, int capacityOfRoom,boolean balcony,boolean viewToSea,int pricePerNight) {
        this.roomNumber = roomNumber;
        this.capacityOfRoom = capacityOfRoom;
        this.balcony = balcony;
        this.viewToSea = viewToSea;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacityOfRoom() {
        return capacityOfRoom;
    }

    public void setCapacityOfRoom(int capacityOfRoom) {
        this.capacityOfRoom = capacityOfRoom;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isViewToSea() {
        return viewToSea;
    }

    public void setViewToSea(boolean viewToSea) {
        this.viewToSea = viewToSea;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription () {return "Izba č."+ roomNumber+ ":"+capacityOfRoom+"miest" +" - " +pricePerNight+"kč/noc," +" Izba ma balkon : "+ balcony+"," + " Izba má vyhled na more : " + viewToSea;}
}
