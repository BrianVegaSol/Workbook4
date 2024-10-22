package com.pluarlsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private double price;

    public Reservation(String roomType, int numberOfNights, double price) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.price = price;
    }
}
