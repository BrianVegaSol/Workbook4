package com.pluarlsight;

import java.time.LocalDateTime;

public class Guests extends Person {
    private int guestId;
    private int numberOfBags;
    private int roomNumber;
    private int guestAge;
    private boolean checkedIn;
    private boolean checkedOut;
    private boolean hasParkingPass;
    private LocalDateTime guestCheckInDate;
    private LocalDateTime guestCheckOutDate;
    private String paymentType;
    private String foodPlan;
}
