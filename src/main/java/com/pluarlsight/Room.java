package com.pluarlsight;

import java.time.LocalDateTime;

public class Room {
    private String bedType = ""; //single/full/twin/double/queen/king
    private int numberOfRooms;
    private int numberOfBedsTotal;
    private boolean oceanSide;
    private boolean roomUpgrades;
    private boolean poolSide;
    private String bedsSize = "Single/ Full/ TwinDouble/ Queen/ King";
    private boolean presidental;
    private boolean honeyMoon;
    private boolean hotTubJacuzzi;
    private boolean isPetAllowed;
    private boolean isSmokingAllowed;
    private boolean tvHasCable;
    private boolean wifi;
    private boolean accessibility;
    private boolean balcony;
    private boolean complimentarySnackBar;
    private boolean hasBeenCleaned;
    private LocalDateTime lastTimeCleaned;

    private int roomNumber;
    private double price;
    private boolean isOccupied;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
}
