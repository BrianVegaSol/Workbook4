package com.pluarlsight;

import java.util.*;
import java.util.Scanner;

public class Module2 {


        /*public static char m () {
               String s = "aba";
               char [] c = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                   char charAtIndext = c.equals(s.charAt(i));
                   if ()
               }
            return 0;
        };*/

    public static void m () {
        HashMap map = new HashMap<>();
        boolean isIsogram = false;
        String s = "aba";
        char [] stringToChar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), 0);
            if (map.containsKey(i)){
                 isIsogram = false;
            } else {
                isIsogram = true;
            }

        }
    }



}

class HotelOperations {
    private boolean isRoomBooked;
    private boolean roomIsOccupied;
    private boolean roomIsClean;
    private double guestFunds;

    public HotelOperations() {
        this.roomIsOccupied = roomIsOccupied;
        this.roomIsClean = roomIsClean;
        this.guestFunds = guestFunds;
        this.roomPrice = roomPrice;
        this.isRoomBooked = isRoomBooked;
    }

    public HotelOperations(boolean roomIsOccupied, boolean roomIsClean, double guestFunds,
                           double roomPrice, boolean isRoomBooked) {
        this.roomIsOccupied = roomIsOccupied;
        this.roomIsClean = roomIsClean;
        this.guestFunds = guestFunds;
        this.roomPrice = roomPrice;
        this.isRoomBooked = isRoomBooked;
    }

    public void setRoomIsOccupied(boolean roomIsOccupied) {
        this.roomIsOccupied = roomIsOccupied;
    }

    static double roomPrice = 500;

    private RoomType roomtype;

    public enum RoomType {
        KING(139.00), DOUBLE(124.00);
        private double pricePerNight;

        RoomType(double price) {
            this.pricePerNight = price;
        }

        // Method to get the price, adjusting for weekends
        public double getPricePerNight(boolean isWeekend) {
            if (isWeekend) {
                return pricePerNight * 1.10;
                // Increase price by 10% if it's a weekend
            }
            return pricePerNight;
        }
    }


    public static void main(String[] args) {
        System.out.println("You see a sign outside that reads:");
        System.out.println("------------------------------------\n|");
        // Get the price of a KING room for a weekend
        double kingPrice = RoomType.KING.getPricePerNight(true);
        System.out.println("|Price for KING room on weekend: $" + kingPrice);
        // Get the price of a DOUBLE room for a weekday
        double doublePrice = RoomType.DOUBLE.getPricePerNight(false);
        System.out.println("|Price for DOUBLE room on weekday: $" + doublePrice);
        System.out.println("|\n------------------------------------");
        roomAvailable();
        //If room booked succesfully, say Enjoy your stay!
        System.out.println("Goodbye!");
    }

    /*public static void roomAvailable(boolean roomIsOccupied, boolean roomIsClean, int guestFunds,
                                     int roomPrice, boolean isRoomBooked) {*/
    public static void roomAvailable() {
        //HotelOperations hotel = new HotelOperations();
        boolean setIsRoomBooked = false;
        Scanner roomMenuScan = new Scanner(System.in);
        System.out.println("Welcome to the HouseKeeping Room Managing Interface\nMark off the following when inspecting the rooms\n" +
                "Is the room currently occupied?\n1) Yes\n2) No");
        int occupiedStatus = roomMenuScan.nextInt();
        boolean roomIsOccupied;
        if (occupiedStatus == 1) {
            roomIsOccupied = true;
        } else {
            roomIsOccupied = false;
        }
        System.out.println("Is the room clean?\n1) Yes\n2) No");
        int cleanStatus = roomMenuScan.nextInt();
        boolean roomIsClean;
        if (cleanStatus == 1) {
            roomIsClean = true;
        } else {
            roomIsClean = false;
        }
        System.out.println("Which room would you like?\n1) Double\n2) King?");
        int roomType = roomMenuScan.nextInt();
        if (roomType == 1) {
            roomPrice = RoomType.DOUBLE.pricePerNight;
        }
        if (roomType == 2) {
            roomPrice = RoomType.KING.pricePerNight;
        }
        System.out.println("Please give us your card");
        System.out.print("Reading");
        try {
            Thread.sleep(000); // Sleep for 1 second
            System.out.print(".");
            Thread.sleep(000);
            System.out.print(".");
            Thread.sleep(000);
            System.out.print(".");
        } catch (InterruptedException e) {
            System.err.println("Error scanning card");
        }
        System.out.println("\nEnter Card Balance");
        int guestFunds = roomMenuScan.nextInt();
        if (roomIsOccupied) {
            System.out.println("Room is currently occupied");
        } else if (!roomIsClean) {
            System.out.println("Room is dirty\nSchedule Cleaning? (1)\nnah let someone else handle it (2)");
        } else if (guestFunds < roomPrice) {
            System.out.println("Insufficient funds. Please leave");
            ;
        } else {
            System.out.println("Room is available!\nProceed with room booking? (1)\nLeave (2)");
            int response = roomMenuScan.nextInt();
            switch (response) {
                case 1:
                    setIsRoomBooked = true;
                    System.out.println("Room booked");
                    break;
                case 2:
                    System.out.println("Leaving hotel . . .");
                    break;
            }
        }
        HotelOperations hotel = new HotelOperations(roomIsOccupied, roomIsClean, guestFunds, roomPrice, setIsRoomBooked);
    }


}

class Reservations {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private int reservationTotal;

    public String getRoomType() {
        return roomType;
    }


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int getReservationTotal() {
        return reservationTotal;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
}

class EmployeeYe {
    private int employeeID;
    private String name;
    private String department;
    protected double payRate;
    private int hoursWorked;

    public static void employeeMain() {

    }

    public double getTotalPay(double payRate, int hoursWorked) {
        return payRate * getRegularHours(hoursWorked) * getOvertimeHours(hoursWorked);
    }

    public int getRegularHours(int hoursWorked) {
        return hoursWorked;
    }

    public double getOvertimeHours(int hoursWorked) {
        if (hoursWorked == 0) {
            return 1;
        } else {
            return hoursWorked * 1.5;
        }
    }


}
